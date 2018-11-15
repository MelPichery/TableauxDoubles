package exos;

import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		int totalmat=0,moymat=0,moytotal=0,moydesmoy=0;
		int[][] t = new int[4][3];
		int[] moy = new int[4];
		
		for (int i = 0; i < 4; i++) {
			
			totalmat=0;
			
			for (int j = 0; j < 3; j++) {
				
				System.out.println("Entrez la note"+(j+1)+" de la matière"+(i+1));
				Scanner sc = new Scanner(System.in);
				t[i][j] = sc.nextInt();
				
				totalmat=totalmat+t[i][j];
				
				
			}
			
			moymat = totalmat/3;
			
			moy[i] = moymat;
			
		}
		
		
		for (int i = 0; i < 4; i++) {
			
			moytotal = moytotal + moy[i];
			System.out.println("Moyenne pour la matière"+(i+1)+" : "+moy[i]);
			
		}
		
		moydesmoy = moytotal/4;
		System.out.println("La moyenne des moyennes est :"+moydesmoy);
		

	}

}
