package iterator;

public class Track {
    private String name;
    private double duration;

    public Track(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public void playTrack(){
        System.out.println("Track with name "+ name+" duration "+ duration);
    }

}
