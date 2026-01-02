package methods_package;

public class Other_ways {
	static int a =0;
	public static void first() {
		System.out.println("first");
		
		second();
	}
	public static void second() {
		System.err.println("second");
		third();
		
	};
	public static void third() {
		System.out.println("third");
		fourth();
		
	}
	public static void fourth() {
		System.out.println("last one ");
		a++;
		if (a<10) {
			first();
			
		}
		else {
			System.out.println("end");
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first();
		
		

	}

}
