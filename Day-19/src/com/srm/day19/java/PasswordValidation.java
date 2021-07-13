package com.srm.day19.java;

import java.util.Scanner;

class Password{
public static final String regularExpression = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})";
}
public class PasswordValidation {
	
    public static void main(String[] args) {
    	
       Scanner sc = new Scanner(System.in);
            String pwd = sc.nextLine();
            if (pwd.matches(Password.regularExpression)) {
                System.out.println("Given Password is Valid.");
            } else {
                System.out.println("Invalid Password!");
                
            }           
        }
    }


