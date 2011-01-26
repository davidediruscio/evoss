package it.univaq.mancoosi.injectors.packages.util;


import it.univaq.mancoosi.injectors.packages.exceptions.InjectorException;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;



public class CheckErrorParsing {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Integer check(String path) throws InjectorException {
		
		PrintStream printStreamOriginal=System.err;
		 
		System.setErr(new PrintStream(new OutputStream() {
			@Override
			public void write(int arg0) throws IOException {
			}
		}));
		
		Integer numberError = -1;
		try {
			
			Class lexerClass = Class.forName(InjectorConfig.getInstance().getGrammarName()+"Lexer");

			
			Constructor con = lexerClass.getConstructor(CharStream.class);
			Object o = con.newInstance(new ANTLRFileStream(path,
					"UTF8"));

			CommonTokenStream tokens = new CommonTokenStream((TokenSource) o);

			Class parserClass = Class.forName("GrammarShellForMancoosiParser");
			Constructor conParser = parserClass.getConstructor(TokenStream.class);
			Object oParser = conParser.newInstance(tokens);

			Method main = parserClass.getMethod("mainRule");
			main.invoke(oParser);

			Method errNumberMethod = parserClass.getMethod("getNumberOfSyntaxErrors");
			numberError = (Integer) errNumberMethod.invoke(oParser);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new InjectorException("ClassNotFoundException");
		} catch (SecurityException e) {
			e.printStackTrace();
			throw new InjectorException("SecurityException");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			throw new InjectorException("NoSuchMethodException");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new InjectorException("IllegalArgumentException");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new InjectorException("IllegalAccessException");
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new InjectorException("InvocationTargetException");
		} catch (IOException e) {
			e.printStackTrace();
			throw new InjectorException("IOException");
		} catch (InstantiationException e) {
			e.printStackTrace();
			throw new InjectorException("InstantiationException");
		}
		System.setErr(printStreamOriginal);
		return numberError;

	}
}
