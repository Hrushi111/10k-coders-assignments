package problemsolving;

public class HospitalManagement {
	int id ;
	String patient_name;
	String disease;
	String date;
	int bill;
	String duty_doctor;
	
	public void setPatientDetails(int id1,String patient_name1,String disease1,String date1,int bill1,String duty_doctor1) {
		 id = id1 ;
		 patient_name=patient_name1;
		 disease=disease1;
		 date=date1;
		 bill=bill1;
		 duty_doctor=duty_doctor;
	}
	public void Printing() {
		System.out.println("		Hospital Management");
		System.out.println("----------------");
		System.out.println("The patient id       	:"+id);
		System.out.println("The patient name     	:"+patient_name);
		System.out.println("disease is           	:"+disease);
		System.out.println("date of joining      	:"+date);
		System.out.println("total bill           	:"+bill);
		System.out.println("The duty doctor is   	:"+duty_doctor);
	}
	
	

}
