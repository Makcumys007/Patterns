/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.devcribs.patterns.Observer.Desciminant;

import java.util.Scanner;

/**
 *
 * @author advirtys
 */
public class TestDesc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  a = scanner.nextDouble(), 
                b = scanner.nextDouble(), 
                c = scanner.nextDouble(),
        Desc = Math.pow(b, 2) - (4*a*c);
        ABCData abcd = new ABCData();
        XValue x = new XValue(abcd);
        YValue y = new YValue(abcd);
        abcd.setVar(a, b, c, Desc);
    }
}
