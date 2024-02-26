package com.nt.service;

import com.nt.entity.StudentEntity;
import com.nt.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public StudentEntity getStudent(Integer id) {
        return studentMapper.getStudent(id);
    }

    public String deleteStdById(Integer sid) {
        return studentMapper.deleteById(sid) +" id has been deleted";
    }
}
