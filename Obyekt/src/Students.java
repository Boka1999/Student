import model.Student;
import model.User;
import servis.StudentService;

public class Students {
    public static void main(String[] args) {
       StudentService studentService = new StudentService();
       Student s1= studentService.create("Aram", "Grigoryan", 1999,65.8, 'M',false );
        Student s2= studentService.create("Anahit", "Asatryan", 1998,72.8, 'F',true );
        Student s3= studentService.create("Gevorg", "Araqelyan", 1997,62.2, 'M',true );
        Student s4= studentService.create("Vrej", "Simonyan", 2003,74.8, 'M',false );
        Student s5= studentService.create("Karen", "Arshakyan", 2001,81.6, 'M',true );
        Student s6= studentService.create("Arevik", "Danielyan", 2004,65.3, 'F',false );
        Student s7= studentService.create("Lusine", "Anastasyan", 2000,90.0, 'F',true );
        Student s8= studentService.create("Petros", "Kirakosyan", 1997,85.2, 'M',true );




    }
}
