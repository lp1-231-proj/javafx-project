package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BuscaFuncionarioClienteController {
    @FXML
    private TextField txfCpf;
    
    public void onActionCadastrarC() {
        String CPF = txfCpf.getText();

        System.out.println(CPF);
    }

    public void onActionCadastrarF() {
        String CPF = txfCpf.getText();

        System.out.println(CPF);
    }

    public void onActionBuscar() {
        String CPF = txfCpf.getText();
        
        System.out.println(CPF);
    }

    public void onActionAcessarEstoque() {
        String CPF = txfCpf.getText();

        System.out.println(CPF);
    }
}
