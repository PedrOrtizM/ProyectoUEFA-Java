/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import static Logica.Main.miUefa;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author pedro ortiz
 */
public class PanelCalendario2 extends javax.swing.JPanel {

    /**
     * Creates new form PanelCalendario2
     */
    int grupo,fecha;
    public PanelCalendario2() {
        initComponents();
        grupo=0;fecha=1;
        JLfecha.setText("Fecha 1");
        JBatrasFech.setEnabled(false);
        JBatrasGru.setEnabled(false);
        mostrar();
      
        
        
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
        JLescudoLocalP1 = new javax.swing.JLabel();
        JLfecha = new javax.swing.JLabel();
        JBatrasFech = new javax.swing.JButton();
        JBsiguienteFec = new javax.swing.JButton();
        JLlocal1 = new javax.swing.JLabel();
        JLvist1 = new javax.swing.JLabel();
        JLvist2 = new javax.swing.JLabel();
        JLlocal2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JLescudoVisP1 = new javax.swing.JLabel();
        JLgolesLocal1 = new javax.swing.JLabel();
        JLgolesVis1 = new javax.swing.JLabel();
        JLgolesLocal2 = new javax.swing.JLabel();
        JLgolesLVis2 = new javax.swing.JLabel();
        JL = new javax.swing.JLabel();
        JL2 = new javax.swing.JLabel();
        JLfechaPartido = new javax.swing.JLabel();
        JLgrupo = new javax.swing.JLabel();
        JBsiguienteGr = new javax.swing.JButton();
        JBatrasGru = new javax.swing.JButton();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALENDARIO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 811, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLescudoLocalP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barcelona (2).png"))); // NOI18N

        JLfecha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        JLfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLfecha.setText("FECHA 1");

        JBatrasFech.setText("<");
        JBatrasFech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBatrasFechActionPerformed(evt);
            }
        });

        JBsiguienteFec.setText(">");
        JBsiguienteFec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsiguienteFecActionPerformed(evt);
            }
        });

        JLlocal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JLlocal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLlocal1.setText("Real Madrid");

        JLvist1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JLvist1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLvist1.setText("Real Madrid");

        JLvist2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JLvist2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLvist2.setText("Real Madrid");

        JLlocal2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JLlocal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLlocal2.setText("Real Madrid");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barcelona (2).png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barcelona (2).png"))); // NOI18N

        JLescudoVisP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barcelona (2).png"))); // NOI18N

        JLgolesLocal1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JLgolesLocal1.setText("-");

        JLgolesVis1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JLgolesVis1.setText("-");

        JLgolesLocal2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JLgolesLocal2.setText("-");

        JLgolesLVis2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JLgolesLVis2.setText("-");

        JL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JL.setText("-");

        JL2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JL2.setText("-");

        JLfechaPartido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JLfechaPartido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLfechaPartido.setText("Real Madrid");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLlocal1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLlocal2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLvist2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLvist1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLescudoLocalP1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JLgolesLocal2)
                        .addComponent(JLgolesLocal1))
                    .addComponent(JBatrasFech, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(JLfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL2)
                            .addComponent(JL, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLgolesVis1)
                            .addComponent(JLgolesLVis2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(JLescudoVisP1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(JBsiguienteFec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(JLfechaPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBatrasFech, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBsiguienteFec, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLlocal1)
                    .addComponent(JLvist1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLgolesLocal1)
                                .addComponent(JLgolesVis1)
                                .addComponent(JL))
                            .addComponent(JLescudoLocalP1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLvist2)
                            .addComponent(JLlocal2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLgolesLocal2)
                                .addComponent(JLgolesLVis2)
                                .addComponent(JL2)))
                        .addGap(52, 52, 52)
                        .addComponent(JLfechaPartido)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLescudoVisP1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 145, 530, -1));

        JLgrupo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        JLgrupo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLgrupo.setText("GRUPO A");
        add(JLgrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 112, 350, 21));

        JBsiguienteGr.setText(">");
        JBsiguienteGr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsiguienteGrActionPerformed(evt);
            }
        });
        add(JBsiguienteGr, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, 13));

        JBatrasGru.setText("<");
        JBatrasGru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBatrasGruActionPerformed(evt);
            }
        });
        add(JBatrasGru, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, 15));
    }// </editor-fold>//GEN-END:initComponents

    
    private void mostrar(){
         JLgolesLocal1.setText("-");
         JLgolesLocal2.setText("-");
         JLgolesVis1.setText("-");
         JLgolesLVis2.setText("-");
         JL.setText("");
         JL2.setText("");
       
        boolean ax=false;
        for(int k=0;k< miUefa.getGrupos().get(grupo).getPartidos().size();k++){
        
        if(miUefa.getGrupos().get(grupo).getPartidos().get(k).getNum()==fecha && ax==false){
        JLlocal1.setText(miUefa.getGrupos().get(grupo).getPartidos().get(k).getLocal().getNombre());
         ImageIcon icon = new ImageIcon(miUefa.getGrupos().get(grupo).getPartidos().get(k).getLocal().getEscudo());
         Icon icono = new ImageIcon(icon.getImage().getScaledInstance(69, 70, Image.SCALE_DEFAULT));          
         JLescudoLocalP1.setIcon(icono);
        
         JLvist1.setText(miUefa.getGrupos().get(grupo).getPartidos().get(k).getVisitante().getNombre());
        ax=true;
        if(miUefa.getGrupos().get(grupo).getPartidos().get(k).isEstado()){
            JLgolesLocal1.setText(""+miUefa.getGrupos().get(grupo).getPartidos().get(k).getGolesLocal());
            JLgolesVis1.setText(""+miUefa.getGrupos().get(grupo).getPartidos().get(k).getGolesVist());
            JL.setText("-");
           
          
        }
        
        }
        else{
            if(miUefa.getGrupos().get(grupo).getPartidos().get(k).getNum()==fecha){
           
        JLlocal2.setText(miUefa.getGrupos().get(grupo).getPartidos().get(k).getLocal().getNombre());
        JLvist2.setText(miUefa.getGrupos().get(grupo).getPartidos().get(k).getVisitante().getNombre());
        if(miUefa.getGrupos().get(grupo).getPartidos().get(k).isEstado()){
        JLgolesLocal2.setText(""+miUefa.getGrupos().get(grupo).getPartidos().get(k).getGolesLocal());
        JLgolesLVis2.setText(""+miUefa.getGrupos().get(grupo).getPartidos().get(k).getGolesVist());
         JL2.setText("-");
        }
        
         }
        }
        }
    
    }
    private void JBsiguienteFecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsiguienteFecActionPerformed
       boolean ax=false;
       
          JBatrasFech.setEnabled(true);
          fecha++;
          JLfecha.setText("Fecha "+fecha);
         if(fecha==6){JBsiguienteFec.setEnabled(false);}
          mostrar();
    }//GEN-LAST:event_JBsiguienteFecActionPerformed

    private void JBatrasFechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBatrasFechActionPerformed
     
        
          JBsiguienteFec.setEnabled(true);
          fecha--;
          JLfecha.setText("Fecha "+fecha);
          if(fecha==1){JBatrasFech.setEnabled(false);}
          mostrar();
       
    }//GEN-LAST:event_JBatrasFechActionPerformed

    private void JBsiguienteGrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsiguienteGrActionPerformed
       JBatrasGru.setEnabled(true);
       String au="";
        grupo++;
        fecha=1;
        JBsiguienteFec.setEnabled(true);
        JBatrasFech.setEnabled(false);
        if(grupo==0){au="A";}if(grupo==1){au="B";}if(grupo==2){au="C";}if(grupo==3){au="D";}
         JLfecha.setText("Fecha "+fecha);
        JLgrupo.setText("GRUPO "+au);
        if(grupo==3){JBsiguienteGr.setEnabled(false);}
        
        mostrar();
      
    }//GEN-LAST:event_JBsiguienteGrActionPerformed

    private void JBatrasGruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBatrasGruActionPerformed
          JBsiguienteGr.setEnabled(true);
       String au="";
        grupo--;
        fecha=1;
        JBsiguienteFec.setEnabled(true);
        JBatrasFech.setEnabled(false);
        if(grupo==0){au="A";}if(grupo==1){au="B";}if(grupo==2){au="C";}if(grupo==3){au="D";}
         JLfecha.setText("Fecha "+fecha);
        JLgrupo.setText("GRUPO "+au);
        if(grupo==0){JBatrasGru.setEnabled(false);}
        
        mostrar();
    }//GEN-LAST:event_JBatrasGruActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBatrasFech;
    private javax.swing.JButton JBatrasGru;
    private javax.swing.JButton JBsiguienteFec;
    private javax.swing.JButton JBsiguienteGr;
    private javax.swing.JLabel JL;
    private javax.swing.JLabel JL2;
    private javax.swing.JLabel JLescudoLocalP1;
    private javax.swing.JLabel JLescudoVisP1;
    private javax.swing.JLabel JLfecha;
    private javax.swing.JLabel JLfechaPartido;
    private javax.swing.JLabel JLgolesLVis2;
    private javax.swing.JLabel JLgolesLocal1;
    private javax.swing.JLabel JLgolesLocal2;
    private javax.swing.JLabel JLgolesVis1;
    private javax.swing.JLabel JLgrupo;
    private javax.swing.JLabel JLlocal1;
    private javax.swing.JLabel JLlocal2;
    private javax.swing.JLabel JLvist1;
    private javax.swing.JLabel JLvist2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}