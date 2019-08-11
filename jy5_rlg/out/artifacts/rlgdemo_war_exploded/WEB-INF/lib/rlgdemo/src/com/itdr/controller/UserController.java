package com.itdr.controller;

import com.itdr.common.ResponseCode;
import com.itdr.pojo.Users;
import com.itdr.services.UserService;
import com.itdr.utils.JsonUtils;
import com.itdr.utils.PathUTil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/manage/user/*")
public class UserController extends HttpServlet {
    private UserService uc = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //怎么获取请求路径信息
        String pathInfo = request.getPathInfo();
        String path = PathUTil.getPath(pathInfo);
        ResponseCode rs = null;
//判断一下是什么样的请求
        switch (path) {
            case "list":
                rs = listDo(request,response);
//                listDo(request,response);
                break;
            case "login":
                rs = loginDo(request,response);
//                loginDo(request,response);
                break;
            case "disableuser":
                rs = disableuserDo(request);
                break;
            case "remove":
                rs = removeDo(request);
                break;
        }

        //返回响应数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().println(JsonUtils.obj2String(rs));
//        response.getWriter().write(rs.toString());
    }

    //获取所有用户列表的请求
    private ResponseCode listDo(HttpServletRequest request,HttpServletResponse response) {
        ResponseCode rs = new ResponseCode();

//        HttpSession session = request.getSession();
//        Users user = (Users) session.getAttribute("user");
//        if (user == null) {
//            rs.setStatus(3);
//            rs.setMag("请登录后操作！");
////            return rs;
//        }
//        if (user.getType() != 1) {
//            rs.setStatus(3);
//            rs.setMag("没有操作权限！");
////            return rs;
//        }
//获取参数
        String pageSize = request.getParameter("pageSize");
        String pageNum = request.getParameter("pageNum");

        rs = uc.selectAll(pageSize, pageNum);

//        request.setAttribute("uli",rs);
//        try {
//            request.getRequestDispatcher("/WEB-INF/userlist.jsp").forward(request,response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //调用业务层处理业务
        return rs;
    }
    //用户登录的请求
    private ResponseCode loginDo(HttpServletRequest request, HttpServletResponse response ){
        //获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ResponseCode rs = uc.selectOne(username, password);
        //获取session对象
        HttpSession session = request.getSession();
        session.setAttribute("user", rs.getDate());
        //调用业务层处理业务
        return rs;
//        response.sendRedirect("/home.jsp");
//        try {
//            request.getRequestDispatcher("/home.html").forward(request,response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
    }
    //禁用用户的请求
    private ResponseCode disableuserDo(HttpServletRequest request) {
//获取参数
       String uid = request.getParameter("uid");
       ResponseCode rs = uc.selectOne(uid);
        //调用业务层处理业务
       return rs;
    }
    //解除禁用用户的请求
    private ResponseCode removeDo(HttpServletRequest request) {
//获取参数
        String uid = request.getParameter("uid");
        ResponseCode rs = uc.updateOne(uid);
        //调用业务层处理业务
        return rs;
    }
    //根据用户id查看用户详情

    //根据用户id修改用户信息

}
