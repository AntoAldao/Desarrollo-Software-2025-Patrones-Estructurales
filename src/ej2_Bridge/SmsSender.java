package ej2_Bridge;

public class SmsSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}