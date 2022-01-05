package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

public class ExemploOrdenacaoSet {
	public static void main(String[] args) {
		
		System.out.println("--\tORDEM ALEATÓRIA:\t-- ");
		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("got","fantasia",60));
			add(new Serie("dark","drama",60));
			add(new Serie("that 70's show","comédia",25));
		}};
		
		for (Serie serie : minhasSeries) {
			System.out.printf("%s - %s - %d\n",serie.getNome(),serie.getGenero(),serie.getTempoEpisodio());
			//System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		System.out.println("--\tORDEM DE INSERÇÃO:\t-- ");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Serie("got","fantasia",60));
			add(new Serie("dark","drama",60));
			add(new Serie("that 70's show","comédia",25));
		}};
		for (Serie serie : minhasSeries1) {
			System.out.printf("%s - %s - %d\n",serie.getNome(),serie.getGenero(),serie.getTempoEpisodio());
			//System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		System.out.println("--\tORDEM NATURAL: (TEMPO DE EPISÓDIO)\t--");
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
		for (Serie serie : minhasSeries2) {
			System.out.printf("%s - %s - %d\n",serie.getNome(),serie.getGenero(),serie.getTempoEpisodio());
			//System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		System.out.println("--\tORDEM NOME/GÊNERO/TEMPO EPISODIO: \t--");
		Set<Serie> minhasSeries3 = new TreeSet<>(new comparatorNGTE());
		minhasSeries3.addAll(minhasSeries);
		
		for (Serie serie : minhasSeries3) {
			System.out.printf("%s - %s - %d\n",serie.getNome(),serie.getGenero(),serie.getTempoEpisodio());
			//System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
}
}

class comparatorNGTE implements Comparator<Serie>{
	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if(nome != 0) return nome;
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0) return genero;
		
		return  Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
		
		
	}
}
