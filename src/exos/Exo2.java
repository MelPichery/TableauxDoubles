package exos;

import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		
		//D�claration et initialisation des variables
		int totalmat=0,moymat=0,moytotal=0,moydesmoy=0;
		int[][] tab = new int[4][3];
		int[] moy = new int[4];
		
		//lecture du tableau tab
		for (int i = 0; i < 4; i++) {
			
			//R�initialisation de totalmat � 0 � chaque changement de mati�re
			totalmat=0;
			
			for (int j = 0; j < 3; j++) {
				
				//Affichage de la consigne et sauvegarde de la note donn�e par l'utilisateur dans le tableau tab
				System.out.println("Entrez la note"+(j+1)+" de la mati�re"+(i+1));
				Scanner sc = new Scanner(System.in);
				tab[i][j] = sc.nextInt();
				
				//Calcul du total pour la mati�re
				totalmat=totalmat+tab[i][j];
				
				
			}
			
			//Calcul de la moyenne par mati�re
			moymat = totalmat/3;
			
			//pour chaque index i la valeur du tableau moy prend la valuer de moymat
			moy[i] = moymat;
			
		}
		
		
		//Lecture du tableau moy
		for (int i = 0; i < 4; i++) {
			
			//Calcul de la moyenne totale
			moytotal = moytotal + moy[i];
			
			//affichage de la moyenne par mati�re
			System.out.println("Moyenne pour la mati�re"+(i+1)+" : "+moy[i]);
			
		}
		
		//calcul de la moyenne des moyennes
		moydesmoy = moytotal/4;
		
		//affichage de moyenne des moyennes
		System.out.println("La moyenne des moyennes est :"+moydesmoy);
		

	}

}
