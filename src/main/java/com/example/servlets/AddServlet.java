package com.example.servlets;

import java.lang.Integer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AddServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       int i = Integer.parseInt(request.getParameter("num1"));
       int j = Integer.parseInt(request.getParameter("num2"));
       int k = i + j;

       request.setAttribute("k", k);
        RequestDispatcher redirectToSquare = request.getRequestDispatcher("sq");
        redirectToSquare.forward(request, response);



        response.getWriter().println("The result is " + k);

    }
}
