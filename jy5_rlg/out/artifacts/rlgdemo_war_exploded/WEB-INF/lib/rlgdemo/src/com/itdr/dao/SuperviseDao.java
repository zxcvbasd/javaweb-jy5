package com.itdr.dao;

import com.itdr.pojo.Product;
import com.itdr.pojo.Supervise;
import com.itdr.utils.PoolUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class SuperviseDao {
    public List<Supervise> selectAll() {
        QueryRunner qr = new QueryRunner(PoolUtil.getCom());
        String sql = "select * from supervise";
        List<Supervise>li = null;
        try {
            li = qr.query(sql,new BeanListHandler<Supervise>(Supervise.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li;
    }
}
