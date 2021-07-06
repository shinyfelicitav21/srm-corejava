package com.srm.day13.java;

public class StringPalindrome {
	static boolean check(String str)
    {
        int n = str.length();
        str= str.toLowerCase();
        
        for (int i=0; i<n; i++,n--)
           if (str.charAt(i) != str.charAt(n - 1))
              return false;      
        return true;
    }
     
    static int count(String str1)
    {       
        str1 = str1 + " ";
         
        // to store each word
        String str2 = "";
        int count = 0;
        for (int i = 0; i < str1.length(); i++)
        {
            char ch = str1.charAt(i);
             
            if (ch != ' ')
            	str2 = str2+ ch;
            else {
                if (check(str2))
                    count++;
                str2 = "";
            }
        }
         
        return count;
    }
     
    public static void main(String args[])
    {
		System.out.println("Count:");
        System.out.println(count(
                   "Arun refer malayalam"));
                   
        System.out.println(count(
                        "Raj speaks malayalam"));
        
    }
}
