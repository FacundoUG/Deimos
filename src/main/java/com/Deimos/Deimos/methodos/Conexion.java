package com.Deimos.Deimos.methodos;

import com.Deimos.Deimos.DTO.usuarioDTO;

import java.sql.*;

public class Conexion {


        public Connection ObtenerConexion(String url, String user, String pass){
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(url,user,pass);
                return conn;
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        public usuarioDTO crearUsuario(usuarioDTO usDTO,Connection conn){
            String sql = "INSERT INTO usuarios(nombre,contraseña,estado) VALUES (?,?,?)";
            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                preparedStatement.setString(1,usDTO.getNombre());
                preparedStatement.setString(2,usDTO.getContraseña());
                preparedStatement.setBoolean(3,usDTO.getEstado());

                preparedStatement.execute();
                preparedStatement.close();

                return usDTO;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
}
