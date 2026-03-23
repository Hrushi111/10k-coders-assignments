package oops;

import java.util.Scanner;

public class PlacementExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlacementExam pe=new PlacementExam();
		PlacementExam.product pro=pe.new product();
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1 Add product ");
			System.out.println("2 Update Stock");
			System.out.println("3 Display Details ");
			
			System.out.println("4 Exit");
			System.out.println();
			System.out.print("Enter the choice : ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				 pro.addproduct();
				 break;
			case 2:
				pro.updatequantity();
				break;
			case 3:
				pro.display();
				break;
			case 4:
				System.out.println("exited");
				break;
			}
			
		}while(choice!=4);
		
		
	}

}
