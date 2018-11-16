package exos;

public class Exo4 {

	public static void main(String[] args) {
		
		//exécution de la méthode tableau
		tableau(2,2);
		
		//exécution de la méthode imprimTableau
		imprimTableau(tableau(3,3));
		
	}
	
	//méthode tableau qui retourne un tableau de int multidimensionnel
	public static int[][] tableau(int taillei, int taillej) {
		
		//Création du tableau tab avec la taille des colonnes et la taille des lignes entrées en paramètre
		int[][] tab = new int[taillei][taillej];
		
		//initialisation des valeurs du tableau à 0 pour chaque index i et j
		for (int i = 0; i < taillei; i++) {
			for (int j = 0; j < taillej; j++) {
				
				 tab[i][j]=0;
				
			}
			
		}
		 return tab;
	}
	

	//méthode imprimTableau qui ne renvoie rien
	public static void imprimTableau(int tableau[][]) {
		
		//Pour chaque index du tableau, on affiche la valeur avec un retour à la ligne à chaque changment de ligne
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau.length; j++) {
				System.out.print(tableau[i][j]+"  ");
			}
			System.out.println();	  
		}
		
	}

}
