package ej3_Decorator;

public class ConHD extends PlanDecorador{
    public ConHD(Plan plan) {
        super(plan);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " + HD";
    }

    @Override
    public double costo() {
        return super.costo() + 500;
    }
}
