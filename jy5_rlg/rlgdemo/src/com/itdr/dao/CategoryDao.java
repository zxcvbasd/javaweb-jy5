package com.itdr.dao;

import com.itdr.pojo.Category;
import com.itdr.utils.PoolUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CategoryDao {
    public List<Category> selectAll() {
        QueryRunner qr = new QueryRunner(PoolUtil.getCom());
        String sql = "select * from category";
        List<Category>li = null;
        try {
            li = qr.query(sql,new BeanListHandler<Category>(Category.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li;
    }

}
