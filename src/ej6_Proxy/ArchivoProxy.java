package ej6_Proxy;

import java.util.List;

public class ArchivoProxy implements Archivo {
    private String nombre;
    private String usuario;
    private static final List<String> usuariosPermitidos = List.of("admin", "carlos", "root");

    public ArchivoProxy(String nombre, String usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
    }

    @Override
    public void abrir() {
        if (usuariosPermitidos.contains(usuario)) {
            ArchivoReal archivoReal = new ArchivoReal(nombre);
            archivoReal.abrir();
        } else {
            System.out.println("Acceso denegado para el usuario: " + usuario);
        }
    }
}
