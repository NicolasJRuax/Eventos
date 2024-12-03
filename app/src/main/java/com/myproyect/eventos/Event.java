package com.myproyect.eventos;


import java.io.Serializable;

public class Event implements Serializable {
    private String name;
    private String description;
    private String address;
    private String date;
    private String price;

    public Event(String name, String description, String address, String date, String price) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.date = date;
        this.price = price;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
