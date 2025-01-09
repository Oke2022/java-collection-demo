import java.util.ArrayList;

public class StageFeatures {

        private ArrayList<Piano> morePiano;
        private ArrayList<Guitar> moreGuitar;


        public StageFeatures() {
            this.morePiano = new ArrayList<>();
            this.moreGuitar = new ArrayList<>();
        }

        public void addPiano(Piano piano) {
            morePiano.add(piano);
        }

        public void addGuitar(Guitar guitar) {
            moreGuitar.add(guitar);
        }

        public void removePiano(Piano piano) {
            morePiano.remove(piano);
        }

        public void removeGuitar(Guitar guitar) {
            moreGuitar.remove(guitar);
        }

        public ArrayList<Piano> getMorePiano() {
            return morePiano;
        }

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
}
