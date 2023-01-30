package lesson001;

public class Question3 {

	public static void main(String[] args) {
		// Verilen ürünün satış fiyatının içinde 
		//%18 kdv ve %15 kar oldugunu biliyoruz
		//verilen ürünün ham fiyatının bulan program.

		float satisFiyati =100;
		//int double float default değerleri 0 olarak kabul ediliyor
		float hamFiyat;
		float kar = 0.15f;
		float kdv = 0.18f;
		
		hamFiyat = satisFiyati - (satisFiyati*kar)-(satisFiyati*kdv);
		System.out.println("ham Fiyatı--> "+ hamFiyat);
		
		System.out.println("*****");
		
		int fiyat = 100;
		float vergisizFiyat = fiyat * 0.82f;
		System.out.println(vergisizFiyat);
		float hamFiyat2 = fiyat * 0.67f;
		System.out.println(hamFiyat2);
	}

}
