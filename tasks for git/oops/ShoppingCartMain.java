package oops;

import java.util.Scanner;

public class ShoppingCartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ShoppingCart crt = new ShoppingCart();
		ShoppingCart.cartitem crtitem = crt.new cartitem();
		int choice1;
		int choice;
		do {

			System.out.println(" 1. show menu ");
			System.out.println(" 2. view cart");
			System.out.println(" 3. checkout ");
			System.out.println(" 4. exit");
			System.out.print("enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:

				System.out.println("--------- menu ---------");
				System.out.println(" id  Product                  price");
				System.out.println(" 1 . coffee                 - 150/-");
				System.out.println(" 2 . biryani                - 220/-");
				System.out.println(" 3 . milkshake              - 80 /-");
				System.out.println(" 4 . chillichicken          - 250/-");
				System.out.println(" 5.  chickennoodles         - 120/-");
				do {
					System.out.println("1. buy items ");
					System.out.println("2. proceed to checkout");
					System.out.print("enter your choice");
					choice1 = sc.nextInt();
					switch (choice1) {
					case 1:
						System.out.print(" product id : ");
						int productid = sc.nextInt();
						System.out.print(" product name : ");
						String productname = sc.next();
						System.out.print(" product price : ");
						int price = sc.nextInt();
						System.out.print(" enter quantity : ");
						int quantity = sc.nextInt();
						crtitem = crt.new cartitem(productname, productid, price, quantity);						
						break;
					case 2:
						System.out.println(" exited successfully");
						break;
					}

				} while (choice1 != 2);
				break;

			case 2:
				crtitem.display();
				break;
			case 3:
				System.out.println(" total price : " + crtitem.totalprice());
				System.out.println(" final price :" + crtitem.discount());

			case 4:
				System.out.println(" exited successfully");
				break;
			}

		} while (choice != 4);

	}

}
