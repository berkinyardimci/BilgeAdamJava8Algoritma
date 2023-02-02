package lesson004;

import java.util.Scanner;

public class Question33 {
	
	//15:08
	
	public static void main(String[] args) {
		// Klavyeden girilen 0 ile 100 arasında 100 dahil 5 adet sayıdan
		// en büyük ve en küçük olanı bulan program

		Scanner scanner = new Scanner(System.in);
		int enBuyuk = -1;
		int enKuck = 101;
		int num;
		int i = 0;

		while (i < 5) {
			System.out.println("Sayı girin");
			num = scanner.nextInt();

			if (num <= 100 && num >= 0) {
				if (num > enBuyuk) {
					enBuyuk = num;
				}
				if (num < enKuck) {
					enKuck = num;
				}
				i++;
			} else {
				System.out.println("geçerli sayıları girin:");
			}
		}
		System.out.println("max: " + enBuyuk);
		System.out.println("min: " + enKuck);

	}

}
