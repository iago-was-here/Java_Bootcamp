package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
	public static void main(String[] args) {
		
		List<String> turmaA = new ArrayList<>();
		
		turmaA.add("Pedro");
		turmaA.add("Thayse");
		turmaA.add("Marcelo");
		turmaA.add("Carla");
		turmaA.add("Juliana");
		turmaA.add("Thiago");
		turmaA.add("Rafael");
		
		System.out.println("Contagem: " + turmaA.stream().count());
		
		System.out.println("Maior numero de letras: " + turmaA.stream().max(Comparator.comparing(String::length)));
		
		System.out.println("Menor numero de letras: " + turmaA.stream().min(Comparator.comparing(String::length)));
		
		System.out.println("Com a letra R no nome: " + turmaA.stream().filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
		
		System.out.println("Retorna uma nova coleção com a quantidade de letras: " + turmaA.stream().map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
		
		System.out.println("Retorna os 3 primeiros elementos: " + turmaA.stream().limit(3).collect(Collectors.toList()));
		
		System.out.println("Retorna os elementos: " + turmaA.stream().peek(System.out::println).collect(Collectors.toList()));
		
		System.out.println("Retorna os elementos novamente: ");
		turmaA.stream().forEach(System.out::println);
		
		System.out.println("Todos elementos algum elemento com W no nome ?" + turmaA.stream().allMatch((elemento) -> elemento.contains("W")));
		
		System.out.println("Tem algum elemento com a minuscula no nome ?" + turmaA.stream().anyMatch((elemento) -> elemento.contains("a")));
		
		System.out.println("Não Tem nenhum elemento com a minuscula no nome ?" + turmaA.stream().noneMatch((elemento) -> elemento.contains("a")));
		
		System.out.println("Retorna o primeiro elemento da coleção: ");
		turmaA.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println("Operação encadeada: ");
		System.out.println(turmaA.stream().peek(System.out::println).map(estudante -> estudante.concat(String.valueOf(estudante.length()))).peek(System.out::println).filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
	}
}
