package problemsolving;

public class ControlFlowStatementsTask {

	public static void posOrNeg(int num) {

		if (num >= 0) {
			System.out.println(" The num : " + num + " is Positive .");

		} else if (num == 0) {
			System.out.println(" The num is Zero");
		} else {
			System.out.println(" The num : " + num + " is Negative .");
		}
	}

	public String evenOrodd(int num) {

		if (num % 2 == 0) {
			return " The Num : " + num + " is even";

		} else if (num == 0) {
			return " The Num : " + num + " is Zero";
		} else {
			return " The Num : " + num + " is odd";
		}
	}

	public static void VotingEligibility(int age) {

		if (age >= 18) {
			System.out.println(" Eligible to vote");
		} else {
			System.out.println(" not eligible to vote");
		}
	}

	public int LargestOfTwo(int a, int b) {
		if (a > b) {
			return a;

		} else if (a == b) {
			return a;
		} else {
			return b;
		}
	}

	public static void Divisibility(int num) {
		if (num % 5 == 0 && num % 11 == 0) {
			System.out.println("The Number is : " + num + " is divisible by 5 and 11");

		}
		else {
			System.out.println("The Number is : " + num + " is NOT divisible by 5 and 11");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" 1 .Positive or Negative");
		System.out.println("-------------------------");

		posOrNeg(5);
		posOrNeg(-4);
		posOrNeg(0);
		System.out.println();
		System.out.println(" 2. Even or Odd");
		System.out.println("-------------------------");

		ControlFlowStatementsTask obj = new ControlFlowStatementsTask();
		System.out.println(obj.evenOrodd(4));
		System.out.println(obj.evenOrodd(33));
		System.out.println(obj.evenOrodd(0));
		System.out.println();

		System.out.println(" 3 .Voting eligibility");
		System.out.println("-------------------------");
		VotingEligibility(3);
		VotingEligibility(30);
		VotingEligibility(0);

		System.out.println();
		System.out.println(" 4. The Largest of Two Numbers");
		System.out.println("-------------------------");
		System.out.println(" The largest of the Two Numbers is: " + obj.LargestOfTwo(3, 7));
		System.out.println(" The largest of the Two Numbers is: " + obj.LargestOfTwo(4, 0));
		System.out.println(" The largest of the Two Numbers is: " + obj.LargestOfTwo(33, 33));

		System.out.println();
		System.out.println(" 5. divisibility by 5 and 11");
		System.out.println("-------------------------");
		Divisibility(4);
		Divisibility(55);
		Divisibility(90);
		

	}

}
