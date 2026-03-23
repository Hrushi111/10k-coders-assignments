package oops;

import java.util.Scanner;

public class PlacementExam {
	static Scanner s = new Scanner(System.in);

	public  class product {
		private int productid;
		private String productname;
		private int price;
		private int quantity;
		public static String storename = "RIZZ store";

		public product() {
		}

		public product(int productid, String productname, int price, int quantity) {
			this.price = price;
			this.productid = productid;
			this.productname = productname;
			this.quantity = quantity;

		}


		public int setprice(int price) {
			return this.price = price;
		}

		public void setproductid(int productid) {
			this.productid = productid;
		}

		public void setproductname(String productname) {
			this.productname = productname;
		}

		public void setquantity(int quantity) {
			this.quantity = quantity;
		}

		public int getprice() {
			return this.price;
		}

		public int getproductid() {
			return this.productid;
		}

		public int getquantity() {
			return this.quantity;
		}

		public String getproductname() {
			return this.productname;
		}

		public  void addproduct() {
			System.out.print("Enter product Name : ");
			setproductname(s.next());
			System.out.print("Enter Product id : ");
			setproductid(s.nextInt());
			System.out.print("Enter price : ");
			setprice(s.nextInt());

		}

		public  void updatequantity() {
			
				setquantity(s.nextInt());
			
		}

		public  void display() {
			System.out.println("Product Name : " + getproductname());
			System.out.println("Product ID : " + getproductid());
			System.out.println("Price : " + getprice());
			System.out.println("Quanitity : " + getquantity());
			System.out.println("Storename : " + storename);
		}
		
		

	}
}
