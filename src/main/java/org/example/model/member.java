package org.example.model;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Builder
@lombok.ToString

public class member {
  private int id;
  private String name;
  private String email;
  private String password;
  private String phone;
  private String address;


}
