package Rmi;
import java.rmi.Remote; 
import java.rmi.RemoteException;
public interface Interface extends Remote {
 String d�biter(double x) throws RemoteException; 
 String cr�diter(double x) throws RemoteException; 
 double Liresolde() throws RemoteException;
}
