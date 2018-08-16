package org.dmj.sch.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dmj.sch.mapper.pojo.OrderMes;

import java.util.List;
import java.util.Map;

/**
 * Created by LST on 2018-08-16.
 */
@Mapper
public interface OrderMapper {
    // 查询订单信息
    public List<OrderMes> loadOrderInfo(Map<String,String> param);
}
