package com.ubs.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println(" Initializing Servlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        System.out.println("Session Name: " + session.getId());
        session.setAttribute("name", "parthServlet");
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        String login = req.getParameter("login");
        String password = req.getParameter("password");
        System.out.println("login: " + login);
        System.out.println("Password: " + password);

        if (login.trim().equalsIgnoreCase("sachin") && password.trim().equalsIgnoreCase("sachin")) {
            printWriter.write("Sucessfully Logged in");
            session.setAttribute("validRequest", "Yes");
            req.getRequestDispatcher("/Validation.jsp").forward(req,resp);

        } else {
            printWriter.write("Please try again !!");
            session.setAttribute("validRequest", "No");
            req.getRequestDispatcher("/Validation.jsp").forward(req,resp);

        }

        printWriter.close();
    }

    @Override
    public void destroy() {
        System.out.println("Destorying the object");
    }
}
