package io.vitus.demoproject.controller;

import io.vitus.demoproject.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> allStudents = new ArrayList<>();

    @PostMapping("/register-student")
    public String registerStudent(@RequestBody Student student) {
        allStudents.add(student);
        return "Student added successfully";
    }

    @GetMapping("/get-all-students")
    public List<Student> getAllStudents() {
        return allStudents;
    }

    @GetMapping("/get-students-scores/{score}")
    public List<Student> getStudentsByScore(@PathVariable long score) {
        Student student1 = new Student("Emma", 1, "emma@gmail.com", 50);
        Student student2 = new Student("Ude", 2, "ude@gmail.com", 40);
        Student student3 = new Student("Loveth", 3, "lovey@gmail.com", 80);
        Student student4 = new Student("Livy", 4, "livy@gmail.com", 100);
        Student student5 = new Student("Lilly", 5, "lilly@gmail.com", 60);

        List<Student> studentList = new ArrayList<>();

        if (student1.getScore() > score) {
            studentList.add(student1);
        }
        if (student2.getScore() > score) {
            studentList.add(student2);
        }
        if (student3.getScore() > score) {
            studentList.add(student3);
        }
        if (student4.getScore() > score) {
            studentList.add(student4);
        }
        if (student5.getScore() > score) {
            studentList.add(student5);
        }

        return studentList;
    }
}
