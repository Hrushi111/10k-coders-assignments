package problemsolving;

public class StatusOfExamResult {
	public void result(int marks) {
		if(marks>35) {
			System.out.println("Passed");
		}
		else {
			System.out.println("supplimentary");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatusOfExamResult s=new StatusOfExamResult();
		s.result(10);
		s.result(48);

	}

}
//marks more than 35 otherwise supplimentary
