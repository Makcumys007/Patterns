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
public class MainWeapon {
    public static void main(String[] args) {
        Weapon ak = new Ak74();
        ak = new Cevie(ak);
        ak = new GunRuchka(ak);
        ak = new Pricel(ak);
        ak = new Mgazin(ak);
        
        System.out.println(ak.getTitle() + "\n" + ak.cost());
    }
    
    
}
