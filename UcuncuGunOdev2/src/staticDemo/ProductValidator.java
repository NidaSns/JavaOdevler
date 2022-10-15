package staticDemo;

public class ProductValidator {
	
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý.");
	}
	
	static {
		System.out.println("Yapýcý static blok çalýþtý.");
	}
	
	public boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void birsey() {
		
	}
	
	//inner class
	public static class BaskaBirClass {
		public static void Sil() {
			
		}
	}
}
