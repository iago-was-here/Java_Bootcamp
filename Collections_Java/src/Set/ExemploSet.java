package Set;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
	public static void main(String[] args) {
		// Dada uma lista de 7 notas de um aluno {7, 8.5, 93, 5, 7, 0, 3.6}, faça: 
		
		System.out.println("Criar um conjunto e adicionar as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas);
		
		System.out.println("Exibir a posição da nota 5: ");
		System.out.println("Metódo Set não é possível trabalhar com posição");
		
		System.out.println("Conferir se a nota 5 está no coonjunto: " + notas.contains(5d));
		
		System.out.println("Exibir a menor nota: " + Collections.min(notas));
		System.out.println("Exibir a maior nota: " + Collections.max(notas));
		
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Exibir a soma das notas: " + soma);
		
		System.out.println("Exibir a média das notas: " + (soma)/notas.size());
		
		System.out.println("Remover a nota 0: " + notas.remove(0d));
		System.out.println(notas);
		
		System.out.println("remover notas menores que 7 e exibir na lista");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		System.out.println("Exibir na ordem que forem inseridas: ");
		Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas2);
		
		System.out.println("Exibir na ordem crescente: ");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		System.out.println("Deletar todo o conjunto: ");
		notas.clear();

		System.out.println("Conferir se está vazio: " + notas.isEmpty());
	}
}
