package Zoo1;

public class Animal {
    private String name;
    private int age;
    private int wight;
    private int height;
    private int legs;
    private int eye;

    public Animal(String name, int age, int wight, int height, int legs, int eye) {
        this.name = name;
        this.age = age;
        this.wight = wight;
        this.height = height;
        this.legs = legs;
        this.eye = eye;
    }
    public void eat(){
        System.out.println(this.name + " eating..");
    }
    public void sleep(){
        System.out.println(this.name + " sleeping....");
    }
}
