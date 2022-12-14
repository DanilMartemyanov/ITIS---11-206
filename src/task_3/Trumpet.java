package task_3;

public class Trumpet implements MusicalInstrument{
    private int diameterCm;

    public Trumpet(int diameter) {
        this.diameterCm = diameter;
    }

    public void play() {
        System.out.println("Ту-ту-ту-туууу");
    }
}
