public class Rectangle implements Polygon {
    private double length;
    private double with;
    

    /**
     * @return double return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return double return the with
     */
    public double getWith() {
        return with;
    }

    /**
     * @param with the with to set
     */
    public void setWith(double with) {
        this.with = with;
    }

    @Override
    public void calArea() {
        
        System.out.println("Chu vi: " + ((length+with)*2));
    }

    @Override
    public void display() {
        System.out.println("Dien tich: " + (length*with));
    }

}
