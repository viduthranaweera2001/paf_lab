package com.example.student.service;

import com.example.student.controller.request.StudentRequest;
import com.example.student.controller.response.StudentResponse;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    StudentRequest addStudent(StudentRequest studentRequest);
    Optional<StudentRequest> getStudent(Long id);
    List<StudentRequest> getStudents();
    Optional<StudentRequest> updateStudent(StudentRequest studentRequest,Long id);
    Optional<StudentRequest> update(StudentRequest studentRequest, Long id);
}
