package ej2_Bridge;

public class AlertNotification extends Notification {
    public AlertNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        sender.send("Alerta: " + message);
    }
}