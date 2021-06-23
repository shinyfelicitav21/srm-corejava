package com.srm.day02.java;

public class RoomClass {
 
	int rno;
	String rtype;
	float rarea;
	String acmachine;

	void setData(int rnum, String rtyp, float area, String acmac) {
		
		this.rno = rnum;
		this.rtype = rtyp;
		this.rarea = area;
		this.acmachine = acmac;
		}
	
		void displayData() {
		System.out.println("Room Number:" + rno);
		System.out.println("Room Type: " +rtype);
		System.out.println("Room Area:" + rarea);
		System.out.println("A/C Machine:"+ acmachine);
		}
		
	public static void main(String[] args) {
		System.out.println("ROOM DETAILS.");
		System.out.println("-------------");
		RoomClass room = new RoomClass();
		room.setData(22, "Normal", 144 ,"Available");
		room.displayData();
	}
}

