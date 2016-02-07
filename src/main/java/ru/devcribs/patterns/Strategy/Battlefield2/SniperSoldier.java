/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Strategy.Battlefield2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author advirtys
 */
public class SniperSoldier extends Soldier{
    private List<WeaponBehavior> weapons;
    
    public SniperSoldier(String title) {
        super(title);
        weapons = new ArrayList<>();
    }

    @Override
    public void gun() {
        System.out.println("Стреляет с "
                + "безшумного пистолета...");
    }

    @Override
    public void firstweapon() {
        System.out.println("Стреляет со "
                + "снайперской винтовки...");
    }
    
    public void supportWeapon(){
        for(WeaponBehavior w : weapons){
            w.useWeapon();
        }
    }

    public void setWeapons(WeaponBehavior w) {
        weapons.add(w);
    } 
}
