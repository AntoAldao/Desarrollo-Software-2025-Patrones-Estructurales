package ej2_Bridge;

public class MainBridge {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        NotificationSender smsSender = new SmsSender();

        Notification alert = new AlertNotification(emailSender);
        Notification reminder = new ReminderNotification(smsSender);
        Notification promotion = new PromotionNotification(emailSender);

        alert.notifyUser("Sistema caído");
        reminder.notifyUser("Reunión a las 3 PM");
        promotion.notifyUser("Descuento del 50%");
    }
}