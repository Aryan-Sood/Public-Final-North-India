package com.example.north_india;

public class TourismModalClass {

    private String name;
    private int image;
    private String price;

    private String tripDescription;

    public TourismModalClass(String name, int image, String price, String tripDescription) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.tripDescription = tripDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTripDescription() {
        return tripDescription;
    }

    public void setTripDescription(String tripDescription) {
        this.tripDescription = tripDescription;
    }

}
