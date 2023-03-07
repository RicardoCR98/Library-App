package Vista;

import Logica.Libro;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class JFAddLibro extends javax.swing.JFrame {
    JTable tabla;
    Libro libro;
    /**
     * Creates new form JFAddEstudiante
     * @param tabla
     */
    public JFAddLibro(JTable tabla) {
        initComponents();
//      this.setAlwaysOnTop(true);
        this.tabla = tabla;
        this.setLocationRelativeTo(null);
    }

    public JTable actualizarTabla(){
        libro = new Libro();
        libro.actualizarTabla(tabla);
        return tabla;
    }
    
    private JFAddLibro() {
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

        jLabel7 = new javax.swing.JLabel();
        jTFCantidad2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTFISBN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFAnio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFGenero = new javax.swing.JTextField();
        btnCancelarLib = new javax.swing.JButton();
        btnAceptarLib = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTFPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFUbicacion = new javax.swing.JComboBox<>();
        jTFAutor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFEditorial = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTFCantidad = new javax.swing.JTextField();

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setText("Precio");

        setTitle("Añadir Libro");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel5.setText("AÑADIENDO LIBROS");

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setText("ISBN");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setText("Titulo Libro");

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("Año Publicación");

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setText("Genero");

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

        btnAceptarLib.setText("Aceptar");
        btnAceptarLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarLibMouseExited(evt);
            }
        });
        btnAceptarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarLibActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setText("Precio");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setText("Autor");

        jTFUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quito", "Cuenca" }));
        jTFUbicacion.setSelectedIndex(-1);

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setText("Ubicación");

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setText("Nombre Editorial");

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setText("Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFAutor)
                                    .addComponent(jTFPrecio)
                                    .addComponent(jTFAnio)
                                    .addComponent(jTFISBN)
                                    .addComponent(jTFGenero)
                                    .addComponent(jTFTitulo)
                                    .addComponent(jTFEditorial)
                                    .addComponent(jTFCantidad, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(btnAceptarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(btnCancelarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 64, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jTFUbicacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(52, 52, 52)))))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTFEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTFUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarLibActionPerformed
        String ubicacion = this.jTFUbicacion.getSelectedItem().toString();
        String codigoSede;
        if (ubicacion.equalsIgnoreCase("Quito")){
            codigoSede = "01";
        }else{
            codigoSede = "02";
        }
        int cantidad = Integer.parseInt(this.jTFCantidad.getText());
        boolean flag = libro.añadirLibro(this.jTFISBN.getText(),codigoSede,cantidad,ubicacion);
        if(flag){
            JOptionPane.showMessageDialog(null, "Datos Guardados correctamente.");
            tabla = libro.actualizarTabla(tabla);
            JTextField[] textFields = {jTFAnio,jTFAutor,jTFCantidad,jTFEditorial,jTFGenero,jTFISBN,jTFPrecio,jTFTitulo};
            for (JTextField textField : textFields) {
                textField.setText("");
            }
            comewth();
        }else{
            JOptionPane.showMessageDialog (null, "Ocurrio un error al ingresar los datos ");    
        }
        
    }//GEN-LAST:event_btnAceptarLibActionPerformed

    private void btnCancelarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarLibActionPerformed
        this.dispose();
        comewth();
    }//GEN-LAST:event_btnCancelarLibActionPerformed

    private void btnAceptarLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarLibMouseEntered
        this.btnAceptarLib.setBorder(new LineBorder(Color.red));
        this.btnAceptarLib.setForeground(Color.red);
    }//GEN-LAST:event_btnAceptarLibMouseEntered

    private void btnAceptarLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarLibMouseExited
        this.btnAceptarLib.setBorder(new LineBorder(new Color(90,130,191)));
        this.btnAceptarLib.setForeground(Color.black);
    }//GEN-LAST:event_btnAceptarLibMouseExited

    private void btnCancelarLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarLibMouseEntered
        this.btnCancelarLib.setBorder(new LineBorder(Color.red));
        this.btnCancelarLib.setForeground(Color.red);
    }//GEN-LAST:event_btnCancelarLibMouseEntered

    private void btnCancelarLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarLibMouseExited
        this.btnCancelarLib.setBorder(new LineBorder(new Color(90,130,191)));
        this.btnCancelarLib.setForeground(Color.black);
    }//GEN-LAST:event_btnCancelarLibMouseExited

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarLib;
    private javax.swing.JButton btnCancelarLib;
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
    private javax.swing.JTextField jTFAnio;
    private javax.swing.JTextField jTFAutor;
    private javax.swing.JTextField jTFCantidad;
    private javax.swing.JTextField jTFCantidad2;
    private javax.swing.JTextField jTFEditorial;
    private javax.swing.JTextField jTFGenero;
    private javax.swing.JTextField jTFISBN;
    private javax.swing.JTextField jTFPrecio;
    private javax.swing.JTextField jTFTitulo;
    private javax.swing.JComboBox<String> jTFUbicacion;
    // End of variables declaration//GEN-END:variables

    public void comewth(){
        this.jTFISBN.setText("");
        this.jTFTitulo.setText("");
        this.jTFGenero.setText("");
        this.jTFAnio.setText("");
    }
}
