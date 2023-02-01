package lesson003;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		// Kullanıcdan sürekli sayı alcaz
		// kullanıcı 0 a basınca aldığımız sayıların çarpımını yazdırcaz

		// while
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz, ve 0'a basark çıkın");

		int sayi = scanner.nextInt();
		int carpim = 1;
		int ilkDeger = 0;

		while (sayi != 0) {
			carpim = carpim * sayi;
			System.out.println("Bir sayı daha giriniz ve ya çıkış için 0");
			sayi = scanner.nextInt();
			ilkDeger = 1;
		}
		if (ilkDeger == 0) {
			System.out.println("Programdan çıktınız");
		} else {
			System.out.println(carpim);
		}

		int number;
		int carpim2 = 1;
		boolean sifirMi = false;
		while (sifirMi == false) {
			System.out.println("Sayı girin: ");
			number = scanner.nextInt();
			if (number != 0) {
				carpim2 = carpim2 * number;
			} else {
				sifirMi = true;
			}
		}
		System.out.println(carpim);
	}

	// alternatif çözüm

}
