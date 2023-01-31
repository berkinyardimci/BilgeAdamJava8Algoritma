package lesson002;

import java.util.Scanner;

public class Question14 {
	
	
	//girilen 3 sayıyı büyükten küçüğe doğru sıralayan program
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.sayi sayı");
		double sayi1 = scanner.nextDouble();
		System.out.println("2.sayi sayı");
		double sayi2 = scanner.nextDouble();
		System.out.println("3.sayi sayı");
		double sayi3 = scanner.nextDouble();
		
		if(sayi1 == sayi2 && sayi2 == sayi3) {
			System.out.println("farklı sayılar giriniz");
		}else {
			if(sayi1 <= sayi2 ) {
				if(sayi2<= sayi3) {
					System.out.println("sayi3> sayi2 > sayi1");
				}else if(sayi3<= sayi1) {
					System.out.println("sayi2> sayi1 > sayi3");
				}else if(sayi1< sayi3) {
					System.out.println("sayi2 > sayi3 > sayi1");
				}
			}
			if(sayi2<sayi1) {
				if(sayi3 <= sayi2) {
					System.out.println("sayi1 > sayi2 > sayi3");
				}else if(sayi3 <= sayi1) {
					System.out.println("sayi1 > sayi3 > sayi2");
				}else if (sayi1 < sayi3) {
					System.out.println("sayi3 > sayi1 > sayi2");
				}
			}
		}
		
		System.out.println("*********************");
		
		
	}
}
