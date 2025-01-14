package com.example.servlets;

import com.example.models.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


public class StageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Piano Yamaha = new Piano(new InstrumentFeatures("Yamaha", "Black", 5));
        Guitar Gibson = new Guitar(new InstrumentFeatures("Gibson", "Cream", 2, 4, 23));

        Piano Nord = new Piano(new InstrumentFeatures("Nord", "Red", 6));
        Guitar Fender = new Guitar(new InstrumentFeatures("Fender", "Wine", 2, 2, 24));

        StageFeatures myStageFeatures = new StageFeatures();
        myStageFeatures.addPiano(Yamaha);
        myStageFeatures.addGuitar(Gibson);
        myStageFeatures.addPiano(Nord);
        myStageFeatures.addGuitar(Fender);

        Stage stage = new Stage(myStageFeatures);


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1> Stage Object</h1> <prev>" + stage + "</body></html>");
    }
}
