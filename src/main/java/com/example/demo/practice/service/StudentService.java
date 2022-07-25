package com.example.demo.practice.service;

import com.example.demo.practice.dao.StudentDAO;
import com.example.demo.practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDAO dao;

    public List<Student> getStudents() {
        try {
            return dao.getStudentsFromDB();
        } catch (IOException e) {

        }
        return new ArrayList<>();
    }

    public Boolean saveStudent(Student student) {
        return true;
    }
}
