package servis;

import model.Plane;

public class AirportTest {
    public static void main(String[] args) {
        Plane p1 = new Plane();
        Plane s1 = p1.create("Su30", "Ru", 1999, 11000, true, 15000, 10, 17000, 4, 150000 );
        Plane s2 = p1.create("F-35", "USA", 2019, 14000, true, 15000, 15, 10000, 4, 140000);
        Plane s3 = p1.create("Mig1", "Ru", 1940, 1500, true, 13000, 17, 19000, 14, 130000);
        Plane s4 = p1.create("Boing", "USA", 1999, 12000, false, 12000, 20, 18000, 8, 120000);
        PlanService plane =  new PlanService();
        plane.task1(s1);
        System.out.println("------------------------------------");
        plane.task2(s4 );
        System.out.println("-------------------------------------");

        System.out.println(plane.task3(s4, s2));
        System.out.println("-------------------------------------");
        System.out.println(plane.task4( s4, s3));
        System.out.println("-------------------------------------");
        plane.task5(s2, s4, s1);
        System.out.println("-------------------------------------");

    }
}
