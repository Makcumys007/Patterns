
package ru.devcribs.patterns.Strategy.Ducks;


public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
    
}
