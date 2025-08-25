package servis;

import model.Plane;

public class PlanService {
    public Plane plane = new Plane();

    public void task1(Plane p1) {
        p1.printInfo();
    }

    public void task2(Plane p2) {
        if ( p2.isMilitary() == true ) {
            System.out.println(p2.getCost());
            System.out.println(p2.getTopSpeed());
        } else {
            System.out.println(p2.getModel());
            System.out.println(p2.getCountry());
        }
    }
    public Plane task3 (Plane p1, Plane p2){

        if (p1.getYear()> p2.getYear() || p1.getYear() == p2.getYear())
            return p1;
        else
            return p2;
    }
    public String task4 (Plane p1, Plane p2) {
        if (p1.getWeight() > p2.getWeight() ){
            return  p1.getModel();
        }
        else
            return p2.getModel();
    }
    public void task5 (Plane a1, Plane a2, Plane a3){
        if (a1.getSeats()==a2.getSeats() || a1.getSeats() == a3.getSeats() || a2.getSeats() == a3.getSeats()){
            System.out.println(a1.getCountry());
        }
        else if (a1.getSeats()< a2.getSeats()&& a1.getSeats() < a3.getSeats()){
            System.out.println( a1.getCountry());
        }
        else if (a2.getSeats()< a3.getSeats()&& a2.getSeats() < a1.getSeats() ){
        System.out.println(a2.getCountry());
        }
        else {
            System.out.println(a3.getCountry());
    }
    }
    public void task6 (Plane array []) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].isMilitary() == false){
                System.out.println(array[i]);
            }

        }
    }
}







