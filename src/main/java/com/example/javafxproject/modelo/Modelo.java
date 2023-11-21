package com.example.javafxproject.modelo;

public class Modelo {

    private Integer id;
    private String nome;
    private String colorway;
    private String tamanho;
    private String quantidade;
    private String preco;

    public Modelo(Integer id, String nome, String colorway, String tamanho, String quantidade, String preco) {
        this.id = id;
        this.nome = nome;
        this.colorway = colorway;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Modelo(String nome, String colorway, String tamanho, String quantidade, String preco) {
        this.nome = nome;
        this.colorway = colorway;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Modelo () {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getColorway(){
        return colorway;
    }

    public void setColorway(String colorway){
        this.colorway = colorway;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public String getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(String quantidade){
        this.quantidade = quantidade;
    }

    public String getPreco(){
        return preco;
    }

    public void setPreco(String preco){
        this.preco = preco;
    }
    
}