package com.Deimos.Deimos.Controller;


import com.Deimos.Deimos.DTO.usuarioDTO;
import com.Deimos.Deimos.methodos.Conexion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.sql.*;

@RestController
@RequestMapping("/usuarios")
public class userController {

    @Value("${url_postgreSQL}")
    private String url;
    @Value("${uss}")
    private String uss;
    @Value("${password}")
    private String pass;

    @PostMapping("/crearusuario")
    public usuarioDTO crearUsuario(@RequestBody usuarioDTO usuarioDTO){
            Conexion conexion=new Conexion();
            try {
                Connection conn = conexion.ObtenerConexion(url,uss,pass);
                return conexion.crearUsuario(usuarioDTO,conn);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }

}
