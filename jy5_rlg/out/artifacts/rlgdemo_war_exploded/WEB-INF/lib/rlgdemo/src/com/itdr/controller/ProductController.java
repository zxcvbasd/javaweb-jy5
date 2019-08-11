package com.itdr.controller;

import com.itdr.common.ResponseCode;
import com.itdr.pojo.Users;
import com.itdr.services.ProductService;
import com.itdr.utils.JsonUtils;
import com.itdr.utils.PathUTil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/manage/product/*")
public class ProductController extends HttpServlet {
    private ProductService ps = new ProductService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pathInfo = request.getPathInfo();
        String path = PathUTil.getPath(pathInfo);
        ResponseCode rs = null;
//判断请求
        switch (path) {
            case "list":
                rs = getAll(request, response);
                break;
            case "updateOrder":
                rs = groundingDo(request);
                break;
        }
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().println(JsonUtils.obj2String(rs));
//        response.getWriter().write(rs.toString());
    }

    //查询所有商品
    private ResponseCode getAll(HttpServletRequest request, HttpServletResponse response) {
        //调用业务层
        String pageSize = request.getParameter("pageSize");
        String pageNum = request.getParameter("pageNum");
//        String Id = request.getParameter("Id");
        ResponseCode rs = ps.getAll(pageSize, pageNum);

        request.setAttribute("pli", rs);
//        try {
//            request.getRequestDispatcher("/WEB-INF/productlist.jsp").forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return rs;
    }
    //产品上下架
    private ResponseCode groundingDo(HttpServletRequest request) {
//获取参数
        String id = request.getParameter("id");
        String status = request.getParameter("status");
        ResponseCode rs = ps.selectOne(id,status);
        //调用业务层处理业务
        return rs;
    }
}

