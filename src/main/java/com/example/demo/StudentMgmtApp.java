package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class StudentMgmtApp {

    @Autowired
    StudentRepository studentRepository;

    public void saveStudent(Student student){
        studentRepository.save(student);
    }
    public void saveStudentTmp(){
        Student student = new Student();
        student.setStudentNumber("000-61-0001");
        student.setFirstName("Anna");
        student.setMiddleName("Lynn");
        student.setLastName("Smith");
        student.setCgpa(3.45);
        student.setDateOfEnrollment(new Date("2019/05/24"));
        studentRepository.save(student);
    }
}
