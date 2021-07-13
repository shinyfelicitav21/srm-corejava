package com.srm.day19.java;

	public class UsernameValidation {
		
	    public static void main(String[] args) {
	    	
	    	 String pattern = "^[a-zA-Z0-9_.]{8,20}$";
	    	 String[] arr = {
	                    "Sharon21", 
	                    "Jancy.22", 
	                    "Bala", "Steve@98",
	                    "_Teena.Raj"
	                };
	         
	         for(String str: arr){
	             
	             if(str.matches(pattern)){
	                 System.out.println(str + " is a valid username!");
	             }else{
	                 System.out.println("Invalid username:"+str);
	                 
	             }
	         }
	    }
	}
