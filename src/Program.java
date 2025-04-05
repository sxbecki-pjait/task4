public class Program {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary("Car Music");
        musicLibrary.createPlaylist("Favourites");
        musicLibrary.createPlaylist("Classics");
        musicLibrary.addTrack("C Walk - Kurupt");
        musicLibrary.addTrack("David Guetta - Memories");
        musicLibrary.addTrack("Eden Hazard - Quebonafide");
        musicLibrary.addTrack("ID - Skeler");
        musicLibrary.addTrack("Intro - TACONAFIDE");
        musicLibrary.addTrack("Trip  - Quebonafide");
        musicLibrary.addTrack("Harry Angel  - Quebonafide");
        musicLibrary.addTrack("Carnival  - Quebonafide");
        musicLibrary.addTrack("Hype  - Quebonafide");
        musicLibrary.addTrack("Ciernie  - Quebonafide");
        musicLibrary.addTrackToPlaylist("David Guetta - Memories", "Classics");
        musicLibrary.addTrackToPlaylist("Eden Hazard - Quebonafide", "Classics");
        musicLibrary.addTrackToPlaylist("ID - Skeler", "Car Music");
        musicLibrary.addTrackToPlaylist("Intro - TACONAFIDE", "Favourites");
        musicLibrary.addTrackToPlaylist("Trip  - Quebonafide", "Favourites");
        musicLibrary.displayAllPlaylists();
        musicLibrary.removeTrackFromPlaylist("ID - Skeler", "Car Music");
        musicLibrary.displayAllPlaylists();
        musicLibrary.searchForPhraseInPlaylists("fide");
    }
}