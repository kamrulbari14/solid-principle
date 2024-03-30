package com.kamrul.solid.principle.srp.following;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SrpUser {

  private String username;
  private String password;
  private String email;
}
