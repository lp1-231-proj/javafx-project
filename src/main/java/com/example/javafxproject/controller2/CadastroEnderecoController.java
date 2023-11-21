package com.example.javafxproject.controller2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import com.example.javafxproject.HelloApplication;
import com.example.javafxproject.endereco.*;
import com.example.javafxproject.funcionario.*;

public class CadastroEnderecoController {
    @FXML
    private TextField txffuncionario;
    @FXML
    private TextField txfcep;
    @FXML
    private TextField txfcidade;
    @FXML
    private TextField txfendereco;
    @FXML
    private TextField txfbairro;
    @FXML
    private TextField txfcomplemento;

    public void onActionCadastrar() throws IOException {
        String funcionario = txffuncionario.getText();

        Integer funcionario_id = FuncionarioDAO.findByName(funcionario).getId();

        String cep = txfcep.getText();
        String cidade = txfcidade.getText();
        String logradouro = txfendereco.getText();
        String bairro = txfbairro.getText();
        String complemento = txfcomplemento.getText();

        
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        Endereco endereco = new Endereco(funcionario_id, cidade, cep, logradouro, bairro, complemento);
        Endereco enderecoCriado = enderecoDAO.create(endereco);

        System.out.println("Endereço Cadastrado");
        
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("cadastro-login.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastro Login");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
        
    }
}
