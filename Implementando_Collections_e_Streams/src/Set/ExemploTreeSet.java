package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
	public static void main(String[] args) {
		
		TreeSet<String> treeCapitais = new TreeSet<>();
		
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florianópolis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		System.out.println("Primeira: " + treeCapitais.first());
		
		System.out.println("Ultima: " + treeCapitais.last());
		
		System.out.println("Abaixo do parametro: " + treeCapitais.lower("Florianópolis"));
		
		System.out.println("Acima do parametro: " + treeCapitais.higher("Florianópolis"));
		
		System.out.println(treeCapitais);
		
		System.out.println("Exibe e remove a primeira: " + treeCapitais.pollFirst());
		System.out.println("Exibe e remove a ultima: " + treeCapitais.pollLast());
		System.out.println("Após chamar o metódo poll: " + treeCapitais);
		
		Iterator<String> iteratorCapitais = treeCapitais.iterator();
		
		while(iteratorCapitais.hasNext()) {
			System.out.println("No While: " + iteratorCapitais.next());
		}
		
		for (String capital : treeCapitais) {
			System.out.println("No for: " + capital);
		}
		
		treeCapitais.clear();
		System.out.println("O conjunto de elementos está vazio ? " + treeCapitais.isEmpty());
	}
}
