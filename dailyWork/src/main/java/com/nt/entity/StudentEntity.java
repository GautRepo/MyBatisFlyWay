package com.nt.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class StudentEntity {

    private Integer sid;
    private String sname;
    private Integer sfee;
    private String sadd;

}
