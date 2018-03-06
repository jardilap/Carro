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
    private Motor motor;
    private Ruedas[] ruedas;
    private Chassis chassis;
    

    public Carro(String marca, String marcaChassis) {
        this.marca = marca;
        chassis = new Chassis(marcaChassis);
    }
    
    public String getRuedasInfo() {
        String info= " ";
        for(int i=0;i<ruedas.length;i++){
            int j=i+1;
            info+="\nMarca rueda "+ j + " "+ ruedas[i].getMarca();
            info+="\nTamaño en pulgadas rueda "+ j + " " + ruedas[i].getTamPulg();
            info+=" ";
        }
        return info;
    }

    public Chassis getChassis() {
        return chassis;
    }
    
    
    
    public String getMarca() {
        return marca;
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
