package exercicios_loops;

import java.util.Scanner;

public class exercicio1_nome_e_idade {
	public static void main(String[] args) {
		String Nome;
		int idade;
		
		while(true) {
			Scanner scan = new Scanner (System.in);
			System.out.println("Nome: ");
			Nome = scan.next();
			if(Nome.equals("0"))break;
			System.out.println("Idade: ");
			idade = scan.nextInt();
		}
	}
}
