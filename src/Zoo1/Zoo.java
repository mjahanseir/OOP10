package Zoo1;

public class Zoo {
    public static void main(String[] args) {

        Animal wolf= new Animal("Wolf", 2, 12 , 180 , 4 , 2);
        wolf.eat();
        wolf.sleep();

        System.out.println("************************");

        Animal deer= new Animal("Deer", 5 ,80, 120,4 , 2);
        deer.sleep();
        deer.eat();

        System.out.println("************************");

        Animal snack= new Animal("Snack", 5 ,80, 120,0 , 2);
        snack.sleep();
        snack.eat();

        System.out.println("************************");

        Bird bird1 = new Bird();
        bird1.fly();

    }
}
