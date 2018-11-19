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
public class Arbitro extends Persona implements Serializable{
    
    private String id;
    
    public Arbitro(){
    id="";}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Arbitro(String id) {
        this.id = id;
    }

      

    @Override
    public String toString() {
        return "Arbitro "+super.getNombre();
    }
    
    
    
}
