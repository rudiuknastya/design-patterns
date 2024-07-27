package iterator;

import java.util.List;

public class StraightIterator implements Iterator {
    private List<Track> tracks;
    private int currentTrack = 0;

    public StraightIterator(List<Track> tracks) {
        this.tracks = tracks;
    }

    @Override
    public boolean hasNext() {
        if (currentTrack >= tracks.size() || tracks.get(currentTrack) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Track next() {
        Track track = tracks.get(currentTrack);
        currentTrack++;
        return track;
    }
}
