package com.nt;

import com.nt.entity.StudentEntity;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.nt.mapper")
//@MappedTypes(StudentEntity.class)
@EnableCaching
public class DailyWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyWorkApplication.class, args);
	}

}
