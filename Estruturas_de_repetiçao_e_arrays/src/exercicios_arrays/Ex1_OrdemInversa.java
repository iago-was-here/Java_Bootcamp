package exercicios_arrays;

public class Ex1_OrdemInversa {
	public static void main(String[] args) {
		int[] vet = {0, 1, 2, 3 , 4 ,5};
		
		int i = 0;
		
		System.out.println("Vetor: ");
		while(i <= (vet.length-1)) {
			System.out.print(vet[i] + " ");
			i++;
		}
		System.out.println();
		
		System.out.println("Vetor na ordem inversa: ");
		for(i = (vet.length - 1); i >= 0; i--) {
			System.out.print(vet[i] + " ");
		}
	}
}
