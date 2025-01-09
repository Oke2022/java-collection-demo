import java.util.ArrayList;

public class Stage {

    private StageFeatures mySetUp;


//    Constructor

    public  Stage (){
        this.mySetUp = mySetUp;
    }


//    Getter

    public void setStage(StageFeatures mySetUp) {
        this.mySetUp = mySetUp;
        System.out.println(mySetUp);
    }

//    toString


    @Override
    public String toString() {
        return "Stage{" +
                "stage=" + mySetUp +
                '}';
    }
}
