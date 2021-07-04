package com.srm.day11.java;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesExample {
	
	public static void main(String[] args)throws Exception{  
		
		Properties p=new Properties();  
		
		System.out.println("Setting the property..");
		
		p.setProperty("uname","xyz@123");  
		p.setProperty("pwd","pwd@123");  
		  
		p.store(new FileWriter("prop.properties"),"propertiesexample");  
	
	 PropertiesExample pe=new PropertiesExample();
	 pe.readMethod();
	 pe.setNewMethod();
	 
	 }  

	private void readMethod() throws IOException {
		 FileReader reader=new FileReader("prop.properties");  
	      
		    Properties p=new Properties();  
		    p.load(reader);  
		      
		    System.out.println(p.getProperty("uname"));  
		    System.out.println(p.getProperty("pwd"));  
		    System.out.println("------------------------------------");
	}
	
	private void setNewMethod() {
		
		Properties p=System.getProperties();  
		Set set=p.entrySet();  
		  
		Iterator itr=set.iterator();  
		
		while(itr.hasNext()){  
		Map.Entry entry=(Map.Entry)itr.next(); 
		
		System.out.println(entry.getKey()+" = "+entry.getValue());  
		
	}
	}
}
