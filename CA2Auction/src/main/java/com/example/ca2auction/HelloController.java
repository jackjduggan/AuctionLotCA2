package com.example.ca2auction;

import com.example.ca2auction.DataStructures.auctionlotNode;
import com.example.ca2auction.DataStructures.linkedlistBoys;
import com.example.ca2auction.DataTypes.auctionLot;
import com.example.ca2auction.DataTypes.bid;
import com.example.ca2auction.DataTypes.bidder;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.*;

public class HelloController {
    // auctionLot fields
    @FXML private TextField auctionLotName;
    @FXML private TextField auctionLotDescription;
    @FXML private TextField auctionLotType;
    @FXML private TextField auctionLotDate;
    @FXML private TextField auctionLotPrice;
    @FXML private ListView<auctionLot> auctionLotListView;
    // bidder fields
    @FXML private TextField bidderName;
    @FXML private TextField bidderAddress1;
    @FXML private TextField bidderAddress2;
    @FXML private TextField bidderNumber;
    @FXML private TextField bidderEmail;
    @FXML private ListView<bidder> bidderListView;
    // bid fields
    @FXML private TextField bidAmount;
    @FXML private TextField bidDate;
    @FXML private ListView<bid> bidListView;

    auctionLot auctionholder= new auctionLot();
    bidder bidderholder=new bidder();
    bid bidholder =new bid();

    public HelloController() {
    }

    //---------------------------------------------------
    //----------------Linked Lists-----------------------
    //---------------------------------------------------
    private static linkedlistBoys<auctionLot> auctionLots;
    private static linkedlistBoys<bidder> bidders;
    private static linkedlistBoys<bid> bids;


    //---------------------------------------------------
    //----------------Initialize Method------------------
    //---------------------------------------------------
    public void initialize(){
        //Got it :)
        auctionLots = new linkedlistBoys<auctionLot>();
        bidders = new linkedlistBoys<>();
        bids = new linkedlistBoys<>();
    }

    //---------------------------------------------------
    //--------------Add Methods--------------------------
    //---------------------------------------------------

    void addbid(bid b) {
        bids.addElement(b);
    }

    public void addbiddetails(){
        bid bids = new bid();
    }

    void addbidder(bidder b) {
        bidders.addElement(b);
    }

//    void additem(auctionLot lot) {
//        auctionlotNode node = new auctionlotNode();
//        node.setContents(lot);
//        node.setNext(HelloApplication.headAL.getNext());
//        HelloApplication.headAL.setNext(node);
//    }
    void additem(auctionLot lot) {
        auctionLots.addElement(lot);
    }



    public void printlot() {
        auctionlotNode temp = HelloApplication.headAL;
        while (temp != null) {
            System.out.println(temp.getContents());
            temp = temp.getNext();

        }
    }

    public void addauctionlotDetails() {
        auctionLot lot = new auctionLot(auctionLotName.getText(), auctionLotDescription.getText(),
                auctionLotType.getText(), auctionLotDate.getText(), auctionLotPrice.getText());

        additem(lot);

        loaditem();
        save();

    }

    public void addbidDetails() {
        bid b = new bid(bidDate.getText(), bidAmount.getText());

        addbid(b);

        loadbid();
        save();
    }

    public void addbidderDetails() {
        bidder bdr = new bidder(bidderName.getText(), bidderAddress1.getText(), bidderAddress2.getText(),
                bidderNumber.getText(), bidderEmail.getText());

        addbidder(bdr);

        loadbidder();
        save();
    }

    //----------------------------------------------------
    //-------------Delete Methods-------------------------
    //----------------------------------------------------
    @FXML
    void deletebid(ActionEvent event) {
        int itemToDelete = bidListView.getSelectionModel().getSelectedIndex(); //gets selection in list view
        bids.delete(itemToDelete); //deletes from list
        loadbid(); //
        save();
    }

    @FXML
    void deletebidder(ActionEvent event) {
        int itemToDelete = bidderListView.getSelectionModel().getSelectedIndex();
        bidders.delete(itemToDelete);
        loadbidder();
        save();
    }

    @FXML
    void deleteitem(ActionEvent event) {
        int itemToDelete = auctionLotListView.getSelectionModel().getSelectedIndex();
        auctionLots.delete(itemToDelete);
        loaditem();
        save();
    }



    //----------------------------------------------------
    //-------------Update Methods-------------------------
    //----------------------------------------------------
    @FXML
    void updatebid(ActionEvent event) {
        bidholder.updatebid(bidDate.getText(), bidAmount.getText());
        loadbid();
        save();
    }

    @FXML
    void updatebidder(ActionEvent event) {
        bidderholder.updatebidder(bidderName.getText(), bidderAddress1.getText(), bidderAddress2.getText(),
                bidderNumber.getText(), bidderEmail.getText());
        loadbidder();
        save();
    }

    @FXML
    void updateitem(ActionEvent event) {
        auctionholder.updateitem(auctionLotName.getText(), auctionLotDescription.getText(), auctionLotType.getText(),
                auctionLotDate.getText(), auctionLotPrice.getText());
        loaditem();
        save();
    }

    //-------------------------------------------------------
    //----------------Choose Methods-------------------------
    //-------------------------------------------------------
    @FXML
    void chooseitem() {
        auctionholder = auctionLotListView.getSelectionModel().getSelectedItem();
        auctionLotName.setText(auctionholder.getName());
        auctionLotDescription.setText(auctionholder.getDescription());
        auctionLotType.setText(auctionholder.getType());
        auctionLotDate.setText(auctionholder.getOrigindate());
        auctionLotPrice.setText(auctionholder.getAskingprice());
    }

    @FXML
    void choosebid() {
        bidholder = bidListView.getSelectionModel().getSelectedItem();
        bidAmount.setText(bidholder.getBidamount());
        bidDate.setText(bidholder.getBiddate());
    }

    @FXML
    void choosebidder() {
        bidderholder = bidderListView.getSelectionModel().getSelectedItem();
        bidderName.setText(bidderholder.getName());
        bidderAddress1.setText(bidderholder.getAddress1());
        bidderAddress2.setText(bidderholder.getAddress2());
        bidderNumber.setText(bidderholder.getNumber());
        bidderEmail.setText(bidderholder.getEmail());
    }

    //-------------------------------------------------------
    //---------------Reset Methods---------------------------
    //-------------------------------------------------------
    public void resetitem(){
        auctionLots.deleteList(); //backend
        auctionLotListView.getItems().clear(); //front end
    }

    public void resetbid(){
        bids.deleteList();
        bidListView.getItems().clear();

    }

    public void resetbidder(){
        bidders.deleteList();
        bidderListView.getItems().clear();

    }

    public void resetsystem(){ //attach to a button
        resetitem();
        resetbid();
        resetbidder();
    }



    //-------------------------------------------------------
    //---------------Load Methods----------------------------
    //-------------------------------------------------------
    @FXML void loadbid() {
        bidListView.getItems().clear();
        linkedlistBoys.Node currentnode = bids.head;
        while (currentnode != null) {
            bidListView.getItems().add((bid) currentnode.getContents());
            currentnode = currentnode.next;
        }
    }

    @FXML void loadbidder() {
        bidderListView.getItems().clear();
        linkedlistBoys.Node currentnode = bidders.head;
        while (currentnode != null) {
            bidderListView.getItems().add((bidder) currentnode.getContents());
            currentnode = currentnode.next;
        }
    }

    @FXML void loaditem() {
        auctionLotListView.getItems().clear();
        linkedlistBoys.Node currentnode = auctionLots.head;
        while (currentnode != null) {
            auctionLotListView.getItems().add((auctionLot) currentnode.getContents());
            currentnode = currentnode.next;
        }
    }



    //--------------------------------------------------------
    //--------------------Save Method-------------------------
    //--------------------------------------------------------
    public void save()  {
        try{
            XStream xstream = new XStream(new DomDriver());
            xstream.addPermission(AnyTypePermission.ANY);
            ObjectOutputStream sav = xstream.createObjectOutputStream(new FileWriter("auctionlots.xml"));
            sav.writeObject(auctionLots);
            sav.close();

            sav = xstream.createObjectOutputStream(new FileWriter("bids.xml"));
            sav.writeObject(bids);
            sav.close();

            sav = xstream.createObjectOutputStream(new FileWriter("bidders.xml"));
            sav.writeObject(bidders);
            sav.close();

            //For some reason when I delete this below, it causes problems. dunno why
//           that worked -- good stuff
            sav.close();}
        catch(Exception e){
            System.out.println(e);
        }
    }


    public void load(ActionEvent event) throws IOException, ClassNotFoundException {
        XStream xstream = new XStream(new DomDriver());
        xstream.addPermission(AnyTypePermission.ANY);
        ObjectInputStream in = xstream.createObjectInputStream(new FileReader("auctionlots.xml"));
        auctionLots = (linkedlistBoys<auctionLot>)  in.readObject();

        in=  xstream.createObjectInputStream(new FileReader("bids.xml"));
        bids = (linkedlistBoys<bid>) in.readObject();

        in=  xstream.createObjectInputStream(new FileReader("bidders.xml"));
        bidders = (linkedlistBoys<bidder>) in.readObject();

        loaditem();
        loadbid();
        loadbidder();
    }
}