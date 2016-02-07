/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Observer.Desciminant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author advirtys
 */
public class ABCData implements Subject{
    private List<Observer> list;
    private double a, b, c, Desc;

    public ABCData() {
        this.list = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : list) {
            o.update(a, b, c, Desc);
        }
    }

    public void setVar(double a, double b, double c, double Desc) {
        this.Desc = Desc; 
        if(Desc > 0){
            System.out.println("2 корня...");
        } else if (Desc == 0) {
            System.out.println("1 корень...");
        } else if (Desc < 0) {
            System.out.println("Нет корней...");
        } 
        this.a = a;
        this.b = b;
        this.c = c;
        notifyObservers();
    }
    
    
    
}
