package Adapter;

public class SistemaImpresion {
    public void imprimirDocumento(Impresora impresora, String contenido) {
        impresora.imprimir(contenido);
    }
}
