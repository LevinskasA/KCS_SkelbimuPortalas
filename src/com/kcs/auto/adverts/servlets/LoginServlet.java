package com.kcs.auto.adverts.servlets;

import com.kcs.auto.adverts.service.LoginService;
import com.kcs.auto.adverts.service.impl.LoginServiceImpl;
import com.kcs.auto.adverts.utils.SecurityUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Askew on 3/10/2017.
 */
@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("action", 1);
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String passwordHash = SecurityUtils.generateMD5(req.getParameter("password"));

        LoginService loginService = new LoginServiceImpl();
        boolean isLoginSuccessful = loginService.isUserHavePermissions(email, passwordHash);

        if (isLoginSuccessful) {
            req.setAttribute("message", "Login successful");

        } else {
            req.setAttribute("message", "Login unsuccessful");

        }

        req.getRequestDispatcher("login.jsp").forward(req, resp);

    }
}
