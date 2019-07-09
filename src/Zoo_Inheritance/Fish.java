package Zoo_Inheritance;

public class Fish extends Animal {
    public Fish(int age, String gender, int wight) {
        super(age, gender, wight);
    }

    public void swimming() {
        System.out.println(" fish can swimming....");
    }
}
