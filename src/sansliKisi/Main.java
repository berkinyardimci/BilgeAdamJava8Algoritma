package sansliKisi;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		String[] sinif = {
	    	"Damla Erişmiş",
	    	"Uğur Gürkan",
	    	"Ahmet Doruk",
	    	"Ayşe Özcan",
	    	"Dilara Bozkurt",
	    	"Gülsu Fındık",
	    	"Hivda Aydoğan",
	    	"Kerem Turak",
	    	"Mehmet Arif",
	    	"Merve Adler",
	    	"Muhammet Ali",
	    	"Nurgül Kurtul",
	    	"Onur Berk",
	    	"Sinem Varol",
	    	"Yasin Solak"
	    };
		
		Random random = new Random();
		int sayi = random.nextInt(sinif.length);
		
		System.out.println("Şansı Kİşi--> " + sinif[sayi]);
	}
}
