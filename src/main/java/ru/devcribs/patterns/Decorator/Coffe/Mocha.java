/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Decorator.Coffe;

/**
 *
 * @author advirtys
 */
public class Mocha extends CondimentDecorator{
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
        }

    @Override
    public double cost() {
        return .05 + beverage.cost();
    }
    
}
