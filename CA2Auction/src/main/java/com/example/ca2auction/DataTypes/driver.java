package com.example.ca2auction.DataTypes;

import com.example.ca2auction.DataStructures.linkedlistBoys;

//The driver class defines the classes inside the LinkedLists
public class driver {

    public linkedlistBoys<auctionLot> auctionLotlinkedListBoys = new linkedlistBoys<>();
    // FYI ^ above wouldnt work unless I made linkedListBoys<F> class static. if issues arise, making class not static
    public linkedlistBoys<bid> bidlinkedListBoys = new linkedlistBoys<>();
    public linkedlistBoys<bidder> bidderlinkedListBoys = new linkedlistBoys<>();

}
