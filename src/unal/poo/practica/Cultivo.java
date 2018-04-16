/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;

/**
 *
 * @author Estudiante
 */
public class Cultivo extends City {
 
 protected int ancho;
 protected int largo;
 
 
 
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

 
 
    public Cultivo(int ancho, int largo) {
        super(ancho, largo);
    }
 
 public void realizarMonitoreo (double temperatura, double humedad){
     
 }
 
 public int medirFertilizante (int cantidad){
 return 0;
 }

 public boolean ponerFertilizante (int x, int y,int cantidad){
 return true;    
 }
 
 public boolean Sembrar(double temperatura,double humedad, int cantidadFertili, int x, int y){
 return true;
 }
 
}

        