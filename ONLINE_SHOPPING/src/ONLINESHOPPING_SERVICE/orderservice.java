package ONLINESHOPPING_SERVICE;
import java.util.ArrayList;
import java.util.List;

import ONLINESHOPPING_ENTITY.order;
public class orderservice {
	private List<order>orderList = new ArrayList<>();
	public orderservice() {
	}
	public void placeorder(order Order ) {
}
	public void updateorderstatus(int Orderid,String status) {
}
	public List<order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<order> orderList) {
		this.orderList = orderList;
	}
}