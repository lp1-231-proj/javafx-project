package com.example.javafxproject.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import com.example.javafxproject.cliente.*;

public class CadastroClienteLojaController {
    @FXML
    private TextField txfNome;
    @FXML
    private TextField txfCpf;
    @FXML
    private TextField txfDataNascimento;
    @FXML
    private TextField txfEmail;
    @FXML
    private TextField txfTelefone;
    @FXML
    private TextField txfRg;

    public void onActionCadastrar() {
        String nome = txfNome.getText();
        String cpf = txfCpf.getText();
        String dataNascimento = txfDataNascimento.getText();
        String email = txfEmail.getText();
        String telefone = txfTelefone.getText();
        String rg = txfRg.getText();

        // ClienteDAO clienteDAO = new ClienteDAO();

        // Cliente cliente = new Cliente(nome, cpf, rg,  dataNascimento, telefone, email);

        // Cliente clienteCriado = clienteDAO.create(cliente);

        System.out.println("Cliente Cadastrado");
    }
    
}
