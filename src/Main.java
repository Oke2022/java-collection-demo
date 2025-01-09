import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
//        System.out.println(myStageFeatures);

    Stage stage = new Stage();
    stage.setStage(myStageFeatures);


//    ArrayList<Stage> stage= new ArrayList<>();
//    stage.add(new Stage(new StageFeatures(Yamaha, Gibson)));
//    stage.add(new Stage(new StageFeatures(Nord, Fender)));



//      ArrayList<StageFeatures> setStage = new ArrayList<>();
//      setStage.add(new StageFeatures(new Piano(new InstrumentFeatures("Yamaha", "Black", 5)), new Guitar(new InstrumentFeatures("Gibson", "Cream" , 2 , 4, 23))));
//      setStage.add(new StageFeatures(new Piano(new InstrumentFeatures("Nord", "Red", 6)), new Guitar(new InstrumentFeatures("Fender", "Wine" , 2 , 2, 24 ))));


//        System.out.println(setStage);
    }
}
