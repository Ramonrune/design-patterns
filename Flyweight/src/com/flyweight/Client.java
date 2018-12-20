package com.flyweight;

public class Client {

	public static void main(String[] args) {
		
		
		WordProcessor wordProcessor = new WordProcessor();
		
		String text = "Teeeeexxxt iss repeaaating";
		
		
		LetterFactory letterFactory = new LetterFactory();
		
		for(int i = 0; i < text.length(); i++){
			
			String value = text.substring(i, i+1);
			
			wordProcessor.addLetter(letterFactory.createLetter(value));
		}
		
		wordProcessor.printLetters();
	}
}
