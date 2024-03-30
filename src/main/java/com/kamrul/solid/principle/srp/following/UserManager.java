package com.kamrul.solid.principle.srp.following;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserManager {
  private final UserRepository userRepository;

  public void createUser(SrpUser user) {
    // Validation logic can be placed here before saving
    userRepository.save(user);
  }

  public void updateUser(SrpUser user) {
    // Validation logic can be placed here before updating
    userRepository.update(user);
  }

  public void deleteUser(SrpUser user) {
    userRepository.delete(user);
  }
}
