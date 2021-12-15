package equals_hashCode;

import java.util.ArrayList;
import java.util.List;

public class teste_carro {
	public static void main(String[] args) {
		
		List<carro> listaCarros = new ArrayList<>();
		
		listaCarros.add(new carro("Ford"));
		listaCarros.add(new carro("Chevrolet"));
		listaCarros.add(new carro("Volkswagen"));
		
		System.out.println(listaCarros.contains(new carro("Ford")));
		//testamos se existe uma marca "Ford" na lista de carros.
		
		System.out.println(new carro("Ford").hashCode());
		//testamos para exibir o hashCode do objeto "Ford".
		
		System.out.println(new carro("Ford1").hashCode());
		//testamos o hasCode de outro objeto.
		
		carro carro1 = new carro("Ford");
		carro carro2 = new carro("Chevrolet");
		System.out.println(carro1.equals(carro2));
		//testamos o metódo equals
		
		
	}
}
