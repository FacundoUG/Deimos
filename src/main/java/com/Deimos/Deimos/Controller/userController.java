package com.Deimos.Deimos.Controller;


import com.Deimos.Deimos.DTO.usuarioDTO;
import com.Deimos.Deimos.methodos.Conexion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.*;

@RestController
@RequestMapping("/usuarios")
public class userController {

    @Autowired
    Conexion conexion;


    @GetMapping("/crearusuario")
    public void crearUsuario(@RequestBody usuarioDTO usuarioDTO){
            try {
                Connection conn = conexion.ObtenerConexion();
                conexion.crearUsuario(usuarioDTO,conn);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }

}
