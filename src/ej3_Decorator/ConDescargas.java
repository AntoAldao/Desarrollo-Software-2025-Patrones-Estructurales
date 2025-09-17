package ej3_Decorator;

public class ConDescargas extends PlanDecorador {
    public ConDescargas(Plan plan) {
        super(plan);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " + Descargas";
    }

    @Override
    public double costo() {
        return super.costo() + 700;
    }
}
