package problemsolving;


public class SwitchStudentMarks {
	public void stmarks(char grade) {
		switch (grade) {
		case 'a':
		case 'A':
			System.out.println("you got 76 to 100 marks");
			break;
		case 'b':
		case 'B':
			System.out.println("you got 51 to 75 marks");
			break;
		case 'c':
		case 'C':
			System.out.println("you got 36 to 50 marks");
			break;
		case 'd':
		case 'D':
			System.out.println("you got 0 to 35 marks");
			break;
		case 'f':
		case 'F':
			System.out.println("you failed");
			break;
		default:
			System.out.println("please enter a valid grade");

		}

	}

	public void stmarks(int marks) {

	    if (marks < 0 || marks > 100) {
	        System.out.println("Invalid Input");
	        return;
	    }

	    switch (marks / 10) {

	        case 10:   
	        case 9:    
	        case 8:    
	            System.out.println("A grade for You");
	            break;

	        case 7:    
	        case 6:    
	        case 5:    
	            if (marks >= 76) {
	                System.out.println("A grade for You");
	            } else {
	                System.out.println("B grade for You");
	            }
	            break;

	        case 4:   
	        case 3:    
	            if (marks >= 36) {
	                System.out.println("C grade for You");
	            } else {
	                System.out.println("D grade for You");
	            }
	            break;

	        case 2:
	        	System.out.println("D grade for You");
	        	break;
	        case 1:
	        case 0:
	        	System.out.println("You Failed");
	            break;

	        default:
	            System.out.println("Invalid Input");
	    }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchStudentMarks o = new SwitchStudentMarks();
		o.stmarks('a');
		o.stmarks('d');
		o.stmarks('m');
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		o.stmarks(35);
		o.stmarks(36);
		o.stmarks(0);
		o.stmarks(74);
		o.stmarks(75);
		o.stmarks(76);
		o.stmarks(54);

	}

}
