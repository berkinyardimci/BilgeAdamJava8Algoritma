package lesson003;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		// Girilen sayının basamaklarının toplamını bulalım
		//127 --> 1+2+7 = output->10
		
		//do while
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi giriniz:");
		int sayi = scanner.nextInt();
		
		int toplam =0;
		//do while da do nun içi ilk 
		
		//toplam 7 +2 + 1
		//sayı 12 1
		do {
			toplam = toplam +sayi%10;
			sayi = sayi /10;
			
		}while(sayi >0);
		System.out.println(toplam);
		
		System.out.println("***********");
		
	
		System.out.println("Sayi giriniz:");
		int sayi2 = scanner.nextInt();
		
		int kalan =0;
		int basamakToplam =0;
		
		while(sayi2 %10 >0) {
			kalan = sayi2 %10;
			basamakToplam = basamakToplam+kalan;
			sayi2 = sayi2 /10;
		}
		System.out.println(basamakToplam);
		


	}

}
