package ej2_Bridge;

public class PromotionNotification extends Notification {
    public PromotionNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        sender.send("Promoción: " + message);
    }
}
