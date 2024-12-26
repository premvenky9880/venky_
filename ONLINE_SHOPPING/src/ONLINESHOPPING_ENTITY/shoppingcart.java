package ONLINESHOPPING_ENTITY; 

import java.util.Map;

public class shoppingcart {
	private Map<product, Integer> items;

	public shoppingcart(Map<product, Integer> items) {
		super();
		this.items = items;
	}

	public Map<product, Integer> getItems() {
		return items;
	}

	public void setItems(Map<product, Integer> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "shoppingcart [items=" + items + "]";
	}
	
	
	 

}
