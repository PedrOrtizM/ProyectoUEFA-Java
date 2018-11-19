/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pedro ortiz
 */
public class Equipo implements Serializable{ // falta asignarle el grupo en la clase uefa a cada euqipo
     
    private String nombre;
    private  ArrayList<Jugador>jugadores;
    private String pais;
    private String estadio;
    private String fotoEstadio;
    private String foto; // FOTO DEL ESCUDO PEQUEÑO
    private Persona entrenador;
    private long ingresos;
    private Grupo grupo;  // OJO CON ESTO
    private String escudo;
    private int nPunto;
    public Equipo(){
        
        jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getFotoEstadio() {
        return fotoEstadio;
    }

    public void setFotoEstadio(String fotoEstadio) {
        this.fotoEstadio = fotoEstadio;
    }

    public int getnPunto() {
        return nPunto;
    }

    public void setnPunto(int nPunto) {
        this.nPunto = nPunto;
    }
    
    

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

   

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Persona getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Persona entrenador) {
        this.entrenador = entrenador;
    }

    public long getIngresos() {
        return ingresos;
    }

    public void setIngresos(long ingresos) {
        this.ingresos = ingresos;
    }
    
    
    
    
}
