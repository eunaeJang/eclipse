package e2018.exam1;

public class Product {
	int id;
	String name; 
	int price;
	
	public Product(int id, String name, int price) {
		this.id = id; 
		this.name = name;
		this.price = price;
	} 
	
	@Override
	public String toString() { 
		// 구현할 부분 
		return String.format("{%d, %s, %d}", id, name, price);
	}
}

