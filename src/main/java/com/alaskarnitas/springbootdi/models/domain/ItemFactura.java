package com.alaskarnitas.springbootdi.models.domain;

public class ItemFactura {

    private Producto producto;
    private Integer cantidad;

    public ItemFactura(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    /**
     * @return Producto return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return Integer return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer calcularImporte() {
        return cantidad * producto.getPrecio();
    }

}