

package Logica;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pedro ortiz
 */
public class FaseFinal implements Serializable {   
    
    private ArrayList<Partido>cuartosFinal;
    private boolean estadoCuartos;
    private ArrayList<Partido>semiFinal;
    private  boolean estadoSemi;
    private Partido PartidoFinal;
    private boolean estadoFinal;
    public FaseFinal(){
    
    cuartosFinal = new ArrayList<>();
    semiFinal = new ArrayList<>();
    PartidoFinal = new Partido();
    estadoCuartos = false;
    estadoSemi = false;
    estadoFinal= false;
    
    }

    public boolean isEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(boolean estadoFinal) {
        this.estadoFinal = estadoFinal;
    }
    

    public ArrayList<Partido> getCuartosFinal() {
        return cuartosFinal;
    }

    public void setCuartosFinal(ArrayList<Partido> cuartosFinal) {
        this.cuartosFinal = cuartosFinal;
    }

    public ArrayList<Partido> getSemiFinal() {
        return semiFinal;
    }

    public void setSemiFinal(ArrayList<Partido> semiFinal) {
        this.semiFinal = semiFinal;
    }

    public Partido getPartidoFinal() {
        return PartidoFinal;
    }

    public void setPartidoFinal(Partido PartidoFinal) {
        this.PartidoFinal = PartidoFinal;
    }

    public boolean isEstadoCuartos() {
        return estadoCuartos;
    }

    public void setEstadoCuartos(boolean estadoCuartos) {
        this.estadoCuartos = estadoCuartos;
    }

    public boolean isEstadoSemi() {
        return estadoSemi;
    }

    public void setEstadoSemi(boolean estadoSemi) {
        this.estadoSemi = estadoSemi;
    }
    
    
    
    
    
}
