package com.example.ca2auction.DataStructures;

import com.example.ca2auction.DataTypes.auctionLot;

public class auctionlotNode {
    auctionLot contents;
    auctionlotNode next;

    public auctionLot getContents() {
        return contents;
    }

    public void setContents(auctionLot contents) {
        this.contents = contents;
    }

    public auctionlotNode getNext() {
        return next;
    }

    public void setNext(auctionlotNode next) {
        this.next = next;
    }

    public auctionlotNode() {
        this.contents = null;
        this.next = null;
    }
}
