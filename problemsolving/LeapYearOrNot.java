package problemsolving;

public class LeapYearOrNot {
	public static void leapyear(int year) {
		if((year%400==0 || year%4==0) && (year%100!=0))  {
			System.out.println("Leap Year");
		}

		else {
			System.out.println("not leapYear");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leapyear(2004);

	}

}
