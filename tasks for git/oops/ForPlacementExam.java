package oops;

import java.util.Scanner;

public class ForPlacementExam {
	public static int power(int base, int power) {
		int result = 1;
		for (int i = 1; i <= power; i++) {
			result *= base;
		}
		return result;

	}

	public static void armstrong(int n) {
		int temp = n;
		int original = n;
		int count = 0;
		while (temp > 0) {
			count++;
			temp /= 10;
		}
		int sum = 0;
		while (original > 0) {
			int digit = original % 10;
			sum = sum + power(digit, count);
			original /= 10;
		}
		if (sum == n) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not armstrong");
		}

	}

	public static void neon(int n) {
		int square = n * n;
		int temp = n;
		int sum = 0;
		while (temp > 0) {
			int digit = temp % 10;
			sum += digit;
			temp /= 10;
		}
		if (sum == n) {
			System.out.println("neon num");
		} else {
			System.out.println("not neon");
		}
	}

	public static void palindrome(int n) {
		int temp = n;
		int rev = 0;
		while (temp > 0) {
			rev = rev * 10 + temp % 10;
			temp = temp / 10;
		}
		if (rev == n) {
			System.out.println("palindrome ");
		} else {
			System.out.println("not a palindrome");
		}
	}

	public static void reverse(int n) {
		int temp = n;
		int rev = 0;
		while (temp > 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		System.out.println(rev + " is the reverse of " + n);
	}

	public static void prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void strong(int n) {
		int result = 0;
		int temp = n;
		while (temp > 0) {
			result = result + factorial(temp % 10);
			temp /= 10;
		}
		System.out.println(result);
	}

	public static void automorphic(int n) {
		int square = n * n;
		int temp = n;
		while (temp > 0) {
			if (temp % 10 != square % 10) {
				System.out.println("false ");
				break;
			}
			temp = temp / 10;
			square /= 10;
		}

		System.out.println("automorphic num");
	}

	public static void fibonacci(int count) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i <= count - 2; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}
	}

	public static void perfect(int n) {
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			System.out.println(n + " is Perfect Number");
		} else {
			System.out.println(n + " is NOT Perfect Number ");
		}
	}

	public static void harshad(int n) {
		int temp = n;
		int sum = 0;
		while (temp > 0) {
			sum += temp % 10;
			temp /= 10;
		}
		System.out.println(n / sum);
	}

	public static void greatest(int n) {
		int max = 0;
		while (n > 0) {
			int digit = n % 10;
			if (digit > max) {
				max = digit;
			}
			n = n / 10;

		}
		System.out.println(max);
	}

	public static void evenorodd(int n) {
		if (n % 2 == 0) {
			System.err.println("Even Number ");
		} else {

			System.out.println("Odd number ");
		}
	}

	public static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a : " + a + "    " + "b :  " + b);
	}

	public static void leapyear(int n) {
		if (n % 400 == 0 || (n % 100 != 0 && n % 4 == 0)) {
			System.out.println("leap year");
		} else {
			System.out.println("Not leap Year");
		}
	}

	public static void leftalignedtriangle(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void rightalignedtriangle(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void solidsquare(int a) {
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
			System.out.print("* ");
		}
			System.out.println();
		}
	}
	public static void invertedtriangle(int n) {
		for(int i=n;i<=0;i--) {
			for(int j=i;j<=i;j--) {
				System.out.println("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("---------------- Problems --------------");
			System.out.println(" 1 Armstrong number                    |");
			System.out.println(" 2 Neon number                         |");
			System.out.println(" 3 Palindrome                          |");
			System.out.println(" 4 Reverse of a num                    |");
			System.out.println(" 5 Prime or Not                        |");
			System.out.println(" 6 Factorial of Number                 |");
			System.out.println(" 7 Automorphic number                  |");
			System.out.println(" 8 Fibonacci Series                    |");
			System.out.println(" 9 Perfect Number                      |");
			System.out.println(" 10 Harshad Number                     |");
			System.out.println(" 11 Greatest digit in Number           |");
			System.out.println(" 12 Even or Odd                        |");
			System.out.println(" 13 Swap two numbers                   |");
			System.out.println(" 14 Leap Year                          |");
			System.out.println(" 15 Left Aligned Triangle              |");
			System.out.println(" 16 Right Aligned Triangle             |");
			System.out.println(" 17 Solid Square                       |");
			System.out.println(" 18 Inverted Triangle                  |");
			System.out.println();
			System.out.print(" Enter your Choice : ");
			choice = sc.nextInt();
			System.out.println();
			switch (choice) {

			case 1:
				System.out.print(" Armstrong number :");
				int num = sc.nextInt();
				armstrong(num);
				System.out.println();
				break;
			case 2:
				System.out.print(" Neon number : ");
				int neon = sc.nextInt();
				neon(neon);
				System.out.println();
				break;
			case 3:
				System.out.print(" Palindrome :");
				int palindrome = sc.nextInt();
				palindrome(palindrome);
				System.out.println();
				break;
			case 4:
				System.out.print(" Reverse of a num : ");
				int rev = sc.nextInt();
				reverse(rev);
				System.out.println();
				break;
			case 5:
				System.out.println(" Prime or Not : ");
				int prime = sc.nextInt();
				prime(prime);
				System.out.println();
				break;
			case 6:
				System.out.print(" Factorial : ");
				int factorial = sc.nextInt();
				System.out.println(factorial(factorial));
				System.out.println();
				break;
			case 7:
				System.out.print(" Automorphic number : ");
				int auto = sc.nextInt();
				automorphic(auto);
				System.out.println();
				break;
			case 8:
				System.out.println(" fibonacci : ");
				int fibonacci = sc.nextInt();
				fibonacci(fibonacci);
				System.out.println();
				break;
			case 9:
				System.out.print(" Perfect Number : ");
				int perfect = sc.nextInt();
				perfect(perfect);
				System.out.println();
				break;
			case 10:
				System.out.print(" Harshad Number : ");
				int harshad = sc.nextInt();
				harshad(harshad);
				System.out.println();
				break;
			case 11:
				System.out.println(" Greatest Digit in a number :");
				int digit = sc.nextInt();
				greatest(digit);
				System.out.println();
				break;
			case 12:
				System.out.print(" EVEN or ODD: ");
				int evenorodd = sc.nextInt();
				evenorodd(evenorodd);
				System.out.println();
			case 13:
				System.out.println(" Swap Two num");
				System.out.print("a : ");
				int a = sc.nextInt();
				System.out.print("b : ");
				int b = sc.nextInt();
				swap(a, b);
				System.out.println();
				break;
			case 14:
				System.out.print(" Enter Year :");
				int year = sc.nextInt();
				leapyear(year);
				System.out.println();
			case 15:
				System.out.print(" Rows for Left aligned triangle");
				int num1 = sc.nextInt();
				leftalignedtriangle(num1);
				break;
			case 16:
				System.out.print(" Rows for Right aligned triangle");
				int num2 = sc.nextInt();
				rightalignedtriangle(num2);
				break;
			case 17:
				System.out.print(" Rows for Solid Square :  ");
				int num3 = sc.nextInt();
				solidsquare(num3);
				break;
			case 18 : 
				System.out.print(" Rows Inverted Triangle : ");
				int num4 = sc.nextInt();
				invertedtriangle(num4);
				break;
			default:
				System.out.println(" Enter Valid Choice");
				break;

			}

		} while (choice != 33);

		System.out.println(" --------------");

		System.out.println(" --------------");

		System.out.println(" --------------");

		System.out.println(" --------------");

		System.out.println(" --------------");

		System.out.println(" --------------");

	}
}
