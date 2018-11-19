/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;

/**
 *
 * @author pedro ortiz
 */
public class Jugador  extends Persona implements Serializable{
    
    
    private String comunitario;
    private String posicion;
    private String numeroTransporte;
    private Equipo equipo;
    private int numGoles;
      
    
    public Jugador(){
        super();
        numGoles=0;
         
    }

    public Jugador(String comunitario, String posicion, String numeroTransporte, Equipo equipo) {
        this.comunitario = comunitario;
        this.posicion = posicion;
        this.numeroTransporte = numeroTransporte;
        this.equipo = equipo;
    }

    public Jugador(String comunitario, String posicion, String numeroTransporte, Equipo equipo, String nombre, String apellidos, String edad, String nacionalidad, String foto) {
        super(nombre, apellidos, edad, nacionalidad, foto);
        this.comunitario = comunitario;
        this.posicion = posicion;
        this.numeroTransporte = numeroTransporte;
        this.equipo = equipo;
    }

  
       
    

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
   
    
    
    
    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }
   
   

    public String getComunitario() {
        return comunitario;
    }

    public void setComunitario(String comunitario) {
        this.comunitario = comunitario;
    }


    public String getNumeroTransporte() {
        return numeroTransporte;
    }

    public void setNumeroTransporte(String numeroTransporte) {
        this.numeroTransporte = numeroTransporte;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    

}
