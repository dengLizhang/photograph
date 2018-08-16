package org.dmj.sch.service;

import org.dmj.sch.mapper.pojo.OrderMes;

import java.util.List;
import java.util.Map;

/**
 * Created by LST on 2018-08-16.
 */
public interface OrderService {
    public List<OrderMes> loadOrderMes(Map<String,String> map);
}
