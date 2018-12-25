package com.memento;

import java.awt.geom.Point2D;

public class ConnectionSolver {

	private Point2D firstPoint;
	
	private Point2D secondPoint;
	
	public void calculateLine(){
		
		System.out.println("Calculating " + firstPoint + " and " + secondPoint);
	}

	public ConnectionSolverMemento createMemento(){
		return new ConnectionSolverMemento(firstPoint, secondPoint);
	}
	
	public void setMemento(ConnectionSolverMemento memento){
		firstPoint = memento.getFirstPoint();
		secondPoint = memento.getSecondPoint();
	}

	public void setFirstPoint(Point2D firstPoint) {
		this.firstPoint = firstPoint;
	}

	public void setSecondPoint(Point2D secondPoint) {
		this.secondPoint = secondPoint;
	}
	
	
	
	
}
