package sesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 'H';
		char[] kalinSesli = {'A','I', 'O', 'U'};
		char[] inceSesli = {'E','İ', 'Ö', 'Ü'};
		boolean inceMi = false;
		boolean kalinMi = false;
		
		for (int i = 0; i < inceSesli.length; i++) {
			char c = inceSesli[i];
			if (c == harf) {
				inceMi = true;
			}
		}
		
		for (int i = 0; i < kalinSesli.length; i++) {
			char e = kalinSesli[i];
			if (e == harf) {
				kalinMi = true;
			}
		}
		
		if (inceMi == false && kalinMi == false) {
			System.out.println("Girdiginiz harf sesli degildir.");
		} else if (kalinMi == true) {
			System.out.println("Girdiginiz harf kalindir.");
		} else if (inceMi == true) {
			System.out.println("Girdiginiz harf incedir.");
		}
		
		
		

	}

}
