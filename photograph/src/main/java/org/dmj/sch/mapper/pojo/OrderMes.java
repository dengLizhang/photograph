package org.dmj.sch.mapper.pojo;

/**
 * Created by LST on 2018-08-16.
 */

import lombok.Data;

@Data
public class OrderMes {
    private int id;
    private String code;
    private String cId;
    private String type;
    private String userId;
    private String name;
    private double price;
}
