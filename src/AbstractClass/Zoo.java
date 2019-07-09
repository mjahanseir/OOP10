package AbstractClass;

public class Zoo {
    public static void main(String[] args) {
    Animal sp = new Sparrow(1, "F", 5);
    sp.move();

    Animal fish1 = new Fish(1,"m",2);
    fish1.move();
        moveAnimal(fish1);
        moveAnimal(sp);

    }

    public static void moveAnimal(Animal animal){
        animal.move();
    }
}
