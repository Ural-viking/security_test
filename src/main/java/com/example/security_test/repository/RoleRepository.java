package com.example.security_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.security_test.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
