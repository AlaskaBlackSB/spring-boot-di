package com.alaskarnitas.springbootdi.models.domain;

public class Producto {

    private String nombre;
    private Integer precio;

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Integer return the precio
     */
    public Integer getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

}