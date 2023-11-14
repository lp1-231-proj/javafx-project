package com.example.javafxproject.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.example.javafxproject.Conexao;

import java.time.LocalDate;


    
// DAO = Data Access Object
public class LoginDAO {
    public LoginDAO create(Login login) {
        String sql = """
            INSERT INTO Login (funcionario_id, email, senha, codigoVerificador, verificado, dataCadastro) VALUES (?, ?, ?, ?, ?, ?);    
        """;
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, login.getFuncionarioId());
            statement.setString(2, login.getEmail());
            statement.setString(3, login.getCodigoVerificador());
            statement.setString(4, login.getEmail());
            statement.setString(5, login.getTelefone());
            statement.setString(6, login.getRg());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                login.setId(rs.getInt(1));
            }

            rs.close();

            return login;
        }  catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
