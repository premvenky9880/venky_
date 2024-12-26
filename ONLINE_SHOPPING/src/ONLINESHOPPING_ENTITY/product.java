package ONLINESHOPPING_ENTITY;

public class product {
	private int productid;
	private String name;
	private double price;
	private int stockquantity;
	
	public product(int productid, String name, double price, int stockquantity) {
		super();
		this.productid = productid;
		this.name = name;
		this.price = price;
		this.stockquantity = stockquantity;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockquantity() {
		return stockquantity;
	}

	public void setStockquantity(int stockquantity) {
		this.stockquantity = stockquantity;
	}

	@Override
	public String toString() {
		return "product [productid=" + productid + ", name=" + name + ", price=" + price + ", stockquantity="
				+ stockquantity + "]";
	}
	

}
