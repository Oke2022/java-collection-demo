package com.example.models;

public class Stage {

    private StageFeatures stageFeatures;



    public  Stage (){
        this.stageFeatures = stageFeatures;
    }


    public void setStage(StageFeatures stageFeatures) {
        this.stageFeatures = stageFeatures;
    }

    public StageFeatures getStageFeatures() {
        return stageFeatures;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "stage=" + stageFeatures +
                '}';
    }
}
