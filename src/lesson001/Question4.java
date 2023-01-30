package lesson001;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// verilen iki sayıdan hangisinin büyük oldugunu bulan program

		float sayi1 = 16;
		float sayi2 = 15;

		if (sayi1 < sayi2) {
			System.out.println("Büyük olan sayı:" + sayi2);
		} else if (sayi1 > sayi2) {
			System.out.println("Büyük olan sayı:" + sayi1);
		} else {
			System.out.println("Sayilar eşittir");
		}

		// girilen iki sayıdan hangisinin büyük oldugunu bulan program
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ilk sayı: ");
		int sayi3 = scanner.nextInt();

		System.out.println("ikinci sayı: ");
		int sayi4 = scanner.nextInt();

		if (sayi3 > sayi4)
			System.out.println("büyük: " + sayi3);
		else if (sayi4 > sayi3)
			System.out.println("Büyük olan sayı:" + sayi4);
		else
			System.out.println("sayilar eşittir");
		scanner.close();
	}

}
