package com.command;

import java.util.LinkedList;
import java.util.Queue;

public class TextEditor {

	
	private String text;
	
	private Queue<Command> queue = new LinkedList<>();
	
	private void executeAction(Command command){
		command.action();
		queue.add(command);
	}
	
	private void undo(){
		Command command = queue.poll();
		if(command != null){
			command.undo();
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Queue<Command> getQueue() {
		return queue;
	}

	public void setQueue(Queue<Command> queue) {
		this.queue = queue;
	}
	
	
	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor();
		textEditor.setText("1234");
		ClearTextCommand command = new ClearTextCommand(textEditor);
		textEditor.executeAction(command);
		
		System.out.println("Text is: " + textEditor.getText());
		textEditor.undo();
		System.out.println("Text is: " + textEditor.getText());
		
		AddTextCommand addTextCommand = new AddTextCommand(textEditor, " add text");
		textEditor.executeAction(addTextCommand);
		System.out.println("Text is: " + textEditor.getText());
		textEditor.undo();
		System.out.println("Text is: " + textEditor.getText());
		
		
		
	}
	
	
}
