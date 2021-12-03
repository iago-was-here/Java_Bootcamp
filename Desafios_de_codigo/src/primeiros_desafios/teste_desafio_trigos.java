package primeiros_desafios;

import java.util.Scanner;

public class teste_desafio_trigos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0 ; i <= n ; i++) {
			int x = sc.nextInt();
			double quantidadeDeGraos = Math.pow(2, x) - 1;
			long qntKg = (long) (quantidadeDeGraos / 12000.0);
			System.out.printf("%d%s\n", qntKg, " kg");
		}
		sc.close();
	}
}
