package Logica;
import Persistencia.Datos;
import Vista.MostrarJugador;
import Vista.Principal;
import Vista.Sorteo;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.utils.SubstanceConstants;
import org.jvnet.substance.watermark.SubstanceImageWatermark;
/**
 *
 * @author pedro ortiz
 */

public class Main {
  public static Uefa miUefa;
    
    public static void main(String[] args) {
        
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        org.jvnet.substance.SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.Business");
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MistAquaSkin");
        SubstanceLookAndFeel.setCurrentTheme( "org.jvnet.substance.theme.SubstanceLightAquaTheme ");
        SubstanceImageWatermark.setKind(SubstanceConstants.ImageWatermarkKind.APP_CENTER);
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(0.3));
        // FALTA ASIGNARLE LA RESPONSABILIDAD AL ARBITRO DE LLENAR EL ACta
        
        miUefa = new Uefa();
        Datos persistencia = new Datos();
      
           
          
         miUefa.getParticipantes().size();
         
        if(persistencia.cargar()!=null){
         miUefa= persistencia.cargar();
            System.out.println("ENTRO");
            System.out.println(miUefa.getParticipantes().size());
        }else{System.out.println("  archivo vacio");}
       
         if(miUefa.isEstado()==false){   
       
       Sorteo nuevo = new Sorteo();
         nuevo.setLocationRelativeTo(null);
         nuevo.setVisible(true);
 }
else{ 
        Principal ven = new Principal();
             
        ven.setLocationRelativeTo(null);
        ven.setVisible(true);    }

//  for(int i=0;i<20;i++){
//  MostrarJugador a = new MostrarJugador(null, true, miUefa.getParticipantes().get(2).getJugadores().get(i));
//  a.setLocationRelativeTo(null);
//  a.setVisible(true);
//  
//  }
     
    }}
    
    
