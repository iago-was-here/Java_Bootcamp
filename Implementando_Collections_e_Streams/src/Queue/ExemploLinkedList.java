package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
	
	public static void main(String[] args) {
		
		Queue <String> filabanco = new LinkedList<>();
		
		filabanco.add("Patricia");
		filabanco.add("Roberto");
		filabanco.add("Fl�vio");
		filabanco.add("Pamela");
		filabanco.add("Anderson");
		
		System.out.println("Exibe a fila: " + filabanco);
		
		String clienteASerAtendido = filabanco.poll();
		
		System.out.println("Cliente a ser atendido: " + clienteASerAtendido);
		System.out.println("Exibe a fila apos chamar o metodo pool: " + filabanco);
		
		String primeiroCliente = filabanco.peek();
		
		System.out.println("Primeiro cliente da fila: " + primeiroCliente);
		System.out.println("Exibe a fila ap�s chamar o met�do peek: " + filabanco);
		
		//filabanco.clear();
		
		System.out.println(filabanco.element());
		System.out.println(filabanco);
		
		System.out.println("Teste for each: ");
		for (String cliente : filabanco) {
			System.out.println(cliente);
		}
		
		
		
		Iterator<String> iteratorFilaBanco = filabanco.iterator();
		
		System.out.println("Teste Iterator: ");
		while(iteratorFilaBanco.hasNext()) {
			System.out.println(iteratorFilaBanco.next());
		}
		
		System.out.println("Tamanho da fila: " + filabanco.size());
		System.out.println("A fila est� vazia ? " + filabanco.isEmpty());
		
	}
}
