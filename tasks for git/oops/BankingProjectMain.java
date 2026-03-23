package oops;

import java.util.Scanner;

public class BankingProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" --------- Welcome to REBEL Bank ----------");
		Scanner sc = new Scanner(System.in);
		int choice;
		BankingProject b = new BankingProject();
		BankingProject.details d = b.new details();
		while (true) {
			System.out.print(" Enter UserName: ");
			String name = sc.next();
			System.out.print(" Enter Password : ");
			String pass = sc.next();
			if (name.equals(d.getUserName()) && pass.equals(d.getPassword())) {
				System.out.println();
				System.out.println(" Logged In");
				System.out.println();
				System.out.print(" Enter First Name : ");
				d.setfname(sc.next());
				System.out.print(" Enter Last Name  : ");
				d.setlname(sc.next());
				System.out.print(" Enter Account No : ");
				d.setaccno(sc.nextInt());
				System.out.print(" Enter IFSC No    : ");
				d.setifsc(sc.nextInt());
				System.out.print(" Enter Mobile No  : ");
				d.setPhoneNo(sc.nextInt());
				System.out.println();
				break;
			} else {
				System.out.println();
				System.out.println(" Enter Valid Credientials");
				System.out.println();

			}
		}
		do {
			System.out.println(" 1. Balance Enquiry ");
			System.out.println(" 2. Withdraw ");
			System.out.println(" 3. Deposit ");
			System.out.println(" 4. Update Mobile Number");
			System.out.println(" 5. Update PIN");
			System.out.println(" 6. Details ");
			System.out.println(" 7. EXIT");
			System.out.println();
			System.out.print(" Enter Your Choice : ");
			choice = sc.nextInt();
			System.out.println();
			switch (choice) {
			case 1:
				System.out.println(" Your Balance is : " + d.getBalance());
				System.out.println();
				break;
			case 2:
				System.out.print(" Enter the Withdraw Amount : ");
				int with = sc.nextInt();
				d.withdraw(with);
				System.out.println();
				break;
			case 3:
				System.out.print(" Enter the Deposit Amount : ");
				int dep = sc.nextInt();
				d.deposit(dep);
				System.out.println();
				break;
			case 4:
				System.out.print(" Enter the Mobile no : ");
				int mobile = sc.nextInt();
				d.setPhoneNo(mobile);
				System.out.println(" Mobile.No changed ");
				System.out.println();
				break;
			case 5:
				System.out.print(" Enter the New Pin : ");
				String pin = sc.nextLine();
				d.setPin(pin);
				System.out.println(" Pin changed ");
				System.out.println();
				break;
			case 7:
				System.out.println(" ------- EXITED ------");
				break;
			case 6:
				d.display();
				break;
			default:
				System.out.println(" Enter the Valid choice ");
				break;
			}

		} while (choice != 6);

	}

}
