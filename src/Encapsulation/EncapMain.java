package Encapsulation;

import java.lang.management.PlatformLoggingMXBean;

public class EncapMain {
    public static void main(String[] args) {
        Player player = new Player("Tom", 200, "Sword");
        System.out.println("initial is : " + player.getHealth());
    }
}
