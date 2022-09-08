public class News implements INews {
    private String title;
    private String author;
    private String publicDate;
    private double date;
    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return String return the publicDate
     */
    public String getPublicDate() {
        return publicDate;
    }

    /**
     * @param publicDate the publicDate to set
     */
    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    /**
     * @return double return the date
     */
    public double getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(double date) {
        this.date = date;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title + "author: " + author + "publicDate: " + publicDate + "Date: " + date);
    }

}
