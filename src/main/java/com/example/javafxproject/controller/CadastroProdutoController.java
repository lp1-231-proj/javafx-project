package com.example.javafxproject.controller;

import com.example.javafxproject.modelo.Modelo;
import com.example.javafxproject.modelo.ModeloDAO;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastroProdutoController {
    @FXML
    private TextField txfnome;
    @FXML
    private TextField txfColorway;
    @FXML
    private TextField txfPreco;
    @FXML
    private TextField txfTamanho;
    @FXML
    private TextField txfQuantidade;
    @FXML

    public void onActionCadastrar() {
        String nome = txfnome.getText();
        String colorway = txfColorway.getText();
        String preco = txfPreco.getText();
        String tamanho = txfTamanho.getText();
        String quantidade = txfQuantidade.getText();

        ModeloDAO modeloDAO = new ModeloDAO();
        Modelo modelo = new Modelo(nome, colorway, tamanho, quantidade, preco);
        Modelo modeloCriado = modeloDAO.create(modelo);

        System.out.println("Modelo Cadastrado");

    }
    
}