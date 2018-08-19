package org.dmj.sch.mapper.pojo;

import lombok.Data;

/**
 * Created by 56821 on 2018/8/19.
 */
@Data
public class Permission {
    private int id;
    //权限名称
    private String name;

    //权限描述
    private String descritpion;

    //授权链接
    private String url;

    //父节点id
    private int pid;
}
