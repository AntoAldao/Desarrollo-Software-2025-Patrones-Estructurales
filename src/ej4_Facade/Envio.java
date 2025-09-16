package ej4_Facade;

import java.util.List;

public class Envio {
    private String direccion;
    private Carrito carrito;

    public void programarEnvio(Carrito carrito, String direccion){
        //logica sencilla para mostrar los productos que se agregan para programar el envio
        System.out.println("Programando envio a la direccion: "+direccion);
        System.out.println("Productos a enviar: ");
        for (Producto p: carrito.getProductos()){
            System.out.println(" - "+p.getNombre());
        }
        System.out.println("Envio listo para despachar");
    }

}
