package org.dmj.sch.service;

import org.dmj.sch.mapper.OrderMapper;
import org.dmj.sch.mapper.pojo.OrderMes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by LST on 2018-08-16.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrderMes> loadOrderMes(Map<String,String> map) {
        return orderMapper.loadOrderInfo(map);
    }
}
