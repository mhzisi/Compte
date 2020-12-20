package Rmi;
import java.rmi.Remote; 
import java.rmi.RemoteException;
public interface Interface extends Remote {
 String débiter(double x) throws RemoteException; 
 String créditer(double x) throws RemoteException; 
 double Liresolde() throws RemoteException;
}
