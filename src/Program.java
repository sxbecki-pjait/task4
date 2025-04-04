public class Program {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary("Car Music");
        musicLibrary.createPlaylist("Favourites");
        musicLibrary.createPlaylist("Classical Music");
        musicLibrary.addTrackToPlaylist("Majteczki w kropeczki - Masno Gang", "Favourites");
        musicLibrary.addTrackToPlaylist("Rose Moet - Malik Montana", "Favourites");
        musicLibrary.addTrackToPlaylist("No to cyk - Diho", "Classical Music");
        musicLibrary.addTrackToPlaylist("Robilas to najlepiej - Diho", "Classical Music");
        musicLibrary.addTrackToPlaylist("Antonio Banderas - Diho", "Classical Music");
        musicLibrary.displayAllPlaylists();
        musicLibrary.removeTrackFromPlaylist("No to cyk - Diho", "Classical Music");
        musicLibrary.displayAllPlaylists();
        musicLibrary.searchForPhraseInPlaylists("Diho");
    }
}