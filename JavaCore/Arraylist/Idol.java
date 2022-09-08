import java.util.ArrayList;

public class Idol {
    private String name;
    private String id;
    private String email;
    private ArrayList<Follower> followers;
    private String group;

    

    public Idol(String name, String id, String email, ArrayList<Follower> followers, String group) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.followers = followers;
        this.group = group;
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
    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    @Override
    public String toString() {
        return "Idol [email=" + email + ", followers=" + followers + ", group=" + group + ", id=" + id + ", name="
                + name + "]";
    }
    
    
}
