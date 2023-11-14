package com.example.javafxproject.login;

public class Login {


    private Integer id;
    private Integer funcionario_id;
    private String email;
    private String senha;
    private String codigoVerificador;
    private Boolean verificado;
    private String dataCadastro;
    
    public Login(Integer id, Integer funcionario_id, String email, String senha, String codigoVerificador, Boolean verificado, String dataCadastro) {
            this.id = id;
            this.funcionario_id = funcionario_id;
            this.email = email;
            this.senha = senha;
            this.codigoVerificador = codigoVerificador;
            this.verificado = verificado;
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
        
    public String getEmail() {
        return email;
    }
        
    public void setEmail(String email) {
        this.email = email;
    }
        
    public String getSenha() {
        return senha;
    }
        
    public void setSenha(String senha) {
        this.senha = senha;
    }
        
    public String getCodigoVerificador() {
        return codigoVerificador;
    }
        
    public void setCodigoVerificador(String codigoVerificador) {
        this.codigoVerificador = codigoVerificador;
    }
        
    public Boolean getVerificado() {
        return verificado;
    }
        
    public void setVerificado(Boolean verificado) {
        this.verificado = verificado;
    }
        
    public String getDataCadastro() {
        return dataCadastro;
    }
        
    public void setDataCadastro (String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
        
}
    


