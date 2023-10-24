package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField txfCpf;
    @FXML
    private TextField txfSenha;
    
    public void onActionEntrar() {
        String cpf = txfCpf.getText();
        String senha = txfSenha.getText();

        System.out.println(cpf);
        System.out.println(senha);
    }
    
}
