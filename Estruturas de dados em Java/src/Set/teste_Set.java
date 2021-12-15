package Set;

import java.util.*;
import equals_hashCode.carro;

public class teste_Set {
	public static void main(String[] args) {
		Set<carro> hashSetCarros = new HashSet<>();
		
		hashSetCarros.add(new carro("Ford"));
		hashSetCarros.add(new carro("Chevrolet"));
		hashSetCarros.add(new carro("Fiat"));
		hashSetCarros.add(new carro("Peugeot"));
		hashSetCarros.add(new carro("Zip"));
		hashSetCarros.add(new carro("Alfa Romeo"));
		
		System.out.println(hashSetCarros);
		
		Set<carro> treeSetCarros = new TreeSet<>();
		treeSetCarros.add(new carro("Ford"));
		treeSetCarros.add(new carro("Chevrolet"));
		treeSetCarros.add(new carro("Fiat"));
		treeSetCarros.add(new carro("Peugeot"));
		treeSetCarros.add(new carro("Zip"));
		treeSetCarros.add(new carro("Alfa Romeo"));
		
		System.out.println(treeSetCarros);
	}
}
