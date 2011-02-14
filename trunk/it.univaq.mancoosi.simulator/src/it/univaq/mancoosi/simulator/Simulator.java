/**
 * 
 */
package it.univaq.mancoosi.simulator;

import it.univaq.mancoosi.simulator.controller.SimulatorController;
import it.univaq.mancoosi.simulator.exceptions.ErrorFoundException;
import it.univaq.mancoosi.simulator.exceptions.SelectionStateNotFoundException;
import it.univaq.mancoosi.simulator.exceptions.SelectionStateNotPermittedException;
import it.univaq.mancoosi.simulator.exceptions.WarningFoundException;


public class Simulator {
	

	public static void main(String[] args) {

		try {
			System.out.println("Simulation started.");

			SimulatorController.getInstance().start();

			System.out.println("Simulation succeeded.");

		} catch (ErrorFoundException e) {
			System.out.println("Simulation failed.");
		} catch (WarningFoundException e) {
			System.out.println("Simulation completed with warnings.");
		} catch (SelectionStateNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Simulation failed.");
		} catch (SelectionStateNotPermittedException e) {
			System.out.println(e.getMessage());
			System.out.println("Simulation failed.");
		} catch (Exception e) {
			System.out.println("Simulator is stopped due to an internal error.");
			System.out.println(e.getMessage());
			System.out.println("Simulation failed.");
			e.printStackTrace();
		}
	}
}