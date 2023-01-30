package lesson001;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		//Girilen sayının tek mi çift oldugunu bulan program
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("sayi giriniz: ");
		int sayi = scanner.nextInt();
		if(sayi %2 == 0) {
			System.out.println("sayi çifttir:");
		}else
			System.out.println("sayi tektir");
	}
	//15:54
	

}
