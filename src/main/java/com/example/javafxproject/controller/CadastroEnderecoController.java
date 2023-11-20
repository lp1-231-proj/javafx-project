package com.example.javafxproject.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import com.example.javafxproject.endereco.*;

public class CadastroEnderecoController {
   // @FXML
   // private TextField txffuncionario_id;
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
    
    public void onActionCadastrar() {
        //int funcionario_id = txffuncionario_id.getText();
        String cep = txfcep.getText();
        String cidade = txfcidade.getText();
        String logradouro = txfendereco.getText();
        String bairro = txfbairro.getText();
        String complemento = txfcomplemento.getText();

        
        EnderecoDAO enderecoDAO = new EnderecoDAO();
       // Endereco endereco = new Endereco(funcionario_id, cidade, cep, logradouro, bairro, complemento);
       // Endereco enderecoCriado = enderecoDAO.create(endereco);

        System.out.println(cep);
        
    }
}
