package mbuchatskyi.product.factory;

import java.time.LocalDate;

import mbuchatskyi.product.Product;
import mbuchatskyi.product.RealProduct;
import mbuchatskyi.product.VirtualProduct;

public class ProductFactory {
	
	public static Product createRealProduct(String name, double price, int size, int weight) {
		return new RealProduct(name, price, size, weight);
	}
	
	public static Product createVirtualProduct(String name, double price, 
			String code, LocalDate expirationDate) {
		return new VirtualProduct(name, price, code, expirationDate);
	}
}
