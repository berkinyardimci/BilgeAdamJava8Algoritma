package lesson004;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		// Girilen sayının mükemmel sayı olup olmadıgını bulan program
		// bölenlerinin toplamı kendisini veren sayı
		// 6 -> 1 +2+3 = 6
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi giriniz");
		
		int sayi = scanner.nextInt();
		int toplam = 0;
		
		for(int i = 1; i<sayi; i++) {
			if(sayi %i ==0) {
				toplam += i;
				//toplam = toplam +i;
			}
		}
		if(toplam == sayi) {
			System.out.println(sayi + "mükemmel sayi");
		}else
			System.out.println(sayi + "mükemmel sayı değildir");
		
	}

}
