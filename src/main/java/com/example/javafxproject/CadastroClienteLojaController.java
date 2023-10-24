package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

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

        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(dataNascimento);
        System.out.println(email);
        System.out.println(telefone);
        System.out.println(rg);

    }
    
}
