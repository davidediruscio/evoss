/**
 * 
 */
package it.univaq.mancoosi.simulator;

import it.univaq.mancoosi.simulator.controller.SimulatorController;
import it.univaq.mancoosi.simulator.exceptions.ErrorFoundException;
import it.univaq.mancoosi.simulator.exceptions.WarningFoundException;


public class Simulator {
	

	public static void main(String[] args) {
		
		
		try {
			System.out.println("Simulation started.");

			SimulatorController simulator = SimulatorController.getInstance();
			if (args != null) simulator.setArgs(args);
			simulator.start();

			System.out.println("Simulation succeeded.");

		} catch (ErrorFoundException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		} catch (WarningFoundException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace(System.out);
			System.out.println("Simulation failed.");
			System.exit(1);
		}
	}
}