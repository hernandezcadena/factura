import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ParqueaderoFrm extends javax.swing.JFrame {
   //atributo para crear el combo
       private DefaultComboBoxModel modeloCombo;
       private DefaultTableModel Modelotabla;
     
    public ParqueaderoFrm() {
        modeloCombo = new DefaultComboBoxModel(new String []{});
        Modelotabla = new DefaultTableModel(null, getColumn());
        initComponents();
        cargarTabla();
                
        Persona objPersona = new Persona();
        ResultSet estados;
        estados = objPersona.listaEstados();
        try {
            while(estados.next()){
            modeloCombo.addElement(new Estado(estados.getInt("id"),estados.getString("nombre")));
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocuerrio un error"+ e.getMessage());
        }
    }

    //Metodo para cargar las columnas
    public String[] getColumn(){
        String column[] = new String[]{"identificacion", "nombre", "telefono"};
        return column;
    }
    
    public void cargarTabla(){
        Cliente objCliente = new Cliente();
        ResultSet resultado = objCliente.listaClientes();
        try {
            Object dato[] = new Object[3];
            while(resultado.next()){
                for(int i = 0; i<3;i++){
                    dato[i] = resultado.getObject(i+1);
                }
                Modelotabla.addRow(dato);
            }
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtidentificacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btninsertar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        cbdependencia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpersona = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnenlistar = new javax.swing.JToggleButton();
        btnconsultar = new javax.swing.JToggleButton();
        btneliminar = new javax.swing.JToggleButton();
        btnACTUALIZAR = new javax.swing.JToggleButton();
        cboEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        jLabel1.setFont(new java.awt.Font("Rosewood Std Regular", 0, 36)); // NOI18N
        jLabel1.setText("PARQUEADERO");

        jLabel2.setText("IDENTIFICACION");

        txtidentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentificacionActionPerformed(evt);
            }
        });

        jLabel3.setText("CLIENTE");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        jLabel4.setText("DIRECCION");

        btninsertar.setText("ENVIAR");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });

        jLabel6.setText("TELEFONO");

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        cbdependencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbdependencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "e-mail", "si", "no" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel1, org.jdesktop.beansbinding.ObjectProperty.create(), cbdependencia, org.jdesktop.beansbinding.BeanProperty.create("elements"), "ESTADO");
        binding.setSourceNullValue(null);
        bindingGroup.addBinding(binding);

        cbdependencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbdependenciaItemStateChanged(evt);
            }
        });
        cbdependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdependenciaActionPerformed(evt);
            }
        });

        jtpersona.setModel(Modelotabla);
        jScrollPane1.setViewportView(jtpersona);

        jLabel5.setText("NIC: 01800 RST345678");

        btnenlistar.setText("ENLISTAR");
        btnenlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenlistarActionPerformed(evt);
            }
        });

        btnconsultar.setText("CONSULTAR");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnACTUALIZAR.setText("ACTUALIZAR");
        btnACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACTUALIZARActionPerformed(evt);
            }
        });

        cboEstado.setModel(modeloCombo);
        cboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbdependencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidentificacion, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(71, 71, 71)
                .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btninsertar)
                        .addGap(38, 38, 38)
                        .addComponent(btnconsultar)
                        .addGap(29, 29, 29)
                        .addComponent(btnenlistar)
                        .addGap(37, 37, 37)
                        .addComponent(btneliminar)
                        .addGap(46, 46, 46)
                        .addComponent(btnACTUALIZAR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbdependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsertar)
                    .addComponent(btnconsultar)
                    .addComponent(btnenlistar)
                    .addComponent(btneliminar)
                    .addComponent(btnACTUALIZAR))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
      Cliente per =new Cliente ();
     
      Estado OdjEstado =(Estado)cboEstado.getSelectedItem();
      int estado= OdjEstado.getId();
      
      per.insertarCliente(Integer.parseInt(txtidentificacion.getText()), txtnombre.getText(), txtdireccion.getText(),Integer.parseInt(txttelefono.getText()),cbdependencia.getSelectedItem().toString());
       
    }//GEN-LAST:event_btninsertarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void cbdependenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbdependenciaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbdependenciaItemStateChanged

    private void cbdependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdependenciaActionPerformed
                    // TODO add your handling code here:
    }//GEN-LAST:event_cbdependenciaActionPerformed

    private void txtidentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentificacionActionPerformed

    }//GEN-LAST:event_txtidentificacionActionPerformed

    private void btnenlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenlistarActionPerformed
    Cliente cli=new Cliente();
    String lista = cli.listarCliente();
        JOptionPane.showMessageDialog(null, lista);// TODO add your handling code here:
    }//GEN-LAST:event_btnenlistarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
    Cliente cli = new Cliente();  
    int  identificacion = Integer.parseInt(txtidentificacion.getText());
    String lista = cli.consultarCliente(identificacion,"","",0,"");
    JOptionPane.showMessageDialog(null, lista);// TODO add your handling code here:
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
    Cliente cli = new Cliente(); 
    int  identificacion = Integer.parseInt(txtidentificacion.getText());
    boolean lista = cli.eliminarCliente(identificacion,"","",0,"");
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACTUALIZARActionPerformed
        Cliente per =new Cliente ();
      per.actualizarCliente(Integer.parseInt(txtidentificacion.getText()), txtnombre.getText(), txtdireccion.getText(),Integer.parseInt(txttelefono.getText()),cbdependencia.getSelectedItem().toString());
    }//GEN-LAST:event_btnACTUALIZARActionPerformed

    private void cboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEstadoActionPerformed

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParqueaderoFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnACTUALIZAR;
    private javax.swing.JToggleButton btnconsultar;
    private javax.swing.JToggleButton btneliminar;
    private javax.swing.JToggleButton btnenlistar;
    private javax.swing.JButton btninsertar;
    private javax.swing.JComboBox<String> cbdependencia;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtpersona;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
