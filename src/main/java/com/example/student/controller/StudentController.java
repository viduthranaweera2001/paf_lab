package com.example.student.controller;

import com.example.student.controller.request.StudentRequest;
import com.example.student.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
//@Setter
@RestController
public class StudentController {
//    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/students",headers = "version=v1")
    public StudentRequest addStudents(@RequestBody StudentRequest studentRequest){
        return studentService.addStudent(studentRequest);
    }

    @GetMapping(value = "/students/{id}",headers = "version=v1")
    public Optional<StudentRequest> getStudent(@PathVariable Long id){
        return studentService.getStudent(id);
    }
    @GetMapping(value = "/students",headers = "version=v1")
    public List<StudentRequest> getStudents(){
        return studentService.getStudents();
    }
    @PutMapping(value = "/student/{id}",headers = "version=v1")
    public Optional<StudentRequest> updateStudent(@RequestBody StudentRequest studentRequest, @PathVariable Long id){
        return studentService.updateStudent(studentRequest,id);
    }
    @PatchMapping("/student/{id}")
    public Optional<StudentRequest> update(@RequestBody StudentRequest student, @PathVariable Long id){
        return studentService.update(student,id);
    }

}
