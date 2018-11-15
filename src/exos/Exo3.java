package exos;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		
		int ligne, colonne, mouvement, colonnem, lignem;
		int[][] tab = new int[10][10];
		
		for (int i = 0; i < 10 ; i++) {
			for (int j = 0; j < 10; j++) {
				
				tab[i][j]= 0;								
				System.out.print(tab[i][j]+"  ");
			}
			System.out.println();
		}
		
				
			System.out.println("Entrez la colonne");
			Scanner sc1 = new Scanner(System.in);
			colonne = sc1.nextInt();
			colonne = colonne -1 ;
			
			System.out.println("Entrez la ligne");
			Scanner sc2 = new Scanner(System.in);
			ligne = sc2.nextInt();
			ligne = ligne -1 ;
			
			tab[colonne][ligne]=1;
			
		
			for (int i = 0; i < 10; i++) {
				
				System.out.println("Quel mouvement ?");
				Scanner sc3 = new Scanner(System.in);
				mouvement = sc3.nextInt();
				
				if(mouvement == 4)break;
				
				if(mouvement == 0) {
					
					colonnem = colonne-1;
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
		
		for (int i = 0; i < 10 ; i++) {
			for (int j = 0; j < 10; j++) {
											
				System.out.print(tab[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
