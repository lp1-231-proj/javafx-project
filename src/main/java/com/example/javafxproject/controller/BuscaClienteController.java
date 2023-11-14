package com.example.javafxproject.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BuscaClienteController {
    @FXML
    private TextField txfCpf;
    
    public void onActionCadastrar() {
        String CPF = txfCpf.getText();

        System.out.println(CPF);
    }
    public void onActionBuscar() {
        String CPF = txfCpf.getText();

        System.out.println(CPF);
    }
}