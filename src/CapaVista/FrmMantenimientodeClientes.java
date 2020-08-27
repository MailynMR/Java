
package CapaVista;

import CapaLogicaNegocios.ClasedeMantenimientoCliente;
import CapaLogicaNegocios.MantenimientodeEspecialidadesMédicas;
import CapaLogicaNegocios.Profesion;
import EnumDireccionEspecialidadesMedicas.Distrito;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrmMantenimientodeClientes extends javax.swing.JInternalFrame {

    //MantenimientodeEspecialidadesMédicas
    private DefaultTableModel tablaModelo;
    private static MantenimientodeEspecialidadesMédicas mantenimientoMedicos= null;

    
    
    public FrmMantenimientodeClientes() {
        for (int i = 0; i < 1000; i++) {
          txtIdentificador.setText(i+ "");
        }
        
        initComponents();
        llenarProfesion();
        
        tablaModelo = (DefaultTableModel)tablaCliente.getModel();
    }

    private void llenarProfesion() {
        for (Profesion prof : Profesion.values()) {
            comboProfesion.addItem(prof);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDocIdentificacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefonoOficina = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefonoCasa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNivelEscolaridad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        btnRegistraCliente = new javax.swing.JButton();
        btnActualizarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        comboProfesion = new javax.swing.JComboBox<>();
        btnAtras = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTelefonoCelular = new javax.swing.JTextField();
        txtNivelIngresos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Identificador: ");

        txtIdentificador.setEditable(false);
        txtIdentificador.setBackground(new java.awt.Color(153, 153, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Documento de Identificación: ");

        txtDocIdentificacion.setBackground(new java.awt.Color(153, 153, 0));
        txtDocIdentificacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Nombre Completo: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Telefono casa:");

        txtNombre.setBackground(new java.awt.Color(153, 153, 0));
        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtApellidos.setBackground(new java.awt.Color(153, 153, 0));
        txtApellidos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Apellidos: ");

        txtTelefonoOficina.setBackground(new java.awt.Color(153, 153, 0));
        txtTelefonoOficina.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Telefono de Celular:");

        txtTelefonoCasa.setBackground(new java.awt.Color(153, 153, 0));
        txtTelefonoCasa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Telefono de la Oficina:");

        txtNivelEscolaridad.setBackground(new java.awt.Color(153, 153, 0));
        txtNivelEscolaridad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Dirección:");

        btnAgregar.setBackground(new java.awt.Color(153, 153, 0));
        btnAgregar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaCliente.setBackground(new java.awt.Color(153, 153, 0));
        tablaCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cedula", "Nombre completo", "Telefono casa", "Telefono Oficina", "Telefono Celular", "Direccion", "Profesion", "Nivel de escolaridad", "Nivel de ingresos"
            }
        ));
        jScrollPane1.setViewportView(tablaCliente);

        btnRegistraCliente.setBackground(new java.awt.Color(153, 153, 0));
        btnRegistraCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRegistraCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Modificar.png"))); // NOI18N
        btnRegistraCliente.setText("Registrar Cliente");
        btnRegistraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraClienteActionPerformed(evt);
            }
        });

        btnActualizarCliente.setBackground(new java.awt.Color(153, 153, 0));
        btnActualizarCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar cliente 32px.png"))); // NOI18N
        btnActualizarCliente.setText("Actualizar Cliente");

        btnEliminarCliente.setBackground(new java.awt.Color(153, 153, 0));
        btnEliminarCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar_usuario 32 px.png"))); // NOI18N
        btnEliminarCliente.setText("Eliminar Cliente");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Profesión: ");

        comboProfesion.setBackground(new java.awt.Color(153, 153, 0));
        comboProfesion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboProfesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProfesionActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(153, 153, 0));
        btnAtras.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel10.setText("Nivel de escolaridad: ");

        txtTelefonoCelular.setBackground(new java.awt.Color(153, 153, 0));
        txtTelefonoCelular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtNivelIngresos.setBackground(new java.awt.Color(153, 153, 0));
        txtNivelIngresos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel11.setText("Nivel de ingresos: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDocIdentificacion)
                        .addComponent(txtApellidos)
                        .addComponent(txtNombre)
                        .addComponent(txtIdentificador)
                        .addComponent(txtTelefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTelefonoOficina)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboProfesion, javax.swing.GroupLayout.Alignment.TRAILING, 0, 169, Short.MAX_VALUE)
                        .addComponent(txtNivelEscolaridad, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtTelefonoCelular, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtNivelIngresos)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnRegistraCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtras)
                        .addContainerGap(288, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnRegistraCliente)
                                .addComponent(btnActualizarCliente)
                                .addComponent(btnAtras)))
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDocIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefonoOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtNivelEscolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNivelIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
     FrmDireccion d = new FrmDireccion();
     d.setVisible(true);
     d.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void llenarTablaClientes(){
        this.tablaModelo.setRowCount(0);//Limpia la tabla
        Object[] datos = new Object[10];
        ArrayList<ClasedeMantenimientoCliente> lista = new ArrayList<ClasedeMantenimientoCliente>();
        try {
            lista = ClasedeMantenimientoCliente.arrayMantenimiento(); //Invoca al método que retorna una ArrayList de Departamentos
        } catch (Exception e) {
        }
        for (int i = 0; i < lista.size(); i++) {
            datos[0] = lista.get(i).getIdentificador();
            datos[1] = lista.get(i).getDOC_id();
            datos[2] = lista.get(i).getNombre()+ " " + lista.get(i).getApellido();
            datos[3] = lista.get(i).getTelefonoHabitacion();
            datos[4] = lista.get(i).getTelefonoOficina();
            datos[5] = lista.get(i).getTelefonoCelular();
            datos[6] = lista.get(i).getDireccion();
            datos[7] = lista.get(i).getProfesion();
            datos[8] = lista.get(i).getNivelEscolaridad();
            datos[9] = lista.get(i).getSueldo();
            tablaModelo.addRow(datos); //Agrega el arreglo como una nueva fila de la tabla
        }
    
    }
    
    private void btnRegistraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraClienteActionPerformed
      
        
        String identificador=txtIdentificador.getText();
        int DocIdentificacion= Integer.parseInt(txtDocIdentificacion.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellidos.getText();
        int telf_casa = Integer.parseInt(txtTelefonoCasa.getText());
        int telf_oficina = Integer.parseInt(txtTelefonoOficina.getText());
        int telf_cel = Integer.parseInt(txtNivelEscolaridad.getText());
        
        String  profesion = String.valueOf(comboProfesion.getSelectedIndex());
        String nivelEscolaridad= txtNivelIngresos.getText();
        int sueldo = Integer.parseInt(txtNivelIngresos.getText());
        String direccion ="Ninguna";
        //para que cuando regrese lo agregue o modifique
        
        ClasedeMantenimientoCliente clase =
new ClasedeMantenimientoCliente(sueldo, nivelEscolaridad,profesion, DocIdentificacion, nombre, apellido,telf_casa, telf_oficina, telf_cel,direccion);
        
/*nt sueldo,String nivelEscolaridad,String profesion, int DOC_id, String nombre,
                String apellido, int telefonoHabitacion, int telefonoOficina, int telefonoCelular, String direccion) {
       */
        //actualiza la tabla con el nuevo departamento
         llenarTablaClientes();
        
    }//GEN-LAST:event_btnRegistraClienteActionPerformed

    private void comboProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProfesionActionPerformed
        llenarProfesion();
    }//GEN-LAST:event_comboProfesionActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnRegistraCliente;
    private javax.swing.JComboBox<Profesion> comboProfesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDocIdentificacion;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtNivelEscolaridad;
    private javax.swing.JTextField txtNivelIngresos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefonoCasa;
    private javax.swing.JTextField txtTelefonoCelular;
    private javax.swing.JTextField txtTelefonoOficina;
    // End of variables declaration//GEN-END:variables
}
