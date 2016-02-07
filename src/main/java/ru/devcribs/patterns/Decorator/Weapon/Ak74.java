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
public class Ak74 extends Weapon {
    

    public Ak74() {
        title = "АК-74";
    }
    

    @Override
    public double cost() {
        return 200;
    }
    
}
