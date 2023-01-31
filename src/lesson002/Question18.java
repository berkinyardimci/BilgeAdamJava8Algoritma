package lesson002;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// Girilen char değerinin alfabenin içinde var mı yok mu
		// a A
		// 7 ? . '

		Scanner scanner = new Scanner(System.in);
		System.out.println("karakter giriniz");
		char ch = scanner.next().charAt(0);

		int asciiCode = ch;
		if (asciiCode >= 65 && asciiCode <= 90) {
			System.out.println("Alfaabetik");
		} else if (asciiCode >= 97 && asciiCode <= 122) {
			System.out.println("Alfaabetik");
		} else {
			System.out.println("alfabede değildir");
		}
		/*
		 * if(asciiCode>=65 && asciiCode<=90 || asciiCode>=97 && asciiCode<=122 ) {
		 * System.out.println("Alfaabetik"); }else {
		 * System.out.println("alfabede değildir"); }
		 */

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " alfabetik bir karakterdir.");
		} else {
			System.out.println(ch + " alfabetik bir karakter değildir.");
		}
	}

}
