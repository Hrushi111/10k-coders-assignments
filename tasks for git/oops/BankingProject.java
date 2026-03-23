package oops;

public class BankingProject {

	public class bank {
		private String username = "admin";
		private String pin = "admin123";
		private String fname;
		private String lname;
		private int phno;

		public bank(String fname, String lname, int phno) {
			this.fname = fname;
			this.lname = lname;
			this.phno = phno;
		}

		public bank() {
			this("", "", 0);
		}

		public void setUserName(String username) {
			this.username = username;
		}

		public void setPin(String Pin) {
			this.pin = Pin;
		}

		public String getUserName() {
			return username;
		}

		public String getPassword() {
			return pin;
		}

		public void setPhoneNo(int phno) {
			this.phno = phno;
		}
		public int getPhone() {
			return this.phno;
		}
		public void setfname(String fname) {
			this.fname=fname;
		}
		public String getfname() {
			return this.fname;
		}
		public void setlname(String lname) {
			this.lname=lname;
		}
		public String getlname() {
			return this.lname;
		}

		public void bankDisplay() {
			System.out.println(" Full name    : " + getfname() + " " + getlname());
			System.out.println(" Phone Number : " + getPhone());
		}

	}

	public class details extends bank {
		private int ifsc;
		private int accno;
		private int balance=1000;

		public details(String fname, String lname, int phno, int ifsc, int accno) {
			super(fname, lname, phno);
			this.accno = accno;
			this.ifsc = ifsc;
		
		}

		public details() {
			this("", "", 0, 0, 0);
		}

		public void setifsc(int ifsc) {
			this.ifsc=ifsc;
		}
		public void setaccno(int accno) {
			this.accno=accno;
		}
		public int getifsc() {
			return this.ifsc;
		}
		public int getaccno() {
			return this.accno;
		}
		public void display() {
			bankDisplay();
			System.out.println(" IFSC code : " + getifsc());
			System.out.println(" Acc.No    : " + getaccno());
			System.out.println(" Balance   : " + getBalance());
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

		public int getBalance() {
			return this.balance;
		}

		public void deposit(int amount) {
			this.balance = getBalance() + amount;
			System.out.println(" Deposit of  " + amount + " Successful");
			System.out.println(" Balance is: " + getBalance());
		}

		public void withdraw(int amount) {
			if(amount<getBalance()) {
				this.balance = getBalance() - amount;
				System.out.println(" Withdraw of " + amount + " Successful");
				System.out.println(" Balance is: " + getBalance());
			}
			else {
				System.out.println(" Insufficient Balance ");
			}
			
		}

	}

}
