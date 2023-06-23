package mbuchatskyi.order;

import java.util.List;

import mbuchatskyi.product.Product;
import mbuchatskyi.user.User;

public class Order {
	private User user;
	private List<Product> products;
	
	private Order(User user, List<Product> products) {
		this.user = user;
		this.products = products;
	}
	
	public static Order createOrder(User user, List<Product> products) {
		return new Order(user, products);
	}

	public User getUser() {
		return user;
	}

	public List<Product> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "Order [user = " + user + ", products = " + products + "]";
	}
}
