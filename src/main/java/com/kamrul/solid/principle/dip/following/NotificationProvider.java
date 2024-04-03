package com.kamrul.solid.principle.dip.following;

public interface NotificationProvider {
  void sendNotification(String message, String recipient);
}

class NotificationService {
  private final NotificationProvider notificationProvider;

  public NotificationService(NotificationProvider notificationProvider) {
    this.notificationProvider = notificationProvider;
  }

  public void sendNotification(String message, String recipient) {
    notificationProvider.sendNotification(message, recipient);
  }
}


class EmailService implements NotificationProvider {
  public void sendNotification(String message, String recipient) {
    System.out.println("Email sent!!");
    System.out.println("Message: " + message);
    System.out.println("Recipient: " + recipient);
  }
}

class DipMain {

  public static void main(String[] args){
    EmailService emailService = new EmailService();

    NotificationService notificationService = new NotificationService(emailService);

    notificationService.sendNotification("Testing mail notification", "Kamrul");
  }

}
