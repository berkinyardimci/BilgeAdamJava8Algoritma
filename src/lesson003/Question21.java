package lesson003;

import java.util.Scanner;

public class Question21 {
	
	
	//Girilen sayıya kadar olan sayıların toplamını yazdıralım
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz:");
		int sayi = scanner.nextInt();
		
		int toplam=0;
		
		for(int i= 1; i<=sayi; i++) {
			toplam = toplam+i;
		}
		
		System.out.println(toplam);
		
		
	}

}
