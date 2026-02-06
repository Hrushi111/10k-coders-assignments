package problemsolving;

public class PassOrFail {
	public static void passorfail(int marks) {
		if (marks >=40) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passorfail(39);
		passorfail(50);
		

	}

}
//40 or more pass
//or fail