package servis;

import model.Student;

public class StudentService {
    public Student create (String name, String surname, int year, double mark, String gender, boolean PHD ) {
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setYear(year);
        student.setGender(gender);
        student.setMark(mark);
        student.setPHD(PHD);
        return student;
    }
    public void MaxStudent(Student s1, Student s2 ){
        if (s1.getYear()< s2.getYear()){
            s1.printinfo();
        }else
            s2.printinfo();
    }
    public Student MaxMark( Student student1, Student student2, Student student3){
        if (student1.getMark() > student2.getMark() && student1.getMark() > student3.getMark()){
            return student1;
        } else if (student2.getMark()> student1.getMark() && student2.getMark()> student3.getMark()) {
            return student2;
        }else
            return  student3;
    }
    public void GirlStudents (Student [] students){
        for ( Student student : students) {
            if (student.getGender() == "F")
                student.printinfo();

        }
    }
    public void MinGirl (Student[] students) {
        for (int i = 0; i <students.length ; i++) {
          int s = 0;
          int MinGirl;
            if (students[i].getGender() == "F" && students[i].getYear() > s  )
               s = students[i].getYear();
            // students.printinfo;
            }
        }
}

