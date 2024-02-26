package com.nt.controller;

import com.nt.entity.StudentEntity;
import com.nt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;


    @PostMapping("/saveStudent")
    public ResponseEntity<Integer> saveStudent(@RequestBody StudentEntity studentEntity){
        return new ResponseEntity<>(service.saveStudent(studentEntity), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<StudentEntity>> getAllStudents(){
        return new ResponseEntity<>(service.getAllStudent(),HttpStatus.ACCEPTED);
    }
}
