package task_3;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        Drum drum = new Drum(80);
        Trumpet trumpet = new Trumpet(20);
        MusicalInstrument[] instrumnets = {guitar,drum,trumpet};
        for(int i = 0 ; i<instrumnets.length;i++){
            instrumnets[i].play();
        }
    }
}
