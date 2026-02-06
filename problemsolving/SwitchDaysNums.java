package problemsolving;

public class SwitchDaysNums {
	public void daysNums(int day) {
		switch (day) {
		case 1:
			System.out.println("the day is sunday");
			break;
		case 2:
			System.out.println("the day is monday");
			break;
		case 3:
			System.out.println("the day is tuesday");
			break;
		case 4:
			System.out.println("the day is wednesday");
			break;
		case 5:
			System.out.println("the day is thursday");
			break;
		case 6:
			System.out.println("the day is friday");
			break;
		case 7:
			System.out.println("the day is saturday");
			break;
		default:
			System.out.println("invalid input");

		}
	}

	public void daysNums(String day) {
		switch (day) {
		case "sunday":
			System.out.println("the day is 1 ");
			break;
		case "monday":
			System.out.println("the day is 2");
			break;
		case "tuesday":
			System.out.println("the day is 3");
			break;
		case "wednesday":
			System.out.println("the day is 4");
			break;
		case "thursday":
			System.out.println("the day is 5");
			break;
		case "friday":
			System.out.println("the day is 6");
			break;
		case "saturday":
			System.out.println("the day is 7");
			break;
		default:
			System.out.println("invalid input");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchDaysNums o = new SwitchDaysNums();
		o.daysNums(3);
		o.daysNums(4);
		o.daysNums(10);
		o.daysNums(6);
		o.daysNums(5);
		System.out.println();
		System.out.println("-----------------------");
		System.out.println();
		o.daysNums("monday");
		

	}

}
