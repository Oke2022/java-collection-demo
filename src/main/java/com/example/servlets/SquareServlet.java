package com.example.servlets;

import java.io.IOException;
import java.lang.Integer;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/sqclass")
public class SquareServlet extends HttpServlet {
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HttpSession session = request.getSession();

        int sum = (int)session.getAttribute("k");


//       int sum = (int) request.getAttribute("sum");

       int square = sum * sum;

       request.setAttribute("square" , square);
       RequestDispatcher dispatcher = request.getRequestDispatcher("square.jsp");
       dispatcher.forward(request, response);


//       response.getWriter().println("The square of the sum of the two numbers is " + square);
    }
}
