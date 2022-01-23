package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
	public static void main(String[] args) {
		
		TreeSet<String> treeCapitais = new TreeSet<>();
		
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florian�polis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("S�o Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		System.out.println("Primeira: " + treeCapitais.first());
		
		System.out.println("Ultima: " + treeCapitais.last());
		
		System.out.println("Abaixo do parametro: " + treeCapitais.lower("Florian�polis"));
		
		System.out.println("Acima do parametro: " + treeCapitais.higher("Florian�polis"));
		
		System.out.println(treeCapitais);
		
		System.out.println("Exibe e remove a primeira: " + treeCapitais.pollFirst());
		System.out.println("Exibe e remove a ultima: " + treeCapitais.pollLast());
		System.out.println("Ap�s chamar o met�do poll: " + treeCapitais);
		
		Iterator<String> iteratorCapitais = treeCapitais.iterator();
		
		while(iteratorCapitais.hasNext()) {
			System.out.println("No While: " + iteratorCapitais.next());
		}
		
		for (String capital : treeCapitais) {
			System.out.println("No for: " + capital);
		}
		
		treeCapitais.clear();
		System.out.println("O conjunto de elementos est� vazio ? " + treeCapitais.isEmpty());
	}
}
