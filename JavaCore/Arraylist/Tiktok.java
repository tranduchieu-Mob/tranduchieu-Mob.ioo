import java.util.ArrayList;

public class Tiktok {
    private ArrayList<Idol> idols;
    private ArrayList<Song> songs;
    
    
    public Tiktok(ArrayList<Idol> idols, ArrayList<Song> songs) {
        this.idols = idols;
        this.songs = songs;
    }
    public void setIdols(ArrayList<Idol> idols) {
        this.idols = idols;
    }
    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
    @Override
    public String toString() {
        return "Tiktok [idols=" + idols + ", songs=" + songs + "]";
    }
    public void add(Tiktok tiktok) {
    }
    
}
