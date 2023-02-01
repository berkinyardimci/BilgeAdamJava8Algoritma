package lesson003;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// Girilen sayının faktorielini bulan program
		
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		int faktorial = 1;
		
		for(int i =1; i<=sayi; i++) {
			faktorial = faktorial *i;
		}
		System.out.println("faktorial: " + faktorial);
	}

}
