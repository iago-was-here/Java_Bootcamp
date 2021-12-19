import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<String> perg = new ArrayList<>();
		
		perg.add("Telefonou para a vítima ?");
		perg.add("Esteve no local do crime ?");
		perg.add("Mora perto da vítima ?");
		perg.add("Devia para a vítima ?");
		perg.add("Já trabalhou com a vítima ?");
		
		String resp;
		Integer cont = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println(perg.get(i));
			resp = scan.next();
			if(resp.equalsIgnoreCase("sim")) {
				cont++;
			}
		}
		
		if(cont == 2) {
			System.out.println("Suspeita");
		}else if((cont == 3) || (cont ==4)) {
			System.out.println("Cumplice");
		}else if(cont == 5) {
			System.out.println("Assasina");
		}else {
			System.out.println("Inocente");
		}
	}
}
