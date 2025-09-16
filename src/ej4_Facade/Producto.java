package ej4_Facade;

public class Producto {
    private long id;
    private String nombre;
    private float precio;

    public Producto(long id, String nombre, float precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString(){
        return "Producto{" +
                "id: "+id+
                ", nombre: "+nombre+
                ", precio: "+precio+
                "}";
    }
}
