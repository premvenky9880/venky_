package ONLINESHOPPING_ENTITY;

import java.util.List;

public class customer extends USER  {
	private String address;
	private String shoppingCart;
	private List<order> orders;
	public customer(int userid, String username, String emailid, String address, String shoppingCart,
			List<order> orders) {
		super(userid, username, emailid);
		this.address = address;
		this.shoppingCart = shoppingCart;
		this.orders = orders;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(String shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public List<order> getOrders() {
		return orders;
	}
	public void setOrders(List<order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "customer [address=" + address + ", shoppingCart=" + shoppingCart + ", orders=" + orders + "]";
	}
	
	
	

}