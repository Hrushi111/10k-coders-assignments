package problemsolving;

public class StudentMarks {

	public static void marks(int marks) {

		if (marks < 0 || marks > 100) {
			System.out.println("Invalid marks");
		} else if (marks >= 75) {
			System.out.println("A grade");
		} else if (marks >= 50) {
			System.out.println("B grade");
		} else if (marks >= 35) {
			System.out.println("C grade");
		} else {
			System.out.println("Fail");
		}
	}

	public static void marks(char grade) {

		if (grade == 'a' || grade == 'A') {
			System.out.println("the marks are betwee 76 to 100");
		} else if (grade == 'b' || grade == 'B') {
			System.out.println("the marsk are between 51 to 75");
		} else if (grade == 'c' || grade == 'C') {
			System.out.println("the marsk are between 36 to 50");
		} else if (grade == 'D' || grade == 'd') {
			System.out.println("the marsk are between 0 to 35");
		} else if (grade == 'f' || grade == 'F') {
			System.out.println("You failed");
		}
		else {System.out.println("invalid input");}
	}

	public static void main(String[] args) {

		marks(75);
		marks(50);
		marks(35);
		marks(0);
		marks(110);
		marks(-5);
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		marks('a');
		marks('f');
		marks('u');
		
	}
}
