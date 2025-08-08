package model;


public class Student {
   private String name;
   private String surname;
   private int year;
   private double mark;
   private char gender;
   private boolean PHD;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isPHD() {
        return PHD;
    }

    public void setPHD(boolean PHD) {
        this.PHD = PHD;
    }

    public int sum(int x, int y) {
    int z = x + y;
    return z;
}
    public void print(){
        System.out.println(name + " " + surname);
    }



    public void printinfo(){

        System.out.println("***********************");
        System.out.println("Name:"+ " " +name);
        System.out.println("SurName:" + " " +surname);
        System.out.println("Year:" + " " +year);
        System.out.println("Mark:"+ " " + mark);
        System.out.println("Gender"+ " " + gender);
        System.out.println("PHD:" + " " + PHD);


    }

    }


