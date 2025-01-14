package com.example.servlets;

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
       int k = (int) request.getAttribute("k");

       k = k * k;

       response.getWriter().println("The square of the sum of the two numbers is " + k);

    }
}
