package lesson001;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		//Girilen 3 sayıdan en büyük olanı yazdıran program
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("3tane sayi giriniz:");
		int sayi1 = scanner.nextInt();
		int sayi2 = scanner.nextInt();
		int sayi3 = scanner.nextInt();
		
		int enBuyuk = sayi1;
		if(sayi1 == sayi2 && sayi2 == sayi3) {
			System.out.println("Bütün sayilar eşittir "+ enBuyuk);
		}else {
			if(sayi2>enBuyuk) {
				enBuyuk= sayi2;
			}
			if(sayi3>enBuyuk) {
				enBuyuk = sayi3;
			}
		}
		
		System.out.println("En Büyük sayi --> " + enBuyuk);
	}

}
