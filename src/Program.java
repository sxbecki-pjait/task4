public class Program {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary("Car Music");
        musicLibrary.createPlaylist("Favourites");
        musicLibrary.createPlaylist("Classical Music");
        musicLibrary.addTrackToPlaylist("David Guetta - Memories", "Classical Music");
        musicLibrary.addTrackToPlaylist("Frank Sinatra - Let It Snow", "Classical Music");
        musicLibrary.addTrackToPlaylist("Intro - TACONAFIDE", "Favourites");
        musicLibrary.addTrackToPlaylist("Trip  - Quebonafide", "Favourites");
        musicLibrary.addTrackToPlaylist("Antonio Banderas - Diho", "Favourites");
        musicLibrary.displayAllPlaylists();
        musicLibrary.removeTrackFromPlaylist("Antonio Banderas - Diho", "Favourites");
        musicLibrary.displayAllPlaylists();
        musicLibrary.searchForPhraseInPlaylists("Memories");
    }
}