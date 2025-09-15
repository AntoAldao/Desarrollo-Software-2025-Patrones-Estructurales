package Adapter;

public class ImpresoraPDFAdapter implements Impresora {
    private final ImpresoraPDF impresoraPDF;

    public ImpresoraPDFAdapter(ImpresoraPDF impresoraPDF) {
        this.impresoraPDF = impresoraPDF;
    }

    @Override
    public void imprimir(String contenido) {
        // hacemos la llamada al metodo de la clase que queremos adaptar
        impresoraPDF.imprimirPDF(contenido);
    }
}