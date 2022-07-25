package com.example.demo.practice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@JsonIgnoreProperties
public class Student implements Serializable {
    private String firstName;
    private String lastName;
    private String studentId;
    private String email;
    private String dateOfBirth;
    private String admissionDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(studentId, student.studentId) && Objects.equals(email, student.email) && Objects.equals(dateOfBirth, student.dateOfBirth) && Objects.equals(admissionDate, student.admissionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, studentId, email, dateOfBirth, admissionDate);
    }
}
