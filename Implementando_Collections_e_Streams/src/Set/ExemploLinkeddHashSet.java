package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkeddHashSet {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(16);
		
		System.out.println(sequenciaNumerica);
		
		sequenciaNumerica.remove(4);
		System.out.println("Após a remoção: " + sequenciaNumerica);
		
		System.out.println("Quantidade de numeros na sequencia: " + sequenciaNumerica.size());
		
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("No while: " + iterator.next());
		}
		
		for (Integer num : sequenciaNumerica) {
			System.out.println("No for: " + num);
		}
		
		sequenciaNumerica.clear();
		System.out.println("O conjunto de elementos está vazio ? " + sequenciaNumerica.isEmpty());
	}
}
