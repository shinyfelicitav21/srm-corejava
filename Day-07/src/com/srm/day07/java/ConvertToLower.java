package com.srm.day07.java;

import java.io.*;

public class ConvertToLower{

public static void main (String[] args) throws IOException {
	
System.out.println("Contents are converted into lower case.");
	
	try {
           BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Admin\\Documents\\Java\\Input.txt"));
          PrintWriter out = (new PrintWriter(new FileWriter("C:\\Users\\Admin\\Documents\\Java\\File1.txt")));
          String fr;
        
          while(( fr= br.readLine()) != null) 
          {
             out.write(fr.toLowerCase()+"\n");
             
           }
         out.close();
         }

           catch(Exception e)
           {
            e.printStackTrace();
            
           }
           }
}




