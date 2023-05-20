package com.Deimos.Deimos.methodos;

import com.Deimos.Deimos.DTO.usuarioDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {

    @Value("${url_postgreSQL}")
    private String url;
    @Value("${user}")
    private String user;
    @Value("${password}")
    private String pass;

        public Connection ObtenerConexion(){
            try {
                Connection conn = DriverManager.getConnection(url,user,pass);
                return conn;
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public ResponseEntity<usuarioDTO> crearUsuario(usuarioDTO usuarioDTO,Connection conn){
            String sql = "INSERT INTO usuarios(nombre,contraseña,estado) VALUES (?,?,?,?)";
            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return null;
        }


}
