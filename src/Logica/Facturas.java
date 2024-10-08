package Logica;
import ConexionBD.ConexionBD;
import Vista.JFAddFactura;
import Vista.JFLibreria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;

public class Facturas {
    private String identificadorFactura;
    private String ISBN;
    private int cantidad;
    private double  precioTotal;
    private String cedulaCliente;
    private String ubicacionFactura;
    Date myDate = new Date();
    String fecha;
    
    private String codigoSede;
    ConexionBD conexion = new ConexionBD();
    Connection cn = conexion.conexion();

    
    public Facturas() {
    }
        public Facturas(String identificadorFactura, String ISBN, int cantidad, /*double precioTotal,*/ String ubicacionFactura, String codigoSede,String cedulaCliente,LocalDate fechaActual) {
        this.identificadorFactura = identificadorFactura;
        this.ISBN = ISBN;
        this.cantidad = cantidad;
//        this.precioTotal = precioTotal;
        this.ubicacionFactura = ubicacionFactura;
        this.codigoSede = codigoSede;
        this.cedulaCliente = cedulaCliente;
        this.fecha = new SimpleDateFormat("yyyy-MM-dd").format(myDate);
        this.myDate = new Date();
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
    try {

        // Crear objeto CallableStatement
        String sql = "{call SP_CalcularPrecioTotal(?, ?, ?, ?, ?, ?, ?)}";
        CallableStatement cstmt = cn.prepareCall(sql);

        // Asignar valores a los parámetros de entrada
        cstmt.setString(1, this.cedulaCliente);
        cstmt.setString(2, this.ISBN);
        cstmt.setInt(3, cantidad);
        cstmt.setString(4, this.identificadorFactura);
        cstmt.setString(5, this.ubicacionFactura);
        cstmt.setString(6, this.codigoSede);

        // Definir el parámetro de salida
        cstmt.registerOutParameter(7, java.sql.Types.DOUBLE);

        // Ejecutar la Stored Procedure
        cstmt.executeUpdate();

        // Recuperar el valor del parámetro de salida
        precioTotal = cstmt.getDouble(7);

        // Imprimir el resultado
        System.out.println("Precio Total: " + precioTotal);

        // Cerrar la conexión y el objeto CallableStatement
        cstmt.close();
        cn.close();

        flag = true;
    } catch (SQLException ex) {
//        Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println(ex.toString());
    } 
//    finally {
//        if (cn != null) {
//            try {
//                cn.close();
//            } catch (SQLException e) {
//                Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, e);
//                System.out.println(e.toString());
//            }
//        }
//    }
    return flag;
//            
//             PreparedStatement pps2 = cn.prepareStatement("set xact_abort on"
//                    +" begin distributed tran"
//                    +" INSERT INTO V_INFOFACTURAS (IDENTIFICACIONFACTURA,CODIGOSEDE,UBICACION) VALUES (?,?,?)"
//                    +" commit tran");
//            pps2.setString(1, this.identificadorFactura);
//            pps2.setString(2, this.codigoSede);
//            pps2.setString(3,this.ubicacionFactura);
//            pps2.executeUpdate();
//                        
//            PreparedStatement pps = cn.prepareStatement("set xact_abort on"
//                    +" begin distributed tran"
//                    +" INSERT INTO V_Facturas (IDENTIFICADORFACTURA,ISBN,CANTIDAD,PRECIOTOTAL,CODIGOSEDE,UBICACION) VALUES (?,?,?,?,?,?)"
//                    +" commit tran");
//            pps.setString(1, this.identificadorFactura);
//            pps.setString(2,this.ISBN);
//            pps.setInt(3,this.cantidad);
//            pps.setDouble(4, this.precioTotal);
//            pps.setString(5, codigoSede);
//            pps.setString(6, this.ubicacionFactura);
//            pps.executeUpdate();
//            
//             PreparedStatement pps1 = cn.prepareStatement("set xact_abort on"
//                    +" begin distributed tran"
//                    +" INSERT INTO V_EstadisticaFact (IDENTIFICACIONFACTURA,FECHAFACTURA,CEDULACLIENTE,CODIGOSEDE,UBICACION) VALUES (?,?,?,?,?)"
//                    +" commit tran");
//            pps1.setString(1, this.identificadorFactura);
//            pps1.setDate(2, java.sql.Date.valueOf(this.fecha));
//            pps1.setString(3,this.cedulaCliente);
//            pps1.setString(4, this.codigoSede);
//            pps1.setString(5, this.ubicacionFactura);
//            pps1.executeUpdate();
//            flag = true;
//        } 
//        catch(SQLException ex) 
//        {
//            Logger.getLogger(Facturas.class.getName()).log(Level. SEVERE, null, ex); 
//            System.out.println(ex.toString());
//        }
//        return flag;
    }
    
    public boolean eliminarRegistro(String id)
    {
        boolean flag = false;
    try {
        PreparedStatement pps;
        pps = cn.prepareStatement("set xact_abort on"
                    +" begin distributed tran"
                    +" DELETE FROM V_Facturas WHERE IDENTIFICADORFACTURA=?"
                    + " commit tran");
        pps.setString(1, id);
        pps.executeUpdate();
        
        PreparedStatement pps1;
        pps1 = cn.prepareStatement("set xact_abort on"
                    +" begin distributed tran"
                    +" DELETE FROM V_EstadisticaFact WHERE IDENTIFICACIONFACTURA=?"
                    + " commit tran");
        pps1.setString(1, id);
        pps1.executeUpdate();
        
        
        PreparedStatement pps2;
        pps2 = cn.prepareStatement("set xact_abort on"
                    +" begin distributed tran"
                    +" DELETE FROM V_INFOFACTURAS WHERE IDENTIFICACIONFACTURA=?"
                    + " commit tran");
        pps2.setString(1, id);
        pps2.executeUpdate();
        
        flag = true;
    } catch (SQLException ex) {
//        Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
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
//        cn.close();
        
    }catch(SQLException ex) {
        //JOptionPane.showMessageDialog (null, "Ocurrio un error al mostrar la tabla ","Error",0);  
//         Logger.getLogger(JFLibreria.class.getName()).log(Level. SEVERE, null, ex); 
//        JOptionPane.showMessageDialog (null, "Ocurrio un error al ingresar los datos ","Error",0);  
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
            dfm.addRow(new Object[]{rs.getString("IDENTIFICADORFACTURA"), rs.getString("ISBN"), rs.getInt("CANTIDAD"),rs.getDouble("PRECIOTOTAL"), rs.getString("UBICACION")});
        }
    }catch(SQLException ex) {
        //JOptionPane.showMessageDialog (null, "Ocurrio un error al mostrar la tabla ");     
    }

}
}
