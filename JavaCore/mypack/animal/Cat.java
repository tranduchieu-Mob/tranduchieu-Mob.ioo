package mypack.animal;

public class Cat extends Animal {

    public Cat(double weight) {
        this.weight = weight;
    }

    // public double getWeight(){
    //     return this.weight;
    // }

    public void run (double speed) {
        System.out.println("Speed with double value: "+ speed);
    }
    public void run (Float speed) {
        System.out.println("Speed with float value: "+ speed);
    }
    public void run (double speed, int second) {
        System.out.println("in" + second + "the cat will get the speed" + speed);
    }
}