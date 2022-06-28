package com.alaskarnitas.springbootdi.models.service;

// @Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {

    @Override
    public String operacion() {
        return "Ejecutando algun proceso importante complicado...";
    }

}
