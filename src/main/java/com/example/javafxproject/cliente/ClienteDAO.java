package com.example.javafxproject.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.example.javafxproject.Conexao;

public class ClienteDAO {
    public Cliente create(Cliente cliente) {
        String sql = """
            INSERT INTO Cliente (nome, cpf, dataNascimento, email, telefone, rg) VALUES (?, ?, ?, ?, ?, ?);    
        """;
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCpf());
            statement.setString(3, cliente.getDataNascimento());
            statement.setString(4, cliente.getEmail());
            statement.setString(5, cliente.getTelefone());
            statement.setString(6, cliente.getRg());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                cliente.setId(rs.getInt(1));
            }

            rs.close();

            return cliente;
        }  catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    // public Cliente update(Cliente cliente) throws SQLException {
    //     String sql = """
    //     UPDATE Cliente
    //     SET nome = ?, telefone = ?, email = ?
    //     WHERE id = ?;
    //     """;

    //     try (
    //         Connection connection = Conexao.getConnection();
    //         PreparedStatement statement = connection.prepareStatement(sql);
    //     ) {

    //         statement.setString(1, cliente.getNome());
    //         statement.setString(2, cliente.getTelefone());
    //         statement.setString(3, cliente.getEmail());
    //         statement.setInt(4, Cliente.getId());
    //         int linhasAfetadas = statement.executeUpdate();

    //         if (linhasAfetadas > 0) {
    //         return cliente;
    //         }
    //         return null;

    //     } catch (SQLException e) {
    //         return null;
    //     }
    // }


    // public Cliente findById(Integer id) {
    //     String sql = "SELECT * FROM Cliente WHERE id = ?;";

    //     try (
    //         Connection connection = Conexao.getConnection();
    //         PreparedStatement statement = connection.prepareStatement(sql);
    //     ) {
    //         statement.setInt(1, id);
    //         ResultSet rs = statement.executeQuery();

    //         if (rs.next()) {
    //         return resultSetToCliente(rs);
    //         }

    //         rs.close();

    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         return null;
    //     }

    //     return null;
    // }

    // public List<Cliente> findAll() {
    //     String sql = "SELECT * FROM Cliente;";
    //     List<Cliente> cliente = new ArrayList<>();

    //     try (
    //         Connection connection = Conexao.getConnection();
    //         Statement statement = connection.createStatement();
    //         ResultSet rs = statement.executeQuery(sql);
    //     ) {
    //         while(rs.next()) {
    //         cliente.add(resultSetToCliente(rs));
    //         }

    //         return cliente;

    //         } catch (Exception e) {
    //         e.printStackTrace();
    //         return null;
    //     }

    // }

    // private Cliente resultSetToCliente(ResultSet rs) throws SQLException {
    //     return new Cliente(
    //     rs.getInt("id"),
    //     rs.getString("nome"),
    //     rs.getString("cpf"),
    //     rs.getString("rg"),
    //     rs.getString("data_nascimento"),
    //     rs.getString("telefone"),
    //     rs.getString("email")
    //     );
    // }
}