package lesson018;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek {

	public static void main(String[] args) {
		
		
		//2 tane set oluşturalım
		//tekrarEdenler, tekrar etmeyenler
		//kullanıcdan bir kelime alcaz
		//eğer tekrar eden harf varsa tekraredenler setine atalım
		//ve tekrar etmeyenlerden çıkaralım
		
		//tekraredenleri ve etmeyenleri yazdıralım
		
		//java
		//tekraredenler--> a
		//tekrarEtmeyenler --> j,v
		
		Set<Character> tekrarEdenler = new HashSet<>();
		Set<Character> tekrarEtmeyenler = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		String metin = scanner.nextLine();
		
		//j, a, v, a
		//set özelliği--> unique değerler alıyo 
		//tekrar etmeyenler--> j, v 
		//tekrarEdenler --> a
		for (int i = 0; i < metin.length() ; i++) {
			if(!tekrarEdenler.contains(metin.charAt(i)) && !tekrarEtmeyenler.add(metin.charAt(i))) {
				tekrarEdenler.add(metin.charAt(i));
				tekrarEtmeyenler.remove(metin.charAt(i));
			}
		}
		System.out.println("tekrarEdenler");
		for (Character character : tekrarEdenler) {
			System.out.print(character +" ,");
		}
		System.out.println();
		System.out.println("Tekrar etmeyenler");
		for (Character character : tekrarEtmeyenler) {
			System.out.print(character +" ,");
		}
		
		
//		Scanner scanner = new Scanner(System.in);
//		String metin = scanner.nextLine();
//		
//		for (int i = 0; i < metin.length(); i++) {
//			for (int j = i+1; j < metin.length(); j++) {
//				if(metin.charAt(i) == metin.charAt(j)) {
//					tekrarEdenler.add(metin.charAt(i));
//				}
//			}
//			if(!tekrarEdenler.contains(metin.charAt(i))) {
//				tekrarEtmeyenler.add(metin.charAt(i));
//			}
//		}
//		
//		System.out.println(tekrarEdenler);
//		System.out.println(tekrarEtmeyenler);
		
	}
	

}
