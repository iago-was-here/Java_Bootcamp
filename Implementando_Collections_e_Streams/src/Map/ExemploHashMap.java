package Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
	public static void main(String[] args) {
		Map<String, Integer> campeoesMundialFifa = new HashMap<String, Integer>();
		
		campeoesMundialFifa.put("Brasil", 5);
		campeoesMundialFifa.put("Alemanha", 4);
		campeoesMundialFifa.put("Itália", 4);
		campeoesMundialFifa.put("Uruguai", 2);
		campeoesMundialFifa.put("Argentina", 2);
		campeoesMundialFifa.put("França", 2);
		campeoesMundialFifa.put("Inglaterra", 1);
		campeoesMundialFifa.put("Espanha", 1);
		
		System.out.println(campeoesMundialFifa);
		
		campeoesMundialFifa.put("Brasil", 6);
		
		System.out.println("Após atualização do registro Brasil: " + campeoesMundialFifa);
		
		System.out.println(campeoesMundialFifa.get("Argentina"));//Retorna a Argentina
		
		System.out.println("Há França no registro ? " + campeoesMundialFifa.containsKey("França"));
		
		campeoesMundialFifa.remove("França");
		
		System.out.println("(após a remoção).Há França no registro ? " + campeoesMundialFifa.containsKey("França"));
		
		System.out.println("Há seleção hexacampea ? " + campeoesMundialFifa.containsValue(6));
		
		System.out.println("Tamanho do mapa: " + campeoesMundialFifa.size());
		
		for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
			System.out.println(entry.getKey() + "-----" + entry.getValue());
		}
		
		for (String key : campeoesMundialFifa.keySet()) {
			System.out.println(key + "-----" + campeoesMundialFifa.get(key));
		}
		
		System.out.println(campeoesMundialFifa);
		
		campeoesMundialFifa.clear();
		System.out.println("Tamanho do mapa: " + campeoesMundialFifa.size());
	}
}
