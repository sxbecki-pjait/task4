import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    List<String> tracks = new ArrayList<String>();
    public Playlist(String name) {
        this.name = name;
    }
    public void addTrack(String track) {
        tracks.add(track);
    }

    public String getName() {
        return name;
    }
    public List<String> getTracks() {
        return tracks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void removeTrack(String track) {
        tracks.remove(track);
    }
    public void displayTracks(){
        System.out.println("Displaying tracks from playlist: " + name);
        for(String track : tracks){
            System.out.println("    -" + track);
        }
    }

    public List<String> searchTracks(String phrase) {
        List<String> newTracks = new ArrayList<>();
        for(String track : tracks){
            if(track.contains(phrase)){
                newTracks.add(track);
            }
        }
        return newTracks;
    }
}
