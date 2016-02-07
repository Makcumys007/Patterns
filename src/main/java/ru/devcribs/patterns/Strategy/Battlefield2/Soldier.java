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
public abstract class Soldier {
    private String title;    

    public Soldier(String title) {
        this.title = title;
        System.out.println(title);
    }    
    
    public void knif(){          // НОЖ
        System.out.println("Владете ножевым боем");
    }

    public abstract void gun();  
    // ПИСТОЛЕТ ПЕРЕОПРЕДЕЛИМ
    
    public abstract void firstweapon(); 
    // ГЛАВНОЕ ОРУЖИЕ ПЕРЕОПРЕДЕЛИМ    
    
}
