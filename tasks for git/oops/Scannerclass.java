package oops;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
//		System.out.println(" enter the INT value: " +s.nextInt());
//		System.err.println(" Enter the float values : " + s.nextFloat());
//		System.out.println("Enter the name: "+ s.next());
//		System.out.println("sai");
//		System.out.println("enter the name 12 "+ s.next().charAt(2));
//		System.out.println("ramavarapu");
		
		System.out.println("enter  the int values: "+s.nextInt());
		s.nextLine();//input buffer s.nextInt() takes this line 
		System.out.println("enter the name: "+ s.nextLine());
		
		
	}

}
