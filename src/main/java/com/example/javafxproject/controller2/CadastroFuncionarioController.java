package com.example.javafxproject.controller2;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import com.example.javafxproject.HelloApplication;
import com.example.javafxproject.funcionario.*;

public class CadastroFuncionarioController {
    @FXML
    private TextField txfNome;
    @FXML
    private TextField txfTelefone;
    @FXML
    private TextField txfrg;
    @FXML
    private TextField txfcpf;
    @FXML
    private TextField txfcargo;
    @FXML
    private TextField txfdataNascimento;
    
    public void onActionCadastrar() throws IOException {
        String nome = txfNome.getText();
        String telefone = txfTelefone.getText();
        String rg = txfrg.getText();
        String cpf = txfcpf.getText();
        String cargo = txfcargo.getText();
        String dataNascimento = txfdataNascimento.getText();
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = new Funcionario(nome, rg, cpf, dataNascimento, telefone, cargo);
        Funcionario funcionarioCriado = funcionarioDAO.create(funcionario);

        System.out.println("Funcionario Cadastrado");
        
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("cadastro-endereco.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastro Endereço");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
       
    }
    
}