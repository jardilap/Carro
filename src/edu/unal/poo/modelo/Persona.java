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
public class Persona {
    private Carro[] carro;
    private String nombre;
    private String Apellido;
    private int cedula;
     

    public Persona(String nombre, String Apellido, int cedula) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.cedula = cedula;
    }
    
    public void listarInfo(Carro[] carro){
        for (int i=0;carro.length>i;i++){
            if (carro[i]!=null){
                System.out.println(carro[i].getMarca() 
                + carro[i].getMarcaChassis() + carro[i].getMotor()
                + carro[i].getRuedas());
            }
        }
        
    }

    public Carro[] getCarro() {
        return carro;
    }

    public void setCarro(Carro[] carro) {
        this.carro = carro;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getCedula() {
        return cedula;
    }
    
    
}
