import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Double> temp = new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			Double aux;
			aux = scan.nextDouble();
			temp.add(aux);
		}
		// todas as temperaturas
		System.out.println(temp);
		
		//media semestral da temperatura
		Double soma = 0d;
		for(int i = 0; i < 6; i++) {
			soma += temp.get(i);
		}
		System.out.println("Media Semestral: " + soma/6);
		
		//temperaturas acima da media
		for(int i = 0; i < 6; i++) {
			if(temp.get(i) > (soma/6)) {
				System.out.print("Acima da media:  " + temp.get(i));
				//Exibir o mês que ocorreram
				if(i == 0) {
					System.out.print(" Janeiro\n");
				}else if(i == 1) {
					System.out.print(" Fevereiro\n");
				}else if(i == 2) {
					System.out.print(" Março\n");
				}else if(i == 3) {
					System.out.print(" Abril\n");
				}else if(i == 4) {
					System.out.print(" Maio\n");
				}else {
					System.out.print(" Junho\n");
				}
			}
		}	
	}
}
