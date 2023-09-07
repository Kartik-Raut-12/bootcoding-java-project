package com.bootcoding.project.model;

public class Vendor {
    int id;
    String name;
    String address;
    long contact;
    Boolean isVeg;

    Boolean isnonveg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public Boolean getIsnonveg() {
        return isnonveg;
    }

    public void setIsnonveg(Boolean isnonveg) {
        this.isnonveg = isnonveg;
    }
}
