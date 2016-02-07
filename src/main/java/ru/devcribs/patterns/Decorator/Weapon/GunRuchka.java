/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Decorator.Weapon;

/**
 *
 * @author advirtys
 */
public class GunRuchka extends WeaponDecorator{
    private Weapon weapon;

    public GunRuchka(Weapon weapon) {
        this.weapon = weapon;
    }
    
    @Override
    public String getTitle() {
        return weapon.getTitle() + " пистолетная рукоятка рукоятка пистолетная AG47";
    }

    @Override
    public double cost() {
        return weapon.cost() + 70;
    }
    
}
