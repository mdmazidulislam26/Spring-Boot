package com.mazid.spring_security_client.ropository;

import com.mazid.spring_security_client.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends jpaRepository<User , Long >{};