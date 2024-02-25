package com.example.student.service.impl;

import com.example.student.controller.request.StudentRequest;
import com.example.student.repository.StudentRepo;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImpl implements StudentService {
    @Autowired
    StudentRepo studentRepo;
    @Override
    public StudentRequest addStudent(StudentRequest studentRequest) {
        return studentRepo.save(studentRequest);
    }

    @Override
    public Optional<StudentRequest> getStudent(Long id) {
        return studentRepo.findById(id);
    }

    @Override
    public List<StudentRequest> getStudents(){
        return studentRepo.findAll();
    }

    @Override
    public Optional<StudentRequest> updateStudent(StudentRequest studentRequest,Long id){
        return studentRepo.findById(id)
                .map(newStudentRequest -> {
                    newStudentRequest.setName(studentRequest.getName());
                    newStudentRequest.setEmail(studentRequest.getEmail());
                    return studentRepo.save(newStudentRequest);
                });
    }

    @Override
    public Optional<StudentRequest> update(StudentRequest studentRequest, Long id) {
        return studentRepo.findById(id)
                .map(studentRequest1 -> {
                    studentRequest1.setName(studentRequest.getName());
                    studentRequest1.setEmail(studentRequest.getEmail());
                    return studentRepo.save(studentRequest1);
                });
    }

}
