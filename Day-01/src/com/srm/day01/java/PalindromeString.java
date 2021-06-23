package com.srm.day01.java;

public class PalindromeString {
	
	static boolean check(String word)
    {
        int n = word.length();
        word = word.toLowerCase();
        
        for (int i=0; i<n; i++,n--)
           if (word.charAt(i) != word.charAt(n - 1))
              return false;      
        return true;
    }
     
    static int count(String str)
    {       
        str = str + " ";
         
        // to store each word
        String word = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
             
            if (ch != ' ')
                word = word + ch;
            else {
                if (check(word))
                    count++;
                word = "";
            }
        }
         
        return count;
    }
     
    public static void main(String args[])
    {
		System.out.println("COUNTING PALINDROME STRING.");
		System.out.println("---------------------------");
		System.out.println("Count:");
        System.out.println(count("Seeta "
                  + "Arun refer malayalam"));
                   
        System.out.println(count("Raj "
                       + "speaks malayalam"));
    }
}
