package product;

public class Product {
	private String _ID; //Product ID: acts as a unique identifier for the products
	private boolean _isScanned; //Product Scanned state: helps us know if the product has been scanned or not(went through the POS system)
	
	//Accessors and Mutators
	public Product(String id, boolean isScanned){
		this._ID = id;
		this._isScanned = isScanned;
	}

	public String get_ID() {
		return _ID;
	}
	
	public boolean get_isScanned() {
		return _isScanned;
	}

	public void set_ID(String _ID) {
		this._ID = _ID;
	}

	public void set_isScanned(boolean _isScanned) {
		this._isScanned = _isScanned;
	}
	
	
}
