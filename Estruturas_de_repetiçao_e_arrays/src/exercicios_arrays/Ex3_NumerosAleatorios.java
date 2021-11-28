package exercicios_arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {
	public static void main(String[] args) {
				
		Random random = new Random ();
		
		int[] nAle = new int [20];
		
		for(int i = 0; i < nAle.length; i++) {
			int num = random.nextInt(100);
			nAle[i] = num;
		}
		
		System.out.print("Numeros aleatorios: ");
		for (int numero : nAle) {
			System.out.print(numero + " ");
		}
		
		System.out.print("\nSucessores dos numeros aleatorios: ");
		for (int numero : nAle) {
			System.out.print((numero + 1) + " ");
		}
		
		System.out.print("\nAntecessores dos numeros aleatorios: ");
		for (int numero : nAle) {
			System.out.print((numero - 1) + " ");
		}
		
	}
}
