import Rmi.*;

import java.rmi.Naming;


public class Client {

    public static void main(String[] args) {
        try {
            Interface service1 = (Interface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service1.créditer(3000));
            System.out.println(service1.débiter(4000));
            System.out.println(service1.Liresolde()); 
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}