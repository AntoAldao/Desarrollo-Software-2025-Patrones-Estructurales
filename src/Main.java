import Adapter.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("---------- Ejercicio1 - Sistema de Impresión con Adaptador -----------\n");

        ImpresoraPDF impresoraPDF = new ImpresoraPDF();
        ImpresoraTexto impresoraTexto = new ImpresoraTexto();

        // aca creamos los adaptadores
        Impresora pdfAdapter = new ImpresoraPDFAdapter(impresoraPDF);
        Impresora textoAdapter = new ImpresoraTextoAdapter(impresoraTexto);

        //creamos el siestema de impresion que usa la interfaz comun
        SistemaImpresion sistema = new SistemaImpresion();

        System.out.println(" --- Imprimiendo en PDF mediante Adapter ---");
        sistema.imprimirDocumento(pdfAdapter, "Informe anual - Sección Finanzas");

        System.out.println("--- Imprimiendo en Impresora de Texto mediante Adapter ---");
        sistema.imprimirDocumento(textoAdapter, "Informe anual - Sección Finanzas");

    }
}