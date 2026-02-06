package problemsolving;

public class LargestofThree {
	public String largest(int a, int b, int c) {
		if(a>b && a>c) {
			return "the largest is : "+a;
		}
		else if (b>a && b>c) {
			return "the largest is : "+b;
		}
		else {
			return "the largest is : "+c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestofThree s= new LargestofThree();
		System.out.println(s.largest(12, 3, 4));
		System.out.println(s.largest(52, 43, 54));

		

	}

}
