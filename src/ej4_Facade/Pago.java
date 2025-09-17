package ej4_Facade;

public class Pago {
    private float monto;
    private String metodoPago;

    public boolean procesarPago(float monto, String metodoPago){
        //logica sencilla para procesar el pago
        System.out.println("Procesando pago de: $"+monto+" con "+metodoPago);
        if (monto > 0){
            System.out.println("Pago exitoso");
            return true;
        }else{
            System.out.println("Pago fallido");
            return false;
        }
    }
}
