package com.mycode.designpatternsstructuraldecorator.entities;

public class MailNotifier extends Notifier {
    public MailNotifier(INotification notification) {
        super(notification);
    }

    @Override
    public void pushNotification(String message) {
        super.pushNotification(message);
        System.out.println("Pushing Notification On Mail With Message :: " + message);
    }

}
