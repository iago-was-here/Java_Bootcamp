package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class teste_Map {
	public static void main(String[] args) {
		
		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("Nome", "Jo�o");
		aluno.put("Idade", "17");
		aluno.put("M�dia", "8.5");
		aluno.put("Turma", "3A");
		
		System.out.println(aluno);
		
		System.out.println(aluno.keySet());
		//met�do KeySet retorna as chaves;
		
		System.out.println(aluno.values());
		//met�do value retorna os valores;
		
		List<Map<String, String>> listaAlunos = new ArrayList<>();
		
		listaAlunos.add(aluno);
		
		Map<String, String> aluno2 = new HashMap<>();
		
		aluno2.put("Nome", "Maria");
		aluno2.put("Idade", "18");
		aluno2.put("M�dia", "8.9");
		aluno2.put("Turma", "3B");
		
		listaAlunos.add(aluno2);
		
		System.out.println(listaAlunos);
		
		System.out.println(aluno.containsKey("Nome"));
	}
}
