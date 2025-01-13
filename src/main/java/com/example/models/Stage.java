package com.example.models;

public class Stage {

    private StageFeatures mySetUp;



    public  Stage (){
        this.mySetUp = mySetUp;
    }


    public void setStage(StageFeatures mySetUp) {
        this.mySetUp = mySetUp;
        System.out.println(mySetUp);
    }


    @Override
    public String toString() {
        return "Stage{" +
                "stage=" + mySetUp +
                '}';
    }
}
