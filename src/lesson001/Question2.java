package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		// verilen iki sayının çarpımını veren program.
		int sayi1 = 5;
		int sayi2 = 10;
		int carpim = sayi1 * sayi2;

		System.out.println("çarpim : " + carpim);

		System.out.println("*********************");

		// Girilen 2 sayının çarpımı
		Scanner input = new Scanner(System.in);
		System.out.println("ilk sayiyi giriniz:");
		int sayi3 = input.nextInt();

		System.out.println("ikinci sayıyı giriniz");
		int sayi4 = input.nextInt();
		//int carpim2 = sayi3 * sayi4;
		System.out.println("çarpımı: " + sayi3 * sayi4);
		
		//14:50

	}

}
