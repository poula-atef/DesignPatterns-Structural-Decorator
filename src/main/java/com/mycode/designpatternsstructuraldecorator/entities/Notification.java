package com.mycode.designpatternsstructuraldecorator.entities;

public class Notification implements INotification {

    @Override
    public void pushNotification(String message) {
        System.out.println("Pushing Notification With Message :: " + message);
    }
}
