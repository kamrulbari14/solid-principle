package com.kamrul.solid.principle.srp.violating;

import lombok.RequiredArgsConstructor;

/** Some points to check out in this class are
 * We have some save, update and delete methods which need database connectivity.
 * Database connectivity can not be a job for this simple User class.
 * On the other hand we have another method to send email which need another job to be done.
 * So, we are violating SRP(Single Responsibility Principle) by giving this class a lot of tasks.
 *
 *** ({@link com.kamrul.solid.principle.srp.following.User}
 *** ({@link com.kamrul.solid.principle.srp.following.UserManager}
 *** ({@link com.kamrul.solid.principle.srp.following.UserRepository}
   look at these classes where SRP is followed properly, by giving them specific tasks.}).
 ***
 * */

@RequiredArgsConstructor
public class User {

  private final String username;
  private final String password;
  private final String email;

  public void saveToDatabase() {
    // Here we might use database connectivity to save user
  }

  public void updateInDatabase() {
    // Here we might use database connectivity to update user
  }

  public void deleteFromDatabase() {
    // Here we might use database connectivity to delete user
  }

  public void sendEmailConfirmation() {
    // Here we might implement email service to send email notification
  }

}
