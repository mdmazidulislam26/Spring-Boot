package com.mazid.Spring_Data_JPA.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.mazid.Spring_Data_JPA.Entity.Guardian;
import com.mazid.Spring_Data_JPA.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

@SpringBootTest
//@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;
    @Test
    @Commit
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("abcd@gmail.com")
                .firstName("ab")
                .lastName("cd")
//                .guardianName("xyz")
//                .guardianEmail("xyz@gmail")
//                .guardianPhone("1234567890")
                .build();
//        Student student1 = new Student();
//        student1.setFirstName("abc");
//        student1.setLastName("xyz");
//        student1.setEmailId("abc@gmail");
//        student1.setGuardianName("xyz");
//        student1.setGuardianEmail("xyz@gmail");
//        student1.setGuardianPhone("1234567890");

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .name("xyz")
                .email("xyz@gmail")
                .mobile("1234567890")
                .build();

        Student student = Student.builder()
                .emailId("abcd@gmail.com")
                .firstName("ab")
                .lastName("cd")
                .guardian(guardian)
                .build();
        studentRepository.save(student);
    }

    @Test
    public void printAllStudents() {
        studentRepository.findAll().forEach(System.out::println);
    }
}