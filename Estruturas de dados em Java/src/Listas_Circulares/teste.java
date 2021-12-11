package Listas_Circulares;

public class teste {
	public static void main(String[] args) {
		ListaCircular<String> minhaLista = new ListaCircular<>();
		
		minhaLista.add("c0");
		System.out.println(minhaLista);
		
		minhaLista.remove(0);
		System.out.println(minhaLista);
		
		minhaLista.add("c1");
		System.out.println(minhaLista);
		
		minhaLista.add("c2");
		minhaLista.add("c3");
		System.out.println(minhaLista);
		
		// Testando o loop da lista;
		//System.out.println(minhaLista.get(0));
		//System.out.println(minhaLista.get(1));
		//System.out.println(minhaLista.get(2));
		//System.out.println(minhaLista.get(3));
		//System.out.println(minhaLista.get(4));
		//System.out.println(minhaLista.get(5));
		
		for(int i = 0; i < 20;i++) {
			System.out.println(minhaLista.get(i));
		}
	}
}
