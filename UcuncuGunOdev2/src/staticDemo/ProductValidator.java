package staticDemo;

public class ProductValidator {
	
	public ProductValidator() {
		System.out.println("Yap?c? blok ?al??t?.");
	}
	
	static {
		System.out.println("Yap?c? static blok ?al??t?.");
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
