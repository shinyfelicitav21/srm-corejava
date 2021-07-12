package com.srm.day18.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException{
		  
			  //Creating the object  
			 Student1 s1 =new  Student1(21,"Sweety"); 
			 Student1 s2 =new  Student1(23,"Raj"); 
			 Student1 s3 =new  Student1(88,"Pavithra"); 
			 Student1 s4 =new  Student1(56,"Teena"); 
			 Student1 s5 =new  Student1(90,"Dinesh"); 
			 
			  //Creating stream and writing the object  
			  FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Documents\\Java\\Student.txt");  
			  ObjectOutputStream out=new ObjectOutputStream(fos);  
			  
			  out.writeObject(s1);  
			  out.writeObject(s2);  
			  out.writeObject(s3);  
			  out.writeObject(s4);  
			  out.writeObject(s5);  
			  out.flush();  
			  
			  //closing the stream  
			  out.close();  
			  
			  System.out.println("Object has been Serialized..");  
			  
	}
}
