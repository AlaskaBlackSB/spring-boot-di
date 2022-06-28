package com.alaskarnitas.springbootdi.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
// Con @RequestScopeEsta factura solo dura lo que dura la peticion http del
// usuario
@RequestScope
public class Factura {

    @Value("${factura.descripcion:otra cosa}")
    private String descripcion;

    @Autowired
    private Cliente cliente;

    @Autowired()
    @Qualifier("itemsFacturaOficina")
    private List<ItemFactura> items;

    /**
     * Se ejecuta justo despues de crear el objeto y de inyectar la dependencia
     */
    @PostConstruct
    public void init() {
        cliente.setNombre(cliente.getNombre().concat(" ").concat("José"));
        descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
    }

    /**
     * Se ejecuta justo antres de destruir el objeto
     */
    @PreDestroy
    public void destroy() {
        System.out.println("Factura destruida: ".concat(descripcion));
    }

    /**
     * @return String return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return Cliente return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return List<ItemFactura> return the items
     */
    public List<ItemFactura> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }

}