package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 465543246;
		int remainder = number % 2;
		boolean isPrime = true;
		
		if (number <= 1) {
			System.out.println("Gecersiz sayi");
			return;
		}
		
		for (int i = 0; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;	
			}
		}
		
		if (isPrime) {
			System.out.println("Bu sayi asaldir.");
		} else {
			System.out.println("Sayi asal degildir.");
		}
		

	}

}
