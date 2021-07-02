package com.srm.day10.java;

public class EmployeeDetails {

	public String name,desgn;
	public int eno;
	
	public EmployeeDetails(String name, String desgn, int eno) {
		super();
		this.name = name;
		this.desgn = desgn;
		this.eno = eno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesgn() {
		return desgn;
	}
	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	
	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", desgn=" + desgn + ", eno=" + eno + "]";
		
	}	
	}



