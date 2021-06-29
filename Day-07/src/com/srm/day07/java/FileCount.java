package com.srm.day07.java;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileCount {

	public static void main(String[] args) {
		
		 try {
		     BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Admin\\Documents\\Java\\Input.txt"));
          String[] words=null;
            String s;
           int wc=0,vowels=0,consonants=0,count=0;
           
            while((s=br.readLine()) != null) {
            	words=s.split(" ");   
                wc=wc+words.length; 
                
                for(int i=0;i<s.length();i++) {
                	char ch = s.charAt(i);
                	
                  if((ch>='a'&& ch<='z')|| (ch>='A'&& ch<='Z'))   {
                	  ch=Character.toLowerCase(ch);
                	  
                	  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                		  vowels++;  
                	  }
                	  else {
                		  consonants++;
                	  }
                  }
                }
                
                for(int i=0;i<s.length();i++) {
                	if(s.charAt(i)!=' ') {
                		count++;
                	}
                }
            }
            
            System.out.println("Word count:"+wc);  
            System.out.println("Char count:"+count);
            System.out.println("Vowel count:"+vowels);
            System.out.println("Consonant count:"+consonants);
	}
catch(Exception e) {
	System.out.println(e);
	
}
}
}
