import java.rmi.*;

public class ArithClient { 
public static void main(String a[]) { 

try { 
String url="rmi://"+a[0]+"/ArithServer"; 
ArithmeticIntf  ai = (ArithmeticIntf)Naming.lookup(url); 
Integer arith=ai.arith(Integer.parseInt(a[1]), Integer.parseInt(a[2]));
System.out.println("Result:"+arith); 
} catch (Exception e) { 

System.out.println("Arithclient exception: " + e); 
} } }

