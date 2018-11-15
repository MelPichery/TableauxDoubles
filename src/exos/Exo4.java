package exos;

public class Exo4 {

	public static void main(String[] args) {
		
		float d1 = 1.5f;
		System.out.println("Je vais à \u20ac la ligne");
		
		
		tableau(2,2);
		
		
		imprimTableau(tableau(3,3));
		
	}
	
	public static int[][] tableau(int taillei, int taillej) {
		
		int[][] tab = new int[taillei][taillej];
		
		for (int i = 0; i < taillei; i++) {
			for (int j = 0; j < taillej; j++) {
				
				 tab[i][j]=0;
				
			}
			
		}
		 return tab;
	}
	

	
	public static void imprimTableau(int tableau[][]) {
		
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau.length; j++) {
				System.out.print(tableau[i][j]+"  ");
			}
			System.out.println();	  
		}
		
	}

}
