package com.learn.sms.controller;

import com.learn.sms.entity.Student;
import com.learn.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("std",service.getAllStudents());
        return "students";
    }

    @GetMapping("/student/new")
    public String createStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){

        service.saveStudent(student);

        return "redirect:/students";

    }

    @GetMapping("/student/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student",service.getStudentByID(id));
        return "edit_students";
    }

    @PutMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student,Model model){
        Student existingStudent = service.getStudentByID(id);
        existingStudent.setId(id);
        existingStudent.setFirstname(student.getFirstname());
        existingStudent.setLastname(student.getLastname());
        existingStudent.setEmail(student.getEmail());
        service.updateStudent(existingStudent);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        service.deleteStudentByID(id);
        return "redirect:/students";
    }

}
