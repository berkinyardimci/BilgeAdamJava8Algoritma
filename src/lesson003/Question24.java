package lesson003;

public class Question24 {

	// 1 den 100 e kadar olan çift sayıların toplamını tek sayıların toplamına
	// oranını bulan programı yazalım
	public static void main(String[] args) {
		double cift = 0;
		double tek = 0;
		

		for (int i = 1; i <= 99; i += 2) {
			tek += i;
		}
		for (int i = 2; i <= 100; i += 2) {
			cift += i;
		}
		double oran = cift/tek;
		System.out.println(oran);
		
		for(int i=1; i<101; i++) {
			if(i %2 ==0) {
				cift = cift +i;
			}else {
				tek = tek +i;
			}
		}
		System.out.println(cift/tek);
		
		
	}
	
	

}
