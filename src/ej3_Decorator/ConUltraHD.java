package ej3_Decorator;

public class ConUltraHD extends PlanDecorador{
    public ConUltraHD(Plan plan) {
        super(plan);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " + Ultra HD";
    }

    @Override
    public double costo() {
        return super.costo() + 1000;
    }
}
