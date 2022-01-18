module com.example.ca2auction {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    requires xstream;

    opens com.example.ca2auction to javafx.fxml, xstream;
    opens com.example.ca2auction.DataTypes to javafx.fxml, xstream;
    opens com.example.ca2auction.DataStructures to javafx.fxml, xstream;

    exports com.example.ca2auction;
    exports com.example.ca2auction.DataTypes;
    exports com.example.ca2auction.DataStructures;
}