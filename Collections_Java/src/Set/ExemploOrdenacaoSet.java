package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*Dadas as seguintes informa��es sobre minhas s�ries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de epis�dio);
S�rie 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
S�rie 2 = nome: dark, genero: drama, tempoEpisodio: 60
S�rie 3 = nome: that '70s show, genero: com�dia, tempoEpisodio: 25
*/

public class ExemploOrdenacaoSet {
	public static void main(String[] args) {
		
		System.out.println("Ordem alet�ria: ");
		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("got","fantasia",60));
			add(new Serie("dark","drama",60));
			add(new Serie("that 70's show","com�dia",25));
		}};
		
		for (Serie serie : minhasSeries) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		System.out.println("ordem de inser��o: ");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Serie("got","fantasia",60));
			add(new Serie("dark","drama",60));
			add(new Serie("that 70's show","com�dia",25));
		}};
		for (Serie serie : minhasSeries1) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		
}
}
