package com.strategy;

public class Client {

	public static void main(String[] args) {
		
		Chess chess = new Chess();
		
		System.out.println("Calculate next step (easy): " + chess.calculateNextStep());
		
		chess.setAlgorithm(new MediumChessAlgorithm());
		
		System.out.println("Calculate next step (medium): " + chess.calculateNextStep());

		chess.setAlgorithm(new HardChessAlgorithm());

		System.out.println("Calculate next step (hard): " + chess.calculateNextStep());

	}
}
