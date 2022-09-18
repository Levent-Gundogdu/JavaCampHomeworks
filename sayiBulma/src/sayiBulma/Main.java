package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1, 2, 5, 7, 9, 0};
		int aranacak = 6;
		boolean mevcutMudur = false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				mevcutMudur = true;
				break;
			}
		}
		
		if (mevcutMudur) {
			System.out.println("Aranan sayi dizide mevcuttur.");
		} else {
			System.out.println("Aranan sayi dizide mevcut degildir.");
		}
		
	}

}
