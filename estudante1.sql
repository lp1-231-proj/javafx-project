-- Active: 1700577222169@@localhost@3306@estudante1
use estudante1;

DROP TABLE IF EXISTS TenisVenda;
DROP TABLE IF EXISTS Venda;
DROP TABLE IF EXISTS Modelo;
DROP TABLE IF EXISTS RedefinirSenha;
DROP TABLE IF EXISTS Login;
DROP TABLE IF EXISTS Endereco;
DROP TABLE IF EXISTS Funcionario;
DROP TABLE IF EXISTS Cliente;

CREATE TABLE Cliente (
    id INT auto_increment,
    nome VARCHAR(100),
    email VARCHAR(100),
    rg CHAR(9),
    cpf CHAR(11),
    dataNascimento DATE,
    telefone CHAR(11),
    PRIMARY KEY (id)
);

CREATE TABLE Funcionario (
    id INT auto_increment,
    nome VARCHAR(100),
    rg CHAR(9),
    cpf CHAR(11),
    dataNascimento DATE,
    telefone CHAR(11),
    cargo VARCHAR(20),
    PRIMARY KEY (id)
);

CREATE TABLE Endereco (
	id INT auto_increment,
    funcionario_id INT,
	cep CHAR(8),
	cidade VARCHAR(100),
	endereco VARCHAR(100),
    bairro VARCHAR(100),
    complemento VARCHAR(100),
    PRIMARY KEY (id),
    FOREIGN KEY (funcionario_id) REFERENCES Funcionario(id)
);

CREATE TABLE Login (
	id INT auto_increment,
    funcionario_id INT,
    senha CHAR(60),
    dataCadastro DATE,
    PRIMARY KEY (id),
    FOREIGN KEY (funcionario_id) REFERENCES Funcionario(id)
);

CREATE TABLE RedefinirSenha(
	id INT auto_increment,
    login_id INT,
    novaSenha CHAR(60),
    redefinido BOOL,
    dataRedefinicao DATE,
    PRIMARY KEY (id),
    FOREIGN KEY (login_id) REFERENCES Login(id)
);

CREATE TABLE Modelo(
	id INT auto_increment,
    nome VARCHAR(100),
    colorway VARCHAR(100),
	quantidade INT,
    tamanho VARCHAR(100),
    preco DOUBLE,
    PRIMARY KEY (id)
);

CREATE TABLE Venda (
    id INT auto_increment,
    dataVenda DATE,
    cliente_id INT,
    funcionario_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id),
    FOREIGN KEY (funcionario_id) REFERENCES Funcionario(id)
);

CREATE TABLE TenisVenda (
    id INT auto_increment,
    valorUnitario DOUBLE,
    quantidade INT,
    venda_id INT,
    modelo_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (venda_id) REFERENCES Venda(id),
    FOREIGN KEY (modelo_id) REFERENCES Modelo(id)
);

SELECT * from cliente;
SELECT * from funcionario;
SELECT * from endereco;
SELECT * from login;
SELECT * from modelo;