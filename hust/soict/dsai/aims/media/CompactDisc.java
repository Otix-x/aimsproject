package aimsproject.hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    
    public String getArtist() {
        return artist;
    }

    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (tracks.size() < 10) {
            tracks.add(track);
            System.out.println("Track " + track.getTitle() + " added");
        } else {
            System.out.println("The CD is full");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track " + track.getTitle() + " removed");
        } else {
            System.out.println("Track " + track.getTitle() + " not found");
        }
    }

    public int getLength() {
        int length = 0;
        for (Track track : tracks) {
            length += track.getLength();
        }
        return length;
    }
}
