package Persistencia;
import java.io.*;
import Logica.*;



   public  class Datos  implements Serializable{

    public Datos() {
       
    }
       
       
       
    public  void guardar(Uefa uefa) {
        try {
            ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream("MIUEFA.BIN"));
            guardar.writeObject(uefa);
            
            
        } catch (IOException e) {
            System.out.println("No se pudo Guardar");
        }
    }
    
        
    public Uefa cargar() {
        try {
            ObjectInputStream cargar = new ObjectInputStream(new FileInputStream("MIUEFA.BIN"));
            Uefa info = (Uefa) cargar.readObject();
            return info;
           } catch (IOException | ClassNotFoundException e) {
               System.out.println("Archivo vacio");
            return null;
           }
        
    
    }
    
       public Uefa cargarExistente() {
        try {
            ObjectInputStream cargar = new ObjectInputStream(new FileInputStream("UefaCargada.dat"));
            Uefa info = (Uefa) cargar.readObject();
            return info;
           } catch (IOException | ClassNotFoundException e) {
               System.out.println("Archivo vacio");
            return null;
           }
        
    
    }


    
    
}
