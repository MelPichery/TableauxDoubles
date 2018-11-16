package exos;

public class Exo1 {

	public static void main(String[] args) {
		
		//déclaration des variables et initialisation
		int valmax = Integer.MIN_VALUE; 
		int[][] tab= {{0,6,2,0,6,2,2,8,9,10,11,12},{0,6,2,30,6,2,2,8,9,10,11,12},{0,6,2,0,6,2,2,8,9,10,11,12},{0,6,2,0,32,2,2,8,9,10,11,12},{0,6,2,0,6,2,2,8,9,10,11,12},{0,6,2,0,6,2,2,8,9,10,11,12},{0,6,2,0,150,2,2,8,9,10,11,12},{0,6,2,90,6,2,2,8,9,10,11,12}} ;
		
		//lecture du tableau
		for (int i = 0; i < 8; i++) {
			
			for (int j = 0; j < 12; j++) {
				
				//Si la valeur du tableau en i,j est supérieur alors valmax prend la valeur du tableau en i,j
				if (tab[i][j]>valmax) {
				
					valmax = tab[i][j];
					
				}
				
			}
			
		}
		
		//Affichage de valmax
		System.out.println("La valeur max est :"+valmax);
		
	}

}
