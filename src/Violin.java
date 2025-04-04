public class Violin extends MusicalInstrument {
    String owner;
    int age;
    boolean isTuned;

    public Violin(int weight, String tradeMark, String owner, int age, boolean isTuned) {
        super(weight, tradeMark);
        this.owner = owner;
        this.age = age;
        this.isTuned = isTuned;
    }

    @Override
    public void work() {
        System.out.println("Die Geige ertönt.");
    }

    @Deprecated
    public void violinTuning () {
        System.out.println("Ich stimme die erste Saite...");
        System.out.println("Ich stimme die zweite Saite...");
        System.out.println("Ich stimme die dritte Saite...");
        System.out.println("Ich stimme die vierte Saite...");
    }


    public void violinPlaying() {
        
    }
}