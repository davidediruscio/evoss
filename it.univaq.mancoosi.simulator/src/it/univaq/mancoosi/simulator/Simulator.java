/**
 * 
 */
package it.univaq.mancoosi.simulator;



import it.univaq.mancoosi.simulator.controller.SimulatorController;
import it.univaq.mancoosi.simulator.util.SimulatorLogger;


public class Simulator {
	

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			System.out.println("Simulation started.");

			SimulatorController.getInstance().start();

			System.out.println("Simulation succeeded.");

		} catch (Exception e) {
			try {
				if (e.getCause() != null) {
					(SimulatorLogger.getInstance()).severe(e.getMessage()
							+ "\n\tCaused by: " + e.getCause().getMessage());
				} else {
					(SimulatorLogger.getInstance()).severe(e.getMessage());
				}
				(SimulatorLogger.getInstance()).info("Simulation failed.");
				
			} catch (Exception e1) {
			}

			System.out.println("Simulation failed.");
		}
	}
}