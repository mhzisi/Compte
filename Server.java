package Rmi;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server { 
	 public static void main(String[] args) throws RemoteException, MalformedURLException {
	        InterfaceImple server = new InterfaceImple();

	        java.rmi.registry.LocateRegistry.createRegistry(1250);

	        Naming.rebind("rmi://127.0.0.1:1250/server", server);
	    }

}
