package exercicios_loops;

import java.util.Scanner;

public class Exercicio4_par_e_impar {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int quantN;
		int num, par = 0, impar = 0;
		
		System.out.println("Quantidade de numeros: ");
		quantN = scan.nextInt();
		
		int i = 0;
		
		do {
			System.out.println("Numero: ");
			num = scan.nextInt();
			if(num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			
			i++;
		}while(i < quantN);
		
		System.out.println("Pares: "+par);
		System.out.println("Impares: "+impar);
	}
}
