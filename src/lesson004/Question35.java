package lesson004;

public class Question35 {

	public static void main(String[] args) {
		// Java,Spring,Postgre,React

		// Java
		// Spring
		// Postgre
		// React

		//
		String list = "Java,Spring,Postgre,React";

		String[] str = list.split(",");

		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);

		System.out.println("**************");
		// Alternatif - 1
		String stringText = "Java,Spring,Postgre,React";
		int index = 0;
		for (int i = 0; i < stringText.length(); i++) {

			if (stringText.charAt(i) == ',') {
				System.out.println(stringText.substring(index, i));
				index = i + 1;
			}
		}
		System.out.println(stringText.substring(index));
		// Alternatif - 2
		System.out.println("**************");
		for (int i = 0; i < stringText.length(); i++) {

			if (stringText.charAt(i) == ',') {
				System.out.println();
			} else {
				System.out.print(stringText.charAt(i));
			}
		}
	}

}
