package com.kamrul.solid.principle.srp.following;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserManager {
  private final UserRepository userRepository;

  public void createUser(User user) {
    // Validation logic can be placed here before saving
    userRepository.save(user);
  }

  public void updateUser(User user) {
    // Validation logic can be placed here before updating
    userRepository.update(user);
  }

  public void deleteUser(User user) {
    userRepository.delete(user);
  }
}
