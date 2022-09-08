import javax.sound.sampled.SourceDataLine;

public class Student implements Iclassification {
    private String name;
    private int age;
    private double marks;
    private boolean classification;
    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return double return the marks
     */
    public double getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public void classify () {
        if( marks >= 8 ){
            System.out.println(" loai A");
        } else if( marks < 8 && marks >6.5 ){
            System.out.println("loai B");
        }else{
            System.out.println("loai C");
        }
    }

    @Override
    public void display() {
        System.out.println("Ten :" + name + " Tuoi: " + age + " Diem: " + marks);
    }
}

