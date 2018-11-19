/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author pedro ortiz
 */
public class Partido implements Serializable {
    
    private Equipo local;
    private Equipo visitante;
    private int golesVist;
    private int golesLocal;
    private String lugar;
    private Calendar fecha;
    private int num;
    private ArrayList<Arbitro>arbitros = new ArrayList<>();
    private ActaArbitral acta;
    private boolean estado=false;
    
    public Partido(){}

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
            
        

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public int getGolesVist() {
        return golesVist;
    }

    public void setGolesVist(int golesVist) {
        this.golesVist = golesVist;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Arbitro> getArbitros() {
        return arbitros;
    }

    public void setArbitros(ArrayList<Arbitro> arbitros) {
        this.arbitros = arbitros;
    }

  

    public ActaArbitral getActa() {
        return acta;
    }

    public void setActa(ActaArbitral acta) {
        this.acta = acta;
    }
    
    
    
}
