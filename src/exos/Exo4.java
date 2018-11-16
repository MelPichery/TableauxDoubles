package exos;

public class Exo4 {

	public static void main(String[] args) {
		
		//ex�cution de la m�thode tableau
		tableau(2,2);
		
		//ex�cution de la m�thode imprimTableau
		imprimTableau(tableau(3,3));
		
	}
	
	//m�thode tableau qui retourne un tableau de int multidimensionnel
	public static int[][] tableau(int taillei, int taillej) {
		
		//Cr�ation du tableau tab avec la taille des colonnes et la taille des lignes entr�es en param�tre
		int[][] tab = new int[taillei][taillej];
		
		//initialisation des valeurs du tableau � 0 pour chaque index i et j
		for (int i = 0; i < taillei; i++) {
			for (int j = 0; j < taillej; j++) {
				
				 tab[i][j]=0;
				
			}
			
		}
		 return tab;
	}
	

	//m�thode imprimTableau qui ne renvoie rien
	public static void imprimTableau(int tableau[][]) {
		
		//Pour chaque index du tableau, on affiche la valeur avec un retour � la ligne � chaque changment de ligne
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau.length; j++) {
				System.out.print(tableau[i][j]+"  ");
			}
			System.out.println();	  
		}
		
	}

}
