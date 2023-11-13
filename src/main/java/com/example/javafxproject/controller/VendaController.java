package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class VendaController {
    
    @FXML
    private TextField txftotal;
    
    public void onActionPagar() {
        String total = txftotal.getText();

        System.out.println(total);
    }
}
