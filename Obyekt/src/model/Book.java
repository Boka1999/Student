package model;

public class Book {

    private String title; //anun
    private String auntor; // hexinaki anun
    private int pages;//ejeri qanak
    private long price; //gin
    private boolean isAvailable;//girqy vacharvum e
    private boolean isEbook;//girqy elektronayin e
    private double rating; //gnahatakan

    public String getAuntor() {
        return auntor;
    }

    public void setAuntor(String auntor) {
        this.auntor = auntor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public long getPrce() {
        return price;
    }

    public void setPrce(int prce) {
        this.price = prce;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isEbook() {
        return isEbook;
    }

    public void setEbook(boolean ebook) {
        isEbook = ebook;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setPrice(int price) {
    }

    public void printInfo() {
        System.out.println("title:" +  " " + title);
        System.out.println("auntor:" +  " " + auntor);
        System.out.println("pages:" + " " + pages);
        System.out.println("price" + " " + price);
        System.out.println("isAvailable" + " " + isAvailable);
        System.out.println("isEbook" + " " + isEbook);
        System.out.println("rating" + " " + rating);
        System.out.println("************************");
    }
}

