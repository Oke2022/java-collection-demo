package com.example.servlets;

import com.example.models.Stage;
import com.example.models.Guitar;
import com.example.models.InstrumentFeatures;
import com.example.models.Piano;
import com.example.models.StageFeatures;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet("/")

public class StageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        InstrumentFeatures yamahaFeatures = new InstrumentFeatures("Yamaha", "Black", 5);
        InstrumentFeatures nordFeatures = new InstrumentFeatures("Nord", "Red", 6);
        InstrumentFeatures korgFeatures = new InstrumentFeatures("Korg", "Gray", 4);

        Piano Yamaha = new Piano(yamahaFeatures);
        Piano Nord = new Piano(nordFeatures);
        Piano Korg = new Piano(korgFeatures);

        ArrayList<Piano>pianos = new ArrayList<>();
        pianos.add(Yamaha);
        pianos.add(Nord);
        pianos.add(Korg);


        InstrumentFeatures gibsonFeatures = new InstrumentFeatures("Gibson", "Cream", 2, 4, 23);
        InstrumentFeatures fenderFeatures = new InstrumentFeatures("Fender", "Wine", 2, 2, 24);
        InstrumentFeatures gretchFeatures = new InstrumentFeatures("Gretch", "Orange", 2, 5, 22);

        Guitar Gibson = new Guitar(gibsonFeatures);
        Guitar Fender = new Guitar(fenderFeatures);
        Guitar Gretch = new Guitar(gretchFeatures);

        ArrayList<Guitar> guitars = new ArrayList<>();
        guitars.add(Gibson);
        guitars.add(Fender);
        guitars.add(Gretch);


        StageFeatures myStageFeatures = new StageFeatures();
        myStageFeatures.setPianoList(pianos);
        myStageFeatures.setGuitarList(guitars);

        Stage stage = new Stage();
        stage.setStage(myStageFeatures);


        request.setAttribute("stagefeatures" , myStageFeatures);
        request.setAttribute("piano" , pianos);
        request.setAttribute("guitar" , guitars);
        RequestDispatcher dispatcher = request.getRequestDispatcher("stage.jsp");
        dispatcher.forward(request, response);
    }
}
