package com.mycode.designpatternsstructuraldecorator.entities;

public class FacebookNotifier extends Notifier {
    public FacebookNotifier(INotification notification) {
        super(notification);
    }

    @Override
    public void pushNotification(String message) {
        super.pushNotification(message);
        System.out.println("Pushing Notification On Facebook With Message :: " + message);
    }
}
