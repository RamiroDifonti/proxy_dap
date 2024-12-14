import se.michaelthelin.spotify.SpotifyApi;
import se.michaelthelin.spotify.model_objects.specification.Track;

public class Spotify implements SpotifyInterface {
    private final SpotifyApi _spotifyApi;
    public Spotify(String id, String secret) {
        this._spotifyApi = new SpotifyApi.Builder()
                .setClientId(id)
                .setClientSecret(secret)
                .build();
        try {
            String accessToken = _spotifyApi.clientCredentials().build().execute().getAccessToken();
            _spotifyApi.setAccessToken(accessToken);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    @Override
    public Track getTrack(String id) {
        try {
            return _spotifyApi.getTrack(id).build().execute();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
