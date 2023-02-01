package lesson003;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// Girilen sayının asal olup olmadıgını bulan programı yazalım
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi giriniz:");
		int sayi = scanner.nextInt();
		
		boolean isPrime=true;
		for(int i=2; i<sayi;i++) {
			if(sayi %i ==0) {
				isPrime = false;
			}else {
				isPrime = true;
			}
		}if(isPrime) {
			System.out.println("sayi asaldır");
		}else {
			System.out.println("asal değildir");
		}
	}
}
