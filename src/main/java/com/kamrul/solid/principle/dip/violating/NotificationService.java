package com.kamrul.solid.principle.dip.violating;

// High-level module
public class NotificationService {
  private final EmailService emailService;

  public NotificationService() {
    this.emailService = new EmailService();
  }

  public void sendNotification(String message, String recipient) {
    // Sending email notification
    emailService.sendEmail(message, recipient);
  }
}

// Low-level module
class EmailService {
  public void sendEmail(String message, String recipient) {
    // Logic to send email
  }

}
