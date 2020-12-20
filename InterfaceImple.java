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
    public String créditer(double x)
    {
    	solde=solde+x; 
    	return("dépout effectuée avec succés");
    } 
    public String débiter(double x)
    {
    	if(solde<x)
    		return("solde insuffisant"); 
    	else 
    		solde=solde-x; 
    	    return("rétrait effectuée avec succés");
    }

   
}