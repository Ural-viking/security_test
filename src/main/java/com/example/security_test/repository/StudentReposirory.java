package com.example.security_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.security_test.entity.Student;

@Repository
public interface StudentReposirory extends JpaRepository<Student, Long> {

}
