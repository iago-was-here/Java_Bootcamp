package Listas_Duplamente_Encadeadas;

public class teste {
	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<String>();
		minhaLista.add("c1");
		minhaLista.add("c2");
		minhaLista.add("c3");
		minhaLista.add("c4");
		minhaLista.add("c5");
		minhaLista.add("c6");
		minhaLista.add("c7");
		
		System.out.println(minhaLista);
		
		minhaLista.remove(3);
		minhaLista.add(3, "99");
		System.out.println(minhaLista);
		
		System.out.println(minhaLista.get(3));
	}
}
