package mbuchatskyi.product;

import java.util.Objects;

public class Product {
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(price, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return price == other.price && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Product [name = " + name + ", price = " + price + "]";
	}
}
