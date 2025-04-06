package scanner;

import bag.Plastic_Bag;
import product.Product;

public class Anti_Theft_Scanner {
	
	public static void scan(Plastic_Bag bag) {
		for(Product product : bag.getProducts()) {
			if(product.get_isScanned() == false) {
				System.err.println("You did not pay for product:" + product.get_ID() + "!!");
				break;
			}
			else {
				System.out.println("All products have been payed for, Thank you for shopping with us!");
			}
		}
	}
	
}
