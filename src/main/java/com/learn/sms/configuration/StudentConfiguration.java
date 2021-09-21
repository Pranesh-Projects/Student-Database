//package com.learn.sms.configuration;
//
//import com.learn.sms.entity.Student;
//import com.learn.sms.repository.StudentRepository;
//import java.util.List;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import java.util.Arrays;
//
//@Configuration
//public class StudentConfiguration {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        Student student1 = new Student("deva", "prakash", "deva@gmail.com");
//        Student student2 = new Student("ganesh", "kavin", "ganesh@gmail.com");
//        Student student3 = new Student("prabhu", "prakash", "prabhu@gmail.com");
//        return args -> {
//            repository.saveAll(Arrays.asList(student1, student2, student3));
//        };
//    }
//}
