package AbstractClass;

public class Bird extends Animal {

    public Bird(int age, String gender, int wight) {
        super(age, gender, wight);
    }

    @Override
    public void move() {
        System.out.println("flapping wings.....");
    }
}
