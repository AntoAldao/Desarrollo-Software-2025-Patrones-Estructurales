package ej4_Facade;

import java.util.List;

public class TiendaFacade {
    private Pago pago;
    private Envio envio;
    private Carrito carrito;

    public TiendaFacade(){
        // Al crear el Facade se instancian los sistemas internos
        this.carrito = new Carrito();
        this.envio = new Envio();
        this.pago = new Pago();
    }

    /*metodo que usara el cliente que aplica las llamadas a los distintos
    sistemas en el orden del proceso de compra*/
    public void comprar(List<Producto> productos, String direccion, String metodoPago){
        System.out.println("Iniciando proceso de compra");
        System.out.println("------------------------------");

        //1. agrega productos al carrito
        for (Producto p: productos){
            this.carrito.setProductos(p);
        }

        //2. preocesa el pago
        float montoTotal = carrito.getPrecioTotal();
        boolean pagoExitoso = this.pago.procesarPago(montoTotal, metodoPago);

        //3. si el pago es exitoso programa el envio
        if (pagoExitoso){
            this.envio.programarEnvio(carrito, direccion);
            System.out.println("Proceso de compra finalizado exitosamente");
        }else {
            System.out.println("Fallo en el proceso de pago no se puede completar");
        }
    }
}
