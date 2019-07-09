package Zoo_Inheritance;

public class Bird extends Animal{

    public Bird(int age, String gender, int wight) {
        super(age, gender, wight);
    }

    public void fly(){
        System.out.println(" Bird can fly....");
    }

}
