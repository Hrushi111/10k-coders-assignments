package problemsolving;

public class EligibilityForLoan {
	public static String loan(int age , int salary) {
		if(age >=21 && salary>20000) {
			return "Eligible for loan";
		}
		else {
			return "not eligible for loan";
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(loan(2,30000));
		System.out.println(loan(23,30000));

	}

}

//the age should be >= 21 and salary should be >20k