package com.itdr.dao;

import com.itdr.pojo.Product;
import com.itdr.utils.PoolUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ProductDao {
    //查询所有产品
    public List<Product> selectAll() {
        QueryRunner qr = new QueryRunner(PoolUtil.getCom());
        String sql = "select * from product";
        List<Product>li = null;
        try {
            li = qr.query(sql,new BeanListHandler<Product>(Product.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li;
    }
//查询一个产品
    public Product selectOne(Integer pid) {
        QueryRunner qr = new QueryRunner(PoolUtil.getCom());
        String sql = "select * from product where id = ? ";
        Product p = null;
        try {
            p = qr.query(sql, new BeanHandler<Product>(Product.class),pid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }
    //根据ID下架上架产品
    public int updateByOrder(Integer pid,Integer statu) {
        QueryRunner qr = new QueryRunner(PoolUtil.getCom());
        String sql = null;
        if (statu == 0){
            sql = "update product set status = 0 where id = ?";
        }
        if (statu == 1){
            sql = "update product set status = 1 where id = ?";
        }
        int row = 0;
        try {
            row = qr.update(sql,pid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }
}
