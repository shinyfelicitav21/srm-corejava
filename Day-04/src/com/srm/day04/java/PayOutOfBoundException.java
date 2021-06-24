package com.srm.day04.java;

public class PayOutOfBoundException  extends Exception{

public int bpay;

public PayOutOfBoundException(int bpay) {
	
	super();
	this.bpay = bpay;
	
}

@Override

public String toString() {
	
	return "PayOutOfBoundException [bpay=" + bpay + "]";
	
}
	}
	
	


