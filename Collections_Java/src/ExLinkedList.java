import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Exemplo retirado do livro Java - Como programar de Paul e harvey Deitel (10° Edição, 2016)
public class ExLinkedList {
	public static void main(String[] args) {
		//adiciona elementos cores à list
		String[] cores = {"preto","amarelo","verde","azul","violeta","prata"};
		List<String> list1 = new LinkedList <>();
		
		for (String cor : cores) {
			list1.add(cor);
		}
		
		//adiciona elementos cores2 à list2
		String[] cores2 = {"laranja","branco","marrom","azul","cinza","prata"};
		List<String> list2 = new LinkedList<>();
		
		for (String cor : cores2) {
			list2.add(cor);
		}
		
		list1.addAll(list2); //concatena as duas listas
		list2 = null; // libera recursos
		printList(list1);// Exibe os elementos da list1
		
		convertToUpperCaseStrings(list1);//converte as strings para letras maiusculas
		printList(list1);

		System.out.println("Deletando elementos 4 a 6");
		removeItems(list1, 4, 7);//remove itens de 4 a 6 da lista
		printList(list1);//imprime os elementos da list1
		printReversedList(list1);//Exibe a lista na ordem inversa
	}
	
	//obtém sublista e utiliza metodo clear para excluir os itens passados para a sublista
	private static void removeItems(List<String> list1, int i, int j) {
		list1.subList(i, j).clear(); //remove os itens
		
	}
	
	//exibe lista invertida
	private static void printReversedList(List<String> list1) {
		ListIterator<String> iterator = list1.listIterator(list1.size());
		
		System.out.println("Lista Invertida: ");
		
		while(iterator.hasPrevious())
			System.out.printf("%s ", iterator.previous());
	}
	
	//converte as strings da list em letras maiusculas
	private static void convertToUpperCaseStrings(List<String> list1) {
		ListIterator<String> iterator = list1.listIterator();
		
		while(iterator.hasNext()) {
			String cor = iterator.next();// obtem o item
			iterator.set(cor.toUpperCase());//converte em letras maiusculas
		}
		
		
	}
	private static void printList(List<String> list) {
		System.out.printf("%nList:%n");
		
		for (String cor : list) {
			System.out.printf("%s ",cor);
		}
		
		System.out.println();
	}
}
