module com.example.javafxproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.javafxproject to javafx.fxml;
    opens com.example.javafxproject.controller to javafx.fxml;

    exports com.example.javafxproject;
}