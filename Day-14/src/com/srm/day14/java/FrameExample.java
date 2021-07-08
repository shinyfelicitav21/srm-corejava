package com.srm.day14.java;

import java.awt.*;

public class FrameExample {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Frame Demo");
		
		Component textArea = new TextArea("My First Frame.");
		Component button = new Button("Click Me");
		 
		frame.add(textArea, BorderLayout.NORTH);
		frame.add(button, BorderLayout.SOUTH);
		 
		int width = 150;
		int height = 150;
		 
		frame.setSize(width, height);
		frame.setVisible(true);

	}
}
