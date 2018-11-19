package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Uefa implements Serializable {
    private ArrayList<Equipo>participantes;
    private ArrayList<Grupo>grupos;
    private boolean estadoGrupos;
    private FaseFinal faseFinal;
    private ComisionArbitral comisionArbitral;
    private ComiteSancionador comiteSancionador;
    private boolean estado=false;
    private Calendar fechaUefa= GregorianCalendar.getInstance();;
   
    // METODOS PARA LAS ESTADISTICAS

    
    public Uefa(){
     participantes = new ArrayList<>();
     grupos = new ArrayList<>();
     comisionArbitral = new ComisionArbitral();
     comiteSancionador = new ComiteSancionador();
     faseFinal = new FaseFinal();
     estadoGrupos = false;
    
     fechaUefa.set(fechaUefa.get(Calendar.YEAR), fechaUefa.get(Calendar.MONTH), fechaUefa.get(Calendar.DATE),0, 0, 0);
  }

    public Calendar getFechaUefa() {
        return fechaUefa;
    }

    public void setFechaUefa(Calendar fechaUefa) {
        this.fechaUefa = fechaUefa;
    }

    public boolean isEstadoGrupos() {
        return estadoGrupos;
    }

    public void setEstadoGrupos(boolean estadoGrupos) {
        this.estadoGrupos = estadoGrupos;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }
    
    public ArrayList<Equipo> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Equipo> participantes) {
        this.participantes = participantes;
    }

    public ComisionArbitral getComisionArbitral() {
        return comisionArbitral;
    }

    public void setComisionArbitral(ComisionArbitral comisionArbitral) {
        this.comisionArbitral = comisionArbitral;
    }

    public ComiteSancionador getComiteSancionador() {
        return comiteSancionador;
    }

    public void setComiteSancionador(ComiteSancionador comiteSancionador) {
        this.comiteSancionador = comiteSancionador;
    }
    public void registrarEquipo(Equipo nuevo){
        participantes.add(nuevo);
    
    }

    public FaseFinal getFaseFinal() {
        return faseFinal;
    }

    public void setFaseFinal(FaseFinal faseFinal) {
        this.faseFinal = faseFinal;
    }
    
    
    
    
    public JTable estadisticaGoleadores(){
    
     JTable tabla = new JTable();
     DefaultTableModel model;
     Object datos[][]={};
     String columnas[]={"Nombre","Equipo","Gol(es)"};
     model = new DefaultTableModel(datos,columnas);
      tabla.setModel(model);
    Object aux[] = new Object[3];
    
    ArrayList<Jugador>lista = new ArrayList<>();
    for(int i=0;i<participantes.size();i++){
      for(int p=0;p<participantes.get(i).getJugadores().size();p++){
           lista.add(participantes.get(i).getJugadores().get(p));
      }
    
    Collections.sort(lista, new Comparator() {
	
    @Override
    public int compare(Object o1, Object o2) {
        Jugador a = new Jugador();
        Jugador b = new Jugador();
  
        a = (Jugador)o1;
        b = (Jugador)o2;
       
    return new Integer(b.getNumGoles()).compareTo(a.getNumGoles());
    }
});
    
    
    }
for(int i=0;i<lista.size();i++){
    if(lista.get(i).getNumGoles()!=0){
                         //System.out.println("ENTROOOOOO");
                         aux[0] = lista.get(i).getNombre();
                         aux[1] = lista.get(i).getEquipo().getNombre();
                         aux[2] = lista.get(i).getNumGoles();
                         model.addRow(aux);
                         }
}  tabla.setShowHorizontalLines(false);
       tabla.setShowVerticalLines(false);
  
    return tabla;
         
    }



    public void empezarSorteo(){
      Grupo grupo1=new Grupo(),
            grupo2=new Grupo(),
            grupo3=new Grupo(),
            grupo4=new Grupo();
     ArrayList<Equipo>equ1 = new ArrayList<>();
    
    Random num = new Random();
    int aux[] = new int [16];    
    int i=0,j;
    aux[i]=num.nextInt(16);
    
    for(i=1;i<16;i++){
    
    aux[i]=num.nextInt(16);
        for(j=0;j<i;j++){
        
        if(aux[i]==aux[j]){i--;}
        
         }
    }
   
   for(int k=0;k<4;k++){
   equ1.add(participantes.get(aux[k]));
   }
   grupo1.setEquipos(equ1);
   
   grupos.add(grupo1);
    ArrayList<Equipo>equ2 = new ArrayList<>();
   for(int k=4;k<8;k++){
   equ2.add(participantes.get(aux[k]));
   }
   grupo2.setEquipos(equ2);
   grupos.add(grupo2);
   ArrayList<Equipo>equ3 = new ArrayList<>();
     for(int k=8;k<12;k++){
   equ3.add(participantes.get(aux[k]));
   }
   grupo3.setEquipos(equ3);
   grupos.add(grupo3);
    ArrayList<Equipo>equ4 = new ArrayList<>();
   for(int k=12;k<16;k++){
   equ4.add(participantes.get(aux[k]));
   }
   grupo4.setEquipos(equ4);
   grupos.add(grupo4);

       
    }
    
    public void generarFechasPartidos(int num){
        //----------------| AGREGAR LOS PARTIDOS A LOS GRUPOS |----------------
     Calendar fecha1=GregorianCalendar.getInstance(),
              fecha2=GregorianCalendar.getInstance(),
              fecha3=GregorianCalendar.getInstance(), 
              fecha4=GregorianCalendar.getInstance(),
              fecha5=GregorianCalendar.getInstance(), 
              fecha6 =GregorianCalendar.getInstance(); 
     
     fecha1.set(fecha1.get(Calendar.YEAR), fecha1.get(Calendar.MONTH), fecha1.get(Calendar.DATE),0, 0, 0);
     fecha2.set(fecha1.get(Calendar.YEAR), fecha1.get(Calendar.MONTH), fecha1.get(Calendar.DATE)+2,0, 0, 0);
     fecha3.set(fecha1.get(Calendar.YEAR), fecha1.get(Calendar.MONTH), fecha1.get(Calendar.DATE)+3,0, 0, 0);
     fecha4.set(fecha1.get(Calendar.YEAR), fecha1.get(Calendar.MONTH), fecha1.get(Calendar.DATE)+4,0, 0, 0);
     fecha5.set(fecha1.get(Calendar.YEAR), fecha1.get(Calendar.MONTH), fecha1.get(Calendar.DATE)+5,0, 0, 0);
     fecha5.set(fecha1.get(Calendar.YEAR), fecha1.get(Calendar.MONTH), fecha1.get(Calendar.DATE)+6,0, 0, 0);
     fecha6.set(fecha1.get(Calendar.YEAR), fecha1.get(Calendar.MONTH), fecha1.get(Calendar.DATE)+7,0, 0, 0);
   
     // GRUPO 
      Partido nuevo = new Partido();
      nuevo.setFecha(fecha1);
      nuevo.setLocal(grupos.get(num).getEquipos().get(0));
      nuevo.setVisitante(grupos.get(num).getEquipos().get(1));
      nuevo.setNum(1);
      grupos.get(num).getPartidos().add(nuevo);
     
      
       Partido nuevo2 = new Partido();       
      nuevo2.setFecha(fecha1);          
      nuevo2.setLocal(grupos.get(num).getEquipos().get(2));
      nuevo2.setVisitante(grupos.get(num).getEquipos().get(3));
      nuevo2.setNum(1);
      grupos.get(num).getPartidos().add(nuevo2); 
      Partido nuevo3 = new Partido();
      nuevo3.setFecha(fecha2);          
      nuevo3.setLocal(grupos.get(num).getEquipos().get(0));
      nuevo3.setVisitante(grupos.get(num).getEquipos().get(2));
      nuevo3.setNum(2);
      grupos.get(num).getPartidos().add(nuevo3); 
      Partido nuevo4 = new Partido();
      nuevo4.setFecha(fecha2);          
      nuevo4.setLocal(grupos.get(num).getEquipos().get(1));
      nuevo4.setVisitante(grupos.get(num).getEquipos().get(3));
      nuevo4.setNum(2);
      grupos.get(num).getPartidos().add(nuevo4); 
      Partido nuevo5 = new Partido();
      nuevo5.setFecha(fecha3);          
      nuevo5.setLocal(grupos.get(num).getEquipos().get(0));
      nuevo5.setVisitante(grupos.get(num).getEquipos().get(3));
      nuevo5.setNum(3);
      grupos.get(num).getPartidos().add(nuevo5); 
      Partido nuevo6 = new Partido();
      nuevo6.setFecha(fecha3);          
      nuevo6.setLocal(grupos.get(num).getEquipos().get(1));
      nuevo6.setVisitante(grupos.get(num).getEquipos().get(2));
      nuevo6.setNum(3);
      grupos.get(num).getPartidos().add(nuevo6); 

       
      nuevo = new Partido();
      nuevo.setFecha(fecha4);
      nuevo.setLocal(grupos.get(num).getEquipos().get(1));
      nuevo.setVisitante(grupos.get(num).getEquipos().get(0));
      nuevo.setNum(4);
      grupos.get(num).getPartidos().add(nuevo);
      
      
      nuevo = new Partido();
      nuevo.setFecha(fecha4);
      nuevo.setLocal(grupos.get(num).getEquipos().get(3));
      nuevo.setVisitante(grupos.get(num).getEquipos().get(2));
      nuevo.setNum(4);
      grupos.get(num).getPartidos().add(nuevo);
      
     
      nuevo = new Partido();
      nuevo.setFecha(fecha5);
      nuevo.setLocal(grupos.get(num).getEquipos().get(2));
      nuevo.setVisitante(grupos.get(num).getEquipos().get(0));
      nuevo.setNum(5);
      grupos.get(num).getPartidos().add(nuevo);
      
      
      nuevo = new Partido();
      nuevo.setFecha(fecha5);
      nuevo.setLocal(grupos.get(num).getEquipos().get(3));
      nuevo.setVisitante(grupos.get(num).getEquipos().get(1));
      nuevo.setNum(5);
      grupos.get(num).getPartidos().add(nuevo);
      
       
      nuevo = new Partido();
      nuevo.setFecha(fecha6);
      nuevo.setLocal(grupos.get(num).getEquipos().get(3));
      nuevo.setVisitante(grupos.get(num).getEquipos().get(0));
      nuevo.setNum(6);
      grupos.get(num).getPartidos().add(nuevo);
      
     
      nuevo = new Partido();
      nuevo.setFecha(fecha6);
      nuevo.setLocal(grupos.get(num).getEquipos().get(2));
      nuevo.setVisitante(grupos.get(num).getEquipos().get(1));
      nuevo.setNum(6);
      grupos.get(num).getPartidos().add(nuevo);
     
           
      
    }
  public int partidosJugados(Equipo equipo,int j){
        
        int aux=0;
        
        for(int k=0;k<grupos.get(j).getPartidos().size();k++){
         
          if((grupos.get(j).getPartidos().get(k).getLocal()==equipo)||
                    grupos.get(j).getPartidos().get(k).getVisitante()==equipo
                    )
            
            {
                if(grupos.get(j).getPartidos().get(k).isEstado()){
                
                aux++;
                }
                
            }
        }      
        
        return aux;}
    
    
        public int[] estadisticaEquipo(Equipo equipo){
        ActaArbitral acta = new ActaArbitral();
        int aux[] = new int[6];
        // aux[0] goles a favor
        //aux[1] goles en contra
        //aux[2] diferencia
        //aux[3] partidos ganados
        //aux[4] partidos perdidos
        //aux[5] partidos empatados
        
        int ox=0;
        for(int p=0;p<comisionArbitral.getActas().size();p++){
            if(ox==11){break;} 
   if( (comisionArbitral.getActas().get(p).getInformacion().getLocal()== equipo)) {
         ox++;
         aux[0]=aux[0]+comisionArbitral.getActas().get(p).getInformacion().getGolesLocal();
         aux[1]=aux[1]+comisionArbitral.getActas().get(p).getInformacion().getGolesVist();
       
       if(comisionArbitral.getActas().get(p).getInformacion().getGolesLocal()>
                 comisionArbitral.getActas().get(p).getInformacion().getGolesVist()){aux[3]++; }
       if(comisionArbitral.getActas().get(p).getInformacion().getGolesLocal()<
                 comisionArbitral.getActas().get(p).getInformacion().getGolesVist()){aux[4]++;}
       if(comisionArbitral.getActas().get(p).getInformacion().getGolesLocal()==
                 comisionArbitral.getActas().get(p).getInformacion().getGolesVist()){ aux[5]++;}
         
         }
   if(comisionArbitral.getActas().get(p).getInformacion().getVisitante()== equipo){
        aux[0]=aux[0]+comisionArbitral.getActas().get(p).getInformacion().getGolesVist();
        aux[1]=aux[1]+comisionArbitral.getActas().get(p).getInformacion().getGolesLocal();
         if(comisionArbitral.getActas().get(p).getInformacion().getGolesVist()>
                 comisionArbitral.getActas().get(p).getInformacion().getGolesLocal()){aux[3]++; }
       if(comisionArbitral.getActas().get(p).getInformacion().getGolesVist()<
                 comisionArbitral.getActas().get(p).getInformacion().getGolesLocal()){aux[4]++;}
       if(comisionArbitral.getActas().get(p).getInformacion().getGolesVist()==
                 comisionArbitral.getActas().get(p).getInformacion().getGolesLocal()){ aux[5]++;}
   
   }
       }
     
        
       
      aux[2] = aux[0]-aux[1];  
    
    return aux;
    
         
    }
        
   public void partidoFinalizado(Partido partido){
   
    
    
    
    
        int pLocal = partido.getLocal().getnPunto();
        int pVist = partido.getVisitante().getnPunto();
        long inLoc =  partido.getLocal().getIngresos();
        long inVis =   partido.getVisitante().getIngresos();
          
          if(partido.getGolesLocal()>partido.getGolesVist()){
        
         partido.getLocal().setIngresos(inLoc+=1000000);
          if(faseFinal.isEstadoCuartos()==false){
              partido.getLocal().setnPunto(pLocal+=3);
          }}
          
          if(partido.getGolesLocal()<partido.getGolesVist()){
         
         partido.getVisitante().setIngresos(inVis+=1000000);
          if(faseFinal.isEstadoCuartos()==false){
         partido.getVisitante().setnPunto(pVist+=3);
          }}
          if(partido.getGolesLocal()==partido.getGolesVist()){
          partido.getLocal().setIngresos(inLoc+=500000);
          partido.getVisitante().setIngresos(inVis+=500000);
           if(faseFinal.isEstadoCuartos()==false){
          partido.getLocal().setnPunto(pLocal+=1);
         partido.getVisitante().setnPunto(pVist+=1);
          }
          }
      partido.setEstado(true);
       System.out.println("ESTADO EN FUNCION: "+partido.isEstado());
      comisionArbitral.getActas().add(partido.getActa());
    
   }     
     
   public void partidosCuartos(int gr){
  Partido nuevo = new Partido();
    Calendar fecha7 = GregorianCalendar.getInstance();
    fecha7.set(Calendar.DAY_OF_MONTH, fecha7.get(Calendar.DAY_OF_MONTH)+6);
  this.establecerClasificacion(0);this.establecerClasificacion(1);
  this.establecerClasificacion(2);this.establecerClasificacion(3);
  switch (gr){
              
      case 0:   
          
      case 1:  nuevo = new Partido();
                    
               nuevo.setFecha(fecha7);
               nuevo.setLocal(grupos.get(0).getEquipos().get(0));
               nuevo.setVisitante(grupos.get(1).getEquipos().get(1));
               faseFinal.getCuartosFinal().add(0,nuevo);
              
               nuevo=new Partido();
               nuevo.setFecha(fecha7);
               nuevo.setLocal(grupos.get(1).getEquipos().get(0));
             
               nuevo.setVisitante(grupos.get(0).getEquipos().get(1));
                
               faseFinal.getCuartosFinal().add(1,nuevo);
              
//             
              break; 
     case 2:   
     case 3:  nuevo = new Partido();
              nuevo.setFecha(fecha7);
              nuevo.setLocal(grupos.get(2).getEquipos().get(0));
              nuevo.setVisitante(grupos.get(3).getEquipos().get(1));
              faseFinal.getCuartosFinal().add(2,nuevo);
              
              nuevo=new Partido();
              nuevo.setLocal(grupos.get(3).getEquipos().get(0));
              nuevo.setFecha(fecha7);
              nuevo.setVisitante(grupos.get(2).getEquipos().get(1));
                
              faseFinal.getCuartosFinal().add(3,nuevo);
              faseFinal.setEstadoCuartos(true);
         break;
  }
  
  
  }
  
   
   
public void partidosSemis(int nPart){
Partido nuevo = new Partido();
Equipo aux = new Equipo();
Equipo aux2 = new Equipo();    
Calendar fecha8 = GregorianCalendar.getInstance();
fecha8.set(Calendar.DAY_OF_MONTH, fecha8.get(Calendar.DAY_OF_MONTH)+7);

    switch(nPart){
        
        case 1: nuevo = new Partido();
                  if(faseFinal.getCuartosFinal().get(0).getGolesLocal()>
                      faseFinal.getCuartosFinal().get(0).getGolesVist()){
               aux =   faseFinal.getCuartosFinal().get(0).getLocal();
                  }
              else{   
                  aux =   faseFinal.getCuartosFinal().get(0).getVisitante();}
            if(faseFinal.getCuartosFinal().get(1).getGolesLocal()>
                      faseFinal.getCuartosFinal().get(1).getGolesVist()){
               aux2 =   faseFinal.getCuartosFinal().get(1).getLocal();
                  }
              else{   
                  aux2 =   faseFinal.getCuartosFinal().get(1).getVisitante();}
             nuevo.setLocal(aux);nuevo.setVisitante(aux2);
             nuevo.setFecha(fecha8);
              faseFinal.getSemiFinal().add(0,nuevo);
            break;
            
            
       case 2: nuevo = new Partido();
                  if(faseFinal.getCuartosFinal().get(2).getGolesLocal()>
                      faseFinal.getCuartosFinal().get(2).getGolesVist()){
               aux =   faseFinal.getCuartosFinal().get(2).getLocal();
                  }
              else{   
                  aux =   faseFinal.getCuartosFinal().get(2).getVisitante();}
            if(faseFinal.getCuartosFinal().get(3).getGolesLocal()>
                      faseFinal.getCuartosFinal().get(3).getGolesVist()){
               aux2 =   faseFinal.getCuartosFinal().get(3).getLocal();
                  }
              else{   
                  aux2 =   faseFinal.getCuartosFinal().get(3).getVisitante();}
              nuevo.setLocal(aux);nuevo.setVisitante(aux2);
              nuevo.setFecha(fecha8);
              faseFinal.getSemiFinal().add(1,nuevo);
              faseFinal.setEstadoSemi(true);
              break;
            
            
    }
              
     
     }

public void partidoFinal(){
 Partido partido = new Partido();
 Equipo aux = new Equipo();
 Equipo aux2 = new Equipo();
Calendar fecha9 = GregorianCalendar.getInstance();
fecha9.set(fecha9.get(Calendar.YEAR), fecha9.get(Calendar.MONTH), fecha9.get(Calendar.DATE));

if(faseFinal.getSemiFinal().get(0).getGolesLocal()>
          faseFinal.getSemiFinal().get(0).getGolesVist()){
         aux = faseFinal.getSemiFinal().get(0).getLocal();
  }
  

  else{aux =faseFinal.getSemiFinal().get(0).getVisitante();}
  
   if(faseFinal.getSemiFinal().get(1).getGolesLocal()>
          faseFinal.getSemiFinal().get(1).getGolesVist()){
         aux2 = faseFinal.getSemiFinal().get(1).getLocal();
  }
  

  else{aux2 =faseFinal.getSemiFinal().get(1).getVisitante();}
   partido.setLocal(aux);
   partido.setVisitante(aux2);
   partido.setFecha(fecha9);
   this.faseFinal.setPartidoFinal(partido);
   

}





public void establecerClasificacion(int i){

    
Collections.sort(grupos.get(i).getEquipos(), new Comparator() {
	
    @Override
    public int compare(Object o1, Object o2) {
        Equipo a = new Equipo();
        Equipo b = new Equipo();
  
        a = (Equipo)o1;
        b = (Equipo)o2;
     if(b.getnPunto()==a.getnPunto()){}   
    return new Integer(b.getnPunto()).compareTo(a.getnPunto());
    }
});
}






}