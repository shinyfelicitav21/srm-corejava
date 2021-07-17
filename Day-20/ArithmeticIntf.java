import java.rmi.*; 

public interface ArithmeticIntf extends Remote {

int arith(int x, int y) throws RemoteException; 
}

