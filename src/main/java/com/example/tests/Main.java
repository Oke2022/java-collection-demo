package  com.example.tests;

import com.example.models.*;


public class Main {

    public static void main(String[] args) {

    Piano Yamaha = new Piano(new InstrumentFeatures("Yamaha", "Black", 5));
    Guitar Gibson = new Guitar(new InstrumentFeatures("Gibson", "Cream" , 2 , 4, 23));

    Piano Nord = new Piano(new InstrumentFeatures("Nord", "Red", 6));
    Guitar Fender = new Guitar(new InstrumentFeatures("Fender", "Wine" , 2 , 2, 24 ));

    StageFeatures myStageFeatures = new StageFeatures();
    myStageFeatures.addPiano(Yamaha);
    myStageFeatures.addGuitar(Gibson);
    myStageFeatures.addPiano(Nord);
    myStageFeatures.addGuitar(Fender);

    Stage stage = new Stage(myStageFeatures);
    stage.setStage(myStageFeatures);
    }
}
