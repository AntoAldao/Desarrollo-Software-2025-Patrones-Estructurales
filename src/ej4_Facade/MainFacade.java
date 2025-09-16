package ej4_Facade;

import java.util.ArrayList;
import java.util.List;

public class MainFacade {
    public static void main(String[] args) {
        //El cliente instancia el Facade (Tienda)
        TiendaFacade tiendaFacade = new TiendaFacade();

        // Lista de productos que el cliente quiere comprar
        List<Producto> miCompra = new ArrayList<>();
        miCompra.add(new Producto(1L, "Fideos", 1200));
        miCompra.add(new Producto(2L, "Aceite", 3800));

        //El cliente realiza la compra a traves de el metodo comprar
        tiendaFacade.comprar(miCompra, "Rodriguez 123", "Efectivo");

    }
}
