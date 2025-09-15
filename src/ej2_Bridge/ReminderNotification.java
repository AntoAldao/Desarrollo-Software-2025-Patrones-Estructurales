package ej2_Bridge;

public class ReminderNotification extends Notification {
    public ReminderNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        sender.send("Recordatorio: " + message);
    }
}