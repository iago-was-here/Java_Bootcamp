package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

public class ExemploOrdenacaoSet {
	public static void main(String[] args) {
		
		System.out.println("Ordem aletória: ");
		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("got","fantasia",60));
			add(new Serie("dark","drama",60));
			add(new Serie("that 70's show","comédia",25));
		}};
		
		for (Serie serie : minhasSeries) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		System.out.println("ordem de inserção: ");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Serie("got","fantasia",60));
			add(new Serie("dark","drama",60));
			add(new Serie("that 70's show","comédia",25));
		}};
		for (Serie serie : minhasSeries1) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		
}
}
