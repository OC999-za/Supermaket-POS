import java.util.ArrayList;
import java.util.List;

import bag.Plastic_Bag;
import pos.POS;
import product.Product;
import scanner.Anti_Theft_Scanner;

public class Main {
	public static void main(String[] args) {
		//Products the consumer 'picks' across supermarket lanes
		Product product1 = new Product("#1", false);
		Product product2 = new Product("#2", false);
		Product product3 = new Product("#3", false);
		Product product4 = new Product("#4", false);
		
		//A collective of the products
		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		
		//Plastic bag for the products
		Plastic_Bag bag = new Plastic_Bag();
		bag.setProducts(products); //method for placing the products inside the plastic bag
		
		//An imitation of the point of sale system, where the user pays for the products
		POS.pay(bag); //if the products don't go through the POS system, the AntiThedft Scanner below will display a message in the error stream
		
		
		Anti_Theft_Scanner.scan(bag); //Anti-Theft scanners at the gate, used to scan all the products inside the plastic bag to check if they have been payed for
	}
}
