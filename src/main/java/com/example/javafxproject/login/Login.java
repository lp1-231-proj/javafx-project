package com.example.javafxproject.login;

public class Login {
    private Integer id;
    private Integer funcionario_id;
    private String senha;
    private String dataCadastro;
    
    public Login(Integer id, Integer funcionario_id, String senha, String dataCadastro) {
            this.id = id;
            this.funcionario_id = funcionario_id;
            this.senha = senha;
            this.dataCadastro = dataCadastro;
    }

    public Login(Integer funcionario_id, String senha, String dataCadastro) {
            this.funcionario_id = funcionario_id;
            this.senha = senha;
            this.dataCadastro = dataCadastro;
    }

    public Login () {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFuncionarioId() {
        return funcionario_id;
    }
    
    public void setFuncionarioId(Integer funcionario_id) {
        this.funcionario_id = funcionario_id;
    }
        
    public String getSenha() {
        return senha;
    }
        
    public void setSenha(String senha) {
        this.senha = senha;
    }
        
    public String getDataCadastro() {
        return dataCadastro;
    }
        
    public void setDataCadastro (String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
        
}