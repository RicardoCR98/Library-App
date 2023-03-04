package Logica;
import ConexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Facturas {
    private String identificadorFactura;
    private String ISBN;
    private int cantidad;
    private double  precioTotal;
    ConexionBD conexion = new ConexionBD();
    Connection cn = conexion.conexion();

    
    public Facturas() {
    }

    public Facturas(String identificadorFactura, String ISBN, int cantidad, double precioTotal) {
        this.identificadorFactura = identificadorFactura;
        this.ISBN = ISBN;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
    }

    public String getIdentificadorFactura() {
        return identificadorFactura;
    }

    public void setIdentificadorFactura(String identificadorFactura) {
        this.identificadorFactura = identificadorFactura;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public ConexionBD getConexion() {
        return conexion;
    }

    public void setConexion(ConexionBD conexion) {
        this.conexion = conexion;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }
     
    
    public boolean añadirFactura(){
        boolean flag = false;
        try 
        {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO V_facturas (IDENTIFICADORFACTURA,ISBN,CANTIDAD,PRECIOTOTAL) VALUES (?,?,?,?)"); 
            pps.setString(1, this.identificadorFactura);
            pps.setString(2,this.ISBN);
            pps.setInt(3,this.cantidad);
            pps.setDouble(4, this.precioTotal);
            flag = true;
        } 
        catch(SQLException ex) 
        {
            Logger.getLogger(Facturas.class.getName()).log(Level. SEVERE, null, ex); 
        }
        return flag;
    }
   
//    public boolean actualizarPrestamo(String sql){
//        boolean flag = false;
//        try {
//            PreparedStatement pps = cn.prepareStatement(sql);
//            pps.executeUpdate();
//            flag = true;
//        } catch(SQLException ex) {
//            Logger.getLogger(Facturas.class.getName()).log(Level. SEVERE, null, ex);    
//        }
//        return flag;
//    }
   
 
    
    public boolean eliminarRegistro()
    {
        boolean flag = false;
        try 
        {
            PreparedStatement pps;
            pps = cn.prepareStatement("DELETE FROM V_facturas WHERE IDENTIFICADORFACTURA=" + this.identificadorFactura);
            pps.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    
    public JTable ActualizarTablaFacturas(JTable tabla1){
    Statement st;
    ResultSet rs=null; 
    JTable tabla = tabla1;
    try {   
        st = cn.createStatement();
        rs = st.executeQuery("SELECT * FROM Prestamo"); 
        DefaultTableModel dfm = new DefaultTableModel();
        tabla.setModel(dfm);
        dfm.setColumnIdentifiers(new Object[]{"ID FACTURA","ISBN","CANTIDAD","PRECIO TOTAL"});
        while(rs.next()){
            dfm.addRow(new Object[]{rs.getString("IDENTIFICADORFACTURA"), rs.getString("ISBN"), rs.getInt("CANTIDAD"),rs.getInt("PRECIOTOTAL")});
        }
    }catch(SQLException ex) {
        Logger.getLogger(Facturas.class.getName()).log(Level. SEVERE, null, ex); 
        JOptionPane.showMessageDialog (null, "Ocurrio un error al mostrar la tabla ");     
    }
    return tabla;
}
    
    public void ActualizarTablaFacturasBusqueda(JTable tabla1, String consulta){
    Statement st;
    ResultSet rs=null; 
    try {   
        st = cn.createStatement();
        rs = st.executeQuery(consulta); 
        DefaultTableModel dfm = new DefaultTableModel();
        tabla1.setModel(dfm);
        dfm.setColumnIdentifiers(new Object[]{"ID FACTURA","ISBN","CANTIDAD","PRECIO TOTAL"});
        while(rs.next()){
            dfm.addRow(new Object[]{rs.getString("IDENTIFICADORFACTURA"), rs.getString("ISBN"), rs.getInt("CANTIDAD"),rs.getInt("PRECIOTOTAL")});
        }
    }catch(SQLException ex) {
        Logger.getLogger(Facturas.class.getName()).log(Level. SEVERE, null, ex); 
        //JOptionPane.showMessageDialog (null, "Ocurrio un error al mostrar la tabla ");     
    }

}
}
