package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Carlos");				
		nomes.add("Pedro");				
		nomes.add("Juliana");
		nomes.add("Anderson");
		nomes.add("Maria");				
		nomes.add("Jo�o");
		
		System.out.println(nomes);//exibindo a lista com a ordem de inser��o
		
		nomes.set(2, "Larissa");
		System.out.println(nomes);
		
		//ordenando de forma natural
		
		Collections.sort(nomes);
		System.out.println(nomes);//Exibindo a lista ordenada
		
		nomes.set(2, "Wesley");
		System.out.println(nomes); //Exibindo a lista ap�s altera��o com a lista j� ordenada
		
		nomes.remove(4);
		System.out.println(nomes);//Exibindo ap�s remo��o por indice
		
		nomes.remove("Wesley");
		System.out.println(nomes);//Exibindo ap�s remo��o diretamente pelo elemento
		
		String nome = nomes.get(1);
		System.out.println(nome);//testando o get
		
		System.out.println("Tamanho da lista: " + nomes.size());
		
		System.out.println("H� Anderson na lista ? " + nomes.contains("Anderson"));
		
		System.out.println("A lista esta vazia ? " + nomes.isEmpty());
		
		//nomes.clear(); 
		System.out.println("A lista esta vazia ? " + nomes.isEmpty());
		
		for (String nome1 : nomes) {
			System.out.println("--->" + nome1);
		}
		
		Iterator<String> iterator = nomes.iterator();
		while(iterator.hasNext()) {
			System.out.println("Testando o iterator: " + iterator.next());
		}
	}
}
