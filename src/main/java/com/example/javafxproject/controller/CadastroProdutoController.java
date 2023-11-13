package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastroProdutoController {
    @FXML
    private TextField txfModelo;
    @FXML
    private TextField txfColorway;
    @FXML
    private TextField txfPreco;
    @FXML
    private TextField txfTamanho;
    @FXML
    private TextField txfQuantidade;
    @FXML

    public void onActionCadastrarP() {
        String Modelo = txfModelo.getText();
        String Colorway = txfColorway.getText();
        String Preco = txfPreco.getText();
        String Tamanho = txfTamanho.getText();
        String Quantidade = txfQuantidade.getText();

        System.out.println(Modelo);
        System.out.println(Colorway);
        System.out.println(Preco);
        System.out.println(Tamanho);
        System.out.println(Quantidade);

    }
    
}