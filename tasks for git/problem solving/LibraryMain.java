package problemsolving;
public class LibraryMain {
    public static void main(String[] args) {

        Library book = new Library();
        HospitalManagement hspt=new HospitalManagement();
        hspt.setPatientDetails(1, "Hrushi", "asthma", "jan 2", 4900, "Sai");
        hspt.Printing();
        System.out.println("----------------");
        book.setBookDetails(101, "J.K. Rowling", "Harry Potter", 499.99, 350);
        book.displayBookDetails();
    }
}
 