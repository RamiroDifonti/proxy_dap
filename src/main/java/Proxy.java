import se.michaelthelin.spotify.model_objects.specification.Track;

import java.util.HashMap;
import java.util.Map;

public class Proxy implements SpotifyInterface {
    private final Spotify _spotify;
    private final Map<String, Track> _cache;

    public Proxy(String id, String secret) {
        this._spotify = new Spotify(id, secret);
        this._cache = new HashMap<>();
    }
    @Override
    public Track getTrack(String id) {
        if (_cache.containsKey(id)) {
            return _cache.get(id);
        } else {
            Track track = _spotify.getTrack(id);
            _cache.put(id, track);
            return track;
        }
    }
}
