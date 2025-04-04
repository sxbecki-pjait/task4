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
        addTrack(track);
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
            System.out.println("Track is removed from the playlist!");
        }
        catch(Exception e){
            System.out.println("Track was not in the playlist!");
        }
    }

    public void displayAllPlaylists() {
        System.out.println();
        System.out.println("Playlists:");
        for (Playlist playlist : playlists) {
            playlist.displayTracks();
            if (playlist.getTracks().isEmpty()) {
                System.out.println("    No tracks found!");
            }
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
        System.out.println("Searching for \"" + phrase + "\" in playlists...");
        for (Playlist playlist : playlists) {
            List<String> matchingTracks = playlist.searchTracks(phrase);
            if (matchingTracks != null){
                for(String matchingTrack : matchingTracks){
                    System.out.println("    -" + matchingTrack);
                }
            }
        }
    }

    public void displayPlaylist(String playlistName) {
        System.out.println();
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
