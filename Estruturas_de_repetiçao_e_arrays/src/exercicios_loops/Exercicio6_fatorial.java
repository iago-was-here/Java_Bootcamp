package exercicios_loops;

import java.util.Scanner;

public class Exercicio6_fatorial {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Fatorial: ");
		int fat = scan.nextInt();
		
		int i, multi = 1;
		
		System.out.print(fat + "! = ");
		for(i = fat; i >= 1; i--) {
			multi = multi * i;
		}
		System.out.println(multi);		
	}
}
