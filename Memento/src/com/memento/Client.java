package com.memento;

import java.awt.geom.Point2D;

public class Client {

	public static void main(String[] args) {
		
		ConnectionSolver connectionSolver = new ConnectionSolver();
		
		connectionSolver.setFirstPoint(new Point2D.Double(1.0, 1.0));
		connectionSolver.setSecondPoint(new Point2D.Double(5.0, 1.0));
		
		
		ConnectionSolverCaretaker connectionSolverCaretaker = new ConnectionSolverCaretaker();
		connectionSolverCaretaker.saveState(connectionSolver);
		
		connectionSolver.calculateLine();
		
		connectionSolver.setFirstPoint(new Point2D.Double(85.0, 275.0));
		connectionSolver.setSecondPoint(new Point2D.Double(75.0, 45.0));
		
		connectionSolver.calculateLine();

	
		ConnectionSolver connectionSolver2 = new ConnectionSolver();
		connectionSolverCaretaker.restoreState(connectionSolver2);
		connectionSolver2.calculateLine();

		connectionSolverCaretaker.restoreState(connectionSolver);
		connectionSolver.calculateLine();
	}
}
