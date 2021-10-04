package no.hvl.dat100;

import java.util.Arrays;

public class ObliggOppgave1B {

	public static void main(String[] args) {
		
		int [][] matrise = { {1,2,3}, 
							{4,5,6}, 
							{7,8,9} 
		};
		int [][] matrise2 = { {1,2,3}, 
				{4,5,6}, 
				{7,8,9} 
};			
		//skrivUtv1(matrise); (Del A, skrive ut matrise)
		//String matStr = tilStreng(matrise); (Del B, returnerer string-representation)
		//System.out.println(matStr);
		//skrivUtv1(skaler(2,matrise)); //(Del C, returnerer ny matrise ganget med tall)
		System.out.println(erLik(matrise,matrise2)); //(Del D, avgjør om to matriser er like)
		
	}

		public static void skrivUtv1(int[][] matrise) {
		
			
		for (int i = 0; i < matrise.length; i++) {
			System.out.print("{");
			for (int j = 0; j < matrise.length; j++) {
				System.out.print(matrise[i][j]);
				System.out.print(",");
			}
			System.out.print("}");
			System.out.print("\n");
			}
	}
		public static String tilStreng(int[][] matrise) {
			
			String matStr = "";
			for (int i = 0; i < matrise.length; i++) {
				
				for (int j = 0; j < matrise.length; j++) {
					int matInt = matrise[i][j];
					matStr += matInt;
					
				}
				matStr += "\n";
		}
			
			return matStr;
}
		public static int[][] skaler(int tall, int[][] matrise) {
			int [][] matKopi = matrise;
			
			for (int i = 0; i < matrise.length; i++) {
				for (int j = 0; j < matrise.length; j++) {
					matKopi [i][j] = matrise[i][j] * tall;
				}
			}
			return matKopi;
		}
		public static boolean erLik(int[][] mat1, int[][] mat2) {
			boolean lik = true;
			for (int i = 0; i < mat1.length; i++) {
				for (int j = 0; j < mat1.length; j++) {
					if (mat1[i][j] != mat2 [i][j]) {
						lik = false;
					}
				}
				
			}
			return lik;
		}
	
}