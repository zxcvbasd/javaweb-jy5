package com.itdr.dao;

import com.itdr.pojo.Order;
import com.itdr.utils.PoolUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class OrderDao {
    //查询所有订单
    public List<Order> selectAll() {
        QueryRunner qr = new QueryRunner(PoolUtil.getCom());
        String sql = "select * from orders";
        List<Order>li = null;
        try {
            li = qr.query(sql, new BeanListHandler<Order>(Order.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li;
    }

    //查询一个订单
    public Order selectOne(String pid, String pname) {

        QueryRunner qr = new QueryRunner(PoolUtil.getCom());
        String sql = "select * from orders where orderno = ?";
        Order p = null;
        try {
            p = qr.query(sql, new BeanHandler<Order>(Order.class),pid,pname);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }
}
