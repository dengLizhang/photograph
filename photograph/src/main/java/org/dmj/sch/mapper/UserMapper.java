package org.dmj.sch.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.dmj.sch.mapper.pojo.User;

import java.util.List;

/**
 * Created by 56821 on 2018/8/13.
 */
@Mapper
public interface UserMapper {
    List<User> loadUsers();
    User loadUserByName(@Param("username") String username);
}
