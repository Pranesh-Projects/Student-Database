package com.learn.sms.service.impl;

import com.learn.sms.entity.Student;
import com.learn.sms.repository.StudentRepository;
import com.learn.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.repository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student getStudentByID(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudentByID(Long id) {
        repository.deleteById(id);
    }


}