package methods;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca(6);
		sayiBulmaca(6);
		sayiBulmaca(6);
		sayiBulmaca(6);
		sayiBulmaca(6);

	}
	
	//camelCasing
	public static void sayiBulmaca(int aranacak) {
		
		int[] sayilar = new int[] {1, 2, 5, 7, 9, 0};
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		String mesaj = "";
		if (varMi) {
			mesaj = "Sayi mevcuttur: " + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayi mevcut degildir: " + aranacak);
		}
		
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
