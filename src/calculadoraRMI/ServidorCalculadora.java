package calculadoraRMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * @author mmorais
 */
public class ServidorCalculadora {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(2020);
		    ServicoCalculadora obj = new ServicoCalculadoraImpl();
			Naming.rebind("//localhost:2020/Calculadora", obj);
			System.out.println("Serviço Calculadora Funcionando.");
		} catch (Exception e) {
			System.out.println("Problemas no Servidor:\n" + e.getMessage());
		}
	}
}