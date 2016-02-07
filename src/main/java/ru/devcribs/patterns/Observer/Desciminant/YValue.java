/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Observer.Desciminant;



/**
 *
 * @author advirtys
 */
public class YValue implements Observer{
    private ABCData abcd;
    private double a, b, c;

    public YValue(ABCData abcd) {
        this.abcd = abcd;
        abcd.registerObserver(this);
    }    
    
    @Override
    public void update(double a, double b, double c, double Desc) {   
        if(Desc >= 0){
            double Y = (-b - Math.sqrt(Desc))/2*a;
             System.out.println(Y);
        }
    }
    
}
