package com.learn.sms.service;

import com.learn.sms.entity.Student;

import java.util.List;

public interface StudentService{

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentByID(Long id);

    Student updateStudent(Student student);

    void deleteStudentByID(Long id);

}