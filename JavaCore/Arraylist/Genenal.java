public class Genenal {
    private String name;
    private String position;
    public void setName(String name) {
        this.name = name;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public Genenal(String name, String position) {
        this.name = name;
        this.position = position;
    }
    @Override
    public String toString() {
        return "Genenal [name=" + name + ", position=" + position + "]";
    }
    
}
