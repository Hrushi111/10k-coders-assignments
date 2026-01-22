package problemsolving;

public class EvenOrOdd {
		public static void evenorodd(int num) {
			if(num%2==0) {
				System.out.println("the number "+ num + " is even");
			}
			else {
			System.out.println("the number "+ num + " is odd");
			
		}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestNum.largestn(3,4);
		System.out.println("-----------");
		NumberChecker.checker(-2);
		System.out.println("-----------");
		evenorodd(3);
		evenorodd(2);
	}

}
