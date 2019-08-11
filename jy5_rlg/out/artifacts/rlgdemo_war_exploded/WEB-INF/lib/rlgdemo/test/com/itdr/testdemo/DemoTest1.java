package com.itdr.testdemo;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class DemoTest1 {
    @Test
    public void test1() throws Exception {
        ComboPooledDataSource co = new ComboPooledDataSource();
        Connection connection = co.getConnection();
        String sql = "select * from users";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(2));
        }
    }

    @Test
    public void test2() {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int a = r.nextInt(50);
            System.out.println(a);
        }
    }

    @Test
    public void test3() {
        String s = "/list.do";
        String s1 = s.replace(".", "/");
        System.out.println(s1);
        String[] sar = s1.split("/");
//        for (int i = 0; i < sar.length; i++) {
//            System.out.println(sar[i]);
//        }
        System.out.println(sar[1]);
    }

    @Test
    public void test4() throws Exception {
//        ComboPooledDataSource c = new ComboPooledDataSource();
//        Connection co = c.getConnection();
//        String s = "select * from users";
//        PreparedStatement ps = co.prepareStatement(s);
//        ResultSet rs = ps.executeQuery();
//        while (rs.next()){
//            System.out.println(rs.getString(2));
//        }
    }
}
