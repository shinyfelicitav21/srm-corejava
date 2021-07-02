package com.srm.day10.java;

import java.util.Comparator;

public class SortEmpID implements Comparator<EmployeeDetails> {

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		
		return o1.eno-o2.eno;
	}
}

 class SortEmpName implements Comparator<EmployeeDetails> {

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		
		return o1.name.compareTo(o2.name);
	}
}