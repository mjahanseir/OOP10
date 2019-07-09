package Encapsulation;

public class Player {

    private String name;
    private int hitPonits =100;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;

        if (health>0 && health<=100) {
            this.hitPonits = health;
        }
        this.weapon = weapon;
    }

    public void loosehealth(int damage){
        this.hitPonits -= damage;
        if(this.hitPonits<=0){
            System.out.println("The player Knocked out");
        }
    }

//    public int healthRemaing(){
//        return this.health;
//    }

    public int getHealth() {
        return hitPonits;
    }
}
