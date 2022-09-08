public class Follower {
    private String name;
    private String id;
    private String email;
    private int numberOfLike;

    
    
    public Follower(String name, String id, String email, int numberOfLike) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.numberOfLike = numberOfLike;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }
    @Override
    public String toString() {
        return "Follower [email=" + email + ", id=" + id + ", name=" + name + ", numberOfLike=" + numberOfLike + "]";
    }
}
