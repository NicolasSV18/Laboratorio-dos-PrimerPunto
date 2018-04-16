/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.City;
import becker.robots.Thing;


/**
 *
 * @author Estudiante
 */
public class Planta extends Thing {
   private double humedad;
   private double temperatura;
   private int fertilizante;
   
    public Planta(City city, int i, int i1,double humedad, double temperatura,int fertilizante) {
        super(city, i, i1);
        this.humedad = humedad;
        this.temperatura = temperatura;
        this.fertilizante = fertilizante;
       setIcon(new Bicon("grass.png"));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
