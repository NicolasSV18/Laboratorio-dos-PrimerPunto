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
   private String[] images = {"growth.png","growthmuerta.png", "growthseca.png" };
    private int state;
   
    public Planta(City city, int i, int i1,double humedad, double temperatura,int fertilizante, int state) {
        super(city, i, i1);
        this.humedad = humedad;
        this.temperatura = temperatura;
        this.fertilizante = fertilizante;
        this.state = 0;
        setIcon(new Bicon("growth.png"));
       
    }

    public boolean adicionarFertilizante(int cantidad){
    boolean r = false;
    if (this.fertilizante + cantidad <= 100 ){
        r = true;
        this.fertilizante = this.fertilizante + cantidad;
    }
   return r;
    }
    
    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getFertilizante() {
        return fertilizante;
    }

    public void setFertilizante(int fertilizante) {
        this.fertilizante = fertilizante;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }


    
    public void cambiarEstado(){
       this.state = ((this.state + 1) % 3);
        setIcon(new Bicon(this.images[this.state]));
    }
    
    
    
    
    
    
    
}
