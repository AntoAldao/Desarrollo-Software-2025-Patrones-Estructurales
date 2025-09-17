package ej5_Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeArboles {
    public static final Map<String, Arbol> arboles = new HashMap<>();

    public static Arbol getArbol(String tipo, String color, String textura) {
        String clave = tipo + "-" + color + "-" + textura;
        if (!arboles.containsKey(clave)) {
            arboles.put(clave, new Arbol(tipo, color, textura));
            System.out.println("Creando nuevo árbol: " + clave);
        }
        return arboles.get(clave);
    }
}
