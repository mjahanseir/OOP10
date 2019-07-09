package AbstractClass;

public class Fish extends Animal {
    public Fish(int age, String gender, int wight) {
        super(age, gender, wight);
    }

    public void swimming() {
        System.out.println(" fish can swimming....");
    }

    @Override
    public void move() {
        System.out.println("Swimming...........");
    }
}
