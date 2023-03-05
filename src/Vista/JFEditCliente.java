/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import java.sql.*;
import Logica.Cliente;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class JFEditCliente extends javax.swing.JFrame {
//JTable tabla;
Cliente cliente;
    public JFEditCliente(JTable tabla) {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.tabla = tabla;
        this.cliente = new Cliente();
        cliente.actualizarTabla(jtableClientes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel17 = new javax.swing.JPanel();
        jCTelefonoCliente = new javax.swing.JCheckBox();
        jCDireccionEstudianteCliente = new javax.swing.JCheckBox();
        jTFCedulaClienteActualizar = new javax.swing.JTextField();
        jTFTelefonoClienteaActualizar = new javax.swing.JTextField();
        jTFDireccionClienteaActualizar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtableClientes = new javax.swing.JTable();
        comboBoxBusquedaCliente = new javax.swing.JComboBox<>();
        jTFBusquedaCliente = new javax.swing.JTextField();
        btnActualizarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnCancelarCliente2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Actualizar y eliminar Estudiante");

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Atributos a actualizar"));

        jCTelefonoCliente.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jCTelefonoCliente.setText("Telefono");
        jCTelefonoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCTelefonoCliente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCTelefonoClienteStateChanged(evt);
            }
        });
        jCTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTelefonoClienteActionPerformed(evt);
            }
        });

        jCDireccionEstudianteCliente.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jCDireccionEstudianteCliente.setText("Direccion");
        jCDireccionEstudianteCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCDireccionEstudianteCliente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCDireccionEstudianteClienteStateChanged(evt);
            }
        });
        jCDireccionEstudianteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCDireccionEstudianteClienteActionPerformed(evt);
            }
        });

        jTFCedulaClienteActualizar.setEditable(false);

        jTFTelefonoClienteaActualizar.setEditable(false);

        jTFDireccionClienteaActualizar.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("Cedula");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCDireccionEstudianteCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCTelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFDireccionClienteaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefonoClienteaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTFCedulaClienteActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCedulaClienteActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCTelefonoCliente)
                    .addComponent(jTFTelefonoClienteaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCDireccionEstudianteCliente)
                    .addComponent(jTFDireccionClienteaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda"));

        jtableClientes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jtableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Telefono", "Dirección", "Ubicación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableClientesMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jtableClientes);

        comboBoxBusquedaCliente.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        comboBoxBusquedaCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Nombre", "Telefono" }));
        comboBoxBusquedaCliente.setSelectedIndex(-1);
        comboBoxBusquedaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBusquedaClienteActionPerformed(evt);
            }
        });

        jTFBusquedaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFBusquedaClienteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(comboBoxBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        btnActualizarCliente.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnActualizarCliente.setText("Actualizar");
        btnActualizarCliente.setPreferredSize(new java.awt.Dimension(107, 51));
        btnActualizarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarClienteMouseExited(evt);
            }
        });
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.setPreferredSize(new java.awt.Dimension(107, 51));
        btnEliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarClienteMouseExited(evt);
            }
        });
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnCancelarCliente2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCancelarCliente2.setText("Cancelar");
        btnCancelarCliente2.setPreferredSize(new java.awt.Dimension(62, 25));
        btnCancelarCliente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarCliente2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarCliente2MouseExited(evt);
            }
        });
        btnCancelarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCliente2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("ACTUALIZAR Y ELIMINAR CLIENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(257, 257, 257))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnCancelarCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        ArrayList<String> atributosActualizar = new ArrayList<String>();
        String consulta = "";
        atributosActualizar.add("CEDULACLIENTE="+jTFCedulaClienteActualizar.getText());
        if (jCTelefonoCliente.isSelected()){atributosActualizar.add("TELEFONOCLIENTE='"+jTFTelefonoClienteaActualizar.getText()+"'");}
        if (jCDireccionEstudianteCliente.isSelected()){atributosActualizar.add("DIRECCIONCLIENTE='"+jTFDireccionClienteaActualizar.getText()+"'");}
        
        Iterator<String> i = atributosActualizar.iterator();
        while (i.hasNext()){
            consulta += i.next() +",";
        }
        
        consulta = consulta.substring (0, consulta.length()-1);
        String condicion = "'" +jTFCedulaClienteActualizar.getText() + "'";
        
        String sql = "UPDATE V_clientes SET "+ consulta + " WHERE CEDULACLIENTE" + " LIKE "+condicion;

        if(cliente.actualizarCliente(sql))
            JOptionPane.showMessageDialog(null, "Datos Actualizados correctamente. ");
        else{
            JOptionPane.showMessageDialog (null, "Ocurrio un error al Actualizar los datos ");  
        }

        cliente.actualizarTabla(jtableClientes);      
        cliente.actualizarTablaBusqueda(jtableClientes, getConsulta());
        jTFCedulaClienteActualizar.setText("");
        jTFTelefonoClienteaActualizar.setText("");
        jTFDireccionClienteaActualizar.setText("");   
    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void jtableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableClientesMouseClicked
        int row =jtableClientes.getSelectedRow();
        if (row !=-1 ){
            jTFCedulaClienteActualizar.setText((String)jtableClientes.getValueAt(row, 0));
        }
    }//GEN-LAST:event_jtableClientesMouseClicked

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        if("".equals(jTFCedulaClienteActualizar.getText())){
            JOptionPane.showMessageDialog (null, "Seleccione a un cliente para eliminar"); 
        }else{
            if(0==JOptionPane.showConfirmDialog(null, "¿Esta seguro de borrar al cliente con cedula "+jTFCedulaClienteActualizar.getText()+" ?","Advertencia",JOptionPane.INFORMATION_MESSAGE)){
                if(cliente.eliminarCliente()){
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
                }else{
                    JOptionPane.showMessageDialog (null, "Ocurrio un error al eliminar los datos ");
                }      
            }
        }    
            jTFCedulaClienteActualizar.setText("");
            jTFTelefonoClienteaActualizar.setText("");
            jTFDireccionClienteaActualizar.setText("");       
            cliente.actualizarTabla(jtableClientes);
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnCancelarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCliente2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarCliente2ActionPerformed

    private void btnActualizarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarClienteMouseEntered
        this.btnActualizarCliente.setBorder(new LineBorder(Color.red));
        this.btnActualizarCliente.setForeground(Color.red);
    }//GEN-LAST:event_btnActualizarClienteMouseEntered

    private void btnActualizarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarClienteMouseExited
        this.btnActualizarCliente.setBorder(new LineBorder(new Color(90,130,191)));
        this.btnActualizarCliente.setForeground(Color.black);
    }//GEN-LAST:event_btnActualizarClienteMouseExited

    private void btnEliminarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarClienteMouseEntered
        this.btnEliminarCliente.setBorder(new LineBorder(Color.red));
        this.btnEliminarCliente.setForeground(Color.red);
    }//GEN-LAST:event_btnEliminarClienteMouseEntered

    private void btnEliminarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarClienteMouseExited
        this.btnEliminarCliente.setBorder(new LineBorder(new Color(90,130,191)));
        this.btnEliminarCliente.setForeground(Color.black);
    }//GEN-LAST:event_btnEliminarClienteMouseExited

    private void btnCancelarCliente2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarCliente2MouseEntered
        this.btnCancelarCliente2.setBorder(new LineBorder(Color.red));
        this.btnCancelarCliente2.setForeground(Color.red);
    }//GEN-LAST:event_btnCancelarCliente2MouseEntered

    private void btnCancelarCliente2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarCliente2MouseExited
        this.btnCancelarCliente2.setBorder(new LineBorder(new Color(90,130,191)));
        this.btnCancelarCliente2.setForeground(Color.black);
    }//GEN-LAST:event_btnCancelarCliente2MouseExited

    private void comboBoxBusquedaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBusquedaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxBusquedaClienteActionPerformed

    private void jCDireccionEstudianteClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCDireccionEstudianteClienteStateChanged
        Checkboxcambio(jCDireccionEstudianteCliente, jTFDireccionClienteaActualizar);
    }//GEN-LAST:event_jCDireccionEstudianteClienteStateChanged

    private void jCTelefonoClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCTelefonoClienteStateChanged
        Checkboxcambio(jCTelefonoCliente, jTFTelefonoClienteaActualizar);
    }//GEN-LAST:event_jCTelefonoClienteStateChanged

    private void jCTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTelefonoClienteActionPerformed

    private void jCDireccionEstudianteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCDireccionEstudianteClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCDireccionEstudianteClienteActionPerformed

    private void jTFBusquedaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaClienteKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cliente.actualizarTablaBusqueda(jtableClientes, getConsulta());
            try{
                // Obtener el índice de la columna deseada
                int indiceColumna = jtableClientes.getColumnModel().getColumnIndex("Cedula");
                Object valorCelda;
                int fila = jtableClientes.getSelectedRow();
                // Obtener el valor de la celda en la fila 0 y la columna correspondiente
                if(fila == -1){
                    valorCelda = jtableClientes.getModel().getValueAt(0, indiceColumna);
                }else{
                    valorCelda = jtableClientes.getModel().getValueAt(fila, indiceColumna);
                }
                jTFCedulaClienteActualizar.setText((String)valorCelda);  
                if(jTFBusquedaCliente.getText().equalsIgnoreCase("")){
                    cliente.actualizarTabla(jtableClientes);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "No se encontro el cliente","Cliente Error",0);
            }
        }

    }//GEN-LAST:event_jTFBusquedaClienteKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnCancelarCliente2;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JComboBox<String> comboBoxBusquedaCliente;
    private javax.swing.JCheckBox jCDireccionEstudianteCliente;
    private javax.swing.JCheckBox jCTelefonoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTFBusquedaCliente;
    private javax.swing.JTextField jTFCedulaClienteActualizar;
    private javax.swing.JTextField jTFDireccionClienteaActualizar;
    private javax.swing.JTextField jTFTelefonoClienteaActualizar;
    private javax.swing.JTable jtableClientes;
    // End of variables declaration//GEN-END:variables

    public void Checkboxcambio(javax.swing.JCheckBox jCheckBox, javax.swing.JTextField jTField ){
            if(jCheckBox.isSelected()){
                jTField.setEditable(true);
            }else{
                 jTField.setEditable(false);
            }
    }

    public String getConsulta(){
            String consulta = "";
            switch(comboBoxBusquedaCliente.getSelectedIndex()){
                case 0:
                    consulta=jTFBusquedaCliente.getText(); 
                    break;
                case 1:
                    consulta=jTFBusquedaCliente.getText(); 
                    break;
                case 2:
                    consulta=jTFBusquedaCliente.getText();
                    break;
            }        
            return consulta;
    }
}
