package com.example.demo.practice.service;

import com.example.demo.practice.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getSutdents() {
        return new ArrayList<>();
    }

    public Boolean saveSutdent(Student student) {
        return true;
    }
}
