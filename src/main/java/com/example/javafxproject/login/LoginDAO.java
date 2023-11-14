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
    public Login create(Login login) {
        String sql = """
            INSERT INTO Acesso (email, senha, codigoVerificador, verificado, dataCadastro) VALUES ( ?, ?, ?, ?, ?);    
        """;
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, login.getEmail());
            statement.setString(2, login.getSenha());
            statement.setString(3, login.getCodigoVerificador());
            statement.setBoolean(4, login.getVerificado());
            statement.setString(5, login.getDataCadastro());
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
