
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Logica.Cliente;
import Logica.Libro;
import Logica.Prestamo;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

/**
 *
 * @author Johan Illicachi
 */
public class JFElimPrestamo extends javax.swing.JFrame {
    JTable tabla;
    Prestamo prestamo = new Prestamo();

    public JFElimPrestamo(JTable tabla) {
        initComponents();
        this.setLocationRelativeTo(null);
        prestamo.ActualizarTablaPrestamosBusqueda(jTPrestamosBusqueda, getConsulta());
        this.tabla = tabla;
    }

    private JFElimPrestamo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jCBLibroPrestamo = new javax.swing.JCheckBox();
        jCBusquedaLibro1 = new javax.swing.JComboBox<>();
        jTFBusquedaLibro1 = new javax.swing.JTextField();
        jCBEstudiantePrestamo = new javax.swing.JCheckBox();
        jCBusquedaEstudiante2 = new javax.swing.JComboBox<>();
        jTFBusquedaEstudiante2 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTPrestamosBusqueda = new javax.swing.JTable();
        btnDevolver = new javax.swing.JButton();
        jLNombres7 = new javax.swing.JLabel();
        jTFCodigoPrestamoDevolucion = new javax.swing.JTextField();
        jTFCodigoLibroPrestamoDevolucion = new javax.swing.JTextField();
        jLNombres6 = new javax.swing.JLabel();
        jLCodigo10 = new javax.swing.JLabel();
        jTFCodigoEstudiantePrestamoDevolucion = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Eliminar Prestamo");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda"));

        jCBLibroPrestamo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jCBLibroPrestamo.setText("Libro");
        jCBLibroPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCBLibroPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBLibroPrestamoActionPerformed(evt);
            }
        });

        jCBusquedaLibro1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jCBusquedaLibro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "codigo_l", "nombre", "genero" }));
        jCBusquedaLibro1.setEnabled(false);

        jTFBusquedaLibro1.setEnabled(false);
        jTFBusquedaLibro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBusquedaLibro1KeyReleased(evt);
            }
        });

        jCBEstudiantePrestamo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jCBEstudiantePrestamo.setText("Estudiante");
        jCBEstudiantePrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCBEstudiantePrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEstudiantePrestamoActionPerformed(evt);
            }
        });

        jCBusquedaEstudiante2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jCBusquedaEstudiante2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "codigo_e", "nombre", "apellidos" }));
        jCBusquedaEstudiante2.setEnabled(false);

        jTFBusquedaEstudiante2.setEnabled(false);
        jTFBusquedaEstudiante2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBusquedaEstudiante2KeyReleased(evt);
            }
        });

        jTPrestamosBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTPrestamosBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPrestamosBusquedaMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(jTPrestamosBusqueda);

        jScrollPane8.setViewportView(jScrollPane12);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBLibroPrestamo)
                    .addComponent(jCBEstudiantePrestamo)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jCBusquedaLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFBusquedaLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jCBusquedaEstudiante2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(81, 81, 81)
                            .addComponent(jTFBusquedaEstudiante2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCBEstudiantePrestamo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBusquedaEstudiante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBusquedaEstudiante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCBLibroPrestamo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBusquedaLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBusquedaLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        btnDevolver.setBackground(new java.awt.Color(255, 255, 255));
        btnDevolver.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnDevolver.setText("Devolver");
        btnDevolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDevolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDevolverMouseExited(evt);
            }
        });
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        jLNombres7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLNombres7.setText("CódigoPrestamo:");

        jTFCodigoPrestamoDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoPrestamoDevolucionActionPerformed(evt);
            }
        });

        jTFCodigoLibroPrestamoDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoLibroPrestamoDevolucionActionPerformed(evt);
            }
        });

        jLNombres6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLNombres6.setText("Código Libro:");

        jLCodigo10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLCodigo10.setText("Codigo estudiante:");

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("ELIMINAR PRESTAMO A ESTUDIANTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCodigo10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCodigoEstudiantePrestamoDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLNombres6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFCodigoLibroPrestamoDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNombres7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFCodigoPrestamoDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCodigo10)
                            .addComponent(jTFCodigoEstudiantePrestamoDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNombres6)
                            .addComponent(jTFCodigoLibroPrestamoDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNombres7)
                            .addComponent(jTFCodigoPrestamoDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        prestamo.setCodigoPrestamo(Integer.parseInt(jTFCodigoPrestamoDevolucion.getText()));
        Libro libro = new Libro();
        libro.setCodigoLibro(Long.parseLong(jTFCodigoLibroPrestamoDevolucion.getText()));
        prestamo.setLibro(libro);
        
        if(prestamo.verificarMultas()){
            int respuesta = JOptionPane.showConfirmDialog(null,"Usted tiene una multa"+"'\nDesea Pagar la multa");
            if(respuesta==0){
                prestamo.eliminarRegistro();
                JOptionPane.showMessageDialog(null, "Prestamo eliminado correctamente.");
            }else{
                JOptionPane.showMessageDialog(null, "No se puede eliminar la multa sin realizar el pago");
            }
                  
        }else{
            prestamo.eliminarRegistro();
            JOptionPane.showMessageDialog(null, "Prestamo eliminado correctamente.");
        }
        
        prestamo.ActualizarTablaPrestamos(tabla);
        prestamo.ActualizarTablaPrestamosBusqueda(jTPrestamosBusqueda, getConsulta());
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void jTFCodigoLibroPrestamoDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoLibroPrestamoDevolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigoLibroPrestamoDevolucionActionPerformed

    private void jTFCodigoPrestamoDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoPrestamoDevolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigoPrestamoDevolucionActionPerformed

    private void jCBLibroPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBLibroPrestamoActionPerformed
        if(jCBLibroPrestamo.isSelected()){
            jCBusquedaLibro1.setEnabled(true);
            jTFBusquedaLibro1.setEnabled(true);

        }else{
            jCBusquedaLibro1.setEnabled(false);
            jTFBusquedaLibro1.setEnabled(false);

        }
    }//GEN-LAST:event_jCBLibroPrestamoActionPerformed

    private void jCBEstudiantePrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEstudiantePrestamoActionPerformed
        if(jCBEstudiantePrestamo.isSelected()){
            jCBusquedaEstudiante2.setEnabled(true);
            jTFBusquedaEstudiante2.setEnabled(true);

        }else{
            jCBusquedaEstudiante2.setEnabled(false);
            jTFBusquedaEstudiante2.setEnabled(false);

        }
    }//GEN-LAST:event_jCBEstudiantePrestamoActionPerformed

    private void jTPrestamosBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPrestamosBusquedaMouseClicked
        int row =jTPrestamosBusqueda.getSelectedRow();
        if (row !=-1){
            jTFCodigoPrestamoDevolucion.setText(Integer.toString((int)jTPrestamosBusqueda.getValueAt(row, 0)));
            jTFCodigoLibroPrestamoDevolucion.setText(Integer.toString((int)jTPrestamosBusqueda.getValueAt(row, 1)));
            jTFCodigoEstudiantePrestamoDevolucion.setText(Integer.toString((int)jTPrestamosBusqueda.getValueAt(row, 2)));
        }
    }//GEN-LAST:event_jTPrestamosBusquedaMouseClicked

    private void jTFBusquedaEstudiante2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaEstudiante2KeyReleased
        prestamo.ActualizarTablaPrestamosBusqueda(jTPrestamosBusqueda, getConsulta());
    }//GEN-LAST:event_jTFBusquedaEstudiante2KeyReleased

    private void jTFBusquedaLibro1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaLibro1KeyReleased
        prestamo.ActualizarTablaPrestamosBusqueda(jTPrestamosBusqueda, getConsulta());
    }//GEN-LAST:event_jTFBusquedaLibro1KeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnDevolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolverMouseEntered
        this.btnDevolver.setBorder(new LineBorder(Color.red));
        this.btnDevolver.setForeground(Color.red);
    }//GEN-LAST:event_btnDevolverMouseEntered

    private void btnDevolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolverMouseExited
        this.btnDevolver.setBorder(new LineBorder(new Color(90,130,191)));
        this.btnDevolver.setForeground(Color.black);
    }//GEN-LAST:event_btnDevolverMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        this.btnCancelar.setBorder(new LineBorder(Color.red));
        this.btnCancelar.setForeground(Color.red);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        this.btnCancelar.setBorder(new LineBorder(new Color(90,130,191)));
        this.btnCancelar.setForeground(Color.black);
    }//GEN-LAST:event_btnCancelarMouseExited

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
            java.util.logging.Logger.getLogger(JFElimPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFElimPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFElimPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFElimPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new JFElimPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JCheckBox jCBEstudiantePrestamo;
    private javax.swing.JCheckBox jCBLibroPrestamo;
    private javax.swing.JComboBox<String> jCBusquedaEstudiante2;
    private javax.swing.JComboBox<String> jCBusquedaLibro1;
    private javax.swing.JLabel jLCodigo10;
    private javax.swing.JLabel jLNombres6;
    private javax.swing.JLabel jLNombres7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTFBusquedaEstudiante2;
    private javax.swing.JTextField jTFBusquedaLibro1;
    private javax.swing.JTextField jTFCodigoEstudiantePrestamoDevolucion;
    private javax.swing.JTextField jTFCodigoLibroPrestamoDevolucion;
    private javax.swing.JTextField jTFCodigoPrestamoDevolucion;
    private javax.swing.JTable jTPrestamosBusqueda;
    // End of variables declaration//GEN-END:variables

public String getConsulta(){
            String consulta = "";
        switch(jCBusquedaLibro1.getSelectedIndex()){
            case 0:
                consulta="codigo_l="+jTFBusquedaLibro1.getText(); 
                break;
            case 1:
                consulta="nombre='"+jTFBusquedaLibro1.getText()+"'"; 
                break;
            case 2: 
                consulta="genero='"+jTFBusquedaLibro1.getText()+"'";
                break;
        }
        
        String consulta1 = "";
        switch(jCBusquedaEstudiante2.getSelectedIndex()){
            case 0:
                consulta1="codigo_e="+jTFBusquedaEstudiante2.getText(); 
                break;
            case 1:
                consulta1="nombres_e='"+jTFBusquedaEstudiante2.getText()+"'"; 
                break;
            case 2: 
                consulta1="apellidos_e='"+jTFBusquedaEstudiante2.getText()+"'";
                break;
        }
        String consultafinal="SELECT * FROM Prestamo";
        
        if(jCBEstudiantePrestamo.isSelected()||jCBLibroPrestamo.isSelected()){
            consultafinal+=" WHERE ";
        }
        if(jCBLibroPrestamo.isSelected()){
            consultafinal+="codigo_l = (SELECT codigo_l FROM Libro WHERE "+consulta+")";
        }
        if(jCBEstudiantePrestamo.isSelected()&&jCBLibroPrestamo.isSelected()){
            consultafinal+=" AND ";
        }
        if(jCBEstudiantePrestamo.isSelected()){
            consultafinal+= "codigo_e = (SELECT codigo_e FROM Estudiante WHERE "+consulta1+")";
        }
    return consultafinal;
    }
}

