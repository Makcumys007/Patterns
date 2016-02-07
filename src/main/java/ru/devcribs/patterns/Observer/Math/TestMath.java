/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Observer.Math;

import java.util.Scanner;

/**
 *
 * @author advirtys
 */
public class TestMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();    
        
        //-----------------------------------------------
        MathData md = new MathData();
        MathSum sum = new MathSum(md);
        MathRaz raz = new MathRaz(md);
        MathMult mult = new MathMult(md);
        MathDiv div = new MathDiv(md);
        md.setVariable(a, b);
    }
}
