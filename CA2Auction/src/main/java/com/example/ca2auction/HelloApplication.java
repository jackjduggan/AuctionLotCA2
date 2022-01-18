package com.example.ca2auction;

import com.example.ca2auction.DataStructures.auctionlotNode;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static auctionlotNode headAL = new auctionlotNode();

    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}