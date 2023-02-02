package lesson004;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		// Verilen kelimenin harflerini alt alta yazdıralım
		//java
		
		//j
		//a
		//v
		//a
		
		String text = "java";
		
		System.out.println(text.length());
		for(int i=0; i<text.length(); i++) {
			System.out.println(text.charAt(i));
		}
		
		//kullanıcdan bi string değer alalım
		//aldıgımız değeri
		//java
		//0. indexi -> j
		//1. indeci -> a
		
		Scanner scanner = new Scanner(System.in);
		String text2 = scanner.nextLine();
		
		for(int i =0; i<text2.length(); i++) {
			System.out.println(i + ". indexi " + text2.charAt(i));
		}
		
	}

}
