package lesson005;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		// Question 43 içinÖDEV--> kaçları saymak istiyosak kullanıcıdan sayıları
		// alalım.

		// 2
		// Bir dizide en büyük ikinci sayıyı bulan program
		int sayilar[] = { 1, 13, 13, 13, 2, 5, 13, 1 };
		int enBuyuk = sayilar[0];
		int ikinci = sayilar[1];

		for (int i = 1; i < sayilar.length; i++) {

			if (sayilar[i] > enBuyuk) {
				ikinci = enBuyuk;
				enBuyuk = sayilar[i];

			} else if (sayilar[i] > ikinci) {
				ikinci = sayilar[i];
			}
		}
		System.out.println(" ikinci sayı " + ikinci);
		// *******************************
		// 3
		// bir dizide eğer 13 var ise hem 13ü hemde bir sonraki indexi
		// toplama işlemine almicak
		// dizideki elemanların toplamını bulalım
		int nums2[] = { 1, 13, 5, 13, 2, 5, 7, 1, 13 };
		int sum = 0;

		for (int i = 0; i < nums2.length; i++) {

			if (nums2[i] == 13) {

				if (nums2.length > i + 1 && nums2[i + 1] != 13) {
					i++;
				}

			} else {
				sum += nums2[i];
			}

		}
		System.out.println(sum);

		int nums4[] = { 1, 13, 5, 13, 13, 2, 5, 7, 1, };
		int toplam = 0;
		boolean birOncekiSayiOnUcMu = false;
		for (int i = 0; i < nums4.length; i++) {
			if (nums4[i] == 13) {
				birOncekiSayiOnUcMu = true;
			} else if (birOncekiSayiOnUcMu == true) {
				birOncekiSayiOnUcMu = false;
			} else {
				toplam = toplam + nums4[i];
			}
		}
		System.out.println(toplam);

		int nums5[] = { 1, 13, 5, 13, 13, 13, 2, 5, 7, 1 };
		int toplam1 = 0;
		for (int i = 0; i < nums5.length; i++) {
			if (nums5[i] == 13) {
				if (i < nums5.length - 1) {
					i++;
					if (nums5[i] == nums5[i - 1])
						i--;
				}
			} else {
				toplam1 += nums5[i];
			}
		}
		System.out.println("Toplam = " + toplam);
	}
}
