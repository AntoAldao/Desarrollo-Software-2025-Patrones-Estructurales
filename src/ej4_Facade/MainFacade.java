package ej4_Facade;

import java.util.ArrayList;
import java.util.List;

public class MainFacade {
    public static void main(String[] args) {
        // El cliente instancia el Facade (Tienda)
        TiendaFacade tiendaFacade = new TiendaFacade();

        // Lista de productos que el cliente quiere comprar
        Producto fideos = new Producto(1L, "Fideos", 1200);
        Producto aceite = new Producto(2L, "Aceite", 3800);

        // El cliente agrega productos usando el método simple del facade
        tiendaFacade.agregarProdcutoAlCarrito(fideos);
        tiendaFacade.agregarProdcutoAlCarrito(aceite);

        // El cliente finaliza la compra a traves de el metodo comprar
        tiendaFacade.comprar("Rodriguez 123", "Efectivo");

    }
}
