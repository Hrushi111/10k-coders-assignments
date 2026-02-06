package problemsolving;

public class JavaTest_5 {

	public static int countOFdigits(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	public static int reverseofnumber(int num) {
		int rev = 0;
		while (num != 0) {
			int lastdigit = num % 10;
			rev = rev * 10 + lastdigit;
			num = num / 10;
		}
		return rev;
	}

	public static String palindrome(int n) {

		int rev = 0;
		int act = n;

		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}

		if (act == rev) {
			return "the num : " + act + " is a palindrome ";
		} else {
			return "the num : " + act + " is a not a palindrome ";
		}
	}

	public static void fibonacci(int n) {
		int a = 0, b = 1;
		int count = 0;
		while (count < n) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
			count++;
		}

	}

	public void cases(int i, int num) {
		System.out.println(" 1 . for even or odd ");
		System.out.println(" 2 . for positive or negative ");
		System.out.println(" 3 . to exit the program");
		switch (i) {
		case 1:
			if (num % 2 == 0) {
				System.out.println("the number is even");
			} else {
				System.out.println("the number is odd");
			}
			break;

		case 2:
			if (num >= 0) {
				System.out.println("the num is positive ");
			} else {
				System.out.println("the num is negative");
			}
			break;
		case 3:
			System.out.println("You successfully exited the program");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = countOFdigits(23566);
		System.out.println(d);
		System.out.println(reverseofnumber(1230098));
		System.out.println(palindrome(121));
		fibonacci(20);
		JavaTest_5 o= new JavaTest_5();
		o.cases(1, 45);
		

	}

}
