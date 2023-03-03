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

public class Libro {
    private String ISBN;
    private String tituloLibro;
    private String nAutor;
    private String genero;
    private String anio_P;
    private String editorial;
    private String numEjemplar;
    private String precio;
    private String ubicacion;
    private String codSede;

    ConexionBD conexion = new ConexionBD();
    Connection cn = conexion.conexion();
    public Libro() {
    }

    public Libro(String ISBN, String tituloLibro, String nAutor, String genero, 
            String anio_P, String editorial, String numEjemplar, String precio, 
            String ubicacion, String codigoSede) {
        this.ISBN = ISBN;
        this.tituloLibro = tituloLibro;
        this.nAutor = nAutor;
        this.genero = genero;
        this.anio_P = anio_P;
        this.editorial = editorial;
        this.numEjemplar = numEjemplar;
        this.precio = precio;
        this.ubicacion = ubicacion;
        this.codSede = codigoSede;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getnAutor() {
        return nAutor;
    }

    public void setnAutor(String nAutor) {
        this.nAutor = nAutor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnio_P() {
        return anio_P;
    }

    public void setAnio_P(String anio_P) {
        this.anio_P = anio_P;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNumEjemplar() {
        return numEjemplar;
    }

    public void setNumEjemplar(String numEjemplar) {
        this.numEjemplar = numEjemplar;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCodSede() {
        return codSede;
    }

    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }
    
    public boolean añadirLibro(){
        boolean flag = false;
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO V_Ejemplar VALUES (?,?,?,?)"); 
            pps.setString (1, this.ISBN);
            pps.setString (2, this.codSede);
            pps.setInt (3, Integer.parseInt(this.numEjemplar));
            pps.setString(4, this.ubicacion);
            pps.executeUpdate ();
            flag = true;
        } catch(SQLException ex) {
            return flag;    
        }
        return flag;
    }
    
    public boolean actualizarLibro(String sql){
        boolean flag = false;
        try {
            PreparedStatement pps = cn.prepareStatement(sql);
            pps.executeUpdate();
            flag = true;
        } catch(SQLException ex) {
            Logger.getLogger(Libro.class.getName()).log(Level. SEVERE, null, ex);    
        }
        return flag;
    }
    
    
    public boolean LibroestaDisponible(){
    int cantidad = 0;
    boolean resultado=false;
    Statement st;
    ResultSet rs=null;    
    try {   
        st = cn.createStatement();
        rs = st.executeQuery("SELECT cantidad FROM V_Libros WHERE ISBN = "+ this.ISBN); 
        while(rs.next()){
            cantidad = rs.getInt("cantidad");
        }
        if(cantidad > 0){
            resultado = true;
        }
        
    }catch(SQLException ex) {
        Logger.getLogger(Libro.class.getName()).log(Level. SEVERE, null, ex); 
        JOptionPane.showMessageDialog (null, "No se sabe si esta disponible el libro ");     
    }
    return resultado;
    }
    
    
    public int obtenerCantidadLibro(String ISBN){
    int cantidad = 0;
    Statement st;
    ResultSet rs = null;
    try{
        st = cn.createStatement();
        rs = st.executeQuery("SELECT cantidad FROM V_Libros WHERE ISBN = "+ISBN);
        while(rs.next()){
            cantidad = rs.getInt("cantidad");
        }
    }catch(SQLException ex) {
        Logger.getLogger(Libro.class.getName()).log(Level. SEVERE, null, ex); 
        JOptionPane.showMessageDialog (null, "Error al obtener la cantidad de libros");     
    }
    return cantidad;
}
    
    public void LibroDisponible(){
    int cantidad = obtenerCantidadLibro(this.ISBN);
    cantidad++;
    String c = String.valueOf(cantidad);
    System.out.println(c);
    try {   
        PreparedStatement pps = cn.prepareStatement("UPDATE Libro SET cantidad="+ c +" WHERE codigo_l = " +this.ISBN);
        pps.executeUpdate();
            
    } catch(SQLException ex) {
        Logger.getLogger(Libro.class.getName()).log(Level. SEVERE, null, ex); 
        JOptionPane.showMessageDialog (null, "Ocurrio un error al ingresar los datos ");     
    }
}
    public JTable actualizarTabla(JTable tabla1){
        Statement st;
        ResultSet rs=null;
        JTable tabla = tabla1;
        try {   
        st = cn.createStatement();
        rs = st.executeQuery("SELECT * FROM V_Libros"); 
        DefaultTableModel dfm = new DefaultTableModel();
        tabla.setModel(dfm);
        dfm.setColumnIdentifiers(new Object[]{"ISBN","Titulo","Autor","Género","Año","Editorial",
            "Cantidad","Precio","Ubicacion"});
        while(rs.next()){
            dfm.addRow(new Object[]{rs.getString("ISBN"), rs.getString("TITULOLIBRO"), rs.getString("NOMBREAUTOR"), rs.getString("Genero"),
            rs.getString("Anio_publicacion"), rs.getString("NombreEditorial"), rs.getString("NumEjemplar"),rs.getString("Precio"),
            rs.getString("Ubicacion")});
        }
    }catch(SQLException ex) {
        Logger.getLogger(JFLibreria.class.getName()).log(Level. SEVERE, null, ex); 
        JOptionPane.showMessageDialog (null, "Ocurrio un error al ingresar los datos ");     
    }
        return tabla;
    } 
    
    public void ActualizarTablaLibrosBusqueda(JTable tabla, String consulta){
    Statement st;
    ResultSet rs=null;    
    try {   
        st = cn.createStatement();      
        rs = st.executeQuery("SELECT * FROM V_Libros WHERE ISBN='"+consulta+"' OR NOMBREAUTOR='"+consulta
        +"' OR GENERO='"+consulta+"'"+" OR TITULOLIBRO='"+consulta+"'"); 
        DefaultTableModel dfm = new DefaultTableModel();
        tabla.setModel(dfm);
        dfm.setColumnIdentifiers(new Object[]{"ISBN","Titulo","Autor","Género","Año","Editorial",
            "Cantidad","Precio","Ubicacion"});
        while(rs.next()){
            dfm.addRow(new Object[]{rs.getString("ISBN"), rs.getString("TITULOLIBRO"), rs.getString("NOMBREAUTOR"), rs.getString("Genero"),
            rs.getString("Anio_publicacion"), rs.getString("NombreEditorial"), rs.getString("NumEjemplar"),rs.getString("Precio"),
            rs.getString("Ubicacion")});
        }    
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog (null, "No se encuentra");     
        }
}
    public void LibroOcupado(){
    int cantidad = obtenerCantidadLibro(this.ISBN);
    cantidad--;
    String c = String.valueOf(cantidad);
    System.out.println(c);
    try {
        PreparedStatement pps = cn.prepareStatement("UPDATE V_Ejemplar SET cantidad="+c+" WHERE ISBN="+this.ISBN); 
        pps.executeUpdate();
            
    } catch(SQLException ex) {
        Logger.getLogger(JFLibreria.class.getName()).log(Level. SEVERE, null, ex); 
        JOptionPane.showMessageDialog (null, "Ocurrio un error al ingresar los datos ");     
    }
}

}
