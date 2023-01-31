package lesson002;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// Girilen karakterin ünlü mü ünsüz mü oldugunu bulan program
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir karakter giriniz: ");
		char ch = scanner.next().charAt(0);
		int ascii = ch;
		switch (ch) {
		case 65, 69, 73, 79, 85, 97, 101, 105, 111, 117:
			System.out.println("ünlü harf");
			break;
		default:
			System.out.println("ünlü değil");
			break;
		}

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println(ch + " bir ünlü harftir.");
		} else {
			System.out.println(ch + " bir ünsüz harftir.");
		}

	}

}
