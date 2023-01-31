package lesson002;

import java.util.Scanner;

public class Question13 {

	// telefona ve maile bir kod gelicek bu kodları biz tanımlicaz
	// kullanıcdan maile ve telefona gelen kod u isticez
	// eğer onun mailine ve telefonana giden kod ile uyuşuyosa
	// sisteme kayıt oldunuz diyelim
	// ya maili hatalıdır ya telefonu yada ikisde hatalıdır
	// kullanıcıyı bilgilendircez.

	public static void main(String[] args) {
		int telKod = 555;
		int mailKod = 444;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Telefona gelen kodu giriniz:");
		int kod1 = scanner.nextInt();
		System.out.println("Maile gelen kodu giriniz:");
		int kod2 = scanner.nextInt();

//		if(telKod == kod1) {
//			if(mailKod == kod2) {
//				System.out.println("Sisteme üye oldunuz");
//			}else {
//				System.out.println("maili kontrol edin");
//			}
//		}else {
//			System.out.println("telen kodunu kontrol edin");
//		}

		if (kod2 == mailKod && kod1 == telKod) {
			System.out.println("Sisteme kayıt oldunuz");
		} else if (kod2 != mailKod && kod1 == telKod) {
			System.out.println("email kodunuz hatalı girdiniz");
		} else if (kod2 == mailKod && kod1 != telKod) {
			System.out.println("telefon kodunuz hatalı girdiniz");
		} else {
			System.out.println("iki kodda hatalı girdiniz");
		}
		
//		if (mailKod == scanner.nextInt() && telKod == scanner.nextInt()) {
//			System.out.println("Sisteme kayıt oldunuz");
//		} else if (kod2 != mailKod && kod1 == telKod) {
//			System.out.println("email kodunuz hatalı girdiniz");
//		} else if (kod2 == mailKod && kod1 != telKod) {
//			System.out.println("telefon kodunuz hatalı girdiniz");
//		} else {
//			System.out.println("iki kodda hatalı girdiniz");
//		}
		
		//14:52
	}

}
