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
public class Suceso  implements Serializable{
    
    private Jugador implicado;
    private int minuto;
    private int tipo;
    // PARA EL TIPO DE SUCESO
    // 1 : SI ES GOL
    // 2 : SI ES AMARILLA
    // 3 : SI ES ROJA 
    // 4 : OTRA INCIDENCIA
    public Suceso(){
       
        
        
    
    
    }
    
    public Jugador getImplicado() {
        return implicado;
    }

    public void setImplicado(Jugador implicado) {
        this.implicado = implicado;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
          
    
}
