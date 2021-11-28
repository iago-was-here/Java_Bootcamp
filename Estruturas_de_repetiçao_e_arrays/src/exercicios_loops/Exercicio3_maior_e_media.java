package exercicios_loops;

import java.util.Scanner;

public class Exercicio3_maior_e_media {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num;
		int maior = 0;
		int soma = 0;
		
		int i = 0;
		do {
			System.out.println("Numero: ");
			num = scan.nextInt();
			soma = soma + num;
			
			if(num > maior) {
				maior = num;
			}
			
			i++;
		}while(i < 5);
		System.out.println("Maior: "+maior);
		System.out.println("Média: "+(soma/i));
	}

}
