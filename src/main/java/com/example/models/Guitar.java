package com.example.models;

public class Guitar {
    private InstrumentFeatures guitarFeatures;


    public Guitar (InstrumentFeatures guitarFeatures){
        this.guitarFeatures =guitarFeatures;
    }

    public InstrumentFeatures getGuitarFeatures() {
        return guitarFeatures;
    }

    public void setGuitarFeatures(InstrumentFeatures guitarFeatures) {
        this.guitarFeatures = guitarFeatures;
    }

    @Override
    public String toString() {
        return "com.example.models.Guitar{" +
                "guitarFeatures=" + guitarFeatures +
                '}';
    }
}