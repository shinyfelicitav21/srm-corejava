import java.rmi.*;
import java.net.*; 

public class ArithServer { 
public static void main(String a[]) { 

try { 
ArithmeticImpl ai= new ArithmeticImpl (); 
Naming.rebind("ArithServer",ai);
System.out.println ("Server is ready."); 
} catch (Exception e) { 
System.out.println ("Server failed:" + e);

 } } }

