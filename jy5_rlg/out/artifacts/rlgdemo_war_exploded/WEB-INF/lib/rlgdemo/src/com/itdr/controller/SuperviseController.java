package com.itdr.controller;

import com.itdr.common.ResponseCode;
import com.itdr.services.SuperviseService;
import com.itdr.utils.JsonUtils;
import com.itdr.utils.PathUTil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/manage/supervise/*")
public class SuperviseController extends HttpServlet {
    private SuperviseService cs = new SuperviseService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        String path = PathUTil.getPath(pathInfo);
        ResponseCode rs = null;
        switch (path) {
            case "list":
                rs = orderAll(request, response);
                break;
            case "b":

                break;
        }
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().println(JsonUtils.obj2String(rs));
//        response.getWriter().write(rs.toString());
    }
    private ResponseCode orderAll(HttpServletRequest request, HttpServletResponse response) {
        String pageSize = request.getParameter("pageSize");
        String pageNum = request.getParameter("pageNum");
        ResponseCode rs = cs.getAll(pageSize, pageNum);

        request.setAttribute("sli",rs);
        try {
            request.getRequestDispatcher("/WEB-INF/superviselist.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
