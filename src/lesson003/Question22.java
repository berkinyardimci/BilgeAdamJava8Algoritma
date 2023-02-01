package lesson003;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// Girilen sayı için çarpım tablosunu veren progrmaı yazalım
		
		//6x1 =6
		//6x2 =12
		//6x3 =18 .....
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Sayı giriniz:");
//		int sayi = scanner.nextInt();
//		
//		for(int i = 1; i<=10; i++) {
//			System.out.println(sayi + " x " + i + " = "+ sayi*i);
//		}
		//ctrl + 7
		
		System.out.println("************");
		//iç içe for kullanlaım
		//bütün çarpım tablosunu yazdıralım
		
		for(int i =1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
		
	}

}
