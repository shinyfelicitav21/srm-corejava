package com.srm.day11.java;

import java.util.Vector;  

public class VectorAddition { 
  
    public static void main(String arg[]) {  
    	
        //Creating vector object  
        Vector<String> vector = new Vector<String>(); 
        
        vector.add(0, "Jancy");  
        vector.add(1, "Anandi");  
        vector.add(2, "Paru");  
        vector.add(3, "Janu");  
        vector.add(4, "Hindu");      
        
        System.out.println("Initial Vector Elements: \n" + vector);  
        System.out.println("");
        
        vector.addElement("Dinesh");
        vector.add(3,"Diva");
        
        System.out.println("Added Vector Elements: \n" + vector);
        System.out.println("");
        
        vector.removeElementAt(4);;
        vector.removeElement("Paru");
        
        System.out.println("New Vector Elements: \n" + vector);
        
        }  
}  