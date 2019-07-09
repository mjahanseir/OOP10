package Zoo_Interface_Abstraction;

public class Animal {
    private int age;
    private String gender;
    private int wight;

    public Animal(int age, String gender, int wight) {
        this.age = age;
        this.gender = gender;
        this.wight = wight;
    }

    public void eat() {
        System.out.println("eating..");
    }

    public void sleep() {
        System.out.println("sleeping....");
    }
}
