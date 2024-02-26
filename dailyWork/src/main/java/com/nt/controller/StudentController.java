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

    @GetMapping("/getStd/{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable Integer id){
        return new ResponseEntity<>(service.getStudent(id),HttpStatus.ACCEPTED);
    }

    @PutMapping("/updateStd")
    public ResponseEntity<Integer> updateStudent(@RequestBody StudentEntity studentEntity){
        return new ResponseEntity<>(service.saveStudent(studentEntity),HttpStatus.OK);
    }

    @DeleteMapping("/deleteStd")
    public ResponseEntity<String> deleteStd(@RequestParam("sid") Integer sid){
        return new ResponseEntity<>(service.deleteStdById(sid),HttpStatus.GONE);
    }
}
