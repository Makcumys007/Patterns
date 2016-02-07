/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Observer.Math;

/**
 *
 * @author advirtys
 */
public class MathMult implements Observer {
    private MathData math;
    private int a, b;

    public MathMult(MathData math) {
        this.math = math;
        math.registerObserver(this);
    }
    

    @Override
    public void update(int a, int b) {
        int c = a * b;
        System.out.println("Произведение числа " + a + " и " + b + " = " + c);
    }
    
    
    
}
