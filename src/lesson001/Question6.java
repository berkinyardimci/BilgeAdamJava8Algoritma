package lesson001;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		//kullanıcdan alınan vize ve final notlarını hesaplayarak
		//geçip geçmediğini hesaplayan program
		
		//vize %40
		//final %60
		//50 ye büyük ve eşitse geçer.
		//50 den küçükse kalır.

		Scanner scanner = new Scanner(System.in);
		
		//camelCasing
		//PascalCasing
		System.out.println("Vize :");
		float vizeNotu = scanner.nextFloat();
		
		System.out.println("Final :");
		float finalNotu = scanner.nextFloat();
		
		float ortalama = (vizeNotu *0.4f) + (finalNotu*0.6f);
		if(ortalama<50) {
			System.err.println("dersten kaldınız");
		}else
			System.out.println("dersten geçtiniz");
		
	}

}
