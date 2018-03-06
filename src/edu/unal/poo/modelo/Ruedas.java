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
public class Ruedas {
    private String marca;
    private int tamPulg;

    public Ruedas(String marca, int tamPulg) {
        this.marca = marca;
        this.tamPulg = tamPulg;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamPulg() {
        return tamPulg;
    }

    public void setTamPulg(int tamPulg) {
        this.tamPulg = tamPulg;
    }
    
    
}
