import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		// criar uma lista e adicionar sete notas.
		List<Double> notas = new ArrayList<>();
		
		notas.add(10.0);
		notas.add(8.5);
		notas.add(4.5);
		notas.add(6d);
		notas.add(9d);
		notas.add(7d);
		notas.add(5.5);
		
		System.out.print("As notas são: ");
		System.out.println(notas);
		
		//exibir a posição da nota 6d
		System.out.print("Posição 6d: ");
		System.out.println(notas.indexOf(6d));
		
		//adicionar a nota 8 na posição 4
		notas.add(4, 8d);
		System.out.println(notas);
		
		//substituir a nota 6d por 7d
		notas.set(3, 7d);
		System.out.println(notas);
		
		//conferir se a nota 6d está na lista
		System.out.println("A nota 6.0 esta na lista ? "+ notas.contains(6d));
		
		//exibir todas as notas na ordem que foram informados;
		//for (Double nota : notas) System.out.println(nota);
		
		//exibir a terceira nota adicionada
		System.out.println("Terceira nota: " + notas.get(2));
		
		//exibir a menor nota
		System.out.println("Menor nota: " + Collections.min(notas));
		
		//exibir a maior nota
		System.out.println("Maior nota: " + Collections.max(notas));
		
		//exibir a soma dos valores:
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Soma das notas: " + soma);
		
		//exibir a media das notas
		System.out.println("Media das notas: " + soma/notas.size());
		
		//remover a nota  de indice 0
		notas.remove(0);
		System.out.println(notas);
		//funciona de forma similar para remover passando o objeto como parametro;
		
		//remover as notas menores que 7 e exibir a lista;
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7) {
				iterator1.remove();
			}
		}
		System.out.println(notas);
		
		// apague toda a lista
		notas.clear();
		System.out.println(notas);
		
		//Conferir se a lista está vazia
		System.out.println(notas.isEmpty());
	}
	
}
