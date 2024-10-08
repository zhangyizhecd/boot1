package org.yizhe.boot1.controller;

import org.yizhe.boot1.Response;
import org.yizhe.boot1.dao.Student;
import org.yizhe.boot1.dto.StudentDTO;
import org.yizhe.boot1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Response<StudentDTO> getStudentById(@PathVariable long id) {
        return Response.newSuccess(studentService.getStudentById(id));
    }

    @GetMapping("/student")
    public Response<List<StudentDTO>> getStudentByAge(@RequestParam int maxAge, @RequestParam int minAge) {
        return Response.newSuccess(studentService.getStudentsByAges(maxAge, minAge));
    }


    @PostMapping("/student")
    public Response<Long> addNewStudent(@RequestBody StudentDTO studentDTO) {
        return Response.newSuccess(studentService.addNewStudent(studentDTO));
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable long id) {
        studentService.deleteStudentById(id);
    }

    @PutMapping("/student/{id}")
    public Response<StudentDTO> updateStudentById(@PathVariable long id, @RequestParam(required = false) String name,
                                                  @RequestParam(required = false) String email) {

        return Response.newSuccess(studentService.updateStudentById(id, name, email));
    }
}