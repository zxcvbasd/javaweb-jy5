package shilian;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/shilian.do")
public class ShilianServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String a = "asd";
        String z = request.getParameter("123");
        if (z.equals(a)){
            response.sendRedirect("/huida.jsp");
        }else {
            response.sendRedirect("/shilian.jsp");
        }
    }
}
