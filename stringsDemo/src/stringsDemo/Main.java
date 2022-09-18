package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugun hava cok guzel.";
		System.out.println(mesaj);
		
		/*
		 * System.out.println("Eleman sayisi: " + mesaj.length());
		 * System.out.println("Besinci eleman: " + mesaj.charAt(4)); //String bir dizi
		 * oldugundan dolayi [0]'dan baslar
		 * System.out.println(mesaj.concat(" Yasasin!")); //Yeni string olusturur.
		 * System.out.println(mesaj.startsWith("A"));
		 * System.out.println(mesaj.endsWith(".")); char[] karakterler = new char[5];
		 * mesaj.getChars(0, 5, karakterler, 0); //Sondaki karakteri dahil etmez. Orn:5
		 * yazinca 4'e kadar yazar. System.out.println(karakterler);
		 * System.out.println(mesaj.indexOf("av"));
		 * System.out.println(mesaj.lastIndexOf("e")); //aramaya sagdan baslar.
		 */		
		
		String yeniMesaj = mesaj.replace(' ', '-'); //karakterlerin yerlerini degistirir.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2)); //Mesajin ikinci index'inden parcala demektir.
		System.out.println(mesaj.substring(2, 4)); //2'den 4'e kadar demektir. 4'uncu index'i hesaba katmaz.
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		String mesaj2 = "         Bugun hava cok guzel          ";
		System.out.println(mesaj2.trim());
		

	}

}
