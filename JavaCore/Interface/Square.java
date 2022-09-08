public class Square implements Polygon {

    private double size;


    /**
     * @return double return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }
    @Override
    public void calArea() {
        System.out.println("Chu vi: " + (size+size)*2);
    }

    @Override
    public void display() {
        System.out.println("Dien tich: " + size*2);
    }


}
