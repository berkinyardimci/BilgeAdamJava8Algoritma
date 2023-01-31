package lesson002;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {

		// Dairenin çevresini ve alanını hesaplayan bir program
		// r değerini kullanıcıdan alcaz
		// Pi = 3.14
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dairenin yarı çapı: ");
		double r = scanner.nextDouble();
		if (r <= 0) {
			System.out.println("Lütfen pozitif bir değer giriniz");
		} else {
			double pi = 3.14;
			double cevre = 2 * (pi * r);
			double alan = pi * r * r;
			System.out.println("Cevre " + cevre);
			System.out.println("Alan " + alan);
		}
	}
}
