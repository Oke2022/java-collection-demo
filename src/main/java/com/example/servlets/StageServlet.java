package com.example.servlets;

import com.example.models.Stage;
import com.example.models.Guitar;
import com.example.models.InstrumentFeatures;
import com.example.models.Piano;
import com.example.models.StageFeatures;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


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


        request.setAttribute("stage" , stage);
        RequestDispatcher dispatcher = request.getRequestDispatcher("stage.jsp");
        dispatcher.forward(request, response);
    }
}
