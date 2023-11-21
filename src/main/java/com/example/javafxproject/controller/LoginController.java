package com.example.javafxproject.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField txfcpf;
    @FXML
    private TextField txfSenha;
    
    public void onActionEntrar() {
        String cpf = txfcpf.getText();
        String senha = txfSenha.getText();

        System.out.println("Login Concluido");

    }
    
}
