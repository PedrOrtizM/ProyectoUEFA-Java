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
public class ActaArbitral implements Serializable{
    
    private Partido informacion;
    private ArrayList<Suceso>sucesos;
    
    public ActaArbitral(){
    sucesos = new ArrayList<>();
    informacion = new Partido();
    }

    public Partido getInformacion() {
        return informacion;
    }

    public void setInformacion(Partido informacion) {
        this.informacion = informacion;
    }

    public ArrayList<Suceso> getSucesos() {
        return sucesos;
    }

    public void setSucesos(ArrayList<Suceso> sucesos) {
        this.sucesos = sucesos;
    }
    
}
