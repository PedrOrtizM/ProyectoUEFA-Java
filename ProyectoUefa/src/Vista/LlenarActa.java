/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.ActaArbitral;
import Logica.Jugador;
import static Logica.Main.miUefa;
import Logica.Partido;
import Logica.Suceso;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro ortiz
 */
public class LlenarActa extends javax.swing.JDialog {

    /**
     * Creates new form LlenarActa
     */
    
    // FALTA GUARDAR LA ACTA EN LA UEFA Y EN EL ARCHIVO SERIALIZABLE
    Partido parti;
    ActaArbitral actaNueva;
    DefaultComboBoxModel modelEquipos;
    DefaultComboBoxModel mdJugLocal;
    DefaultComboBoxModel mdJugVist;
    DefaultTableModel md;
    String datos[][]={};
    String columnas[]={"Implicado"," Equipo","Tipo","Min"}; 
    int ngoles=0,ngoles2=0,gr,pa;
    
    
    public LlenarActa(java.awt.Frame parent, boolean modal,Partido miPartido) {
        super(parent, modal);
        initComponents();
        actaNueva = new ActaArbitral();
       parti = new Partido();
        
        md = new DefaultTableModel(datos,columnas);
       
       CBjugador.setEnabled(false);
        // ----------------- COMBO BOX DE EQUIPOS --------------------------
        modelEquipos = new DefaultComboBoxModel();
        modelEquipos.addElement("Seleccione");
        modelEquipos.addElement(miPartido.getLocal().getNombre());
        modelEquipos.addElement(miPartido.getVisitante().getNombre());
        CBequipo.setModel(modelEquipos);
        
         // ----------------- COMBO BOX DE JUGADORES LOCAL -------------------
        mdJugLocal = new DefaultComboBoxModel();
        mdJugLocal.addElement("Seleccione");
        
        for(int i=0;i<miPartido.getLocal().getJugadores().size();i++){
        
        mdJugLocal.addElement(miPartido.getLocal().getJugadores().get(i).getNombre()+" "
                
                +miPartido.getLocal().getJugadores().get(i).getApellidos());
        
        
        }
         // ----------------- COMBO BOX DE JUGADORES VIST -------------------
        mdJugVist = new DefaultComboBoxModel();
        mdJugVist.addElement("Seleccione");
        
        for(int i=0;i<miPartido.getVisitante().getJugadores().size();i++){
        
        mdJugVist.addElement(miPartido.getVisitante().getJugadores().get(i).getNombre()+" "+
                
                miPartido.getVisitante().getJugadores().get(i).getApellidos());
        
        
        }
        JLnombreLocal.setText(miPartido.getLocal().getNombre());
        JLnombreVist.setText(miPartido.getVisitante().getNombre());
        // IMAGEN ESCUDO LOCAL
         if(miPartido.getLocal().getEscudo()!=null){
         ImageIcon icon = new ImageIcon(miPartido.getLocal().getEscudo());
         Icon icono = new ImageIcon(icon.getImage());          
             JLescudoLocal.setText(null);
             JLescudoLocal.setIcon(icono);
         }
        // IMAGEN ESCUDO VISITANTE
          if(miPartido.getVisitante().getEscudo()!=null){
         ImageIcon icon2 = new ImageIcon(miPartido.getVisitante().getEscudo());
         Icon icono2 = new ImageIcon(icon2.getImage());          
             jLabel4.setText(null);
             jLabel4.setIcon(icono2);
          }
          
         
          JLlugar.setText("Santiago Bernabeu");
        
        
        parti = miPartido;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CBtipoSuceso = new javax.swing.JComboBox();
        CBjugador = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CBequipo = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        JSmin = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        JLnombreVist = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JLescudoLocal = new javax.swing.JLabel();
        JLnombreLocal = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        JLlocal = new javax.swing.JLabel();
        JLvist = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JLlugar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTsucesos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Acta Arbitral");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 11, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registro Sucesos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("EQUIPO:");

        CBtipoSuceso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Gol", "Amarrilla", "Roja", "Otro" }));

        CBjugador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sleccione", "Iker", "Carvajal", "Pepe", "Ramos", "Marcelo", "Kroos", "Modric", "Bale", "James", "Cristiano", "Benzema" }));
        CBjugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBjugadorActionPerformed(evt);
            }
        });

        jButton1.setText("AGREGAR ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("JUGADOR:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("MINUTO:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("TIPO:");

        CBequipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Local", "Visitante" }));
        CBequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBequipoActionPerformed(evt);
            }
        });

        jButton4.setText("ELIMINAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        JSmin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 90, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBequipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JSmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CBjugador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBtipoSuceso, 0, 104, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CBequipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(CBjugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(CBtipoSuceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JSmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 268, 530, 210));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Informacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        JLnombreVist.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLnombreVist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLnombreVist.setText("VISITANTE");
        JLnombreVist.setToolTipText("");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shield-128.png"))); // NOI18N
        jLabel4.setToolTipText("");

        JLescudoLocal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLescudoLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shield-128.png"))); // NOI18N

        JLnombreLocal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLnombreLocal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLnombreLocal.setText("LOCAL");

        JLlocal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JLlocal.setText("0");

        JLvist.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JLvist.setText("0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("-");

        JLlugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLlugar.setText("jLabel2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(JLlocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(47, 47, 47)
                        .addComponent(JLvist))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(JLlugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLlocal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLvist, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(JLlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLescudoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(JLnombreLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLnombreVist, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombreVist)
                    .addComponent(JLnombreLocal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLescudoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 58, 530, 210));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Todos Sucesos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        JTsucesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Implicado", " Equipo", "Tipo", "Minuto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTsucesos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 520, -1));

        jButton2.setText("GUARDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CANCELAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(575, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 550, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        
        if(CBequipo.getSelectedIndex()==0 || CBjugador.getSelectedIndex()==0 ||
               CBtipoSuceso.getSelectedIndex()==0){
       
           
           JOptionPane.showMessageDialog(null, " FALTAN CAMPOS POR LLENAR ");
           
        }
       
        
      
      
        else{
            
               
               Suceso nuevoSuceso = new Suceso();
        
               actaNueva.setInformacion(parti);
               
               if(CBequipo.getSelectedIndex()==1){
               nuevoSuceso.setImplicado(parti.getLocal().getJugadores().get(CBjugador.getSelectedIndex()-1));
               }
                if(CBequipo.getSelectedIndex()==2){
               nuevoSuceso.setImplicado(parti.getVisitante().getJugadores().get(CBjugador.getSelectedIndex()-1));
               
               }
               
               nuevoSuceso.setMinuto((int)JSmin.getValue());
               nuevoSuceso.setTipo(CBtipoSuceso.getSelectedIndex());
               if(verificarTarjeta(actaNueva, nuevoSuceso.getImplicado(),nuevoSuceso.getTipo())==true){
               
                  actaNueva.getSucesos().add(nuevoSuceso);
                JOptionPane.showMessageDialog(null, "SUCESO AGREGADO");
               
              
              
               
               if(CBtipoSuceso.getSelectedIndex()==1){
                   if(CBequipo.getSelectedIndex()==1){
                       ngoles++; 
                       JLlocal.setText(String.valueOf(ngoles));
                       parti.setGolesLocal(ngoles);
                nuevoSuceso.getImplicado().setNumGoles( nuevoSuceso.getImplicado().getNumGoles()+1);
                                 }
                    else{
                        ngoles2++;
                        JLvist.setText(String.valueOf(ngoles2));
                        parti.setGolesLocal(ngoles);
                       nuevoSuceso.getImplicado().setNumGoles( nuevoSuceso.getImplicado().getNumGoles()+1);
                   }
                   
                   
                   }
                 String aux=null;
                 if(nuevoSuceso.getTipo()==1){aux="Goool";}
                 if(nuevoSuceso.getTipo()==2){aux="Amarilla";}
                 if(nuevoSuceso.getTipo()==3){aux="Roja";}
                 if(nuevoSuceso.getTipo()==4){aux="Otro";}
                 
                 Object data[] = new Object[4];
                 data[0] = nuevoSuceso.getImplicado().getNombre();
                 data[1] = nuevoSuceso.getImplicado().getEquipo().getNombre();
                 data[2] = aux;
                 data[3] = nuevoSuceso.getMinuto();
                 md.addRow(data);
                 JTsucesos.setModel(md);
               }
               else{JOptionPane.showMessageDialog(rootPane, "ESTE JUGADOR HA SIDO EXPULSADO");}
               
                }
        
     
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

      // PARA EL TIPO DE SUCESO
    // 1 : SI ES GOL
    // 2 : SI ES AMARILLA
    // 3 : SI ES ROJA 
    // 4 : OTRA INCIDENCIA
    public boolean verificarTarjeta(ActaArbitral acta,Jugador jugador,int tipo){
        int aux=0,aux2=0;
        
        
                     for(int i=0;i<acta.getSucesos().size();i++){    
        
                     if(acta.getSucesos().get(i).getImplicado() == jugador){
                     
                         if(acta.getSucesos().get(i).getTipo()==2){
                            aux++;
                             System.out.println("222");
                            }
                         if(acta.getSucesos().get(i).getTipo()==3){
                            aux2++;   
                             System.out.println("222");
                            }
                         
                     }
                     }
                     
        
                       if(tipo==2 || tipo==1 || tipo==4){  
                  if((aux==1 || aux==0) && aux2==0){return true;} 
                  
                  if(aux2!=0){return false;}
                  if(aux==2){return false;}
                  
      
        }
                   if(tipo==3){   if((aux==0 || aux==1) && aux2==0){return true;}
                       
                       }
                   System.out.println("ultimo rreutnr");
                       return false;
    
    }
    private void CBequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBequipoActionPerformed
       if(CBequipo.getSelectedIndex()==0){CBjugador.setEnabled(false);}
       if(CBequipo.getSelectedIndex()==1){
                                         CBjugador.setModel(mdJugLocal);
                                         CBjugador.setEnabled(true);}
       if(CBequipo.getSelectedIndex()==2){
                                         CBjugador.setModel(mdJugVist);
                                         CBjugador.setEnabled(true);}
       
    }//GEN-LAST:event_CBequipoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        actaNueva.setInformacion(parti);
                    
         parti.setGolesLocal(ngoles);
         parti.setGolesVist(ngoles2);
         parti.setActa(actaNueva);
          
          miUefa.partidoFinalizado(parti);
            
      
       JOptionPane.showMessageDialog(null," ACTA REGISTRADA CON EXITO ");
       dispose();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 
   
       
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CBjugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBjugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBjugadorActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBequipo;
    private javax.swing.JComboBox CBjugador;
    private javax.swing.JComboBox CBtipoSuceso;
    private javax.swing.JLabel JLescudoLocal;
    private javax.swing.JLabel JLlocal;
    private javax.swing.JLabel JLlugar;
    private javax.swing.JLabel JLnombreLocal;
    private javax.swing.JLabel JLnombreVist;
    private javax.swing.JLabel JLvist;
    private javax.swing.JSpinner JSmin;
    private javax.swing.JTable JTsucesos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
