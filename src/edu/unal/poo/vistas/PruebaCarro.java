/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.vistas;
import edu.unal.poo.modelo.*;

/**
 *
 * @author Juan_Ardila
 */
public class PruebaCarro {
    public static void main(String[] args) {
        Motor m1 = new Motor("Hyundai", "Raptor", 2000, 4);
        Motor m2 = new Motor("Hyundai", "Raptor", 2010, 6);
        
        Carro c1 = new Carro ("vw", "honda");
        Carro c2 = new Carro ("GM", "Chevrolet");
        
        Ruedas r1=new Ruedas("GM",16);
        Ruedas r2=new Ruedas("GM",16);
        Ruedas r3=new Ruedas("GM",16);
        Ruedas r4=new Ruedas("GM",16);
        
        Ruedas r5=new Ruedas("GM",18);
        Ruedas r6=new Ruedas("GM",18);
        Ruedas r7=new Ruedas("GM",18);
        Ruedas r8=new Ruedas("GM",18);
        
        Ruedas[] ruedas={r1, r2, r3, r4};
        Ruedas[] ruedas2={r5, r6, r7, r8};
        
        c1.setMotor(m1);
        c2.setMotor(m2);
        
        c1.setRuedas(ruedas);
        c2.setRuedas(ruedas2);
        
        Persona p1 = new Persona("Juan", "Perez", 1019147372);
        p1.addCar(c1);
        p1.addCar(c2);
        
        p1.listarInfo();
        
    }
    
}
