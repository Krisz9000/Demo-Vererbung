public class MusicalInstrument {
    int weight;
    String tradeMark;

    public MusicalInstrument(int weight, String tradeMark) {
        this.weight = weight;
        this.tradeMark = tradeMark;
    }

    public void work() {
        System.out.println("Das Instrument spielt...");
    }
}