package com.mazid.Spring_Data_JPA.Entity;

<<<<<<< HEAD
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
=======
import jakarta.persistence.*;
>>>>>>> 8d331ba (Configer application.proparty and add a entity Student)
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
<<<<<<< HEAD
=======
  @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
>>>>>>> 8d331ba (Configer application.proparty and add a entity Student)
  private Long studentId;
  private String firstName;
  private String lastName;
  private String email;
  private String guardianName;
  private String guardianEmail;
  private String guardianPhone;
}
