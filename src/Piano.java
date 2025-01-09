public class Piano implements InstrumentInterface{
    private InstrumentFeatures pianoFeatures;


    public Piano(InstrumentFeatures pianoFeatures) {
        this.pianoFeatures = pianoFeatures;
    }

    @Override
    public void isPlaying() {
        System.out.println
                ("The " + pianoFeatures.getColor() + " " + pianoFeatures.getModel() + " is on.");
    }

    @Override
    public String getFeatures() {
        return "This is a " + pianoFeatures.getColor() + " " + pianoFeatures.getModel() + " with " + pianoFeatures.getOctave() ;
    }


    @Override
    public String toString() {
        return "Piano{" +
                "pianoFeatures=" + pianoFeatures +
                '}';
    }
}

