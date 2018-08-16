package org.dmj.sch.controller;

import org.dmj.sch.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by ZWS on 2018-08-16.
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/loadOrderInfo")
    public Object loadOrder(Map<String,String> map){
        return orderService.loadOrderMes(map);
    }
}
