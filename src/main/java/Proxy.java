import se.michaelthelin.spotify.model_objects.specification.Track;

import java.util.HashMap;
import java.util.Map;

public class Proxy implements SpotifyInterface {
    private final SpotifyInterface _spotify;
    private final Map<String, Track> _cache;

    public Proxy(SpotifyInterface spotify) {
        this._spotify = spotify;
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
