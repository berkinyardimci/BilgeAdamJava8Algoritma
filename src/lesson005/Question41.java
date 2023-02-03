package lesson005;

public class Question41 {

	public static void main(String[] args) {
		int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };
		// 0 dan küçük sayılar yerine 100 koyalım;

		// 16:10
		int enKuck = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] <= enKuck) {
				sayilar[i] = 100;

				int yeniSayi = sayilar[i];
				System.out.println(i + ".index değişti " + yeniSayi);
			}
		}
//		for(int i=0; i<yeniSayilar.length;i++) {
//			System.out.println(sayilar[i]);
//		}
		// System.out.println(Arrays.toString(sayilar));
	}

}
