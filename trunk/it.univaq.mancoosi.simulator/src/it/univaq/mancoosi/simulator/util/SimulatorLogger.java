/**
 * 
 */
package it.univaq.mancoosi.simulator.util;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.ErrorManager;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

/**
 * Manages the logger and its configuration.
 */
public class SimulatorLogger {

	private static SimulatorLogger instance = null;

	private static Logger logger = null;

	private static SimulatorConfig config = null;

	private static FileHandler fh;

	/**
	 * Singleton
	 * @return instance
	 * @throws SimulatorException
	 */
	public static SimulatorLogger getInstance() throws SimulatorException {
		if (instance == null)
			instance = new SimulatorLogger();
		return instance;
	}

	/**
	 * Private constructor
	 * @throws SimulatorException
	 */
	private SimulatorLogger() throws SimulatorException {
		try {
			config = SimulatorConfig.getInstance();
			logger = Logger.getLogger("it.univaq.mancoosi.simulator");

			if (config.isConsoleLog() || config.isSaveFileLog()) {
				
				if (config.isConsoleLog()) {
					logger.setUseParentHandlers(false);
					Handler ch = new MyHandler();
					logger.addHandler(ch);
				}
				
				if (config.isSaveFileLog()) {
					fh = new FileHandler(config.getDirLog() + "log_" + getTime() + ".txt");
					
					fh.setFormatter(new SimpleFormatter());
					logger.addHandler(fh);
				}
				
				logger.setLevel(Level.ALL);
			
			} else {
				logger.setLevel(Level.OFF);
			}

		} catch (SecurityException e) {
			throw new SimulatorException("Error logger security ", e);
		} catch (IOException e) {
			throw new SimulatorException("IO error in logger", e);
		}
	}

	/**
	 * Set a suitable format for the time
	 * @return Date
	 */
	private String getTime() {
		Calendar cal = new GregorianCalendar();
		int h = cal.get(Calendar.HOUR);
		int mm = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		int d = cal.get(Calendar.DAY_OF_MONTH);
		int m = cal.get(Calendar.MONTH);
		int y = cal.get(Calendar.YEAR);
		String x;
		if (cal.get(Calendar.AM_PM) == 0) {
			x = "AM";
		} else {
			x = "PM";
		}
		String time = y + "-" + m + "-" + d + "_" + h + ":" + mm + ":" + s + x;
		return time;
	}

	/**
	 * Finest level
	 * @param msg
	 */
	public void finest(String msg) {
		logger.finest(msg);
	}

	/**
	 * Finer level
	 * @param msg
	 */
	public void finer(String msg) {
		logger.finer(msg);
	}

	/**
	 * Fine level
	 * @param msg
	 */
	public void fine(String msg) {
		logger.fine(msg);
	}

	/**
	 * Config level
	 * @param msg
	 */
	public void config(String msg) {
		logger.config(msg);
	}

	/**
	 * Info level
	 * @param msg
	 */
	public void info(String msg) {
		logger.info(msg);
	}

	/**
	 * Warning level
	 * @param msg
	 */
	public void warning(String msg) {
		logger.warning(msg);
	}

	/**
	 * Severe (error) level 
	 * @param msg
	 */
	public void severe(String msg) {
		logger.severe(msg);
	}
}

class MyHandler extends Handler {
	@Override
	public void publish(LogRecord record) {
		if (getFormatter() == null) {
			setFormatter(new MyFormatter());
		}

		try {
			String message = getFormatter().format(record);
			if (record.getLevel().intValue() >= Level.WARNING.intValue()) {
				System.err.write(message.getBytes());
			} else {
				System.out.write(message.getBytes());
			}
		} catch (Exception exception) {
			reportError(null, exception, ErrorManager.FORMAT_FAILURE);
			return;
		}

	}

	@Override
	public void close() throws SecurityException {
	}

	@Override
	public void flush() {
	}
}


class MyFormatter extends Formatter {
	@Override
	public String format(LogRecord record) {
		return "  "+record.getLevel().getName() + ": " + record.getMessage() + "\n";
	}
}