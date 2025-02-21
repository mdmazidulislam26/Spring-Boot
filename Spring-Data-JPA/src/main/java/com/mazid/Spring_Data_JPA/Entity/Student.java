package com.mazid.Spring_Data_JPA.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

  @Id
  private Long studentId;
  private String firstName;
  private String lastName;
  private String email;
  private String guardianName;
  private String guardianEmail;
  private String guardianPhone;
}
