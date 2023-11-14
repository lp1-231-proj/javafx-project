package com.example.javafxproject.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastroFuncionarioController {
    @FXML
    private TextField txfNome;
    @FXML
    private TextField txfEmail;
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
        String nome = txfNome.getText();
        String email = txfEmail.getText();
        String telefone = txfTelefone.getText();
        String rg = txfrg.getText();
        String cpf = txfcpf.getText();
        String cargo = txfcargo.getText();
        String dataNascimento = txfdataNascimento.getText();
        String cep = txfcep.getText();
        String cidade = txfcidade.getText();
        String endereco = txfendereco.getText();
        String bairro = txfbairro.getText();
        String complemento = txfcomplemento.getText();

        System.out.println(nome);
        System.out.println(email);
        System.out.println(telefone);
        System.out.println(rg);
        System.out.println(cpf);
        System.out.println(cargo);
        System.out.println(dataNascimento);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(endereco);
        System.out.println(bairro);
        System.out.println(complemento);
        
    }
    
}