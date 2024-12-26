package ONLINESHOPPING_ENTITY;
import java.util.List;
public class order  extends USER  {
			private int orderid;
			private String customer;
			private List<productquantitypair> products;
			private String status;
			public order(int userid, String username, String emailid, int orderid, String customer,
					List<productquantitypair> products, String status) {
				super(userid, username, emailid);
				this.orderid = orderid;
				this.customer = customer;
				this.products = products;
				this.status = status;
			}
			public int getOrderid() {
				return orderid;
			}
			public void setOrderid(int orderid) {
				this.orderid = orderid;
			}
			public String getCustomer() {
				return customer;
			}
			public void setCustomer(String customer) {
				this.customer = customer;
			}
			public List<productquantitypair> getProducts() {
				return products;
			}
			public void setProducts(List<productquantitypair> products) {
				this.products = products;
			}
			public String getStatus() {
				return status;
			}
			public void setStatus(String status) {
				this.status = status;
			}
			@Override
			public String toString() {
				return "order [orderid=" + orderid + ", customer=" + customer + ", products=" + products + ", status="
						+ status + "]";
			} 

			public void displayOrderDetails() {
		        System.out.println("Order ID: " + orderid);
		        System.out.println("customer: " + customer); 
		        System.out.println("Status: " + status);
		        System.out.println("Products:");
		        for (productquantitypair pq : products) {
		            System.out.println("- " + pq.getProduct().getName() + ", Quantity: " + pq.getQuantity());
			
		        }		
			}
}
