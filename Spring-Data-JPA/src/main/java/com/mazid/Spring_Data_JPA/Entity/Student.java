package com.mazid.Spring_Data_JPA.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "tblStudent",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "emailId_unique",
                        columnNames = "email_address"
                )
        }
)
public class Student {

  @Id
  @SequenceGenerator(
          name = "student_sequence",
          sequenceName = "student_sequence",
          allocationSize = 1
  )
  @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "student_sequence"
  )
  private Long studentId;
  private String firstName;
  private String lastName;
  @Column(
          name = "email_address",
          nullable = false
  )
  private String emailId;
  private String guardianName;
  private String guardianEmail;
  private String guardianPhone;
}
