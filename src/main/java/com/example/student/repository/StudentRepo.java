package com.example.student.repository;

import com.example.student.controller.request.StudentRequest;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository <StudentRequest,Long> {
}
