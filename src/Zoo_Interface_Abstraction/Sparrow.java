package Zoo_Interface_Abstraction;

public class Sparrow extends Bird implements IFlyable{
    public Sparrow(int age, String gender, int wight) {
        super(age, gender, wight);
    }


    @Override
    public void fly() {
        System.out.println("fly....");
    }
}
