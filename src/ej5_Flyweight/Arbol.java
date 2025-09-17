package ej5_Flyweight;

public class Arbol {
    private String tipo;
    private String color;
    private String textura;

    public Arbol(String tipo, String color, String textura) {
        this.tipo = tipo;
        this.color = color;
        this.textura = textura;
    }

    public void dibujar(int x, int y) {
        System.out.println("Dibujando árbol de tipo " + tipo +
                " en (" + x + "," + y + ") con color " + color +
                " y textura " + textura);
    }
}
