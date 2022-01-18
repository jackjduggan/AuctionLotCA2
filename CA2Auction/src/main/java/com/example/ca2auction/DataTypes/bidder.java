package com.example.ca2auction.DataTypes;

public class bidder {
    public String name;
    public String address1;
    public String address2;
    public String number;
    public String email;

    public bidder(String name, String address1, String address2, String number, String email) {
        this.name= name;
        this.address1= address1;
        this.address2= address2;
        this.number= number;
        this.email= email;
    }

    public bidder() {
        this.name= "";
        this. address1= "";
        this.address2 = "";
        this. number = "";
        this.email = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //----------------Update Bidder--------------------------
    public void updatebidder(String name, String address1, String address2, String number, String email) {
        this.name= name;
        this.address1= address1;
        this.address2= address2;
        this.number= number;
        this.email= email;
    }

    @Override
    public String toString() {
        return "bidder{" +
                "name=" + name +
                ", address1=" + address1 +
                ", address2=" + address2 +
                ", number=" + number +
                ", email=" + email +
                '}';
    }
}
