package lesson001;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		//javada primitive tipler nelerdir?
		//birbirlerinden farkı?
		
		//Verlilen isim ve soy isim değerlerini hello 
		//(isim) (soyisim) seklinde yazdıralım)
		
		//değişken tanımlarken okunaklı olsun
		String isim = "mehmet";
		String soyisim = "kış";
		
		System.out.println("Hello: " + isim + " " +soyisim);
		System.out.println("Hello: " + isim + " " +soyisim);
		System.out.println("Hello: " + isim + " " +soyisim);
		System.out.println("Hello: " + isim + " " +soyisim);
		System.out.println("Hello: " + isim + " " +soyisim);
		
		//Girilen isim ve soy ismini yazdıralım
		
		//input nesnesi oluşturduk
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("İsminizi girin: ");
		String isim2 = scanner.nextLine();
		
		System.out.println("Soyisim girin: ");
		String soyisim2 = scanner.nextLine();
		
		System.out.println("girilen isim: " + isim + " " + " soyisim " + soyisim);
	}
}
