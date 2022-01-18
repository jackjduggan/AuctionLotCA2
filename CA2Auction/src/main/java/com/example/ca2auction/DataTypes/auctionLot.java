package com.example.ca2auction.DataTypes;

public class auctionLot {
    public String name;
    public String description;
    public String type;
    public String origindate;
    public String askingprice;


    public auctionLot(String name, String description, String type, String origindate, String askingprice) {
        this.name= name;
        this.description= description;
        this.type= type;
        this.origindate= origindate;
        this.askingprice= askingprice;
    }


    public auctionLot() {
        this.name= "";
        this.description="";
        this.type="";
        this.origindate="";
        this.askingprice="";
    }
//     public void updateitem(String name, String description, String type, String origindate, String askingprice);{
//         this.name = "";
//        this.description = "";
//        this.type = "";
//        this.origindate = "";
//        this.askingprice = "";
//    }



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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrigindate() {
        return origindate;
    }

    public void setOrigindate(String origindate) {
        this.origindate = origindate;
    }

    public String getAskingprice() {
        return askingprice;
    }

    public void setAskingprice(String askingprice) {
        this.askingprice = askingprice;
    }

    //----------------Update Bid-----------------------------
    public void updateitem(String name, String description, String type, String origindate, String askingprice) {
        this.name= name;
        this.description= description;
        this.type= type;
        this.origindate= origindate;
        this.askingprice= askingprice;
    }


    @Override
    public String toString() {
        return "auctionLot{" +
                "name=" + name +
                ", description=" + description +
                ", type=" + type +
                ", origindate=" + origindate +
                ", askingprice=" + askingprice +
                '}';
    }
}
