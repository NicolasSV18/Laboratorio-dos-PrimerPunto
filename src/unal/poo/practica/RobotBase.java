package unal.poo.practica;

import becker.robots.*;
import becker.robots.icons.Icon;
import unal.poo.practica.Planta;
import java.awt.Color;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
   
        
	public static void main (String[] args) throws InterruptedException{
            //Declarar la creacion de la ciudad
            objetos = new City("C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\Laboratorio-dos-PrimerPunto\\Field.txt");
            objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
           
            estudiante = new Drone(objetos,0, 2, Direction.EAST,10);
            Planta planta = new Planta(objetos, 0, 3,15,15,15,0);
           
            estudiante.move();
            //Semaforo semaforo = new Semaforo(objetos, 0, 6);
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move();
            
            /*Thing t = estudiante.examineThings(new FlorPred()).next();
            if(t instanceof Flor){
               estudiante.pickThing();
            }*/
            
            estudiante.move();
            planta.cambiarEstado();
            //Thread.sleep(500);
            //semaforo.cambiarEstado();
           
            
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

