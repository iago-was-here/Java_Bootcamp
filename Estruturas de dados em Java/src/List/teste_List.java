package List;

import java.util.*;
import equals_hashCode.carro;

public class teste_List {
	public static void main(String[] args) {
		
		List<carro> listCarros = new ArrayList<>();
		
		listCarros.add(new carro("Ford"));
		listCarros.add(new carro("Chevrolet"));
		listCarros.add(new carro("Fiat"));
		listCarros.add(new carro("peugeot"));
		
		System.out.println(listCarros.contains(new carro("Ford")));
		//testamos o met�do contains.
		
		System.out.println(listCarros.get(2));
		//testamos o met�do get.
		
		System.out.println(listCarros.indexOf(new carro("Fiat")));
		//testamos o met�do indexOf.
		
		System.out.println(listCarros.remove(2));
		System.out.println(listCarros);
		//testamos o met�do remove;
	}
}
