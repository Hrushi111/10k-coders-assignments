package oops;

import java.util.Scanner;

public class SuperkeywordMain {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Superkeyword s=new Superkeyword();
//		Superkeyword.BankAccount b=s.new BankAccount();
//		Superkeyword.SavingsAccount sa=s.new SavingsAccount(1,"Sai",900);
//		
//		sa.displaySavings();
//	}

	public static void main(String[] args) {

		Superkeyword s = new Superkeyword();
		Scanner sc = new Scanner(System.in);

		System.out.print("Name: ");
		String stname = sc.nextLine();

		System.out.print("rollno: ");
		int rollno = sc.nextInt();
		sc.nextLine(); // buffer clear

		System.out.print("branch: ");
		String branch = sc.nextLine();

		System.out.print("gpa: ");
		int gpa = sc.nextInt();

		System.out.print("total fee: ");
		int totalfee = sc.nextInt();

		System.out.print("Paid fee: ");
		int paidfee = sc.nextInt();
		
		Superkeyword.studentPayment p = s.new studentPayment(stname, rollno, branch, gpa, paidfee, totalfee);

		p.paymentdisplay();
	}

}
