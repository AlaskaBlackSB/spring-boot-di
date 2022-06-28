package com.alaskarnitas.springbootdi;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alaskarnitas.springbootdi.models.domain.ItemFactura;
import com.alaskarnitas.springbootdi.models.domain.Producto;
import com.alaskarnitas.springbootdi.models.service.IServicio;
import com.alaskarnitas.springbootdi.models.service.MiServicio;
import com.alaskarnitas.springbootdi.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

    @Bean("miServicioSimple")
    @Primary
    public IServicio registrarMiServicio() {
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    public IServicio registrarMiServicioComplejo() {
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems() {

        Producto producto1 = new Producto("Camara", 100);
        Producto producto2 = new Producto("Celular", 200);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 5);

        return Arrays.asList(linea1, linea2);
    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina() {

        Producto producto1 = new Producto("Monitor", 50);
        Producto producto2 = new Producto("Computadora", 20);
        Producto producto3 = new Producto("impresora", 20);
        Producto producto4 = new Producto("escritorio", 20);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 5);
        ItemFactura linea3 = new ItemFactura(producto3, 5);
        ItemFactura linea4 = new ItemFactura(producto4, 5);

        return Arrays.asList(linea1, linea2, linea3, linea4);
    }

}
