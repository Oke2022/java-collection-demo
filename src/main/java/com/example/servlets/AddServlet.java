package com.example.servlets;

import java.lang.Integer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/addclass")
public class AddServlet extends HttpServlet {
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       int i = Integer.parseInt(request.getParameter("num1"));
       int j = Integer.parseInt(request.getParameter("num2"));
       int k = i + j;


        HttpSession session = request.getSession();
        session.setAttribute("k", k);

       response.sendRedirect("sqclass");

//       request.setAttribute("sum", k);
//        RequestDispatcher redirectToSquare = request.getRequestDispatcher("sqclass");
//        redirectToSquare.forward(request, response);



//        response.getWriter().println("The result is " + k);

    }
}
