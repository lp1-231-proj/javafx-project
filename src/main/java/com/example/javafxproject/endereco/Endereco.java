package com.example.javafxproject.endereco;

public class Endereco {

    private Integer id;
    private int funcionario_id;
    private String cep;
    private String cidade;
    private String logradouro;
    private String bairro;
    private String complemento;

    public Endereco(Integer id, int funcionario_id, String cep, String cidade, String logradouro, String bairro, String complemento) {
        this.id = id;
        this.funcionario_id = funcionario_id;
        this.cep = cep;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.complemento = complemento;
    }

    public Endereco(int funcionario_id, String cidade,String cep, String logradouro, String bairro, String complemento) {
        this.funcionario_id = funcionario_id;
        this.cep = cep;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.complemento = complemento;
    }

    public Endereco () {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getFuncionarioId(){
        return funcionario_id;
    }

    public void setFuncionarioId(int funcionario_id){
        this.funcionario_id = funcionario_id;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getlogradouro(){
        return logradouro;
    }

    public void setlogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    public String getBairro(){
        return bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getComplemento(){
        return complemento;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }
    
}
