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
    private int numEjemplar;
    private double precio;
    private String ubicacion;
    private String codSede;

    ConexionBD conexion = new ConexionBD();
    Connection cn = conexion.conexion();
    public Libro() {
    }

    public Libro(String ISBN, String tituloLibro, String nAutor, String genero, 
            String anio_P, String editorial, int numEjemplar, double precio, 
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

    public int getNumEjemplar() {
        return numEjemplar;
    }

    public void setNumEjemplar(int numEjemplar) {
        this.numEjemplar = numEjemplar;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
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
    
    public boolean añadirLibro(String ISBN, String codSede, int numEjemplar, String ubicacion){
        boolean flag = false;
        try {
            PreparedStatement pps = cn.prepareStatement("set xact_abort on"
                    + " begin distributed tran"
                    + " INSERT INTO V_Ejemplar (ISBN, CODIGOSEDE, NUMEJEMPLAR, UBICACION) VALUES (?, ?, ?, ?)"
                    + " commit tran"); 
            pps.setString (1, ISBN);
            pps.setString (2, codSede);
            pps.setInt (3, numEjemplar);
            pps.setString(4, ubicacion);
            pps.executeUpdate ();
            flag = true;
        } catch(SQLException ex) {   
            System.out.println(ex.toString());
        }
        return flag;
    }
    
    public boolean actualizarLibro(int consulta, String condicion, String codigoSede){
        boolean flag = false;
        try {
             String sql = "set xact_abort on"
                + " begin distributed tran"
                + " UPDATE V_Ejemplar SET NUMEJEMPLAR="+ consulta + " WHERE ISBN" + " LIKE "+condicion + " AND CODIGOSEDE='"+codigoSede+"'"
                + " commit tran";
            PreparedStatement pps = cn.prepareStatement(sql);
            pps.executeUpdate();
            flag = true;
        } catch(SQLException ex) {   
            Logger.getLogger(Libro.class.getName()).log(Level. SEVERE, null, ex); 
            System.out.println(ex);
        }
        return flag;
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
        JOptionPane.showMessageDialog (null, "Ocurrio un error al ingresar los datos ","Error",0);     
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

}
