/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Strategy.Battlefield2;

/**
 *
 * @author advirtys
 */
public class Cluemor implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Может "
                + "поставить растяжку");
    }
    
}
