package com.mazid.Spring_Data_JPA.repository;

import com.mazid.Spring_Data_JPA.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
