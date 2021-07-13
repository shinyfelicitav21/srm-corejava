package com.srm.day19.java;

import java.util.regex.*;

public class RegexMethods {
	public static void main(String[] args)
    {
    String regex = "(s*s)";
    Pattern p= Pattern.compile(regex);
    String str= "shiny felicita sharon sweety";
    Matcher match= p.matcher(str);
            
    while (match.find()) {
        System.out.println(match.group());
        
    }
}
}
