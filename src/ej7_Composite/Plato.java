package ej7_Composite;

class Plato implements ElementoMenu {
    private String nombrePlato;

    public Plato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }
    @Override
    public void muestra(String mensaje) {
        System.out.println(mensaje + "-Plato: " + nombrePlato);
    }
}
