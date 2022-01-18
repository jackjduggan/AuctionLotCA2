package com.example.ca2auction.DataTypes;

public class bid {
    public String bidamount;
    public String biddate;


    public bid (String bidamount, String biddate) {
        this.bidamount = bidamount;
        this.biddate = biddate;


    }

    public bid() {
        this.bidamount= "";
        this .biddate = "";
    }

    public String getBidamount() {
        return bidamount;
    }

    public void setBidamount(String bidamount) {
        this.bidamount = bidamount;
    }

    public String getBiddate() {
        return biddate;
    }

    public void setBiddate(String biddate) {
        this.biddate = biddate;
    }

    //----------------Update Bid-----------------------------
    public void updatebid(String bidamount, String biddate) {
        this.bidamount = bidamount;
        this.biddate = biddate;
    }

    @Override
    public String toString() {
        return "bid{" +
                "bidamount=" + bidamount +
                ", biddate=" + biddate +
                '}';
    }
}
