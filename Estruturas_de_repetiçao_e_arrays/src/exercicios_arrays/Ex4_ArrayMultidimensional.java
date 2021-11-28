package exercicios_arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
	public static void main(String[] args) {
		Random random = new Random ();
		
		int[][] mat = new int[4][4];
		
		 for(int i = 0; i < mat.length; i ++) {
			 for(int j = 0; j < mat[i].length; j++) {
				 
				 mat[i][j] = random.nextInt(9);
			 }
		 }
		 
		 System.out.println("Matriz: ");
		 for (int[] linha : mat) {
			for (int eleColuna : linha) {
				System.out.print(eleColuna + " ");
			}
			System.out.println();
		}
	}
}
