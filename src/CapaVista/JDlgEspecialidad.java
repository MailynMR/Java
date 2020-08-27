
package CapaVista;



import CapaLogicaNegocios.ClaseMantenimientoEspecialidades;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class JDlgEspecialidad extends javax.swing.JDialog {
    private String codigoCiudad;
    private TipoMantenimientoEspecialidad tipoMantenimiento;
    ClaseMantenimientoEspecialidades especialidadBuscar = null;
    public JDlgEspecialidad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
 public JDlgEspecialidad(String codigoCiudad, TipoMantenimientoEspecialidad tipoMantenimiento ) {
        this.codigoCiudad = codigoCiudad;
        this.tipoMantenimiento = tipoMantenimiento;
        try {
            initComponents();
        } catch (Exception e) {
        }
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
        jLabel2 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jTxtEspecialidad = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jTxtNombreDoctor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel2.setText("Especialidad");

        jTxtCodigo.setEditable(false);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre Doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtNombreDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTxtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNombreDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        
        
        // TODO add your handling code here:
        switch (tipoMantenimiento) {
            case AGREGAR:
                jTxtCodigo.setEditable(true);
                jTxtEspecialidad.setEditable(true);
                setTitle("Nueva Especialidad");
                break;
            case MODIFICAR:
                jTxtCodigo.setEditable(false);
                jTxtEspecialidad.setEditable(true);
                jTxtEspecialidad.selectAll();
                setTitle("Modificar Especialidad");
                break;
            case CONSULTAR:
                jTxtCodigo.setEditable(false);
                jTxtEspecialidad.setEditable(false);
                setTitle("Consulta de una Especialidad");
                break;
        }
        jTxtCodigo.setText(codigoCiudad);
        jTxtEspecialidad.setText("");
        try {
        especialidadBuscar = ClaseMantenimientoEspecialidades.consultaEspecialidades(codigoCiudad);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar la Especialidad\n"+
                e.toString() + "\n" + e.getMessage());
        }  
        if(especialidadBuscar != null){
            jTxtEspecialidad.setText(especialidadBuscar.getEspecialidad());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        //Obtiene los datos para la actualización
        String codigo = jTxtCodigo.getText();
        String doctor = jTxtNombreDoctor.getText();
        String especialidad = jTxtEspecialidad.getText();
       
        //Actualiza el Departamento static del FrmDepartamento
        //para que cuando regrese lo agregue o modifique
        FrmMantenimientodeEspecialidades.setEspecialidadesMantenimiento(new ClaseMantenimientoEspecialidades(codigo, doctor, especialidad));
       this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //FrmMantenimientoEspecialidades
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnAceptar;
    javax.swing.JButton btnCancelar;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JTextField jTxtCodigo;
    javax.swing.JTextField jTxtEspecialidad;
    javax.swing.JTextField jTxtNombreDoctor;
    // End of variables declaration//GEN-END:variables
}
