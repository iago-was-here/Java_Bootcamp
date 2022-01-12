import java.util.LinkedList;
import java.util.List;

//Exemplo retirado do livro Java - Como programar de Paul e harvey Deitel (10° Edição, 2016)
public class ExLinkedList {
	public static void main(String[] args) {
		//adiciona elementos cores à list
		String[] cores = {"preto","amarelo","verde","azul","violet","prata"};
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
		System.out.println(list1); // Exibe os elementos da list1
	
	}
}
