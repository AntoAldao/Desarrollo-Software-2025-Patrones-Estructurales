package ej6_Proxy;

public class MainProxy {
    public static void main(String[] args) {
        Archivo archivo1 = new ArchivoProxy("documento_secreto.txt", "carlos");
        archivo1.abrir(); // acceso permitido

        Archivo archivo2 = new ArchivoProxy("documento_secreto.txt", "invitado");
        archivo2.abrir(); // acceso denegado
    }
}
