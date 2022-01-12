package Map;

import java.util.*;
/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - contato = nome: Simba, numero: 2222;
id = 4 - contato = nome: Cami, numero: 5555;
id = 3 - contato = nome: Jon, numero: 1111;
*/

public class Exercicio3 {
	public static void main(String[] args) {
		System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, contato> agenda = new HashMap<>() {{
           put(1, new contato("Simba", 5555));
           put(4, new contato("Cami", 1111));
           put(3, new contato("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new contato("Simba", 5555));
            put(4, new contato("Cami", 1111));
            put(3, new contato("Jon", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem número telefone\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, contato>> set1 = new TreeSet<>(new ComparatorOrdemNomecontato());
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}

class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, contato>> {
    @Override
    public int compare(Map.Entry<Integer, contato> cont1, Map.Entry<Integer, contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}

class ComparatorOrdemNomecontato implements Comparator<Map.Entry<Integer, contato>> {
    @Override
    public int compare(Map.Entry<Integer, contato> cont1, Map.Entry<Integer, contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}
