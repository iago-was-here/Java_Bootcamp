package primeiros_desafios;

import java.util.Scanner;

public class teste_desafio_fuso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasaida = sc.nextInt();
		int tempoviagem = sc.nextInt();
		int fuso = sc.nextInt();
		
		int ajuste = horasaida + tempoviagem + fuso;
		
		if(ajuste < 24){
		  	System.out.println(ajuste);
		}else if(ajuste == 24){
		  ajuste = 0;
		  System.out.println(ajuste);
		}else{
		  ajuste = ajuste - 24;
		  System.out.println(ajuste);
		}
		
		sc.close();
	}
}
