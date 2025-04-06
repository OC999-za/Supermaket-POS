package pos;

import bag.Plastic_Bag;
import product.Product;

public class POS {
	
	public static void pay(Plastic_Bag plastic) {
		for(Product product: plastic.getProducts()) {
			product.set_isScanned(true); //changes products state
		}
	}
	
}
