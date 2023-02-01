package lesson003;

public class Question26 {

	public static void main(String[] args) {
		// a dan z ye kadar olan harfleri yazdıralım
		
		char ch;
		for(ch = 'a'; ch<='z'; ch ++) {
			System.out.print(ch + " ");
		}
		System.out.println("***");
		
		for(char i =97; i<=122; i++) {
			System.out.print(i + " ");
		}
	}

}
