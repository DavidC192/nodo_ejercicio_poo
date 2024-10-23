package com.eafit.nodo;
import com.eafit.nodo.models.Clientes;
import com.eafit.nodo.models.Producto;
import com.eafit.nodo.models.Venta;
import com.eafit.nodo.models.Detalles_venta;
import com.eafit.nodo.models.Marca;
import com.eafit.nodo.repositories.clientesRepository;
import com.eafit.nodo.repositories.detalles_ventaRepository;
import com.eafit.nodo.repositories.marcaRepository;
import com.eafit.nodo.repositories.productoRepository;
import com.eafit.nodo.repositories.ventaRepository;

public class Main {
    public static void main(String[] args) {

        clientesRepository clientesRepository = new clientesRepository();
        productoRepository productoRepository = new productoRepository();
        ventaRepository ventaRepository = new ventaRepository();
        detalles_ventaRepository detalles_ventaRepository = new detalles_ventaRepository();
        marcaRepository marcaRepository = new marcaRepository();

        Clientes clientes = new Clientes();
        clientes.setCliente_id(1231);
        clientes.setNombre("Cliente 1");
        clientes.setApellido("Cliente 2");
        Clientes clientes2 = Clientes.builder()
                .cliente_id(13112)
                .nombre("pedro")
                .apellido("rapo")
                .build();
        Detalles_venta detalles_venta = new Detalles_venta();
        detalles_venta.setCantidad_productos(2);
        Marca marca = Marca.builder()
                .id_marca(123423432)
                .nombre_marca("los pollos")
                .categori_marca("perro2")
                .build();
        Producto producto = Producto.builder()
                .id_producto(1212)
                .nombre_producto("QUINUAVERDE")
                .build();
        Venta venta = Venta.builder()
                .venta_id(12002)
                .build();
        clientesRepository.create(clientes);
        clientesRepository.create(clientes2);
        productoRepository.create(producto);
        ventaRepository.create(venta);
        detalles_ventaRepository.create(detalles_venta);
        marcaRepository.create(marca);

        clientesRepository.findAll()
                .forEach(System.out::println);
        detalles_ventaRepository.findAll()
                .forEach(System.out::println);
        marcaRepository.findAll()
                .forEach(System.out::println);
        productoRepository.findAll()
                .forEach(System.out::println);
        ventaRepository.findAll()
                .forEach(System.out::println);



        clientesRepository.close();
        productoRepository.close();
        ventaRepository.close();
        detalles_ventaRepository.close();
        marcaRepository.close();
    }

}