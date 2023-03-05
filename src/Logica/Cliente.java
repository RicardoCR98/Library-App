package Logica;
import ConexionBD.ConexionBD;
import Vista.JFLibreria;
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
public class Cliente {
    
    private String cedula;
    private String codigoSede;
    private String nombre;
    private String telefono;
    private String direccion;
    private String ubicacion;
    ConexionBD conexion = new ConexionBD();
    Connection cn = conexion.conexion();
    
    public Cliente(){
        
    }

    public Cliente(String cedula,String nombre, String telefono, String direccion, String ubicacion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.codigoSede = "";
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigoSede() {
        return codigoSede;
    }

    public void setCodigoSede(String codigoSede) {
        this.codigoSede = codigoSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public boolean añadirCliente(){
            boolean bandera = false;
            if("Quito".equals(this.getUbicacion())){
                setCodigoSede("01");
            }else{
                setCodigoSede("02");
            }
            //sf
            try{
              PreparedStatement pps = cn.prepareStatement("INSERT INTO V_clientes"
                                                        + "(CEDULACLIENTE, CODIGOSEDE, NOMBRECLIENTE, TELEFONOCLIENTE, DIRECCIONCLIENTE, UBICACION) VALUES (?,?,?,?,?,?);"); 
              pps.setString(1, this.cedula);
              pps.setString(2, this.codigoSede);
              pps.setString(3, this.nombre);
              pps.setString(4, this.telefono);
              pps.setString(5,this.direccion);
              pps.setString(6, this.ubicacion);
              pps.executeUpdate();
              bandera = true;
            }catch(SQLException e){
             bandera = false;        
            }
            return bandera;
    }
    public boolean actualizarCliente(String sql){
           boolean bandera = false;
           try{
            PreparedStatement pps = cn.prepareStatement(sql);
            pps.executeUpdate();
            bandera = true;
           }catch(SQLException e){
            Logger.getLogger(Cliente.class.getName()).log(Level. SEVERE, null, e); 
            JOptionPane.showMessageDialog (null, "Ocurrio un error al Actualizar los datos ");     
            bandera = false;
           }
        return bandera;      
    }
    public boolean eliminarCliente(){
        boolean bandera = false;
        try{
           PreparedStatement pps = cn.prepareStatement("DELETE FROM V_clientes WHERE CEDULACLIENTE="+this.cedula); 
           pps.executeUpdate ();
           bandera = true;
        }catch(SQLException e){
           JOptionPane.showMessageDialog (null, "Ocurrio un error al eliminar los datos ");  
           bandera = false;
        }
        return bandera;
    }
    
    public JTable actualizarTabla(JTable tabla1){
        JTable tabla = tabla1;
        Statement st;
        ResultSet rs=null; 
        try {   
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM V_Clientes"); 
            DefaultTableModel dfm = new DefaultTableModel();
            tabla.setModel(dfm);
           dfm.setColumnIdentifiers(new Object[]{"Cédula","Nombre","Telefono","Dirección","Ubicación"});
           while(rs.next()){
               dfm.addRow(new Object[]{rs.getString("CEDULACLIENTE"), rs.getString("NOMBRECLIENTE"),rs.getString("TELEFONOCLIENTE"), 
                   rs.getString("DIRECCIONCLIENTE"), rs.getString("UBICACION") });
            }
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog (null, "Ocurrio un error al ingresar los datos ");  
        }        
            return tabla;

    }
    public void actualizarTablaBusqueda(JTable tabla1, String consulta){
    Statement st;
    ResultSet rs=null;    
    try {   
        st = cn.createStatement();       
        rs = st.executeQuery("SELECT * FROM FROM V_clientes WHERE CEDULACLIENTE='"+consulta+
                             "' OR NOMBRECLIENTE='"+consulta+
                             "' OR TELEFONOCLIENTE='"+consulta+
                             "' OR UBICACION='"+consulta+
                             "' OR DIRECCIONCLIENTE='"+consulta+"'"); 
        DefaultTableModel dfm = new DefaultTableModel();
        tabla1.setModel(dfm);
        dfm.setColumnIdentifiers(new Object[]{"Cédula","Nombre","Telefono","Dirección","Ubicación"});
        while(rs.next()){
            dfm.addRow(new Object[]{rs.getString("CEDULACLIENTE"), rs.getString("NOMBRECLIENTE"),
                rs.getString("TELEFONOCLIENTE"), rs.getString("DIRECCIONCLIENTE"), rs.getString("UBICACION") });
        }
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog (null, "No se encuentra");      
    }
   }
}
   
