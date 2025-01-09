public class InstrumentFeatures {
    private  String model;
    private String color;
    private int knobs;
    private int pickups;
    private int octave;
    private int fret;


//    Constructor for guitar class


    public InstrumentFeatures(String model, String color, int pickup, int knobs, int fret) {
        this.model = model;
        this.color = color;
        this.pickups = pickups;
        this.knobs = knobs;
        this.fret = fret;
    }


//    Constructor for piano class

    public InstrumentFeatures (String model, String color, int octave) {
        this.model = model;
        this.color = color;
        this.octave = octave;
    }


//    Setters and Getters


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKnobs() {
        return knobs;
    }

    public void setKnobs(int knobs) {
        this.knobs = knobs;
    }

    public int getPickups() {
        return pickups;
    }

    public void setPickups(int pickups) {
        this.pickups = pickups;
    }

    public int getOctave() {
        return octave;
    }

    public void setOctave(int octave) {
        this.octave = octave;
    }

    public int getFret() {
        return fret;
    }

    public void setFret(int fret) {
        this.fret = fret;
    }


//    toString method


    @Override
    public String toString() {
        return "InstrumentFeatures{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", knobs=" + knobs +
                ", pickups=" + pickups +
                ", octave=" + octave +
                ", fret=" + fret +
                '}';
    }
}
