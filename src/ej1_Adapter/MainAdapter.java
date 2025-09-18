package ej1_Adapter;

import ej1_Adapter.*;

public class MainAdapter {
    public static void imprimirDocumento(Impresora impresora, String contenido) {
        impresora.imprimir(contenido);
    }

    public static void main(String[] args) {
        // Usando la impresora PDF directamente (no necesita adapter)
        Impresora impresoraPDF = new ImpresoraPDF();
        imprimirDocumento(impresoraPDF, "Contrato en formato PDF");

        // Usando la impresora de texto plano a través del adapter
        ImpresoraTexto impresoraTexto = new ImpresoraTexto();
        Impresora impresoraTextoAdaptada = new ImpresoraTextoAdapter(impresoraTexto);
        imprimirDocumento(impresoraTextoAdaptada, "Informe en texto plano");
    }

}
