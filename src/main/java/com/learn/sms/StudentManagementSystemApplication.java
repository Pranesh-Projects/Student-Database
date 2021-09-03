package com.learn.sms;

import com.learn.sms.entity.Student;
import com.learn.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

//    @Autowired
//    private StudentRepository repository;

//    @Override
//    public void run(String... args) throws Exception {

//        Student student1 = new Student("deva", "prakash", "deva@gmail.com");
//        repository.save(student1);
//        Student student2 = new Student("ganesh", "kavin", "ganesh@gmail.com");
//        repository.save(student2);
//        Student student3 = new Student("prabhu", "prakash", "prabhu@gmail.com");
//        repository.save(student3);
//    }

}
