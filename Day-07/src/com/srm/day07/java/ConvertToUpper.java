package com.srm.day07.java;

import java.io.*;

public class ConvertToUpper{

public static void main (String[] args) throws IOException {
	
System.out.println("Contents are converted into upper case.");
	
	try {
           BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Admin\\Documents\\Java\\Input.txt"));
          PrintWriter out = (new PrintWriter(new FileWriter("C:\\Users\\Admin\\Documents\\Java\\File2.txt")));
          String fr;
        
          while(( fr= br.readLine()) != null) 
          {
             out.write(fr.toUpperCase()+"\n");
             
           }
         out.close();
         }

           catch(Exception e)
           {
            e.printStackTrace();
            
           }
           }
}




