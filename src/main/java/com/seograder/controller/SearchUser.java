package com.seograder.controller;

import com.seograder.persistence.UserHibernateDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/searchUser"}
)

public class SearchUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserHibernateDao userData = new UserHibernateDao();

        req.setAttribute("users", userData.getAllUsers());

        if (req.getParameter("submit").equals("viewAll")){
            req.setAttribute("users", userData.getAllUsers());
        } else{
            req.setAttribute("users", userData.getAllUsers());
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}
