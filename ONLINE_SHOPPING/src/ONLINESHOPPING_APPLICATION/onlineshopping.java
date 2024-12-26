package ONLINESHOPPING_APPLICATION;
import java.util.Scanner;

import ONLINESHOPPING_SERVICE.adminservice;
import ONLINESHOPPING_SERVICE.customerservice;
import ONLINESHOPPING_SERVICE.orderservice;
import ONLINESHOPPING_SERVICE.productservice;
public class onlineshopping {
	private static productservice productService = new productservice();
	private static customerservice customerService = new customerservice();
	private static orderservice orderService = new orderservice();
	private static adminservice adminService = new adminservice();

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        while (true) {
		            
		            System.out.println("1. Admin Menu");
		            System.out.println("2. Customer Menu");
		            System.out.println("3. Exit");
		            System.out.print("Enter your choice: ");
		            int choice = scanner.nextInt();

		            int adminChoice;
					switch (choice) {
		                case 1:
		                    do {
		                        System.out.println("Admin Menu:");
		                        System.out.println("1. Add Product");
		                        System.out.println("2. Remove Product");
		                        System.out.println("3. View Products");
		                        System.out.println("4. Create Admin");
		                        System.out.println("5. View Admins");
		                        System.out.println("6. View order status");

		                        System.out.println("7. View orders");
		                        System.out.println("8. Return");
		                        System.out.print("Enter your choice: ");
		                        int adminChoice1 = scanner.nextInt();

		                        switch (adminChoice1) {
		                            case 1:
		                                addproduct(scanner);
		                                break;
		                            case 2:
		                                removeProduct(scanner);
		                                break;
		                            case 3:
		                                viewProducts();
		                                break;
		                            case 4:
		                                createAdmin(scanner);
		                                break;
		                            case 5:
		                                viewAdmins();
		                                break;
		                            case 6:
		                                updateorderstatus(scanner);
		                                break;
		                            case 7:
		                            	vieworders();
		                                break;
		                            case 8:
		                            	 System.out.println("Exiting Admin....");
		                      
		                                break;
		                                
		                            default:
		                                System.out.println("Invalid choice. Please try again.");
		                        }
		                    } while (adminhoice != 8);
		                    break;
		                case 2:
		                    int customerchoice;
		                    do {
		                    	System.out.println("\nCustomer Menu:");
		                        System.out.println("1. Create Customer");
		                        System.out.println("2. View Customers");
		                        System.out.println("3. Place Orders");
		                        System.out.println("4. View orders");
		                        System.out.println("5. View products");
		                        System.out.println("6. Return");
		                        System.out.print("Enter your choice: ");
		                        customerchoice = scanner.nextInt();

		                        switch (customerchoice) {
		                            case 1:
		                                addproduct(scanner);
		                                break;
		                            case 2:
		                                vieworders(scanner);
		                                break;
		                            case 3:
		                                placeorders();
		                                break;
		                            case 4:
		                                vieworders(scanner);
		                                break;
		                            case 5:
		                                viewProducts();
		                                break;
		                            case 6:
		                                
		                            	 System.out.println("Exiting customer menu....");
		                      
		                                break;
		                                
		                            default:
		                                System.out.println("Invalid choice. Please try again.");
		                        }
		                    } while (adminChoice != 6);
		                    break;
		                    
		        case 3:
                    
               	 System.out.println("Exiting....");
                 scanner.close();
                 return;
                
                   
               default:
                   System.out.println("Invalid choice. Please try again.");
					}
		        }
		    }
				
					private static void addProduct (Scanner scanner) {

					System.out.print("Enter Product ID: ");

					int ProductId = scanner.nextInt();

					System.out.print("Enter Product Name: ");

					String name = scanner.next();

					System.out.print("Enter Product Price: ");

					double price = scanner.nextDouble();

					System.out.print("Enter Stock Quantity: ");

					int stockQuantity = scanner.nextInt();

					product roduct = new product (ProductId, name, price, stockQuantity);

					productService.addProduct (product);

					System.out.println("Product added sucessfully!");
				
						
					}
					private static void removeProduct (Scanner scanner) {
						System.out.print("Enter Product ID: ");

						int productId = Scanner.nextInt();
						
						productservice.removeproduct(productId);
                        System.out.println("Product removed sucessfully!");
					
						
					

			private static void viewproducts() {
				// TODO Auto-generated method stub
				
			}

			private static void placeorders() {
				// TODO Auto-generated method stub
				
			}

			private static void vieworders(Scanner scanner) {
				// TODO Auto-generated method stub
				
			}

			private static void vieworders() {
				// TODO Auto-generated method stub
				
			}

			private static void updateorderstatus(Scanner scanner) {
				// TODO Auto-generated method stub
				
			}

			private static void viewAdmins() {
				// TODO Auto-generated method stub
				
			}

			private static void createAdmin(Scanner scanner) {
				// TODO Auto-generated method stub
				
			}

			private static void viewProducts() {
				// TODO Auto-generated method stub
				
			}

			private static void removeProduct(Scanner scanner) {
				// TODO Auto-generated method stub
				
			}

			private static void addproduct(Scanner scanner) {
				// TODO Auto-generated method stub
				
			}         
		                  


	}

			private static void vieworders() {
				// TODO Auto-generated method stub
				
			}

			private static void updateorderstatus(Scanner scanner) {
				// TODO Auto-generated method stub
				
			}

			private static void placeorders() {
				// TODO Auto-generated method stub
				
			}

			private static void vieworders(Scanner scanner) {
				// TODO Auto-generated method stub
				
			}

			private static void viewAdmins() {
				// TODO Auto-generated method stub
				
			}

			private static void createAdmin(Scanner scanner) {
				// TODO Auto-generated method stub
				
			}

			private static void viewProducts() {
				// TODO Auto-generated method stub
				
			}

			private static void removeProduct(Scanner scanner) {
				// TODO Auto-generated method stub
				
			}

			private static void addproduct(Scanner scanner) {
				// TODO Auto-generated method stub
				
			}

}
