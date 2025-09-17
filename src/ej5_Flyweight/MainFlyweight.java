package ej5_Flyweight;

import java.util.Random;

public class MainFlyweight {
    private static final String[] tipos = { "Pino", "Roble", "Sauce" };
    private static final String[] colores = { "Verde", "Oscuro", "Claro" };
    private static final String[] texturas = { "Rugosa", "Lisa" };

    public static void main(String[] args) {
        Random random = new Random();

        int cantidadArboles = 1_000_000; // 1 millón de árboles
        for (int i = 0; i < cantidadArboles; i++) {
            // Se eligen propiedades intrínsecas
            String tipo = tipos[random.nextInt(tipos.length)];
            String color = colores[random.nextInt(colores.length)];
            String textura = texturas[random.nextInt(texturas.length)];

            // Se obtiene el flyweight
            Arbol arbol = FabricaDeArboles.getArbol(tipo, color, textura);

            // Se le asignan propiedades extrínsecas (posición)
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);
            arbol.dibujar(x, y);
        }

        System.out.println("Total de objetos únicos creados: " +
                FabricaDeArboles.arboles.size());
    }
}
