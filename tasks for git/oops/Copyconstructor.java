package oops;

public class Copyconstructor {
	private int roll;
	private String name;
	public Copyconstructor(int roll,String name) {
		this.roll=roll;
		this.name=name;
	}
	
	public Copyconstructor(Copyconstructor other) {
		this.roll=other.roll;
		this.name=other.name;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Copyconstructor s = new Copyconstructor(10,"hrushi");
		System.out.println(s.name);
		System.out.println(s.roll);
		Copyconstructor s1 = new Copyconstructor(s);
		System.out.println(s1.name);
		System.out.println(s1.roll);
		
		

	}

}
