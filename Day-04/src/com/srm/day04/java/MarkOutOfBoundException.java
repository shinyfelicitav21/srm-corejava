package com.srm.day04.java;

public class MarkOutOfBoundException extends Exception {

	public int mark;

	public MarkOutOfBoundException(int mark) {
		
		super();
		this.mark = mark;
	}

	@Override
	
	public String toString() {
		
		return "MarkOutOfBoundException [mark=" + mark + "]";
		
	}
}
