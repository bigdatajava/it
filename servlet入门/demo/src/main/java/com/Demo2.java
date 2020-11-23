package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Demo2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        HttpSession httpSession = req.getSession(true);
        String name = req.getParameter("name");
        System.out.println("demo2...");
        if ("demo1".equalsIgnoreCase(name)){
            httpSession.setAttribute("name",name);
            resp.sendRedirect(req.getContextPath()+"/demo1.html");
        }else{
            resp.sendRedirect(req.getContextPath()+"/index.html");
        }
    }
}
