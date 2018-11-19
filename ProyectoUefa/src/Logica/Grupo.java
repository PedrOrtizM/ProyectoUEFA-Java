/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author pedro ortiz
 */
public class Grupo implements Serializable{
    
    private ArrayList<Partido>partidos;
    private ArrayList<Equipo>equipos;
    private int numero;
   
    
    public Grupo(){
      partidos = new ArrayList<>();
      equipos = new ArrayList<>();
    }

    public Grupo(ArrayList<Partido> partidos, ArrayList<Equipo> equipos, int numero) {
        this.partidos = partidos;
        this.equipos = equipos;
        this.numero = numero;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


}
