package Queue;

import java.util.LinkedList;
import java.util.Queue;

import equals_hashCode.carro;

public class teste_queue {
	public static void main(String[] args) {
		// teste da estrutura fila.
		
		Queue<carro> queueCarros = new LinkedList<>();
		
		queueCarros.add(new carro("Ford"));
		queueCarros.add(new carro("Chevrolet"));
		queueCarros.add(new carro("Fiat"));
		
		System.out.println(queueCarros.add(new carro("peugeot")));
		System.out.println(queueCarros);
		//testamos o met�do add.
		
		
		System.out.println(queueCarros.offer(new carro("Renault")));
		System.out.println(queueCarros);
		//testamos o met�do offer.
		
		System.out.println(queueCarros.peek());
		System.out.println(queueCarros);
		//testamos o met�do peek.
		
		System.out.println(queueCarros.poll());
		System.out.println(queueCarros);
		//testamos o met�do pool.
		
		System.out.println(queueCarros.isEmpty());
		//testamos o met�do isEmpty.
	}
}
