package bag;

import java.util.ArrayList;
import java.util.List;

import product.Product;

public class Plastic_Bag {
	private List<Product> products = new ArrayList<>();

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
