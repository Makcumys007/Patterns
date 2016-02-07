/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Singleton;

/**
 *
 * @author advirtys
 */
public class Singleton {
    private static Singleton instance;
    private boolean empty;
    private boolean boiled;
    private Singleton() {
        empty = true;
        boiled = false;
    }

    public static Singleton getInstance() {
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
    
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }
    
    public void boiled(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
    
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.fill();
        s.boiled();
        System.out.println(s);
        
       
    }
    
}
