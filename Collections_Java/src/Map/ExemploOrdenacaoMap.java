package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {
	public static void main(String[] args) {
		
		System.out.println("Ordem Aleatória: ");
		Map<String, Livro> meusLivros = new HashMap<>() {{
			put("Hawking, Stephen", new Livro("Uma breve história do tempo",256));
			put("Duhhig, Charles", new Livro("O poder do hábito",408));
			put("Harari, Yuval Noah", new Livro("21 liçoes para o século 21",256));
		}};
		
		for(Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey() + "-" + livro.getValue().getNome());
		}
		System.out.println("Ordem de Inserção: ");
		Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
			put("Hawking, Stephen", new Livro("Uma breve história do tempo",256));
			put("Duhhig, Charles", new Livro("O poder do hábito",408));
			put("Harari, Yuval Noah", new Livro("21 liçoes para o século 21",256));
		}};
		
		for(Map.Entry<String, Livro> livro1 : meusLivros1.entrySet()) {
			System.out.println(livro1.getKey() + "-" + livro1.getValue().getNome());
		}
		
		System.out.println("Ordem Natural");
		Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
		
		for(Map.Entry<String, Livro> livro2 : meusLivros2.entrySet()) {
			System.out.println(livro2.getKey() + "-" + livro2.getValue().getNome());
		}
		
		System.out.println("Ordem Natural dos livros: ");
		Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new comparatorNome());
		meusLivros3.addAll(meusLivros.entrySet());
		for(Map.Entry<String, Livro> livro : meusLivros3) {
			System.out.println(livro.getKey() + "-" + livro.getValue().getNome());
		}
		
		
		}
	}
	
	class Livro {
		private String nome;
		private Integer paginas;
		
		public Livro(String nome, Integer pagina) {
			this.nome = nome;
			this.paginas = paginas;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Integer getPaginas() {
			return paginas;
		}
		public void setPaginas(Integer paginas) {
			this.paginas = paginas;
		}
		
		@Override
		public String toString() {
			return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
		}
	}
	
	class comparatorNome implements Comparator<Map.Entry<String, Livro>>{

		@Override
		public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
			
			return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
		}
		
	}
