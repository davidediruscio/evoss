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

			SimulatorController.getInstance().start();

			System.out.println("Simulation succeeded.");

		} catch (ErrorFoundException e) {
			System.out.println(e.getMessage());
		} catch (WarningFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Simulator is stopped due to an internal error.");
			System.out.println(e.getMessage());
			System.out.println("Simulation failed.");
			//e.printStackTrace();
		}
	}
}