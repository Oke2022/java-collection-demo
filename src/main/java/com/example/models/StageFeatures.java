package com.example.models;

import java.util.ArrayList;

public class StageFeatures {

        private ArrayList<Piano> pianoList;
        private ArrayList<Guitar> guitarList;


        public StageFeatures() {
            this.pianoList = new ArrayList<>();
            this.guitarList = new ArrayList<>();
        }



        public void addPiano(Piano piano) {
            pianoList.add(piano);
        }

        public void addGuitar(Guitar guitar) {
            guitarList.add(guitar);
        }

        public void removePiano(Piano piano) {
            pianoList.remove(piano);
        }

        public void removeGuitar(Guitar guitar) {
            guitarList.remove(guitar);
        }

    public void setPianoList(ArrayList<Piano> pianoList) {
        this.pianoList = pianoList;
    }

    public void setGuitarList(ArrayList<Guitar> guitarList) {
        this.guitarList = guitarList;
    }

    public ArrayList<Piano> getPianoList() {
            return pianoList;
        }

        public ArrayList<Guitar> getGuitarList() {
            return guitarList;
        }



        @Override
        public String toString() {
            return "StageFeatures{" +
                    "pianos=" + pianoList +
                    ", guitars=" + guitarList +
                    '}';
        }

}
