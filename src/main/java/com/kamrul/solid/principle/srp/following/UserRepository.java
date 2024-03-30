package com.kamrul.solid.principle.srp.following;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
  public void save(SrpUser user) {
    // Logic to save user into the database
  }

  public void update(SrpUser user) {
    // Logic to update user in the database
  }

  public void delete(SrpUser user) {
    // Logic to delete user from the database
  }

}
