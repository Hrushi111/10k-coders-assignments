package problemsolving;

public class DiscountEligibility {
	public static String discount(int cost) {
		if(cost>5000) {
			return "discount applied";
			
		}
		else {
			return "not eligible for discount";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(discount(6666));

	}

}
//total cost is more than 5k discount applied 