package problemsolving;

public class BonusEligibility {
	
	public String bonus(int bon) {
		if(bon>25000) {
			return "Eligibel for bonus";
		}
		else {
			 return "not Eligible for bonus";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BonusEligibility s= new BonusEligibility();
		System.out.println(s.bonus(300000));

	}

}
//if the salary is more than 25k is eligible to get bonus