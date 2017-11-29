package sequence;

import java.rmi.Naming;

/**
 * @author mmorais
 */
public class ServerSequence {

	public static void main(String[] args) {
		try {
		  Sequence obj = new SequenceImpl();
			Naming.rebind("//localhost:2020/sequence", obj);
			System.out.println("Servidor Funcionando.");
		} catch (Exception e) {
			System.out.println("Problemas no Servidor:\n" + e.getMessage());
		}
	}
}