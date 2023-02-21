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
    
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;
    private String Ubicacion;
    
    public Cliente(){
        
    }

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.Ubicacion = Ubicacion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    
    
   
    public boolean añadirCliente(){
//        boolean flag = false;
//        try {
//            PreparedStatement pps = cn.prepareStatement("INSERT INTO Estudiante(nombres_e, apellidos_e) VALUES (?,?)"); 
//            pps.setLong(1, this.codigoEstudiante);
//            pps.setString(1, this.cedula);
//            pps.setString(2, this.nombre);
//            pps.setString(3, this.telefono);
//            pps.setString(4,this.direccion);
//            pps.setString(5, this.Ubicacion);
//
//           
//            pps.executeUpdate ();
//            flag = true;
//        } catch(SQLException ex) {
//            Logger.getLogger(Cliente.class.getName()).log(Level. SEVERE, null, ex); 
//            flag = false;     
//        }
//        return flag;
return true;
    }
    public boolean ActualizarCliente(String sql){
//        boolean flag = false;
//        try {
//        PreparedStatement pps = cn.prepareStatement(sql);
//        pps.executeUpdate();
//        flag = true;
//     } catch(SQLException ex) {
//            Logger.getLogger(Cliente.class.getName()).log(Level. SEVERE, null, ex); 
//            JOptionPane.showMessageDialog (null, "Ocurrio un error al Actualizar los datos ");     
//        }
//        return flag;
return true;
    }
    public boolean EliminarCliente(){
//        boolean flag = false;
//        try {
//            PreparedStatement pps = cn.prepareStatement("DELETE FROM Estudiante WHERE codigo_e="+this.codigoEstudiante); 
//            pps.executeUpdate ();
//            flag = true;
//        } catch(SQLException ex) {
//            Logger.getLogger(Cliente.class.getName()).log(Level. SEVERE, null, ex); 
//            JOptionPane.showMessageDialog (null, "Ocurrio un error al eliminar los datos ");     
//        }
//        return flag;
return true;
        
    }
    public JTable actualizarTabla(JTable tabla1){
    JTable tabla = tabla1;
//    Statement st;
//    ResultSet rs=null; 
//    try {   
//        st = cn.createStatement();
//        rs = st.executeQuery("SELECT * FROM Estudiante"); 
//        DefaultTableModel dfm = new DefaultTableModel();
//        tabla.setModel(dfm);
//        dfm.setColumnIdentifiers(new Object[]{"Código","Nombres","Apellidos"});
//        while(rs.next()){
//            dfm.addRow(new Object[]{rs.getInt("codigo_e"), rs.getString("nombres_e"), rs.getString("apellidos_e")});
//        }
//    }catch(SQLException ex) {
//        Logger.getLogger(JFBiblioteca.class.getName()).log(Level. SEVERE, null, ex); 
//    }        
//        return tabla;
return tabla;
    }
    public void actualizarTablaBusqueda(JTable tabla1, String consulta){
//    Statement st;
//    ResultSet rs=null;    
//    try {   
//        st = cn.createStatement();       
//        rs = st.executeQuery("SELECT * FROM Estudiante WHERE "+consulta); 
//        DefaultTableModel dfm = new DefaultTableModel();
//        tabla1.setModel(dfm);
//        dfm.setColumnIdentifiers(new Object[]{"Código","Nombre","Apellido"});
//        while(rs.next()){
//            dfm.addRow(new Object[]{rs.getInt("codigo_e"), rs.getString("nombres_e"), rs.getString("apellidos_e")});
//        }
//        
//        }catch(SQLException ex) {
//        //Logger.getLogger(JFBibliotecaDB.class.getName()).log(Level. SEVERE, null, ex); 
//        //JOptionPane.showMessageDialog (null, "Ocurrio un error al ingresar los datos ");     
//    }
   }
}
   
