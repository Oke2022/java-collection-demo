import java.util.ArrayList;

public class StageFeatures {

//    private ArrayList<Piano> morePiano;
//    private ArrayList<Guitar> moreGuitar;
//
//    public StageFeatures() {
//        this.morePiano = morePiano;
//        this.moreGuitar = moreGuitar;
//    }
//
//    //    Add Piano and Guitar to the stage
//
//    public void addInstrument (Piano piano, Guitar guitar){
//        morePiano.add(piano);
//        moreGuitar.add(guitar);
//
//    }
//    public void removeInstrument (Piano piano, Guitar guitar) {
//        morePiano.remove(piano);
//        moreGuitar.remove(guitar);
//    }
//
//    public ArrayList<Piano> getMorePiano() {
//        return morePiano;
//    }
//
//    public ArrayList<Guitar> getMoreGuitar() {
//        return moreGuitar;
//    }
//
//    @Override
//    public String toString() {
//        return "StageFeatures{" +
//                "pianos=" + morePiano +
//                ", guitars=" + moreGuitar +
//                '}';
//    }
//



        private ArrayList<Piano> morePiano;
        private ArrayList<Guitar> moreGuitar;

        // Constructor
        public StageFeatures() {
            this.morePiano = new ArrayList<>(); // Initialize the list for Pianos
            this.moreGuitar = new ArrayList<>(); // Initialize the list for Guitars
        }

        // Add a single Piano to the stage
        public void addPiano(Piano piano) {
            morePiano.add(piano);
        }

        // Add a single Guitar to the stage
        public void addGuitar(Guitar guitar) {
            moreGuitar.add(guitar);
        }

        // Remove a single Piano from the stage
        public void removePiano(Piano piano) {
            morePiano.remove(piano);
        }

        // Remove a single Guitar from the stage
        public void removeGuitar(Guitar guitar) {
            moreGuitar.remove(guitar);
        }

        // Get all Pianos
        public ArrayList<Piano> getMorePiano() {
            return morePiano;
        }

        // Get all Guitars
        public ArrayList<Guitar> getMoreGuitar() {
            return moreGuitar;
        }

        @Override
        public String toString() {
            return "StageFeatures{" +
                    "pianos=" + morePiano +
                    ", guitars=" + moreGuitar +
                    '}';
        }




    //    private Piano piano;
//    private Guitar guitar;
//
//
////  Constructor
//
//    public StageFeatures(Piano piano, Guitar guitar) {
//        this.piano = piano;
//        this.guitar =guitar;
//    }
//
//
////    Setters and Getters
//
//
//    public Piano getPiano() {
//        return piano;
//    }
//
//    public void setPiano(Piano piano) {
//        this.piano = piano;
//    }
//
//    public Guitar getGuitar() {
//        return guitar;
//    }
//
//    public void setGuitar(Guitar guitar) {
//        this.guitar = guitar;
//    }
//
//    @Override
//    public String toString() {
//        return "StageFeatures{" +
//                "piano=" + piano +
//                ", guitar=" + guitar +
//                '}';
//    }
}
