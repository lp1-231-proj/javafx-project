package com.example.javafxproject.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import com.example.javafxproject.login.*;

public class LoginController {
    @FXML
    private TextField txfEmail;
    @FXML
    private TextField txfSenha;
    @FXML
    private TextField txfCodigoVerificador;
    
    public void onActionEntrar() {
        String email = txfEmail.getText();
        String senha = txfSenha.getText();
        String codigoVerificador = txfCodigoVerificador.getText();

        LoginDAO loginDAO = new LoginDAO();

        //Login login = new Login(email, senha, codigoVerificador);

        //Login loginCriado = loginDAO.create(login);

        System.out.println("Login Concluido");

    }
    
}
