package lesson002;

import java.util.Scanner;

public class Question16 {
	
	//kullanıcdan aldıgımız sayı haftanın hangi gününe denk geliyo
	//bu gün hafta sonu mu hafta içi mi kontrol edelim
	//switch case
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-7 arası sayı");
		int gun = scanner.nextInt();
		
		String durum = "Hafta Içi";
		if(gun >= 6 && gun <=7) {
			durum = "hafta Sonu";
		}
		switch (gun) {
		case 1:
			System.out.println("Pazartesi " + durum);
			break;
		case 2:
			System.out.println("Sali " + durum);
			break;
		case 3:
			System.out.println("Çarşamba " + durum);
			break;
		case 6:
			System.out.println("Cumartesi " + durum);
			break;

		default:
			break;
		}
		switch (gun) {
		case 1, 2, 3, 4, 5:
			System.out.println("Hafta içi");
			break;
		case 6, 7:
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Hatalı bir değer girdiniz");
			break;
		}
		
		//16:13

	}

}
