package iterator;

import java.util.List;

public class ReverseIterator implements Iterator{
    private List<Track> tracks;
    private int currentTrack;

    public ReverseIterator(List<Track> tracks) {
        this.tracks = tracks;
        this.currentTrack = tracks.size();
    }

    @Override
    public boolean hasNext() {
        if (currentTrack  == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Track next() {
        Track track = tracks.get(currentTrack-1);
        currentTrack--;
        return track;
    }
}
