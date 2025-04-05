import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
    private List<Playlist> playlists = new ArrayList<>();

    public MusicLibrary(String playlistName) {
        createPlaylist("All Songs");
        createPlaylist(playlistName);
    }
    public MusicLibrary() {
        createPlaylist("All Songs");
    }

    public void createPlaylist(String title) {
        playlists.add(new Playlist(title));
    }

    public void addTrackToPlaylist(String track, String playlistsName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equals(playlistsName)) {
                if(!playlist.getTracks().contains(track)) {
                    playlist.addTrack(track);
                    System.out.println("Successfully added track " + track + " to playlist " + playlistsName);
                }
                else{
                    System.out.println("Track is already in the playlist!");
                }
                break;
            }
        }
    }
    public void removeTrackFromPlaylist(String track, String playlistsName) {
        Playlist playlist = findPlaylist(playlistsName);
        try{
            playlist.removeTrack(track);
            removeTrack(track);
            System.out.println("======================================");
            System.out.println(track + " removed from the playlist!");
            System.out.println("======================================");
        }
        catch(Exception e){
            System.out.println("Track was not in the playlist!");
        }
    }

    public void displayAllPlaylists() {
        System.out.println();
        System.out.println("Playlists:");
        System.out.println();
        for (Playlist playlist : playlists) {
            if(playlist.getName().equals("All Songs")){
                continue;
            }
            displayPlaylist(playlist.getName());
        }

    }

    public Playlist findPlaylist(String playlistName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equals(playlistName)) {
                return playlist;
            }
        }
        return null;
    }

    public void searchForPhraseInPlaylists(String phrase) {
        System.out.println();
        System.out.println("Searching for \"" + phrase + "\" in database...");
        for(String track : playlists.get(0).getTracks()) {
            if(track.toLowerCase().contains(phrase.toLowerCase())) {
                System.out.println("    -" + track);
            }
        }
    }

    public void displayPlaylist(String playlistName) {
        Playlist playlist = findPlaylist(playlistName);
        playlist.displayTracks();
        if (playlist.getTracks().isEmpty()) {
            System.out.println("    No tracks found!");
        }
    }

    public void addTrack(String track){
        findPlaylist("All Songs").addTrack(track);

    }
    public void removeTrack(String track){
        findPlaylist("All Songs").removeTrack(track);
    }

}
