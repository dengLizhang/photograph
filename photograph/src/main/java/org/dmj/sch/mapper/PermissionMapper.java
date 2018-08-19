package org.dmj.sch.mapper;

import org.dmj.sch.mapper.pojo.Permission;

import java.util.List;

/**
 * Created by 56821 on 2018/8/19.
 */
public interface PermissionMapper {
    public List<Permission> findAll();
    public List<Permission> findByAdminUserId(int userId);
}
