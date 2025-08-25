package model;

public class Plane {
   private String model;
   private String country; //erkiry
   private int year ;
   private int hours; //odum anckacrac jamery
   private boolean military; // razmakan e te voch
   private int weight; //teveri bacvacq
   private int wingspan; //teveri bacvacqy
   private int topSpeed; // aravelaguyn aragutyuny
   private int seats; // nstatexeri qanak
   private double cost; //arjeq

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2021 ) {
            this.year = year;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 10000){
        this.hours = hours;}
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 10000 && weight <= 160000){
        this.weight = weight;}
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 45){
        this.wingspan = wingspan;}
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 0){
        this.topSpeed = topSpeed;}
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats >= 0){
        this.seats = seats;}
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0){
        this.cost = cost;}
    }
    public void  printInfo (){
        System.out.println("Model" + " " + model);
        System.out.println("Country " + " " + country);
        System.out.println("Year" + " " + year);
        System.out.println("hours" + " " + hours);
        System.out.println("Military" + " " + military);
        System.out.println("Weigth" + " " + weight);
        System.out.println( "Wingspan" + " "+ wingspan);
        System.out.println("TopSprd" + " " + topSpeed);
        System.out.println("Seats" + " "+ seats);
        System.out.println("Cost" + " " + cost);

    }
    public Plane create (String model, String country, int year, int hours, boolean military, int weight, int wingspan, int topSpeed, int seats,double cost) {
        Plane plane = new Plane();
        plane.setModel(model);
        plane.setCountry(country);
        plane.setYear(year);
        plane.setHours(hours);
        plane.setMilitary(military);
        plane.setWeight(weight);
        plane.setWingspan(wingspan);
        plane.setTopSpeed(topSpeed);
        plane.setSeats(seats);
        plane.setCost(cost);
        return plane;
    }


}
