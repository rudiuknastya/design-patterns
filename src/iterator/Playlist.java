package iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Track> tracks = new ArrayList<>();
    public void addTrack(Track track){
            tracks.add(track);

    }
    public Iterator straightIterator(){
        return new StraightIterator(tracks);
    }
    public Iterator reverseIterator(){
        return new ReverseIterator(tracks);
    }

}
