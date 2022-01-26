package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List_Estudante {
	public static void main(String[] args) {
		
		List<Estudante> turmaA = new ArrayList<>();
		
		turmaA.add(new Estudante("Pedro", 19));
		turmaA.add(new Estudante("Carlos", 23));
		turmaA.add(new Estudante("Mariana", 21));
		turmaA.add(new Estudante("João", 18));
		turmaA.add(new Estudante("Thiago", 20));
		turmaA.add(new Estudante("George", 22));
		turmaA.add(new Estudante("Larissa", 22));
		
		System.out.println("--- Ordem de Inserção ---");
		System.out.println(turmaA);
		
		turmaA.sort((first, second) -> first.getIdade() - second.getIdade());
		
		System.out.println("--- Ordem natural dos números - idade ---");
		System.out.println(turmaA);
		
		turmaA.sort((first, second) -> second.getIdade() - first.getIdade());
		
		System.out.println("--- Ordem reversa dos números - idade ---");
		System.out.println(turmaA);
		
		turmaA.sort(Comparator.comparing(Estudante::getIdade));
		
		System.out.println("--- Ordem natural dos números - idade (method reference) ---");
		System.out.println(turmaA);
		
		turmaA.sort(Comparator.comparing(Estudante::getIdade).reversed());
		
		System.out.println("--- Ordem reversa dos números - idade (method reference) ---");
		System.out.println(turmaA);
		
		Collections.sort(turmaA);
		
		System.out.println("--- Ordem natural dos numeros - idade (Interface Comparable)");
		System.out.println(turmaA);
		
		Collections.sort(turmaA, new Estudante_Comparator());
		
		System.out.println("--- Ordem reversa dos números - idade (Interface Comparator) ---");
		System.out.println(turmaA);
	}
}
