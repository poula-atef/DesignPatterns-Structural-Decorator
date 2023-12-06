package com.mycode.designpatternsstructuraldecorator.entities;

public class WhatsAppNotifier extends Notifier {
    public WhatsAppNotifier(INotification notification) {
        super(notification);
    }

    @Override
    public void pushNotification(String message) {
        super.pushNotification(message);
        System.out.println("Pushing Notification On WhatsApp With Message :: " + message);
    }
}
