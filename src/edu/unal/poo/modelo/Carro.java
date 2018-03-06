/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.modelo;

/**
 *
 * @author Juan_Ardila
 */
public class Carro {
    private String marca;
    private String marcaChassis;
    private Motor motor;
    private Ruedas[] ruedas;
    Chassis chassis = new Chassis("");
    

    public Carro(String marca, String marcaChassis) {
        this.marca = marca;
        chassis.setMarca(marcaChassis);
    }
    

    public String getMarca() {
        return marca;
    }
    
    public String getMarcaChassis() {
        return marcaChassis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Ruedas[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Ruedas[] ruedas) {
        this.ruedas = ruedas;
    }
    
    
    
}
