package com.srm.day16.java;

import javax.swing.*;  
import java.text.*;  
import java.util.*; 

public class DigitalWatch implements Runnable{ 
	
JFrame f;  
Thread t=null;  
int hrs=0, min=0, sec=0;  
String timeString = "";  
JButton b;  
  
DigitalWatch(){  
    f=new JFrame();  
      
    t = new Thread(this);  
        t.start();  
      
    b=new JButton();  
        b.setBounds(100,100,100,50);  
      
    f.add(b);  
    f.setSize(300,400);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
  
 public void run() {  
      try {  
         while (true) {  
  
            Calendar cal = Calendar.getInstance();  
            hrs = cal.get( Calendar.HOUR_OF_DAY );  
            if ( hrs > 12 ) hrs -= 12;  
            min = cal.get( Calendar.MINUTE );  
            sec = cal.get( Calendar.SECOND );  
  
            SimpleDateFormat sdf= new SimpleDateFormat("hh:mm:ss");  
            Date date = cal.getTime();  
            timeString = sdf.format( date );  
  
            printTime();  
  
            t.sleep( 1000 );    
         }  
      }  
      catch (Exception e) { }  
 }  
  
public void printTime(){  
b.setText(timeString);  
}  
  
public static void main(String[] args) {  
    new DigitalWatch();  
          
}  
}  
