package problemsolving;
class NumberChecker {
	
		static void checker(int num) {
			if(num>0) {
				System.out.println("the number "+ num + " is positive");
			}
			if (num<0) {
				System.out.println("the number "+ num + " is negative");
			}
			if (num==0) {
				System.out.println("the number "+ num + " is neither positive nor negative");
			}
		}
	
	public static void main(String[] args) {
		
		checker(5);
		checker(-3);
	
	}

}
