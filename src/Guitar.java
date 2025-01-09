public class Guitar {
    private InstrumentFeatures guitarFeatures;

//    Constructor

    public Guitar (InstrumentFeatures guitarFeatures){
        this.guitarFeatures =guitarFeatures;
    }

//    Setters and Getters

    public InstrumentFeatures getGuitarFeatures() {
        return guitarFeatures;
    }

    public void setGuitarFeatures(InstrumentFeatures guitarFeatures) {
        this.guitarFeatures = guitarFeatures;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "guitarFeatures=" + guitarFeatures +
                '}';
    }
}
