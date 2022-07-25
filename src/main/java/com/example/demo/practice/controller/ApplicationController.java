package com.example.demo.practice.controller;

import com.example.demo.practice.model.Student;
import com.example.demo.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "student")
public class ApplicationController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/application1")
    public String getApplication() {
        return "Hi I am Shilpa.I would like to master SpringBoot";
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        return new ResponseEntity(studentService.getStudents(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveStudent(@RequestBody Student student) {
        return new ResponseEntity(studentService.saveStudent(student), HttpStatus.OK);
    }
}
