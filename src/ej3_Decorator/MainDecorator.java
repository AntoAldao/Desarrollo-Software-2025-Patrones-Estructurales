package ej3_Decorator;

public class MainDecorator {
    public static void main(String[] args) {

        PlanBasico planBasico = new PlanBasico();
        System.out.println("Descripcion: " + planBasico.descripcion() + ", Costo: " + planBasico.costo());

        ConHD conHD = new ConHD(planBasico);
        System.out.println("Descripcion: " + conHD.descripcion() + ", Costo: " + conHD.costo());

        ConUltraHD conUltraHD = new ConUltraHD(planBasico);
        System.out.println("Descripcion: " + conUltraHD.descripcion() + ", Costo: " + conUltraHD.costo());


        ConDescargas conDescargas = new ConDescargas(conHD);
        System.out.println("Descripcion: " + conDescargas.descripcion() + ", Costo: " + conDescargas.costo());


        ConDescargas conDescargas1 = new ConDescargas(conUltraHD);
        System.out.println("Descripcion: " + conDescargas1.descripcion() + ", Costo: " + conDescargas1.costo());



    }
}
