package problemsolving;

public class LargestNum {
	public String largestnum(int a , int b) {
		return (a>b)? a+" is the largest": b+" is the largest";
	}
	public static void largestn(int a ,int b) {
		
		if (a>b) {
			System.out.println("the num "+ a+" is the largest");
		}
		else {
			System.out.println("the num "+ b+" is the largest");

		}
	}
	public static void main(String[] args) {
		LargestNum obj= new LargestNum();
		String s=obj.largestnum(5, 3);
		largestn(3,4);
		System.out.println();
		System.out.println(s);
	}

}
