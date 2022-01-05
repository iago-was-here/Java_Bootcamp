package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex1 {
	public static void main(String[] args) {
		
		Set<String> rainbow = new HashSet<String>(Arrays.asList("Vermelho","Laranja","Amarelo","verde","Azul","Anil","Violeta"));
		System.out.printf("A) ");
		for (String cor : rainbow) {
			System.out.printf("%s\n",cor);
		}
		
		System.out.println("B) " + rainbow.size());
		
		Set<String> rainbow1 = new TreeSet<String>(rainbow);
		System.out.printf("C) ");
		for (String cor : rainbow1) {
			System.out.printf("%s\n",cor);
		}
		
		Iterator<String> iterator = rainbow.iterator();
		
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
	}
}
