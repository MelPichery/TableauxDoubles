package exos;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		
		//Déclaration et initialisation des variables
		int ligne, colonne, mouvement, colonnem, lignem;
		int[][] tab = new int[10][10];
		
		//lecture du tableau tab
		for (int i = 0; i < 10 ; i++) {
			for (int j = 0; j < 10; j++) {
				
				//initialisation à 0 de chaque index et affichage du tableau
				tab[i][j]= 0;								
				System.out.print(tab[i][j]+"  ");
			}
			System.out.println();
		}
		
			//Affichage des consignes et sauvegarde des données colonne et ligne de l'utilisateur	
			System.out.println("Entrez la colonne");
			Scanner sc1 = new Scanner(System.in);
			colonne = sc1.nextInt();
			colonne = colonne -1 ;
			
			System.out.println("Entrez la ligne");
			Scanner sc2 = new Scanner(System.in);
			ligne = sc2.nextInt();
			ligne = ligne -1 ;
			
			//La valeur du tableau à l'index colonne et ligne 
			tab[colonne][ligne]=1;
			
			
			for (int i = 0; i < 10; i++) {
				
				//Affichage de la consigne et sauvegarde de la donnée mouvement donnée par l'utilisateur
				System.out.println("Quel mouvement ?");
				Scanner sc3 = new Scanner(System.in);
				mouvement = sc3.nextInt();
				
				//Si mouvement égal 4 alors on sort de la boucle
				if(mouvement == 4)break;
				
				/*
				 * Si mouvement égal 0 alors on sauvegarde dans une variable temporaire colonnem et lignem 
				 * le changement de colonne et de ligne
				 */
				if(mouvement == 0) {
					
					colonnem = colonne-1;
					lignem=ligne-1;
					
					//Vérification des bornes 
					if(colonnem>=0 && colonnem<10 && lignem>=0 && lignem<10) {
						
						/*
						 * si c'est dans le tableau, le tableau tab prend la valeur 0 à aux index précédents 
						 * les variables colonne et ligne prennent les valeurs de colonnem et lignem puis
						 * la valeur du tableau à l'index colonne et ligne prend 1
						 */		 
						tab[colonne][ligne] = 0;
						colonne = colonnem;
						ligne=lignem;
						tab[colonne][ligne]=1;
						
					}else {
						
						//sinon on signale à l'utilisateur qu'il est en dehors du tableau 
						System.out.println("out of bound");
					}
				}
				
				if(mouvement == 1) {
					
					colonnem = colonne-1;
					lignem= ligne+1;
					
					if(colonnem>=0 && colonnem<10 && lignem>=0 && lignem<10) {
						tab[colonne][ligne] = 0;
						colonne = colonnem;
						ligne=lignem;
						tab[colonne][ligne]=1;
					}else {
						System.out.println("out of bound");
					}
				}
				
				if(mouvement == 2) {
					
					colonnem = colonne+1;
					lignem=ligne-1;
					
					if(colonnem>=0 && colonnem<10 && lignem>=0 && lignem<10) {
						tab[colonne][ligne] = 0;
						colonne = colonnem;
						ligne=lignem;
						tab[colonne][ligne]=1;
					}else {
						System.out.println("out of bound");
					}
				}
				
				if(mouvement == 3) {
					
					colonnem = colonne+1;
					lignem=ligne+1;
					
					if(colonnem>=0 && colonnem<10 && lignem>=0 && lignem<10) {
						tab[colonne][ligne] = 0;
						colonne = colonnem;
						ligne=lignem;
						tab[colonne][ligne]=1;
					}else {
						System.out.println("out of bound");
					}
				}
				
				
			}
			
			
		System.out.println("Après avoir joué");
		
		//Affichage du tableau, une fois que l'utilisateur a fini de jouer
		for (int i = 0; i < 10 ; i++) {
			for (int j = 0; j < 10; j++) {
											
				System.out.print(tab[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
