package FactoryDesignPattern.Weapon;

public class Gun implements Weapon {
    public void attack(){
        int points = 80;
        System.out.println("attacked with Gun, points scored is`"+points);
    }
}
