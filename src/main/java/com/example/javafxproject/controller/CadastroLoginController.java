package com.example.javafxproject.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import com.example.javafxproject.funcionario.*;
import com.example.javafxproject.login.Login;
import com.example.javafxproject.login.LoginDAO;
import com.example.javafxproject.util.Criptografia;

public class CadastroLoginController {
    @FXML
    private TextField txffuncionario;
    @FXML
    private TextField txfsenha;
    @FXML
    private TextField txfdata;

    public void onActionCadastrar() {
        String funcionario = txffuncionario.getText();

        Integer funcionario_id = FuncionarioDAO.findByName(funcionario).getId();

        String senhaNCript = txfsenha.getText();
        String senha = Criptografia.converter(senhaNCript);

        String dataCadastro = txfdata.getText();
        
        LoginDAO loginDAO = new LoginDAO();
        Login login = new Login(funcionario_id, senha, dataCadastro);
        Login loginCriado = loginDAO.create(login);

        System.out.println("Senha Cadastrada");
    }
}
