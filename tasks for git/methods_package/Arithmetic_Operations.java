package methods_package;

public class Arithmetic_Operations {
	
	
	public static void addition() {
		int sum=a+b;
		System.out.println("The addition of "+ a +" and " + b + " is " + sum);
		
	}
	public static void subtraction() {
		int subtr=a-b;
		System.out.println("The subtraction of "+ a +" and " + b + " is " + subtr);
		
	}public static void multiply() {
		int mult=a *b;
		System.out.println("The product of "+ a +" and " + b + " is " + mult);
		
	}public static void division() {
		int div = a%b;
		System.out.println("The division of "+ a +" and " + b + " is " + div);
		
	}public static void remainder() {
		int rem=a/b;
		System.out.println("The remainder of "+ a +" and " + b + " is " + rem);
		
	}public static void increment() {
		int pre_increment=++c;
		int post_increment=c++;
		System.out.println("The pre_increment of  "+ c + " is "+ pre_increment +" and " +"The post_increment of "+  c + " is " + post_increment);
		
	}public static void decrement() {
		int post_decrement=c--;
		int pre_decrement= --c;
		System.out.println("The post_decrement of "+ c+ " is "+ post_decrement +" and " +"The pre_decrement of "+  c + " is " + pre_decrement);
		
	}
	static int a=20;
	static int b=5;
	static int c = 12;
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		 
		addition();
		subtraction();
		multiply();
		division();
		remainder();
		increment();
		decrement();
		

	}

}
