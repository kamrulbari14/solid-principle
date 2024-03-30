package com.kamrul.solid.principle.srp.violating;

import com.kamrul.solid.principle.srp.following.SrpUser;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Some points to check out in this class are:
 * - We have some save, update, and delete methods which require database connectivity.
 *   Database connectivity cannot be a job for this simple User class.
 * - On the other hand, we have another method to send email, which requires another job to be done.
 * - So, we are violating SRP (Single Responsibility Principle) by giving this class a lot of tasks.
 * - Look at these classes where SRP is followed properly, by giving them specific tasks:
 *   - {@link SrpUser}
 *   - {@link com.kamrul.solid.principle.srp.following.UserManager}
 *   - {@link com.kamrul.solid.principle.srp.following.UserRepository}
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private String username;
  private String password;
  private String email;

  public void saveToDatabase() {
    // Database connectivity and logic to save user
    System.out.println(
        "Saving user to the database: " + username + "and password: " + Arrays.toString(
            Base64.getEncoder().encode(password.getBytes(StandardCharsets.UTF_8))));
  }

  public void updateInDatabase() {
    // Database connectivity and logic to update user
    System.out.println("Updating user in the database: " + username);
  }

  public void deleteFromDatabase() {
    // Database connectivity and logic to delete user
    System.out.println("Deleting user from the database: " + username);
  }

  public void sendEmailConfirmation() {
    // Logic to send email confirmation
    System.out.println("Sending email confirmation to: " + email);
  }
}
