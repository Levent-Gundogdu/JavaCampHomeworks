package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Statik yapici blok calisti.");
	}
	
	public ProductValidator() {
		System.out.println("Yapici blok calisti.");
	}
	
	public static boolean isValid(Product product) { //static olan metod bir kere olusur ve bellekte durur. Uygulama sifirlanana kadar atilmaz. 
		
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
}













