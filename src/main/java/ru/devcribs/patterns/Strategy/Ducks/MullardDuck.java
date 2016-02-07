/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Strategy.Ducks;



/**
 *
 * @author advirtys
 */
class MullardDuck extends Duck {
    
    
    
    public MullardDuck() {        
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }  
    

    @Override
    public void display() {

    }

    @Override
    public void swim() {
        super.swim(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void performQuack() {
        super.performQuack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void performFly() {
        super.performFly(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
