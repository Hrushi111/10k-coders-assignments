package oops;

import java.util.Scanner;

public class MethodOverloading {
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int add(int a) {
		return a;
	}
	public static String add(String string , String string2, String  string3) {
		System.out.println(string);
		System.out.println(string2);
		System.out.println(string3);
		return string+string2+string3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(add(s.nextInt(),s.nextInt()));
		System.out.println(add(s.nextInt()));
		System.out.println();
		System.out.println(add(s.nextLine(),s.nextLine(),s.nextLine()));

	}
	

}
