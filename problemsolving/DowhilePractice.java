package problemsolving;

public class DowhilePractice {

	public static void numbers() {
		int i = 1;
		System.out.println("  numbers from 1 to 5 ");
		do {
			System.out.println("  " + i);
			i++;
		} while (i <= 5);

	}

	public void fiveTable() {
		int i = 1;
		System.out.println("  FIVE table");
		System.out.println(" ----------------");
		do {
			System.out.println(" | " + i + " X " + " 5 " + " = " + i * 5 + " | ") ;
			i++;
		} while (i <= 20);
		System.out.println(" ----------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers();
		System.out.println();
		DowhilePractice o = new DowhilePractice();
		o.fiveTable();
	}

}

//print num for 1 to 5 using do while execute the loop atleast once
//print the table of 5 using do while  
// 