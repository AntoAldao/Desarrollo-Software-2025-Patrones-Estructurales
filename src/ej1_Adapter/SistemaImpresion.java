package ej1_Adapter;

public class SistemaImpresion {
    public void imprimirDocumento(Impresora impresora, String contenido) {
        impresora.imprimir(contenido);
    }
}
