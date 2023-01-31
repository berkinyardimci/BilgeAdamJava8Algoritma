package lesson002;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		//int olarak
		//dışardan iki tane sayısal değer alalım
		//iki sayının toplamı çift ise true değilse false yazdıralım
		//en sondada sayıların toplamının yarısını yazdıralım
		
		Scanner scanner = new Scanner(System.in);
		boolean ciftMi;
		int sayi1;
		int sayi2;
		double toplam;
		System.out.println("1. sayiyi giriniz: ");
		sayi1 = scanner.nextInt();
		
		System.out.println("2. sayiyi giriniz: ");
		sayi2 = scanner.nextInt();
		toplam = sayi1 + sayi2;
		if(toplam %2 ==0) {
			ciftMi = true;
		}else {
			ciftMi = false;
		}
		System.out.println(ciftMi);
		System.out.println(toplam /2);
		
		System.out.println("***************");
		boolean durum = (toplam % 2 == 0);
		System.out.println(durum);
		System.out.println(toplam /2);
	}
	
	

}
