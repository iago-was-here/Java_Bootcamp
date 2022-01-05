package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
	public static void main(String[] args) {
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopulares);
		
		//substituir o consumo do gol por 15.2 km/l
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		
		//conferir se contem o modelo tucson
		System.out.println(carrosPopulares.containsKey("tucson"));
		
		//Exibir o consumo do uno
		System.out.println(carrosPopulares.get("uno"));
		
		//Exiba os modelos
		System.out.println(carrosPopulares.keySet());
		
		//Exiba os consumos dos carros
		System.out.println(carrosPopulares.values());
		
		//Exibir o modelo mais economica e seu consumo
		Double melhorConsumo = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		
		String modeloMaisEficiente = "";
		
		for (Map.Entry<String, Double> entry : entries) {
			if(entry.getValue().equals(melhorConsumo)) modeloMaisEficiente = entry.getKey();
		}
		
		System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + melhorConsumo);
		
		//Exibir o modelo menos economico e seu consumo
		Double maiorConsumo = Collections.min(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
		
		String modeloMenosEficiente = "";
		
		for (Map.Entry<String, Double> entry : entries1) {
			if(entry.getValue().equals(maiorConsumo)) modeloMenosEficiente = entry.getKey();
		}
		System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + maiorConsumo);
		
		//exiba a soma dos consumos
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("Soma dos consumos: " + soma);
		
		//exiba a media dos consumos
		System.out.println("Media: " + (soma/carrosPopulares.size()));
		
		//remover os carros que possuem consumo 15.6
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next().equals(15.6)) iterator1.remove();
		}
		System.out.println(carrosPopulares);
		
		//Exibir na ordem que forem inseridos
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopulares1);
		
		//Exibir ordenado pelo modelo
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		System.out.println(carrosPopulares2);
		
		//Deletar o conjunto de carros
		carrosPopulares.clear();
		
		//conferir se esta vazio
		System.out.println(carrosPopulares.isEmpty());
	}
	}
