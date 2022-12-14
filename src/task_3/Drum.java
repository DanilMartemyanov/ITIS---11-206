package task_3;

public class Drum implements MusicalInstrument{
    private int sizeCm;

    public Drum(int size) {
        this.sizeCm = size;
    }

    public void play(){
        System.out.println("Бам-бам-ба-бам");
    }
}
