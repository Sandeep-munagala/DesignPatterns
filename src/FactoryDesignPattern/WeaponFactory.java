package FactoryDesignPattern;

import FactoryDesignPattern.Weapon.Gun;
import FactoryDesignPattern.Weapon.Sword;
import FactoryDesignPattern.Weapon.Weapon;

public class WeaponFactory{
    public Weapon getWeapon(String type){
        return switch (type.toLowerCase()) {
            case "sword" -> new Sword();
            case "gun" -> new Gun();
            default -> throw new IllegalArgumentException("Unknown weapon type");
        };
    }
}
