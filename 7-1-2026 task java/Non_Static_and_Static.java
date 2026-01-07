package methods_package;

public class Non_Static_and_Static {
	public static void static_method() {
		System.out.println("static method");
		
				
	}
	public void non_static_method() {
		System.out.println("non static method");
		Non_Static_and_Static.static_method();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_Static_and_Static obj = new Non_Static_and_Static();
		obj.non_static_method();
		

	}

}
