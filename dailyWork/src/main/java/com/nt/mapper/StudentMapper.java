package com.nt.mapper;

import com.nt.entity.StudentEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


//@Mapper
public interface StudentMapper {

    /*@Insert("insert into student (sid,sname,sfee,sadd) values (#{sid}, #{sname}, #{sfee}, #{sadd})")*/
    Integer saveStudent(StudentEntity studentEntity);

    List<StudentEntity> getAllStudent();
}
