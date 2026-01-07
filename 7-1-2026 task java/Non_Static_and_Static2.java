package methods_package;

public class Non_Static_and_Static2 {

	public static void static_method() {
		System.out.println("static method");
	}
	public void non_static1() {
		System.out.println("non static method 1");
		
		
		
	}
	public void non_static2() {
		System.out.println("non static method 2");
		static_method();
		
		non_static1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_Static_and_Static2 obj = new Non_Static_and_Static2();
		obj.non_static2();

	}

}
