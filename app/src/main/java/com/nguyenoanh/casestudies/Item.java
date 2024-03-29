package com.nguyenoanh.casestudies;

public class Item {

    private String name, place;
    int image;

    public Item(String name, String place, int image) {
        this.name = name;
        this.place = place;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
