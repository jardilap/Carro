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
public class Motor {
    private String marca;
    private double cilindraje;
    private int cilindros;
    private String modelo;

    public Motor(String marca, String modelo, double cilindraje, int cilindros) {
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.cilindros = cilindros;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public int getCilindros() {
        return cilindros;
    }
    
    public String getModelo(){
        return modelo;
    }

    
    

}
