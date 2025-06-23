package DesignPatterns;

interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("sending notification through Email");
    }
}

class SMSNotification  implements  Notification{
    public void notifyUser() {
        System.out.println("sending notification through sms");
    }
}
class NotificationFactory
{
    public static Notification getNotification(String notification)
    {
        if("Email".equalsIgnoreCase(notification))
        {
            return new EmailNotification();
        }
        else if("SMS".equalsIgnoreCase(notification))
        {
            return new SMSNotification();
        }
        else return null;

    }
}
public class Factory {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.getNotification("Email");
        Notification notification1 = NotificationFactory.getNotification("sms");
        notification1.notifyUser();;
        notification.notifyUser();

    }
}
