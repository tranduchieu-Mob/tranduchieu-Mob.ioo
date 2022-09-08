public class Song {
    private String id;
    private String name;
    private String singer;

    
    
    public Song(String id, String name, String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }
    @Override
    public String toString() {
        return "Song [id=" + id + ", name=" + name + ", singer=" + singer + "]";
    }
   
    

}
