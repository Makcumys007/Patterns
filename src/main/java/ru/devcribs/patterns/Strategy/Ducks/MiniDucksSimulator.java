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
public class MiniDucksSimulator {
    public static void main(String[] args) {
        Duck mullard = new MullardDuck();
        mullard.performFly();
        mullard.performQuack();
    }

    
}
