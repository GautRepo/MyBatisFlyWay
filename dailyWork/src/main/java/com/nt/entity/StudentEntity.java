package com.nt.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {

    private Integer sid;
    private String sname;
    private Integer sfee;
    private String sadd;

}
