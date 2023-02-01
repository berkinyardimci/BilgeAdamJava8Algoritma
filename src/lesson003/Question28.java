package lesson003;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// 1- Girilen sayının 5 in kuvveti olup olmadıgını bulan program
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi giriniz:");
		int sayi2 = scanner.nextInt();
		boolean kontrol = true;

		if (sayi2 == 0) {
			System.out.println("sıfırdan farklı bir değer girin");
		} else {
			while (kontrol == true) {
				if (sayi2 % 5 == 0) {
					sayi2 = sayi2 / 5;
					if (sayi2 == 1) {
						System.out.println("5 in kuvvetidir.");
						kontrol = false;
					}
				} else {
					System.out.println("5 in kuvveti değildir");
					kontrol = false;
				}
			}
		}

		// 2-
		if (Math.log(sayi2) % Math.log(5) == 0) {
			System.out.println("sayı 5in kuvvetidir");
		} else {
			System.out.println("sayı 5in kuvveti değildir");
		}


	

		// Girilen sayının 5 in katı olup olmadıgını bulan program

//		System.out.println("Sayi giriniz:");
//		int sayi = scanner.nextInt();
//		
//		for(int i = 1; i<=sayi; i++) {
//			if(sayi %5 == 0) {
//				System.out.println("sayi 5in katıdır.");
//				break;
//			}else {
//				System.out.println("5 in katı değildir.");
//				break;
//			}
//		}
	}

}
