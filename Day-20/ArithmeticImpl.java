import java.rmi.*;
import java.rmi.server.*; 

public class ArithmeticImpl extends UnicastRemoteObject implements ArithmeticIntf{
 
public ArithmeticImpl() throws RemoteException{}

public int arith(int x, int y) throws RemoteException{

return(x+y);

}
}
