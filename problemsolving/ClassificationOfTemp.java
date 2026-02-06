package problemsolving;

public class ClassificationOfTemp {
	public void temp(int temp) {
		if (temp>35) {
			System.out.println("very hot");
		}
		else if (temp>25) {
			System.out.println("hot");
		}
		else if (temp>15) {
			System.out.println("warm");
		}
		else {
			System.out.println("cold");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassificationOfTemp s= new ClassificationOfTemp();
		s.temp(35);

	}

}
//temp >35 ====== very hot
//temp >25 ======= hot
//temp >15 ======= warm
//or else it is cold
