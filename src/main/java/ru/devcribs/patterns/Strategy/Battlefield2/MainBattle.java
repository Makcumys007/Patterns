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
public class MainBattle {
    public static void main(String[] args) {
        SniperSoldier sniper = new SniperSoldier("Снайпер");
        sniper.knif();
        sniper.gun();
        sniper.firstweapon();        
        sniper.setWeapons(new F1());
        sniper.setWeapons(new Cluemor());
        sniper.supportWeapon();
        
        AssaultSoldier assault = new AssaultSoldier("Штурмовик");
        assault.knif();
        assault.gun();
        assault.firstweapon(); 
        assault.setWeapons(new GP25());
        assault.setWeapons(new F1());
        assault.supportWeapon();        
             
    }
}
