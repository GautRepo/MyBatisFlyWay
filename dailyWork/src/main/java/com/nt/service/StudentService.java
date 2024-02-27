package com.nt.service;

import com.nt.entity.StudentEntity;
import com.nt.mapper.StudentMapper;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@CacheConfig(cacheNames = "student")
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @CachePut(key = "#studentEntity.sid"/*,cacheNames = "student"*/)
    public Integer saveStudent(StudentEntity studentEntity){
        log.info("******call went to db*******");
       return studentMapper.saveStudent(studentEntity);
    }


    @Cacheable/*(cacheNames = "student")*/
    public List<StudentEntity> getAllStudent() {
        log.info("******call went to db*******");
        return studentMapper.getAllStudent();
    }

    @Cacheable(key="#id")
    public StudentEntity getStudent(Integer id) {
        log.info("******call went to db*******");
        return studentMapper.getStudent(id);
    }

    @CacheEvict(key = "#sid")
    public String deleteStdById(Integer sid) {
        log.info("******call went to db*******");
        return studentMapper.deleteById(sid) +" row has been deleted";
    }

    /*@PostConstruct
    public void initDB(){
        IntStream.rangeClosed(4,1000)
                .mapToObj(i-> new StudentEntity().toBuilder().sid(i).sname("abc"+i).sadd("Patna-"+i).sfee(i*10).build())
                .forEach(s -> studentMapper.saveStudent(s));
    }*/
}
