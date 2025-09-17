package ej4_Facade;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Carrito {

    private List<Producto> productos = new ArrayList<>();

    public void setProductos(Producto producto) {
        System.out.println("Agregando producto "+producto+" al carrito");
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public float getPrecioTotal(){
        float total = 0.0f;
        for (Producto producto : productos){
            total += producto.getPrecio();
        }
        return total;
    }

}
