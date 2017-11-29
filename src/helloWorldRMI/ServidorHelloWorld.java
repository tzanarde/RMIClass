package helloWorldRMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			LocateRegistry.createRegistry(2020);
			HelloWorld obj = new HelloWorldImpl();
			Naming.rebind("//localhost:2020/ServicoHello", obj);
			System.out.println("Servidor no ar.");
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
