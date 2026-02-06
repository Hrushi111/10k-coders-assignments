package problemsolving;

public class LoopingStatements {
	public static void Whileloop(int i) { // while loop

		while (i < 5) {
			System.out.println(i);
			i++;
		}
	}

	public static void Dowhileloop(int i) { // do while loop
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}

	public static void forloop(int i) { // for loop
		for (int i1 = 1; i1 < 10; i1=i1+2) { // odd numbers
			System.out.println(i1);
		}
		System.out.println();
		for (int i1 = 0; i1 < 10; i1=i1+2) { // even numbers
			System.out.println(i1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whileloop(1);
		System.out.println();
		Dowhileloop(1);
		System.out.println();
		forloop(4);
	}

}
