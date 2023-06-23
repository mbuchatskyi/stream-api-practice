package mbuchatskyi.product;

public class RealProduct extends Product {
	private int size;
	private int weight;
	
	public RealProduct(String name, double price, int size, int weight) {
		super(name, price);
		this.size = size;
		this.weight = weight;
	}

	public int getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}
}
