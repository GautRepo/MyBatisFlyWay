package com.nt.service;

import com.nt.entity.StudentEntity;
import com.nt.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;


    public Integer saveStudent(StudentEntity studentEntity){
       return studentMapper.saveStudent(studentEntity);
    }

    public List<StudentEntity> getAllStudent() {
        return studentMapper.getAllStudent();
    }
}
