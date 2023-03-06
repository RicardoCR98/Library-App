package Logica;
import ConexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
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
    private String cedulaCliente;
    private String ubicacionFactura;
    LocalDate fechaActual = LocalDate.now();
    
    private String codigoSede;
    ConexionBD conexion = new ConexionBD();
    Connection cn = conexion.conexion();

    
    public Facturas() {
    }

//    public Facturas(String identificadorFactura, String ISBN, int cantidad, double precioTotal, String ubicacionFactura, String codigoSede,String cedulaCliente) {
//        this.identificadorFactura = identificadorFactura;
//        this.ISBN = ISBN;
//        this.cantidad = cantidad;
//        this.precioTotal = precioTotal;
//        this.ubicacionFactura = ubicacionFactura;
//        this.ubicacionFactura = codigoSede;
//        this.cedulaCliente = cedulaCliente;
//    }
//        public Facturas(String identificadorFactura, LocalDate fechaActual, String cedulaCliente, String codigoSede,String ubicacionFactura) {
//        this.identificadorFactura = identificadorFactura;
//        this.fechaActual = fechaActual;
//        this.cedulaCliente = cedulaCliente;
//        this.codigoSede = codigoSede;
//        this.ubicacionFactura = ubicacionFactura;
//    }
//    
            public Facturas(String identificadorFactura, String ISBN, int cantidad, double precioTotal, String ubicacionFactura, String codigoSede,String cedulaCliente,LocalDate fechaActual) {
        this.identificadorFactura = identificadorFactura;
        this.ISBN = ISBN;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
        this.ubicacionFactura = ubicacionFactura;
        this.codigoSede = codigoSede;
        this.cedulaCliente = cedulaCliente;
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
    public String getUbicacionFactura() {
        return ubicacionFactura;
    }

    public void setUbicacionFactura(String ubicacionFactura) {
        this.ubicacionFactura = ubicacionFactura;
    }
    
    
    public String getCodigoSede() {
        return codigoSede;
    }

    public void setCodigoSede(String codigoSede) {
        this.codigoSede = codigoSede;
    }
    
    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }
    
    public boolean añadirFactura(){
        boolean flag = false;
        try 
        {

            PreparedStatement pps1 = cn.prepareStatement("INSERT INTO V_EstadisticaFact (IDENTIFICACIONFACTURA,FECHAFACTURA,CEDULACLIENTE,CODIGOSEDE,UBICACION) VALUES (?,?,?,?,?)"); 
            pps1.setString(1, this.identificadorFactura);
            pps1.setDate(2, java.sql.Date.valueOf(this.fechaActual));
            pps1.setString(3,this.cedulaCliente);
            if (this.codigoSede != null) {
                pps1.setString(4, codigoSede);
            } else {
                JOptionPane.showMessageDialog(null, "Valor nulo detectado");
            }
            pps1.setString(5, this.ubicacionFactura);
            pps1.executeUpdate();
            
            
            PreparedStatement pps = cn.prepareStatement("INSERT INTO V_Facturas (IDENTIFICADORFACTURA,ISBN,CANTIDAD,PRECIOTOTAL,CODIGOSEDE,UBICACION) VALUES (?,?,?,?,?,?)");
            pps.setString(1, this.identificadorFactura);
            pps.setString(2,this.ISBN);
            pps.setInt(3,this.cantidad);
            pps.setDouble(4, this.precioTotal);
            pps.setString(5, codigoSede);
            pps.setString(6, this.ubicacionFactura);
            pps.executeUpdate();
            flag = true;
        } 
        catch(SQLException ex) 
        {
            Logger.getLogger(Facturas.class.getName()).log(Level. SEVERE, null, ex); 
        }
        return flag;
    }
    
    public boolean añadirEstadistica(){
        boolean flag = false;
        try
        {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO V_EstadisticaFact (IDENTIFICADORFACTURA,FECHAFACTURA,CEDULACLIENTE,CODIGOSEDE,UBICACION) VALUES (?,?,?,?,?)"); 
            pps.setString(1, this.identificadorFactura);
            pps.setString(2,this.fechaActual.toString());
            pps.setString(3,this.cedulaCliente);
            pps.setString(4, this.codigoSede);
            pps.setString(5, this.ubicacionFactura);
            pps.executeUpdate();
        }catch(SQLException ex) 
        {
            Logger.getLogger(Facturas.class.getName()).log(Level. SEVERE, null, ex); 
        }
        return flag;
    }
       
    public boolean eliminarRegistro(String id)
    {
        boolean flag = false;
    try {
        PreparedStatement pps;
        pps = cn.prepareStatement("DELETE FROM V_Facturas WHERE IDENTIFICADORFACTURA=?");
        pps.setString(1, id);
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
        rs = st.executeQuery("SELECT * FROM V_facturas order by IDENTIFICADORFACTURA ASC"); 
        DefaultTableModel dfm = new DefaultTableModel();
        tabla.setModel(dfm);
        dfm.setColumnIdentifiers(new Object[]{"ID FACTURA","ISBN","CANTIDAD","PRECIO TOTAL","UBICACION"});
        while(rs.next()){
            dfm.addRow(new Object[]{rs.getString("IDENTIFICADORFACTURA"), rs.getString("ISBN"), rs.getInt("CANTIDAD"),rs.getDouble("PRECIOTOTAL"), rs.getString("UBICACION")});
        }
        cn.close();
        return tabla;
    }catch(SQLException ex) {
        Logger.getLogger(Facturas.class.getName()).log(Level. SEVERE, null, ex); 
        JOptionPane.showMessageDialog (null, "Ocurrio un error al mostrar la tabla ");     
    }
    return tabla;
}
    
    public void ActualizarTablaFacturasBusqueda(JTable tabla1,String consulta){
    Statement st;
    ResultSet rs=null; 
    try {   
        st = cn.createStatement();
        rs = st.executeQuery("SELECT * FROM V_Facturas WHERE ISBN ='"+consulta+"' OR IDENTIFICADORFACTURA='"+consulta+"' OR UBICACION='"+consulta+"'"); 
        DefaultTableModel dfm = new DefaultTableModel();
        tabla1.setModel(dfm);
        dfm.setColumnIdentifiers(new Object[]{"ID FACTURA","ISBN","CANTIDAD","PRECIO TOTAL", "UBICACION"});
        while(rs.next()){
            dfm.addRow(new Object[]{rs.getString("IDENTIFICADORFACTURA"), rs.getString("ISBN"), rs.getInt("CANTIDAD"),rs.getInt("PRECIOTOTAL"), rs.getString("UBICACION")});
        }
    }catch(SQLException ex) {
        Logger.getLogger(Facturas.class.getName()).log(Level. SEVERE, null, ex); 
        //JOptionPane.showMessageDialog (null, "Ocurrio un error al mostrar la tabla ");     
    }

}
}
