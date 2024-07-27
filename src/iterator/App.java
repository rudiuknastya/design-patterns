package iterator;

public class App {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Track track1 = new Track("Ocean", 3.4);
        Track track2 = new Track("Moonlight", 1.2);
        Track track3 = new Track("Rose", 5.1);
        Track track4 = new Track("Baby", 2.32);
        playlist.addTrack(track1);
        playlist.addTrack(track2);
        playlist.addTrack(track3);
        playlist.addTrack(track4);
        Iterator straightIterator = playlist.straightIterator();
        while (straightIterator.hasNext()) {
            Track track = straightIterator.next();
            track.playTrack();
        }
        System.out.println();
        Iterator reverseIterator = playlist.reverseIterator();
        while (reverseIterator.hasNext()) {
            Track track = reverseIterator.next();
            track.playTrack();
        }
    }
}
