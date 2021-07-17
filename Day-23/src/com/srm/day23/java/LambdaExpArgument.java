package com.srm.day23.java;

interface StringFun { 
	String fun(String n);
}

public class LambdaExpArgument {

     static String stringOp(StringFun sf, String s) {
     return sf.fun(s);
}

public static void main(String args[]) {
	
String in = "Lambda Expression"; 
String out;
System.out.println("Input String: " + in);

 out = stringOp((str) -> str.toUpperCase(), in);

System.out.println("String in uppercase: " + out);

out = stringOp((str) -> {
String res = ""; 
int i;

for(i = 0; i < str.length(); i++) if(str.charAt(i) != ' ')

res += str.charAt(i);
return res; 
}, 
in);

System.out.println("String with spaces removed: " + out);
StringFun rev = (str) -> { 
String res = "";

int i;

for(i = str.length()-1; i >= 0; i--) res += str.charAt(i);
return res;

};
     System.out.println("Reversed string: " +stringOp(rev, in));
 
}
}

