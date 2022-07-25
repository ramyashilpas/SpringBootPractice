package com.example.demo.practice.dao;

import com.example.demo.practice.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDAO {
    final Logger LOGGER = LoggerFactory.getLogger(getClass());

    public List<Student> getStudentsFromDB() throws IOException {
        List<Student> students = new ArrayList<>();

        Student student = Student.builder().studentId("585").admissionDate("06/06/2011").firstName("Ramya").lastName("Polisetty").email("testemail@gmail.com").dateOfBirth("02/02/1993").build();
        Student student1 = Student.builder().studentId("536").admissionDate("06/06/2006").firstName("Charan").lastName("Oggu").email("testemail1@gmail.com").dateOfBirth("02/02/1988").build();

        students.add(student);
        students.add(student1);

        /*Resource resource = new ClassPathResource("classpath:data.json");
        InputStream inputStream = resource.getInputStream();
        try {
            byte[] bdata = FileCopyUtils.copyToByteArray(inputStream);
            String data = new String(bdata, StandardCharsets.UTF_8);
            LOGGER.info(data);
            //students =
        } catch (IOException e) {
            LOGGER.error("IOException", e);
        }*/

        return students;
    }
}
