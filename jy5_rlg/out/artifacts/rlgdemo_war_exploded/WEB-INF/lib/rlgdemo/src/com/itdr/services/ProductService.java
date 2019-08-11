package com.itdr.services;

import com.itdr.common.Const;
import com.itdr.common.ResponseCode;
import com.itdr.dao.ProductDao;
import com.itdr.pojo.Product;

import java.util.List;

public class ProductService {
    private ProductDao pd = new ProductDao();
//查询所有商品
    public ResponseCode getAll(String pageSize, String pageNum) {
        if (pageSize == null || pageSize.equals("")){
            pageSize = "10";
        }
        if (pageNum == null || pageNum.equals("")){
            pageNum = "1";
        }


        List<Product> li = pd.selectAll();
//        rs = ResponseCode.successRS(li);
        ResponseCode rs=new ResponseCode();
        rs.setStatus(0);
        rs.setDate(li);

//        if (Id == null || Id.equals("")){
//            rs.setStatus(3);//3代表该参数不能为空
//            rs.setMag("该参数不能为空，请重新输入");
//            return rs;
//        }
        return rs;
    }

    //产品上下架
    public ResponseCode selectOne(String pids, String status) {
        ResponseCode rs = new ResponseCode();
        if (pids == null || pids.equals("") || status == null || status.equals("")) {
            rs.setStatus(Const.USER_PARAMETER_CODE);
            rs.setMag(Const.USER_PARAMETER_MSG);
//            rs = ResponseCode.defeatedRS(Const.USER_PARAMETER_CODE, Const.USER_PARAMETER_MSG);
            return rs;
        }
        Integer pidi = null;
        Integer statu = null;
        try {
            pidi = Integer.parseInt(pids);
            statu = Integer.parseInt(status);
        } catch (Exception e) {
            rs.setStatus(105);
            rs.setMag("非法参数");
            return rs;
        }
        //查询是否有这样产品
        Product u = pd.selectOne(pidi);
        if (u == null){
            rs.setStatus(Const.USER_NO_CODE);
            rs.setDate(Const.USER_NO_MSG);
            return rs;
        }
        int row = pd.updateByOrder(pidi,statu);
        if (row <= 0){
            rs.setStatus(106);
            rs.setMag("操作失败");
            return rs;
        }
        rs.setStatus(0);
        rs.setDate(row);
        return rs;
    }
}
