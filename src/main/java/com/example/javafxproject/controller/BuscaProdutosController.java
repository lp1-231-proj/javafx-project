package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BuscaProdutosController {
    
    @FXML
    private TextField txfmodelo;
    
    public void onActionBuscar() {
        String modelo = txfmodelo.getText();

        System.out.println(modelo);
    }
}