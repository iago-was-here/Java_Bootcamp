package exercicios_loops;

import java.util.Scanner;

public class Exercicio5_tabuada {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int n,i;
		
		System.out.println("Escolha uma tabuada de 1 a 10: ");
		n = scan.nextInt();
		System.out.println("Tabuada de "+n);
		for(i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
	}
}
