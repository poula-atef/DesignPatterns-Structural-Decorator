package com.mycode.designpatternsstructuraldecorator.entities;

public abstract class Notifier implements INotification {
    private final INotification notification;

    public Notifier(INotification notification) {
        this.notification = notification;
    }

    @Override
    public void pushNotification(String message) {
        notification.pushNotification(message);
    }
}
