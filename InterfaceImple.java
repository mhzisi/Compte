package Rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class InterfaceImple extends UnicastRemoteObject implements Interface { 
	  private double solde;
    public InterfaceImple() throws RemoteException {} 
    public double Liresolde()
    {
    	return solde;
    } 
    public String cr�diter(double x)
    {
    	solde=solde+x; 
    	return("d�pout effectu�e avec succ�s");
    } 
    public String d�biter(double x)
    {
    	if(solde<x)
    		return("solde insuffisant"); 
    	else 
    		solde=solde-x; 
    	    return("r�trait effectu�e avec succ�s");
    }

   
}