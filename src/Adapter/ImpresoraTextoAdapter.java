package Adapter;

public class ImpresoraTextoAdapter implements Impresora {
    private final ImpresoraTexto impresoraTexto;

    public ImpresoraTextoAdapter(ImpresoraTexto impresoraTexto) {
        this.impresoraTexto = impresoraTexto;
    }

    @Override
    public void imprimir(String contenido) {
        // hacemos la llamada al metodo de la clase que queremos adaptar
        impresoraTexto.imprimirTexto(contenido);
    }
}