package com.alaskarnitas.springbootdi.models.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@PropertySource("classpath:application.properties")
// Con @RequestScopeEsta factura solo dura lo que dura la peticion http del
// usuario
@RequestScope
public class Cliente {

    @Value("${cliente.nombre:Nombre por defecto}")
    private String nombre;

    @Value("${cliente.apellidos:Apellidos por defecto}")
    private String apellidos;

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
     * @return String return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellido to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

}
