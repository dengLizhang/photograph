package org.dmj.sch.mapper.pojo;

import lombok.Data;

/**
 * Created by 56821 on 2018/8/13.
 */
@Data
public class User {
    private int id;
    private String name;
    private String desc;
    private String img;
    private String phone;
    private String password;
    private String email;
    private String evaluate;
}

