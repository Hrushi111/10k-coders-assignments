package methods_package;

public class Calculator {
	static int a=29;
	 static int b=30;
	public static int add() { 
		return a+b;
	}
	public static int sub() {
		int a=1;
		int b=3;
		return a-b;
	}
	public static int mult(int a , int b) {
		
		return a*b ;
	}public static int div(int a , int b) {
		int res=a/b;
		return res;
	}
	
	
	public class NumberCheck{
		public static String IsEven(int n) {
			if (n%2==0) {return "Even";}
			else {return "odd";}
			
		}
	}
	public class MathOperations{
		public static int square(int n) {
			return n*n;
		}
		public static int cubes(int n) {
			return n*n*n;
		}
	}
	
	public  class StudentResult {
		static int calculateTotal(int sub1,int sub2 , int sub3 , int sub4) {
			int total=sub1+sub2+sub3+sub4;
		
			return total;
		}
		
		public static int calculateAverage(int sub1,int sub2 , int sub3 , int sub4) {
			int avg=(sub1+sub2+sub3+sub4)/4;
			return avg;
		}
	}
	public class IntrestCalculator{
		static double p=20000;
		static double r=3.2;
		static double t=5;
		public static double calculateSi() {
			double Si = (p*t*r)/100;
			return Si;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1=10;
		int sub2=20;
		int sub3 = 30;
		int sub4= 40;
		
		System.out.println("the addition of "+ a+ " and "+ b + " is " +add()+" // static input values");
		System.out.println();
		System.out.println(a+" - " +b +" is " +sub()+" // local input values inside the method ");
		System.out.println();
		System.out.println("the result of " + a + " X " +b +" is " +mult(100,30)+ " // passed arguments through method ");
		System.out.println();
		System.out.println("100 divided by 30 " + " is " +div(100,30)+ " // took a result in a seperate variable ");
		System.out.println();
		System.out.println("The given number is " + NumberCheck.IsEven(100)+ " // used two return statements");
		System.out.println();
		System.out.println("the square of the given num is "+ MathOperations.square(3)+ " // called through class"+"\n" +"\n"+ "the cube of the given number is " + MathOperations.cubes(3));
		System.out.println();
		System.out.println("The total score of four subs : " + sub1+ " " + sub2 +" "+ sub3+ " " + sub4+ " is "+ StudentResult.calculateTotal(sub1, sub2, sub3, sub4) +" // used local variables in main method" );
		System.out.println();
		System.out.println("The average of the four subs : " + sub1+ " " + sub2 +" "+ sub3+ " " + sub4+ " is "+StudentResult.calculateAverage(sub1, sub2, sub3, sub4));
		System.out.println("");
		System.out.println("The simple intrest for the principle amount of  "+ IntrestCalculator.p+" for rate of intrest "+ IntrestCalculator.r +" and over a time period of "+IntrestCalculator.t +" is "+ IntrestCalculator.calculateSi() +" // static variables called through class" );
	}

}
