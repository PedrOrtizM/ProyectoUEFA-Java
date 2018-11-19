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
public class ComisionArbitral implements Serializable{
    private ArrayList<ActaArbitral>actas;
    private ArrayList<Persona>arbitros;
    
    public ComisionArbitral(){
    actas = new ArrayList<>();
    arbitros = new ArrayList<>();
    
    }

    public ArrayList<ActaArbitral> getActas() {
        return actas;
    }

    public void setActas(ArrayList<ActaArbitral> actas) {
        this.actas = actas;
    }

    public ArrayList<Persona> getArbitros() {
        return arbitros;
    }

    public void setArbitros(ArrayList<Persona> arbitros) {
        this.arbitros = arbitros;
    }
  
}
