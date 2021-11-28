package exercicios_arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String[] cons = new String[6];
		int qnt = 0, i = 0;
		
		do {
			System.out.println("Letra: ");
			String letra = scan.next();
			
			if(!(letra.equalsIgnoreCase("a") ||
					letra.equalsIgnoreCase("e") ||
					letra.equalsIgnoreCase("i") ||
					letra.equalsIgnoreCase("o") ||
					letra.equalsIgnoreCase("u") )){
				cons[i] = letra;
				qnt++;
			}
			i++;
		}while(i < cons.length);
		
		for (String string : cons) {
			if(string != null) {
				System.out.print(string + " ");
				}
		} 
		
		System.out.println();
		System.out.println("Quantidade de consoantes: "+qnt);
	}
}
