/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Observer.Math;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author advirtys
 */
public class MathData implements Subject{
    private List<Observer> observers;
    private int a, b;

    public MathData() {
        observers = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(a, b);
        }
    }
    
    public void setVariable(int a, int b){
        this.a = a;
        this.b = b;
        notifyObservers();
    }
    
}
