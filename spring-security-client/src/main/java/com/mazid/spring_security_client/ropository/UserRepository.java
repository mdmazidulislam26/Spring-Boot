package com.mazid.spring_security_client.ropository;

import com.mazid.spring_security_client.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {};