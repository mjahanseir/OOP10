package Zoo_Inheritance;

public class Zoo {
    public static void main(String[] args) {

        Animal animal1= new Animal(12, "m", 12  );
        animal1.eat();
        animal1.sleep();

        System.out.println("************************");

        Bird bird1 = new Bird(3,"m",12);
        bird1.eat();
        bird1.sleep();
        bird1.fly();

    }
}
