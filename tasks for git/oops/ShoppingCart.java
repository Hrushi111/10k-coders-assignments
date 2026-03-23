package oops;

public class ShoppingCart {
	public class product {
		private String productName;
		private int productid;
		private int price;

		public product(String productName, int productid, int price) {
			this.productid = productid;
			this.price = price;
			this.productName = productName;
		}

		public product() {
			this("", 0, 100);
		}

		public void productdisplay() {
			System.out.println("product id : " + productid);
			System.out.println("product : " + productName);
			System.out.println("price : " + price);
		}

	}

	public class cartitem extends product {
		private int quantitiy;
		private int totalamount;

		public cartitem(String productName, int productid, int price, int quantitiy) {
			super(productName, productid, price);
			this.quantitiy = quantitiy;
			
		}

		public cartitem(int quantity) {
			this("", 0, 0,0);
		}

		public cartitem() {
			super();
		}

		public void increasequantity() {
			this.quantitiy = quantitiy + 1;
		}

		public void decreasequantity() {
			if (this.quantitiy > 1) {
				this.quantitiy = quantitiy - 1;
			} else {
				System.out.println(" add on item");
			}
		}

		public int totalprice() {
			return this.totalamount = super.price * this.quantitiy;

		}

		public int discount() {
			return this.totalamount = totalamount - (totalamount / 10);
		}

		public void display() {
			super.productdisplay();
			System.out.println("Quantity : " + this.quantitiy);
			System.out.println("total amount : " + this.totalamount);
			System.out.println("final price : " + this.discount());
		}

	}
}
