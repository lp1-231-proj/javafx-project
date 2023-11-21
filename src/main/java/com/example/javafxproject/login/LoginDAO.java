package com.example.javafxproject.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.example.javafxproject.Conexao;

public class LoginDAO {
    public Login create(Login login) {
        String sql = """
            INSERT INTO Login VALUES ( ?, ?, ?, ?);    
        """;
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setInt(1, login.getFuncionarioId());
            statement.setString(2, login.getSenha());
            statement.setString(3, login.getDataCadastro());
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
