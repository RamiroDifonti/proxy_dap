import se.michaelthelin.spotify.model_objects.specification.Track;

public class SpotifyManager {
    private final SpotifyInterface _spotify;
    public SpotifyManager(SpotifyInterface spotify) {
        this._spotify = spotify;
    }
    public Track getTrack(String id) {
        return _spotify.getTrack(id);
    }
}
