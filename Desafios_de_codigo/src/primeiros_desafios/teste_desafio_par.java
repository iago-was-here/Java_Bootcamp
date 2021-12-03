package primeiros_desafios;

import java.util.Scanner;

public class teste_desafio_par {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (int i = 0; i < N; i++) {
    		int x = leitor.nextInt();
    		
    		if(x == 0) {
    			System.out.println("NULL");
    		}else if(((x % 2) == 0) && (x > 0)){
    			System.out.println("EVEN POSITIVE");
    		}else if(((x % 2) == 0) && (x < 0)){
    			System.out.println("EVEN NEGATIVE");
    		}else if(((x % 2) != 0) && (x > 0)) {
    			System.out.println("ODD POSITIVE");
    		}else if(((x % 2) != 0) && (x < 0)) {
    			System.out.println("ODD NEGATIVE");
    		}
    	}
    	leitor.close();
	}
}
