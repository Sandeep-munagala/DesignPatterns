package FactoryDesignPattern.Weapon;

public class Sword implements Weapon {
    @Override
    public void attack() {
        int points = 45;
        System.out.println("attacked with Sword, points scored " + points);
    }
}
