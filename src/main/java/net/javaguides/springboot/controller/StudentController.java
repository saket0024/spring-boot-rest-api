package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    @GetMapping("/student")
    public Student getStudent() {

        Student student = new Student(1, "Saket", "Ranjan");

        return student;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Shayam", "Rai"));
        students.add(new Student(2, "Ram", "Ji"));
        students.add(new Student(3, "Heera", "Moti"));
        return students;
    }


    //spring boot rest api with @pathvariable

    @GetMapping("/students/{id}/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("firstName") String studentFirstName,
                                       @PathVariable("lastName") String studentLastName) {
        return new Student(studentId, studentFirstName, studentLastName);
    }

    //QueryParam using @RequestParam
    //http://localhost:8080/students/query?id=1&firstName=Radha&lastName=Krishna

    @GetMapping("/students/query")
    public Student studentRequestVariable(@RequestParam int id, @RequestParam String firstName, @RequestParam String lastName) {
        return new Student(id, firstName, lastName);
    }


}

