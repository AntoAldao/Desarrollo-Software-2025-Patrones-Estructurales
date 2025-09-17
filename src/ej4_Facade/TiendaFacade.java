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

    /* el facade expone la funcionalidad de agregar productos pero oculta el
    subsitema carrito */
    public void agregarProdcutoAlCarrito(Producto producto){
        this.carrito.setProductos(producto);
    }

    /*metodo que usara el cliente que aplica las llamadas a los distintos
    sistemas en el orden del proceso de compra*/
    public void comprar(String direccion, String metodoPago){
        System.out.println("\n------------------------------");
        System.out.println("Iniciando proceso de compra");
        System.out.println("------------------------------");

        //el Facade ya tiene los productos en su instancia de carrito
        float montoTotal = this.carrito.getPrecioTotal();
        if (montoTotal<=0){
            System.out.println("El carrit esta vacio no se puede continuar el proceso de compra");
            return;
        }

        //2. procesa el pago
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
