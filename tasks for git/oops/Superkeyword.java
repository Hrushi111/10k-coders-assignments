package oops;

//public class Superkeyword {
//
//	class BankAccount {
//		private long Bankaccountnum;
//		private String Holdername;
//		private long Balance;
//
//		public BankAccount(long Bankaccountnum, String Holdername, long balance) {
//			this.Bankaccountnum = Bankaccountnum;
//			this.Holdername = Holdername;
//			this.Balance = Balance;
//		}
//
//		public BankAccount(long Bankaccountnum, String Holdername) {
//			this(Bankaccountnum, Holdername, 5000);
//		}
//
//		public BankAccount(long Bankaccountnum) {
//			this(Bankaccountnum, "", 0);
//		}
//
//		public BankAccount() {
//			this(0, "Unknown", 0);
//		}
//
//		public void displayAccount() {
//			System.out.println("Account Number: " + Bankaccountnum);
//			System.out.println("Holder Name: " + Holdername);
//			System.out.println("Balance: " + Balance);
//		}
//
//	}
//
//	class SavingsAccount extends BankAccount {
//		private int intrest;
//
//		public SavingsAccount(long Bankaccountnum, String Holdername, long balance, int intrest) {
//			super(Bankaccountnum, Holdername, balance);
//			this.intrest = intrest;
//		}
//		public SavingsAccount(long Bankaccountnum, String Holdername) {
//			super(Bankaccountnum,Holdername);
//		}
//		public SavingsAccount(long Bankaccountnum,String Holdername,long balance) {
//			super(Bankaccountnum,Holdername,balance);
//		}
//		public SavingsAccount(long Bankaccountnum) {
//			super(Bankaccountnum);
//		}
//
//		public SavingsAccount() {
//			super();
//			this.intrest = 0;
//		}
//		
//		public void displaySavings() {
//			displayAccount();
//			System.out.println("Intrest: "+intrest);
//		}
//	}
//}	
public class Superkeyword {

	public class studentDetails {
		private String stname;
		private int rollno;
		private String branch;
		private int gpa;

		public studentDetails(String stname, int rollno, String branch, int gpa) {
			this.stname = stname;
			this.gpa = gpa;
			this.branch = branch;
			this.rollno = rollno;
		}

		public studentDetails(String stname, int rollno, String branch) {
			this(stname, rollno, branch, 0);
		}

		public studentDetails(String stname, int rolllno) {
			this(stname, rolllno, "", 0);
		}

		public studentDetails(String stname) {
			this(stname, 0, "", 0);
		}
		public studentDetails() {
			this("",0,"",0);
		}
		
		public  void detaildisplay() {
			System.out.println("name: "+ stname);
			System.out.println("rollno: "+ rollno);
			System.out.println("branch: "+ branch);
			System.out.println("cgpa: "+ gpa);
			
		}
	}

	public class studentPayment extends studentDetails {
		private int paidfee;
		private int totalfee;
		private int due;
		

		public studentPayment(String stname,int rollno,String branch,int gpa, int paidfee,int totalfee) {
			super(stname,rollno,branch,gpa);
			this.totalfee=totalfee;
			this.paidfee = paidfee;
			this.due = totalfee-paidfee;

		}
		public studentPayment() {
			super();
			this.due=0;
		}
		
		
		public void paymentdisplay() {
			detaildisplay();
			System.out.println("fee: "+ totalfee);
			System.out.println("total fee: "+paidfee);
			System.out.println("due: "+ due);
		}

	}

}
