package exemploRMI;

import java.rmi.Naming;

/**
 * @author mmorais
 */
public class Server {

	public static void main(String[] args) {
		try {
		  OlaRemoto obj = new OlaImpl();
			Naming.rebind("//localhost:2020/Exemplo", obj);
			System.out.println("Servidor Funcionando.");
		} catch (Exception e) {
			System.out.println("Problemas no Servidor:\n" + e.getMessage());
		}
	}
}