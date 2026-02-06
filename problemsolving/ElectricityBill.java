package problemsolving;

public class ElectricityBill {
	public int bill(int unit) {
		if(unit<=100) {
			return unit*2;
		}
		else if (unit<=200) {
			return unit*3;
		}
		else {
			return unit*5;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill s=new ElectricityBill();
		System.out.println("the total bill is : "+ s.bill(200));
		System.out.println("the total bill is : "+ s.bill(30));
		System.out.println("the total bill is : "+ s.bill(2100));


	}

}
//unit is <=100 the bill should be double of the unit 
//if the unit is <= 200 the bill should be thrice of the units
//or else the bill should be 5 times of the units