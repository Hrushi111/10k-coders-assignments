package oops;

public class ConstructorOverloading {
	public ConstructorOverloading() {
		this(3,4,5);
		System.out.println(" no parametersied constructor");
	}

	public ConstructorOverloading(int a) {
		System.out.println(" 1 parametersied constructor");
		System.out.println(a);
	}

	public ConstructorOverloading(int a, int b) {
		this(3);
		System.out.println(" 2 parametersied constructor");
		System.out.println(a + " " + b);
	}

	public ConstructorOverloading(int a, int b, int c) {
		this(3,4);
		System.out.println(" 3 parametersied constructor");
		System.out.println(a + " " + b + " " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading o = new ConstructorOverloading();

	}

}
