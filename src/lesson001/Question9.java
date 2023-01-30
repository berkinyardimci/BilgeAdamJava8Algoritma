package lesson001;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Girilen ortalamanın harf notuna göre geçip geçmediğini bulan program
		
		// 90 üstü AA
		// 80 ve 90 arası BB
		// 70 le 80 arası CC
		// 60 la 70 arası DD
		// 60 tan küçükse FF kaldı olsun
		
		Scanner scanner = new Scanner(System.in);
		
		double ortalama;
		System.out.println("ortalama giriniz ");
		
		ortalama = scanner.nextDouble();
		if(ortalama >100 || ortalama <0) {
			System.out.println("lütfen geçerli değerler girin");
		}else {
			if(ortalama>=90) {
				System.out.println("AA");
			}else if(ortalama>=80 && ortalama<90) {
				System.out.println("BB");
			}else if(ortalama>=70 && ortalama<80) {
				System.out.println("CC");
			}else if(ortalama>=60 && ortalama<70) {
				System.out.println("DD");
			}else {
				System.out.println("FF");
			}
		}
		
	}

}
