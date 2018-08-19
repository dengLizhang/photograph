package org.dmj.sch;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by 56821 on 2018/8/19.
 */
public class TestMain {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        //加密"0"
        String encode = bCryptPasswordEncoder.encode("123");
        System.out.println(encode);


    }
}
