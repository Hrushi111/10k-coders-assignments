package problemsolving;

public class ForloopPractice {
	public static void numbers() {
		System.out.println("normal numbers 1 to 5 ");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	public static void evennums() {
		System.out.println("even numbers");
		System.out.println();
		for(int i=0;i<=20;i=i+2) {
			System.out.println(i);
		}
	}
	public static void reverse() {
		System.out.println("reverese of the numbers");
		for(int i=5;i>0;i--) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers();
		System.out.println();
		evennums();
		System.out.println();
		reverse();

	}

}
// print num from  1 to 5 
// print even numm from 1 to 20 
// reverse num from 5 to 1