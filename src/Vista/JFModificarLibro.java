/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Logica.Libro;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author PC
 */
public class JFModificarLibro extends javax.swing.JFrame {
Libro libro;
    public JFModificarLibro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.libro = new Libro();
        libro.actualizarTabla(jTBusquedaAct);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jTFISBNLibroActualizar = new javax.swing.JTextField();
        jTFCantidadActualizarLibros = new javax.swing.JTextField();
        jCCantidadLibro = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jcUbicacionActualizar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCBusquedaLibro = new javax.swing.JComboBox<>();
        jTFBusquedaLibro = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTBusquedaAct = new javax.swing.JTable();
        btnActualizarLib = new javax.swing.JButton();
        btnCancelarLib = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Actualizar y eliminar Libros");

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Atributos a actualizar"));

        jTFISBNLibroActualizar.setEditable(false);

        jTFCantidadActualizarLibros.setEditable(false);

        jCCantidadLibro.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jCCantidadLibro.setText("Cantidad");
        jCCantidadLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCCantidadLibro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCCantidadLibroStateChanged(evt);
            }
        });
        jCCantidadLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCantidadLibroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setText("ISBN:");

        jcUbicacionActualizar.setEditable(true);
        jcUbicacionActualizar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quito", "Cuenca" }));
        jcUbicacionActualizar.setSelectedIndex(-1);

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setText("Ubicacion");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFISBNLibroActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jCCantidadLibro)
                                .addGap(18, 18, 18)
                                .addComponent(jTFCantidadActualizarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jcUbicacionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(39, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFISBNLibroActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCCantidadLibro)
                    .addComponent(jTFCantidadActualizarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcUbicacionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda"));

        jCBusquedaLibro.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jCBusquedaLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISBN", "Nombre", "Genero", "Autor" }));
        jCBusquedaLibro.setSelectedIndex(-1);

        jTFBusquedaLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBusquedaLibroActionPerformed(evt);
            }
        });
        jTFBusquedaLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFBusquedaLibroKeyPressed(evt);
            }
        });

        jTBusquedaAct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Titulo", "Autor", "Género", "Año", "Editorial", "Cantidad", "Precio", "Ubicacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTBusquedaAct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBusquedaActMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTBusquedaAct);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCBusquedaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFBusquedaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBusquedaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBusquedaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnActualizarLib.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnActualizarLib.setText("Actualizar");
        btnActualizarLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarLibMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnActualizarLibMousePressed(evt);
            }
        });
        btnActualizarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarLibActionPerformed(evt);
            }
        });

        btnCancelarLib.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCancelarLib.setText("Cancelar");
        btnCancelarLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarLibMouseExited(evt);
            }
        });
        btnCancelarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarLibActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("ACTUALIZAR Y ELIMINAR LIBROS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(btnActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(btnCancelarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCCantidadLibroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCCantidadLibroStateChanged
        Checkboxcambio(jCCantidadLibro, jTFCantidadActualizarLibros);
    }//GEN-LAST:event_jCCantidadLibroStateChanged

    private void jCCantidadLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCantidadLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCCantidadLibroActionPerformed

    private void btnActualizarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarLibActionPerformed
//        ArrayList<String> atributosActualizar = new ArrayList<String>();
        int consulta = 0;
        String codigoSede ="";
//        atributosActualizar.add("ISBN="+jTFISBNLibroActualizar.getText());
            String ubicacion = this.jcUbicacionActualizar.getSelectedItem().toString();
            
            if (ubicacion.equalsIgnoreCase("Quito")){
                codigoSede = "01";
            }else{
                codigoSede = "02";
            }
//            atributosActualizar.add("UBICACION="+ubicacion);
//            atributosActualizar.add("CODIGOSEDE="+ codigoSede);
        
//        if (jCCantidadLibro.isSelected()){atributosActualizar.add("NUMEJEMPLAR='"+jTFCantidadActualizarLibros.getText()+"'");}
//        Iterator<String> i = atributosActualizar.iterator();

//        while (i.hasNext()){
//            consulta += i.next() +",";
//        }
//        consulta = consulta.substring (0, consulta.length()-1);
        consulta = Integer.parseInt(jTFCantidadActualizarLibros.getText());
        String condicion = "'" +jTFISBNLibroActualizar.getText () + "'";
       


        if(libro.actualizarLibro(consulta, condicion, codigoSede))
            JOptionPane.showMessageDialog(null, "Datos Actualizados correctamente. ");
        else{
            
            JOptionPane.showMessageDialog (null, "Ocurrio un error al Actualizar los datos ");  
        }
        
        libro.actualizarTabla(jTBusquedaAct);
        libro.ActualizarTablaLibrosBusqueda(jTBusquedaAct, getConsulta());
        jTFCantidadActualizarLibros.setText("");
        jTFISBNLibroActualizar.setText("");
    }//GEN-LAST:event_btnActualizarLibActionPerformed

    private void btnCancelarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarLibActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btnCancelarLibActionPerformed

    private void btnActualizarLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibMouseEntered
        this.btnActualizarLib.setBorder(new LineBorder(Color.red));
        this.btnActualizarLib.setForeground(Color.red);
    }//GEN-LAST:event_btnActualizarLibMouseEntered

    private void btnActualizarLibMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibMousePressed

    }//GEN-LAST:event_btnActualizarLibMousePressed

    private void btnCancelarLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarLibMouseEntered
        this.btnCancelarLib.setBorder(new LineBorder(Color.red));
        this.btnCancelarLib.setForeground(Color.red);
    }//GEN-LAST:event_btnCancelarLibMouseEntered

    private void btnCancelarLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarLibMouseExited
        this.btnCancelarLib.setBorder(new LineBorder(new Color(90,130,191)));
        this.btnCancelarLib.setForeground(Color.black);
    }//GEN-LAST:event_btnCancelarLibMouseExited

    private void btnActualizarLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibMouseExited
        this.btnActualizarLib.setBorder(new LineBorder(new Color(90,130,191)));
        this.btnActualizarLib.setForeground(Color.black);
    }//GEN-LAST:event_btnActualizarLibMouseExited

    private void jTFBusquedaLibroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaLibroKeyPressed
        // TODO add your handling code here:                                      
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(jTFBusquedaLibro.getText().equals("")){
                libro.actualizarTabla(jTBusquedaAct);
            }
            libro.ActualizarTablaLibrosBusqueda(jTBusquedaAct, getConsulta());
            try{
                    // Obtener el índice de la columna deseada
                int indiceColumna = jTBusquedaAct.getColumnModel().getColumnIndex("ISBN");
                Object valorCelda;
                int fila = jTBusquedaAct.getSelectedRow();
                // Obtener el valor de la celda en la fila 0 y la columna correspondiente
                if(fila == -1){
                    valorCelda = jTBusquedaAct.getModel().getValueAt(0, indiceColumna);
                }else{
                    valorCelda = jTBusquedaAct.getModel().getValueAt(fila, indiceColumna);
                }
                jTFISBNLibroActualizar.setText((String)valorCelda);  
                if(jTFBusquedaLibro.getText().equalsIgnoreCase("")){
                libro.actualizarTabla(jTBusquedaAct);
        }
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "No se encontro el Libro","Libro Error ",0);
            }
        }
    }//GEN-LAST:event_jTFBusquedaLibroKeyPressed

    private void jTBusquedaActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBusquedaActMouseClicked
        // TODO add your handling code here:                                  
        int indiceColumna = jTBusquedaAct.getColumnModel().getColumnIndex("ISBN");
        int fila = jTBusquedaAct.getSelectedRow();
        Object valorCelda;
        if(fila == -1){
            valorCelda = jTBusquedaAct.getModel().getValueAt(0, indiceColumna);
        }else{
            valorCelda = jTBusquedaAct.getModel().getValueAt(fila, indiceColumna);
        }
        jTFISBNLibroActualizar.setText((String)valorCelda); 
    }//GEN-LAST:event_jTBusquedaActMouseClicked

    private void jTFBusquedaLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBusquedaLibroActionPerformed
        // TODO add your handling code here:
        if(jTFBusquedaLibro.getText().equals("")){
                libro.actualizarTabla(jTBusquedaAct);
        }
    }//GEN-LAST:event_jTFBusquedaLibroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarLib;
    private javax.swing.JButton btnCancelarLib;
    private javax.swing.JComboBox<String> jCBusquedaLibro;
    private javax.swing.JCheckBox jCCantidadLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTBusquedaAct;
    private javax.swing.JTextField jTFBusquedaLibro;
    private javax.swing.JTextField jTFCantidadActualizarLibros;
    private javax.swing.JTextField jTFISBNLibroActualizar;
    private javax.swing.JComboBox<String> jcUbicacionActualizar;
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
        switch(jCBusquedaLibro.getSelectedIndex()){
            case 0:
                consulta=jTFBusquedaLibro.getText(); 
                break;
            case 1:
                consulta=jTFBusquedaLibro.getText(); 
                break;
            case 2: 
                consulta=jTFBusquedaLibro.getText();
                break;
            case 3:
                consulta=jTFBusquedaLibro.getText();
                break;
        
        }
        return consulta;
    }
}
