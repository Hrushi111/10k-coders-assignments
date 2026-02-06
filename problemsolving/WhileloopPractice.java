package problemsolving;

public class WhileloopPractice {

	// num from 1 to 5 using whilel loop
	public static void whileloop(int i) {
		System.out.println("Normal numbers");

		while (i <= 5) {
			System.out.println("  " + i);
			i++;
		}
	}

	// even numbers
	public static void whileeven(int i) {
		System.out.println("the even numbers are : ");

		while (i <= 10) {
			System.out.println("  " + i);
			i = i + 2;
		}
	}

	// odd and even
	public static void oddOrEven(int a, int i) {

		if (i % 2 == 0) {
			System.out.println("the even numbers are :");
			while (i <= a) {
				System.out.println("  " + i);
				i = i + 2;
			}
		} else {
			System.out.println("the odd numbers are :");
			while (i <= a) {
				System.out.println("  " + i);
				i = i + 2;
			}

		}
	}

	// sum of first 5 natural numbers
	public static void summ() {
		System.out.print("sum of first 5 natural numbers is ");

		int d = 1;
		int sum = 0;
		while (d <= 10) {
			sum = sum + d;
			d++;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		whileloop(0);
		System.out.println("------------");
		whileeven(0);
		System.out.println();
		oddOrEven(10, 1);
		System.out.println();
		summ();

	}

}
