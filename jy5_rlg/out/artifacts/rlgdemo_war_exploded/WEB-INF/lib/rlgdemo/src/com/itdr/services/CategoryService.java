package com.itdr.services;

import com.itdr.common.ResponseCode;
import com.itdr.dao.CategoryDao;
import com.itdr.pojo.Category;

import java.util.List;

public class CategoryService {

    private CategoryDao cd = new CategoryDao();
//查询所有分类
    public ResponseCode getAll(String pageSize, String pageNum) {
        if (pageSize == null || pageSize.equals("")){
            pageSize = "10";
        }
        if (pageNum == null || pageNum.equals("")){
            pageNum = "1";
        }
        ResponseCode rs = null;
        List<Category> li = cd.selectAll();
        rs = ResponseCode.successRS(li);
        return rs;
    }
}
