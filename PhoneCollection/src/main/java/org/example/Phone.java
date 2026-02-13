package org.example;

public class Phone {
    private int id;
    private String name;
    private String brand;
    private double price;
    private int cameraMP;
    private String releaseDate;

    Phone(int id, String name, String brand, double price, int cameraMP, String releaseDate) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.cameraMP = cameraMP;
        this.releaseDate = releaseDate;
    }



    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setPrice(double price) { this.price = price; }
    public void setCameraMP(int cameraMP) { this.cameraMP = cameraMP; }

   // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }
    public int getCameraMP() { return cameraMP; }
    public String getReleaseDate() {return releaseDate;}
}
