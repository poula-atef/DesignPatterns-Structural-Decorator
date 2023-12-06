package com.mycode.designpatternsstructuraldecorator;

import com.mycode.designpatternsstructuraldecorator.entities.*;

public class Main {

    public static void main(String[] args) {
        INotification notification = new FacebookNotifier(
                new WhatsAppNotifier(
                        new Notification()
                )
        );
        notification.pushNotification("NEW NOTIFICATION !!");
    }

}
