public class Main {
    public static void main(String[] args) {
        String client_id = "75399c2bdb7948b882f6647795204070";
        String client_secret = "484b0ac5151f4288a40c06e8ae7a4dc4";

        SpotifyInterface spotify = new Proxy(client_id, client_secret);
        String track1 = "3n3Ppam7vgaVa1iaRUc9Lp";
        String track2 = "11dFghVXANMlKmJXsNCbNl";
        System.out.println(spotify.getTrack(track1).getName());
        System.out.println(spotify.getTrack(track2).getName());
        System.out.println(spotify.getTrack(track1).getName());
    }
}
