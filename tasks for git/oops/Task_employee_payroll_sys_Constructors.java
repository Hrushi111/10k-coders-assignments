package oops;

public class Task_employee_payroll_sys_Constructors {
	private int empid;
	private String empName;
	private String department;
	private double BasicSalary;
	private double hra;
	private double da;
	private double netSalary;

	public Task_employee_payroll_sys_Constructors() {
		this(0,"unknown","not assigned",0,0,0,0);
		
	}

	public Task_employee_payroll_sys_Constructors(int empid, String empName) {
		this(empid,empName,"General",15000,0,0,0);
	}

	public Task_employee_payroll_sys_Constructors(int empid, String empName, String department) {
		this(empid,empName,department,25000,0,0,0);
		
		
		
	}

	public Task_employee_payroll_sys_Constructors(int empid, String empName, String department, double basicSalary,
			double hra, double da, double netSalary) {
		
		this.empid = empid;
		this.empName = empName;
		this.department = department;
		this.BasicSalary = basicSalary;
		this.hra = (20 / 100) * BasicSalary;
		this.da = (10 / 100) * BasicSalary;
		this.netSalary = hra+da+BasicSalary;
	}

	public void display() {
		System.out.println(empid);
		System.out.println(empName);
		System.out.println(department);
		System.out.println(BasicSalary);
		System.out.println(hra);
		System.out.println(da);
		System.out.println(netSalary);

	}

	

}
