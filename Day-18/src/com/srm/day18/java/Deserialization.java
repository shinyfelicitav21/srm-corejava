package com.srm.day18.java;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		
		try{  
			  //Creating stream to read  object  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Documents\\Java\\Student.txt")); 
			  Student1 s1=(Student1)in.readObject();  
			  Student1 s2=(Student1)in.readObject(); 
			  Student1 s3=(Student1)in.readObject(); 
			  Student1 s4=(Student1)in.readObject(); 
			  Student1 s5=(Student1)in.readObject(); 
			  
			  //Printing the data of  serialized object 
			  System.out.println("Student ID and Name:");
			  System.out.println("");
			  System.out.println(s1.id+","+s1.name);  
			  System.out.println(s2.id+","+s2.name);  
			  System.out.println(s3.id+","+s3.name);  
			  System.out.println(s4.id+","+s4.name);  
			  System.out.println(s5.id+","+s5.name);  
			  
			  //closing the stream  
			  in.close();  
			  
			  }
		
		catch(Exception e)
		{
			System.out.println(e);
			}  
	}
}
