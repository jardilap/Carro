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
    private Carro[] carros;
    private String nombre;
    private String Apellido;
    private int cedula;
     

    public Persona(String nombre, String Apellido, int cedula) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.cedula = cedula;
        carros=new Carro[100];
    }
    
    public void listarInfo(){
        for (int i=0;carros.length>i;i++){
            if (carros[i]!=null){
                int j=i+1;
                System.out.println("Carro #" + j + "\nMarca: " + 
                        carros[i].getMarca() + "\nMarca Chasis: " + 
                        carros[i].getChassis().getMarca() + "\nMarca Motor: " +
                        carros[i].getMotor().getMarca() + "\nModelo Motor: " + 
                        carros[i].getMotor().getModelo() + "/nInfo Ruedas: " +
                        carros[i].getRuedasInfo());
            }
        }
        
    }
    
    public boolean addCar(Carro newCar){
        for(int i=0; carros.length>i;i++){
            if (carros[i]==null){
                carros[i]=newCar;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeCar(Carro car){
        for(int i=0; carros.length>i;i++){
            if (carros[i]==car){
                carros[i]=null;
                return true;
            }
        }
        return false;
    }
    
    public Carro[] getCarro() {
        return carros;
    }

    public void setCarro(Carro[] carro) {
        this.carros = carro;
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
