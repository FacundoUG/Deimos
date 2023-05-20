package com.Deimos.Deimos.DTO;

public class usuarioDTO {

    private Integer id;
    private String nombre;
    private String contraseña;
    private Boolean estado;

    public usuarioDTO() {
    }

    public usuarioDTO(Integer id, String nombre, String contraseña, Boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
