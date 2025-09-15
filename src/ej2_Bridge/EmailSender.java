package ej2_Bridge;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Enviando Email: " + message);
    }
}