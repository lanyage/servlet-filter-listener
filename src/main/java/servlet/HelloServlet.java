package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;


public class HelloServlet extends HttpServlet {


    /**
     * 所有的请求会先经过该方法
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    /**
     * service会将Get请求发送到这里
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        resp.getWriter().println("<ul><li>HelloServlet Invoked.</li></ul>");
    }

    /**
     * service会将Post请求发送到这里
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        resp.getWriter().println("<ol><li>HelloServlet Invoked.</li></ol>");
    }
}
