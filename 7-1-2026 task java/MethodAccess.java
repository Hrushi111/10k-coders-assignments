package methods_package;

public class MethodAccess {
	public void First() {
		
		System.out.println("non static menthod 1");
		MethodAccess obj= new MethodAccess();
		obj.second();
		
	}
	public void second() {
		
		System.out.println("non static method 2");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodAccess obj= new MethodAccess();
		obj.First();
		
	}
		
	}


