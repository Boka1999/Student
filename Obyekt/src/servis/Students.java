package servis;

import model.Student;

import java.security.Provider;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
       StudentService StudentService = new StudentService();
       Student s1= StudentService.create("Aram", "Grigoryan", 1999,65.8, "M",false );
        Student s2= StudentService.create("Anahit", "Asatryan", 1998,72.8, "F",true );
        Student s3= StudentService.create("Gevorg", "Araqelyan", 1997,62.2, "M",true );
        Student s4= StudentService.create("Vrej", "Simonyan", 2003,74.8, "M",false );
        Student s5= StudentService.create("Karen", "Arshakyan", 2001,81.6, "M",true );
        Student s6= StudentService.create("Arevik", "Danielyan", 2004,65.3, "F",false );
        Student s7= StudentService.create("Lusine", "Anastasyan", 2000,90.0, "F",true );
        Student s8= StudentService.create("Petros", "Kirakosyan", 1997,85.2, "M",true );

        s1.printinfo();
        System.out.println("***********************");
        s2.printinfo();
        System.out.println("***********************");
        s3.printinfo();
        System.out.println("***********************");
        s4.printinfo();
        System.out.println("***********************");
        s5.printinfo();
        System.out.println("***********************");
        s6.printinfo();
        System.out.println("***********************");
        s7.printinfo();
        System.out.println("***********************");
        s8.printinfo();
     System.out.println("//////////////////////////////////");
     StudentService.MaxStudent(s3,  s2);
     System.out.println("//////////////////////////////////");
     StudentService.MaxMark(s1, s6, s8).printinfo();
     System.out.println("//////////////////////////////////");
     Student[]a = {s1, s2, s3, s4, s5, s6, s7, s8};
     StudentService.GirlStudents(a);



    }
}
