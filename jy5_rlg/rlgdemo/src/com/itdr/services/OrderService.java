package com.itdr.services;

import com.itdr.common.ResponseCode;
import com.itdr.dao.OrderDao;
import com.itdr.pojo.Order;

import java.util.List;

public class OrderService {
    private OrderDao od = new OrderDao();
//查询所有订单
    public ResponseCode getAll(String pageSize, String pageNum) {
        if (pageSize == null || pageSize.equals("")){
            pageSize = "10";
        }
        if (pageNum == null || pageNum.equals("")){
            pageNum = "1";
        }
        ResponseCode rs = null;
        List<Order> li = od.selectAll();
        rs = ResponseCode.successRS(li);
        return rs;
    }
}

