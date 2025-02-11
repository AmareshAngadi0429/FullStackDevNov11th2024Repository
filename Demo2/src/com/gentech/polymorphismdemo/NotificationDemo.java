package com.gentech.polymorphismdemo;
abstract class Notification
{
    abstract void notification();
}
class MobileNo extends Notification
{

    @Override
    void notification() {
        System.out.println("Notification sent through linked Mobile Number");
    }
}
class Email extends Notification
{

    @Override
    void notification() {
        System.out.println("Notification sent through linked Email");
    }
}
class  Post extends Notification
{

    @Override
    void notification() {
        System.out.println("Notification sent through given address in database");
    }
}
public class NotificationDemo {
    public static void main(String[] args) {
        MobileNo m = new MobileNo();
        Email e = new Email();
        Post p = new Post();

        Notification n;
        n=m;
        n.notification();

        n=e;
        n.notification();

        n=p;
        n.notification();

    }
}
