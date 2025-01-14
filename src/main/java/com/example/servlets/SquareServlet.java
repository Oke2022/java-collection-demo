package com.example.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       int sum = (int) request.getAttribute("sum");

       sum = sum * sum;

       request.setAttribute("square of the sum " , sum);
       RequestDispatcher dispatcher = request.getRequestDispatcher("square.jsp");
       dispatcher.forward(request, response );


       response.getWriter().println("The square of the sum of the two numbers is " + sum);
    }
}
