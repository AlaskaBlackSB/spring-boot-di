package com.alaskarnitas.springbootdi.models.service;

// @Component("miServicioSimple")
// @Primary
public class MiServicio implements IServicio {

    @Override
    public String operacion() {
        return "Ejecutando algun proceso importante simple...";
    }

}
