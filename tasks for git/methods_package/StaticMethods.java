package methods_package;

public class StaticMethods {
	
	public static class Employee{
		int employeeID;
		String name;
		double monthlySalary;
		double annualSalary;
		public static double calculateAnnualSalary(double monthlySalary) {
			double annualsalary=monthlySalary*12;
			return annualsalary;
		}
		public static String displayEmployeeDetails(int employeeId,String name,double monthlySalary,double annualSalary) {
			String details= "Employee ID: "+ employeeId + " Name: "+ name + " MonthlySalary: "+ monthlySalary+ " AnnualSalary: "+annualSalary;
			return details;
		}
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Employee obj1=new Employee();
		obj1.employeeID=1;
		obj1.name="Sai";
		obj1.monthlySalary=30000.2;
		double a=Employee.calculateAnnualSalary(obj1.monthlySalary);
		System.out.println(Employee.displayEmployeeDetails(obj1.employeeID, obj1.name, obj1.monthlySalary,a));
		System.out.println();
		
		Employee obj2=new Employee();
		obj2.employeeID=2;
		obj2.name="Hrushi";
		obj2.monthlySalary=40000.2;
		double b=Employee.calculateAnnualSalary(obj2.monthlySalary);
		System.out.println(Employee.displayEmployeeDetails(obj2.employeeID, obj2.name, obj2.monthlySalary,b));
		System.out.println();
		
		Employee obj3=new Employee();
		obj3.employeeID=3;
		obj3.name="jay";
		obj3.monthlySalary=20000.2;
		double c=Employee.calculateAnnualSalary(obj3.monthlySalary);
		System.out.println(Employee.displayEmployeeDetails(obj3.employeeID, obj3.name, obj3.monthlySalary,c));
		System.out.println();
		
		Employee obj4=new Employee();
		obj4.employeeID=4;
		obj4.name="hey";
		obj4.monthlySalary=34000.2;
		double d=Employee.calculateAnnualSalary(obj4.monthlySalary);
		System.out.println(Employee.displayEmployeeDetails(obj4.employeeID, obj4.name, obj4.monthlySalary,d));
		System.out.println();
		
		Employee obj5=new Employee();
		obj5.employeeID=5;
		obj5.name="oye";
		obj5.monthlySalary=50000.2;
		double e=Employee.calculateAnnualSalary(obj1.monthlySalary);
		System.out.println(Employee.displayEmployeeDetails(obj5.employeeID, obj5.name, obj5.monthlySalary,e));
	}

}
