package FactoryDesignPattern;

import FactoryDesignPattern.Weapon.Weapon;

public class test {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new WeaponFactory();
        Weapon w1 = weaponFactory.getWeapon("gun");
        w1.attack();
        Weapon w2 = weaponFactory.getWeapon("sword");
        w2.attack();
    }
}
