
package CapaVista;

import CapaLogicaNegocios.Direccion;
import EnumDireccionEspecialidadesMedicas.Canton;
import EnumDireccionEspecialidadesMedicas.Distrito;
import EnumDireccionEspecialidadesMedicas.Provincia;
import javax.swing.table.DefaultTableModel;

public class FrmDireccion extends javax.swing.JFrame {

    private DefaultTableModel tablaModelo;
    private static Direccion direccion = null;
    
    
    public FrmDireccion() {
        initComponents();
        llenarProvincia();
       // llenarCanton();
        llenarDistrito();
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {      
        
        
    }
    
    private void llenarProvincia() {
        //System.out.println("Provincias");
        for (Provincia pro : Provincia.values()) {
           // System.out.println( pro );
            comboProvincia.addItem(pro);
        }
    }
   private void llenarCanton() {
       //for normal
       
//        for ( Canton canton : Canton.values() ){
//            comboCanton.addItem(canton);
//        }
//        
        System.out.println(""+comboCanton.getSelectedItem());
        int contador1 = 0;
        int contador2 = 0;
        
        comboCanton.getSelectedIndex();
        switch (comboProvincia.getSelectedIndex()) {
           case 0://sanJose
               contador1=1;
               contador2=16;
               
               break;
           case 1://Alajuela 15 cantones
               contador1=17;
               contador2=3;
               break;
           case 2:
           contador1=0;
           contador2=3;
           break;
           default:
               //throw new AssertionError();
       }
        
//        for (int i = contador1; i < contador2; i++) {
//           comboCanton.addItem();
//       }
       int contador3=0;
       Canton c = null;
       System.out.println("");
       comboCanton.removeAllItems();
       System.out.println("intervalo " + contador1+ " , " + contador2);
       System.out.println("Indice "+ comboProvincia.getSelectedIndex());
        for (Canton canton : Canton.values()) {
            c = canton; 
            if (contador3<=contador2 && contador3>=contador1) {
                comboCanton.addItem(c);
                System.out.println(canton);
            }
            contador3++;
        }
        
    }
   private void llenarDistrito() {
        for (Distrito dis : Distrito.values()) {
            comboDistrito.addItem(dis);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboProvincia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboCanton = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboDistrito = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSeñas = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        btnListo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Provincia: ");

        comboProvincia.setBackground(new java.awt.Color(102, 102, 0));
        comboProvincia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        comboProvincia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboProvinciaMouseClicked(evt);
            }
        });
        comboProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProvinciaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Cantón:");

        comboCanton.setBackground(new java.awt.Color(102, 102, 0));
        comboCanton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        comboCanton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboCantonMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Distrito:");

        comboDistrito.setBackground(new java.awt.Color(102, 102, 0));
        comboDistrito.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Señas:");

        txtAreaSeñas.setColumns(20);
        txtAreaSeñas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAreaSeñas.setRows(5);
        jScrollPane1.setViewportView(txtAreaSeñas);

        btnAgregar.setBackground(new java.awt.Color(102, 102, 0));
        btnAgregar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnListo.setBackground(new java.awt.Color(102, 102, 0));
        btnListo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnListo.setText("Listo");
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboCanton, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        dispose();
    }//GEN-LAST:event_btnListoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
 
        //se deben de guardar las archivos en 
        //“Distribución_Territorial_Costa_Rica.txt"
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void comboProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProvinciaActionPerformed

        llenarCanton();
    }//GEN-LAST:event_comboProvinciaActionPerformed

    private void comboProvinciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboProvinciaMouseClicked
       llenarCanton();
       comboProvincia.getSelectedItem();
    }//GEN-LAST:event_comboProvinciaMouseClicked

    private void comboCantonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCantonMouseClicked
                   // TODO add your handling code here:
                   llenarCanton();
    }//GEN-LAST:event_comboCantonMouseClicked

    int indiceSelecionado;
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnListo;
    private javax.swing.JComboBox<Canton> comboCanton;
    private javax.swing.JComboBox<Distrito> comboDistrito;
    private javax.swing.JComboBox<Provincia> comboProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtAreaSeñas;
    // End of variables declaration//GEN-END:variables
}
