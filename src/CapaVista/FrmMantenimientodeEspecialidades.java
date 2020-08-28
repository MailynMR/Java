package CapaVista;

import CapaLogicaNegocios.ClaseEspecialidades;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmMantenimientodeEspecialidades extends javax.swing.JFrame {

    private DefaultTableModel tablaModelo;
    private static ClaseEspecialidades especialidadesMantenimiento = null;

    public FrmMantenimientodeEspecialidades() {
        initComponents();
        tablaModelo = (DefaultTableModel) jTblEspecialidad.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jToolBar2 = new javax.swing.JToolBar();
        jBtnGuardar1 = new javax.swing.JButton();
        jBtnModificar1 = new javax.swing.JButton();
        jBtnEliminar1 = new javax.swing.JButton();
        jBtnConsultar1 = new javax.swing.JButton();
        jBtnCancelar1 = new javax.swing.JButton();
        jBtnSalir1 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jBtnGuardar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnConsultar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblEspecialidad = new javax.swing.JTable();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar2.setRollover(true);

        jBtnGuardar1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salvar_Disco2.png"))); // NOI18N
        jBtnGuardar1.setText("Guardar");
        jBtnGuardar1.setFocusable(false);
        jBtnGuardar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnGuardar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardar1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jBtnGuardar1);

        jBtnModificar1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnModificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Modificar.png"))); // NOI18N
        jBtnModificar1.setText("Modificar");
        jBtnModificar1.setFocusable(false);
        jBtnModificar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnModificar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificar1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jBtnModificar1);

        jBtnEliminar1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.jpg"))); // NOI18N
        jBtnEliminar1.setText("Eliminar");
        jBtnEliminar1.setFocusable(false);
        jBtnEliminar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnEliminar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminar1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jBtnEliminar1);

        jBtnConsultar1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnConsultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Consultar.png"))); // NOI18N
        jBtnConsultar1.setText("Consultar");
        jBtnConsultar1.setFocusable(false);
        jBtnConsultar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnConsultar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultar1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jBtnConsultar1);

        jBtnCancelar1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar.png"))); // NOI18N
        jBtnCancelar1.setText("Cancelar");
        jBtnCancelar1.setFocusable(false);
        jBtnCancelar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnCancelar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jBtnCancelar1);

        jBtnSalir1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        jBtnSalir1.setText("Salir");
        jBtnSalir1.setFocusable(false);
        jBtnSalir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnSalir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalir1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jBtnSalir1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        jBtnGuardar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salvar_Disco2.png"))); // NOI18N
        jBtnGuardar.setText("Guardar");
        jBtnGuardar.setFocusable(false);
        jBtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnGuardar);

        jBtnModificar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Modificar.png"))); // NOI18N
        jBtnModificar.setText("Modificar");
        jBtnModificar.setFocusable(false);
        jBtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnModificar);

        jBtnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.jpg"))); // NOI18N
        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.setFocusable(false);
        jBtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnEliminar);

        jBtnConsultar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Consultar.png"))); // NOI18N
        jBtnConsultar.setText("Consultar");
        jBtnConsultar.setFocusable(false);
        jBtnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnConsultar);

        jBtnCancelar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.setFocusable(false);
        jBtnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnCancelar);

        jBtnSalir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        jBtnSalir.setText("Salir");
        jBtnSalir.setFocusable(false);
        jBtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnSalir);

        jTblEspecialidad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTblEspecialidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Especialidad", "Nombre del Doctor"
            }
        ));
        jScrollPane1.setViewportView(jTblEspecialidad);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        // TODO add your handling code here:
        JDlgEspecialidad dlgCiudad = new JDlgEspecialidad("", TipoMantenimientoEspecialidad.AGREGAR);
        dlgCiudad.setModal(true);//Indica que no se puede pasar a la ventana anterior mientras no se cierre esta
        dlgCiudad.setLocationRelativeTo(null);
        dlgCiudad.setVisible(true);
        //Cuando regresa del JDialog debe traer el departamento a agregar
        
        
    if (this.especialidadesMantenimiento != null) {
        //Agrega el departamento al archivo
try {
    ClaseEspecialidades.agregarEspecialidad(especialidadesMantenimiento); //Agrega el departamento al archivo
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "Error al grabar el Especialidad " + "\n" + ex.toString() + "\n" + ex.getMessage());
    return;
}
        //actualiza la tabla con el nuevo departamento
        llenaTablaEspecialidad();
    }
    
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void llenaTablaEspecialidad() {
        //Llama al método que llena la lista con los Departamentos del ArrayList
        //Llena la tabla con los Departamentos que se grabaron en el ArrayList

        this.tablaModelo.setRowCount(0);//Limpia la tabla
        Object[] datos = new Object[3];
        ArrayList<ClaseEspecialidades> lista = new ArrayList<ClaseEspecialidades>();
        try {
            lista = ClaseEspecialidades.arrayEspecialidad(); //Invoca al método que retorna una ArrayList de Departamentos
        } catch (Exception e) {
        }
        for (int i = 0; i < lista.size(); i++) {
            datos[0] = lista.get(i).getCodigo();
            datos[1] = lista.get(i).getEspecialidad();
            datos[2] = lista.get(i).getDoctor();
            tablaModelo.addRow(datos); //Agrega el arreglo como una nueva fila de la tabla
        }
    }


    public static ClaseEspecialidades getEspecialidadesMantenimiento() {
        return especialidadesMantenimiento;
    }

    public static void setEspecialidadesMantenimiento(ClaseEspecialidades especialidadesMantenimiento) {
        FrmMantenimientodeEspecialidades.especialidadesMantenimiento = especialidadesMantenimiento;
    }
    
    

    private void activarBotonesModificarEliminar() {
        jBtnGuardar.setEnabled(false);
        jBtnEliminar.setEnabled(true);
        jBtnModificar.setEnabled(true);
        jBtnCancelar.setEnabled(true);
    }

    private void desactivarBotonesModificarEliminar() {
        jBtnGuardar.setEnabled(true);
        jBtnEliminar.setEnabled(false);
        jBtnModificar.setEnabled(false);
        jBtnCancelar.setEnabled(false);
    }

    private void limpiar() {
        desactivarBotonesModificarEliminar();
    }
    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed

        if (jTblEspecialidad.getSelectedRow() >= 0) {
            String codigo = jTblEspecialidad.getValueAt(jTblEspecialidad.getSelectedRow(), 0).toString();
            JDlgEspecialidad dlgEspecialidad
                    = new JDlgEspecialidad(codigo, TipoMantenimientoEspecialidad.MODIFICAR);//OJO se envía al contructor del JDialog el código del depto
            dlgEspecialidad.setModal(true);//Indica que no se puede pasar a la ventana anterior mientras no se cierre esta
            dlgEspecialidad.setLocationRelativeTo(null);
            dlgEspecialidad.setVisible(true);
            //Cuando regresa del JDialog debe traer el departamento con los atributos modificados
            if (this.especialidadesMantenimiento != null) {
                //Modifica el departamento de la lista
                try {
                    ClaseEspecialidades.modificarEspecialiadad(especialidadesMantenimiento);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al modificar la ciudad" + "\n" + ex.toString());
                    return;
                }

                llenaTablaEspecialidad(); //actualiza la tabla con el nuevo departamento
            }
            jTblEspecialidad.clearSelection();;
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la ciudad a modificar");
            return;
        }
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
        if (jTblEspecialidad.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la ciudad a eliminar");
            return;
        }
        String codigo
                = jTblEspecialidad.getValueAt(jTblEspecialidad.getSelectedRow(), 0).toString();
        try {
            ClaseEspecialidades.eliminarEspecialidad(codigo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la Especialidad" + "\n" + ex.toString());
        }
        llenaTablaEspecialidad(); //actualiza la tabla con el nuevo departamento

    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultarActionPerformed
        if (jTblEspecialidad.getSelectedRow() >= 0) {
            String codigo = jTblEspecialidad.getValueAt(jTblEspecialidad.getSelectedRow(), 0).toString();
            JDlgEspecialidad dlgEspecialidad = new JDlgEspecialidad(codigo, TipoMantenimientoEspecialidad.CONSULTAR);//OJO se envía al contructor del JDialog el código del depto
            dlgEspecialidad.setModal(true);//Indica que no se puede pasar a la ventana anterior mientras no se cierre esta
            dlgEspecialidad.setLocationRelativeTo(null);
            dlgEspecialidad.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la especialidad a consultar");
            return;
        }
        jTblEspecialidad.clearSelection();
    }//GEN-LAST:event_jBtnConsultarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        desactivarBotonesModificarEliminar();
        limpiar();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnGuardar1ActionPerformed

    private void jBtnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnModificar1ActionPerformed

    private void jBtnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnEliminar1ActionPerformed

    private void jBtnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConsultar1ActionPerformed

    private void jBtnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCancelar1ActionPerformed

    private void jBtnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSalir1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientodeEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientodeEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientodeEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientodeEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMantenimientodeEspecialidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnCancelar1;
    private javax.swing.JButton jBtnConsultar;
    private javax.swing.JButton jBtnConsultar1;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnEliminar1;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnGuardar1;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jBtnModificar1;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jBtnSalir1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblEspecialidad;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
