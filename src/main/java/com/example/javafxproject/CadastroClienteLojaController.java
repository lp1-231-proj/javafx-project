package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastroClienteLojaController {
    @FXML
    private TextField txfNome;
    @FXML
    private TextField txfEmail;
    @FXML
    private TextField txfTelefone;
    @FXML
    
    public void onActionCadastrar() {
        String nome = txfNome.getText();
        String email = txfEmail.getText();
        String telefone = txfTelefone.getText();
        Boolean aceitaPromocao = ckbPromocao.isSelected();

        System.out.println(nome);
        System.out.println(email);
        System.out.println(telefone);
        System.out.println(aceitaPromocao);

        

    <Label text="CPF" />
    <TextField fx:id="txfCpf" />

    <Label text="Data de Nascimento" />
    <TextField fx:id="txfDataNascimento" />

    <Label text="E-mail" />
    <TextField fx:id="txfEmail" />

    <Label text="Telefone (DDD + número)" />
    <TextField fx:id="txfTelefone" />

    <Label text="RG" />
    <TextField fx:id="txfRg" />

    }
    
}
