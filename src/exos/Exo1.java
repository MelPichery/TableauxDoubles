package exos;

public class Exo1 {

	public static void main(String[] args) {
		int valmax = Integer.MIN_VALUE; 
		int[][] t= {{0,6,2,0,6,2,2,8,9,10,11,12},{0,6,2,30,6,2,2,8,9,10,11,12},{0,6,2,0,6,2,2,8,9,10,11,12},{0,6,2,0,32,2,2,8,9,10,11,12},{0,6,2,0,6,2,2,8,9,10,11,12},{0,6,2,0,6,2,2,8,9,10,11,12},{0,6,2,0,150,2,2,8,9,10,11,12},{0,6,2,90,6,2,2,8,9,10,11,12}} ;
		

		for (int i = 0; i < 8; i++) {
			
			for (int j = 0; j < 12; j++) {
				
				if (t[i][j]>valmax) {
				
					valmax = t[i][j];
					
				}
				
			}
			
		}
		
		System.out.println("La valeur max est :"+valmax);
		
	}

}
