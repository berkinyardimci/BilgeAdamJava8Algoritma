package lesson006;

public class Question48 {

	public static void main(String[] args) {
		// Verilen 2 matristeki sayıları toplayan progra
		//toplanan sayıları 2 ye 3 lük yeni bir matrise atalım
		
		/*
		 * 8 10 3
		 * 10 4 12
		 */
		
		int[][] matris1 = {{5,6,2}, {9,1,6}};
		int[][] matris2 = {{3,4,1}, {1,3,6}};
		
		int[][] matris3  = new int [2][3];
		
		for (int i = 0; i < matris3.length; i++) {
			for (int j = 0; j < matris3[i].length; j++) {
				matris3[i][j] = matris1[i][j] + matris2[i][j];
				System.out.print(matris3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
