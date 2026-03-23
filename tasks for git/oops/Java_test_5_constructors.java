package oops;

import java.util.Scanner;

public class Java_test_5_constructors {
// ----------------- 11 
//	public class Student {
//		private int marks;
//		private String name;
//		private int roll;
//
//		public Student(String name, int roll, int marks) {
//			this.name = name;
//			this.marks = marks;
//			this.roll = roll;
//
//		}
//
//		public Student() {
//			this("", 0, 0);
//		}
//		
//		public void display() {
//			System.out.println("Name :"+name);
//			System.out.println("roll : "+ roll);
//			System.out.println("marks : "+marks);
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner s=new Scanner(System.in);
//		System.out.print("Name : ");
//		String name=s.nextLine();
//		System.out.print("Roll : ");
//		int roll=s.nextInt();
//		System.out.print("marks : ");
//		int marks=s.nextInt();
//		Java_test_5_constructors f=new Java_test_5_constructors();
//		Java_test_5_constructors.Student d=f.new Student(name,roll,marks);
//		System.out.println();
//		d.display();
//		
//		
//
//	}
// --------------------12
//	public class Rectangle{
//		private int l;
//		private int w;
//		public Rectangle(int l,int w) {
//			this.l=l;
//			this.w=w;
//			
//		}
//		public Rectangle(int side) {
//		
//			this.l=w=side;
//		}
//		
//		
//		public int area() {
//			return l*w;
//		}
//	}
//	
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.print("enter l: ");
//		int l= s.nextInt();
//		System.out.print("enter w: ");
//		int w=s.nextInt();
//		Java_test_5_constructors f=new Java_test_5_constructors();
//		Java_test_5_constructors.Rectangle r=f.new Rectangle(l,w);
//		Java_test_5_constructors.Rectangle r1=f.new Rectangle(l);
//		System.out.println("Rectangle area "+r.area());
//		System.out.println("Square area "+r1.area());
//		
//	}

// -----------------------13

//	public class parent {
//		private String name;
//		private int age;
//
//		parent(String name, int age) {
//			this.name = name;
//			this.age = age;
//
//		}
//	}
//
//	public class child extends parent {
//		public child(String name, int age) {
//			super(name, age);
//		}
//
//		public void display() {
//			System.out.println("Name : " + super.name);
//			System.out.println("Age : " + super.age);
//		}
//
//	}
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		Java_test_5_constructors f = new Java_test_5_constructors();
//		System.out.print("name : ");
//		String name = s.nextLine();
//		System.out.println("age : ");
//		int age = s.nextInt();
//
//		Java_test_5_constructors.child c = f.new child(name, age);
//		System.out.println();
//		c.display();
//	}

//--------------------14 

//	public class constructor_overloading{
//		
//		public constructor_overloading() {
//			
//			System.out.println("chain 1");
//		}
//		public constructor_overloading(int a) {
//			this();
//			System.out.println("chain 2");
//			System.out.println(a);
//		}
//		public constructor_overloading(int a ,int b) {
//			this(a);
//			System.out.println("chain 3");
//			System.out.println(a+" "+ b);
//		}
//	}
//	public static void main(String [] args) {
//		Scanner s = new Scanner(System.in);
//	
//		Java_test_5_constructors f = new Java_test_5_constructors();
//		Java_test_5_constructors.constructor_overloading c=f.new constructor_overloading(5,9);
//		
//	}

	public class bankaccount {

		private int accno;
		private int balance;
		private String name;

		public bankaccount() {
			this("", 0, 0);
		}

		public bankaccount(String name, int accno, int balance) {
			this.accno = accno;
			this.balance = 1000;
			this.name = name;
		}

	}

	public class savings extends bankaccount {
		private int intrestrate;

		public savings(String name, int accno, int balance, int intrestrate) {
			super(name, accno, balance);
			this.intrestrate = intrestrate;
		}

		public savings() {
			super();
		}

		public void deposit(int amount) {
			super.balance = super.balance + amount;
		}

		public void withdraw(int amount) {
			super.balance = super.balance - amount;
		}

		public void display() {
			System.out.println("accno : " + super.accno);
			System.out.println("name : " + super.name);
			System.out.println("balance : " + super.balance);
			System.out.println("Yearly intrest : " + yearlyintrest());
		}

		public int yearlyintrest() {
			return super.balance = (super.balance * 12 * this.intrestrate) / 100;
		}
	}

	public static void main(String[] args) {
		System.out.println(" -------- welcome to bank ----------");
		Scanner sc = new Scanner(System.in);

		System.out.print("enter your name ");
		String name = sc.next();
		System.out.print("enter accno: ");
		int accno = sc.nextInt();
		System.out.print("enter the pin :");
		int pin = sc.nextInt();

		System.out.print("enter the intrest rate: ");
		int intrestrate = sc.nextInt();
		Java_test_5_constructors f = new Java_test_5_constructors();
		Java_test_5_constructors.savings s = f.new savings(name, accno, 0, intrestrate);

		int choice;
		do {

			System.out.println("1 . deposit ");
			System.out.println("2 . withdraw");
			System.out.println("3 . display");

			System.out.println("4 . exit");
			System.out.println();
			System.out.print("enter your choice : ");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the deposit amount: ");
				int amount = sc.nextInt();
				s.deposit(amount);
				System.out.println("deposit success");
				break;
			case 2:
				System.out.println("Enter the Withdraw amount: ");
				int amount1 = sc.nextInt();
				s.withdraw(amount1);
				System.out.println("withdraw success");
				break;
			case 3:
				s.display();
				break;
			case 4:
				System.out.println("Exited");
				break;
			default:
				System.out.println("enter valid choice");
				break;
			}
		} while (choice != 4);
	}

}
