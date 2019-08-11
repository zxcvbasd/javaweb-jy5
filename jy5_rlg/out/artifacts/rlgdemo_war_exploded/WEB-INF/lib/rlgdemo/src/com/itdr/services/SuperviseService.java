package com.itdr.services;

import com.itdr.common.ResponseCode;
import com.itdr.dao.SuperviseDao;
import com.itdr.pojo.Supervise;

import java.util.List;

public class SuperviseService {
    private SuperviseDao pd = new SuperviseDao();
    //查询所有管理员
    public ResponseCode getAll(String pageSize, String pageNum) {
        if (pageSize == null || pageSize.equals("")){
            pageSize = "10";
        }
        if (pageNum == null || pageNum.equals("")){
            pageNum = "1";
        }

        ResponseCode rs = null;
        List<Supervise> li = pd.selectAll();
        rs = ResponseCode.successRS(li);
        return rs;
    }
}
