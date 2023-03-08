package Vista;

import Logica.*;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
public final class JFLibreria extends javax.swing.JFrame{
   
    JFAddCliente jfaddcliente;
    JFEditCliente jfeditcliente;
    JFAddLibro jfaddlibro;
    JFModificarLibro jfmodificarlibro;
    Libro libro;
    Cliente cliente;
    JFAddFactura jfAddFactura;
    Login log = new Login();
    Facturas factura;
    JTable tabla;
    public JFLibreria() {
        initComponents();
        factura = new Facturas();
        this.setLocationRelativeTo(null);
        scaleImage();
        showPanel();
        setVisible(true);
        jfaddlibro = new JFAddLibro(this.jTLibros);
        jfmodificarlibro = new JFModificarLibro();
        jfaddcliente = new JFAddCliente(this.jTClientes);
        jfeditcliente = new JFEditCliente(this.jTClientes);
        jfAddFactura = new JFAddFactura(this.JTFactuas);
        cliente = new Cliente();
        libro = new Libro();
        jfaddlibro.actualizarTabla();
        
    }
    
    public void showPanel() {
        this.PClientes.setVisible(false);
        this.PnlLib.setVisible(false);
        this.PFacturas.setVisible(false);
        lblUsers.setForeground(Color.white);
        lblUsers.setText("Admin");
    }

    //Escalar imagenes del inicio
    public void scaleImage() {
        //Logo Librimundi
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/iconMinimal.jpg"));
        Image image = (icon).getImage().getScaledInstance(this.iconoLibriMundi.getWidth(), iconoLibriMundi.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);
        iconoLibriMundi.setIcon(icon);
        //Inicio
        ImageIcon iconoMinimal = new ImageIcon(getClass().getResource("/Imagenes/LogoLibri.jpg"));
        Image imagenFondo = (iconoMinimal).getImage().getScaledInstance(this.PiconMinimal.getWidth(), this.PiconMinimal.getHeight(), Image.SCALE_SMOOTH);
        iconoMinimal = new ImageIcon(imagenFondo);
        PiconMinimal.setIcon(iconoMinimal);
        //Admin
        ImageIcon iconoAdminis = new ImageIcon(getClass().getResource("/Imagenes/admin.png"));
        Image imageAdmin = (iconoAdminis).getImage().getScaledInstance(this.iconoAdmin.getWidth(), iconoAdmin.getHeight(), Image.SCALE_SMOOTH);
        iconoAdminis = new ImageIcon(imageAdmin);
        iconoAdmin.setIcon(iconoAdminis);
        //PoradaLibro
        ImageIcon iconLibro = new ImageIcon(getClass().getResource("/Imagenes/libro.png"));
        Image imageLibro = (iconLibro).getImage().getScaledInstance(this.iconoLibro.getWidth(), iconoLibro.getHeight(), Image.SCALE_SMOOTH);
        iconLibro = new ImageIcon(imageLibro);
        iconoLibro.setIcon(iconLibro);
        //IconoHome
        ImageIcon iconeHome = new ImageIcon(getClass().getResource("/Imagenes/Home.png"));
        Image imageHome = (iconeHome).getImage().getScaledInstance(this.iconHome.getWidth(), this.iconHome.getHeight(), Image.SCALE_SMOOTH);
        iconeHome = new ImageIcon(imageHome);
        iconHome.setIcon(iconeHome);
        //Estudiante
        ImageIcon iconRegis = new ImageIcon(getClass().getResource("/Imagenes/RegistroEstudiante.png"));
        Image imageEstu = (iconRegis).getImage().getScaledInstance(this.iconoEstud.getWidth(), iconoEstud.getHeight(), Image.SCALE_SMOOTH);
        iconRegis = new ImageIcon(imageEstu);
        iconoEstud.setIcon(iconRegis);
        //AñadirLibro
        ImageIcon iconodLibro = new ImageIcon(getClass().getResource("/Imagenes/AñadirLib.png"));
        Image imageLib = (iconodLibro).getImage().getScaledInstance(this.iconLib.getWidth(), iconLib.getHeight(), Image.SCALE_SMOOTH);
        iconodLibro = new ImageIcon(imageLib);
        iconLib.setIcon(iconodLibro);
        //Prestamos y multas
        ImageIcon iconPrestamo = new ImageIcon(getClass().getResource("/Imagenes/prestamo.png"));
        Image imagePrest = (iconPrestamo).getImage().getScaledInstance(this.iconoPrestamo.getWidth(), iconoPrestamo.getHeight(), Image.SCALE_SMOOTH);
        iconPrestamo = new ImageIcon(imagePrest);
        iconoPrestamo.setIcon(iconPrestamo);
        //Añadir Estudiante
        ImageIcon iconEstud = new ImageIcon(getClass().getResource("/Imagenes/AñadirEstud.png"));
        Image imageAñadir = (iconEstud).getImage().getScaledInstance(this.EiconoAñadir.getWidth(), EiconoAñadir.getHeight(), Image.SCALE_SMOOTH);
        iconEstud = new ImageIcon(imageAñadir);
        EiconoAñadir.setIcon(iconEstud);
        //Modificar Estudiante
        ImageIcon iconModif = new ImageIcon(getClass().getResource("/Imagenes/ModificarEstud.png"));
        Image imageModif = (iconModif).getImage().getScaledInstance(this.EiconoModificar.getWidth(), EiconoModificar.getHeight(), Image.SCALE_SMOOTH);
        iconModif = new ImageIcon(imageModif);
        EiconoModificar.setIcon(iconModif);

        //Lupa
        ImageIcon iconLupa = new ImageIcon(getClass().getResource("/Imagenes/Lupa.png"));
        Image imageLupa = (iconLupa).getImage().getScaledInstance(this.EiconoLupa.getWidth(), EiconoLupa.getHeight(), Image.SCALE_SMOOTH);
        iconLupa = new ImageIcon(imageLupa);
        EiconoLupa.setIcon(iconLupa);
        //Lupa
        ImageIcon iconLupaPrest = new ImageIcon(getClass().getResource("/Imagenes/Lupa.png"));
        Image imageLupa1 = (iconLupaPrest).getImage().getScaledInstance(this.PMiconoLupa.getWidth(), PMiconoLupa.getHeight(), Image.SCALE_SMOOTH);
        iconLupaPrest = new ImageIcon(imageLupa1);
        PMiconoLupa.setIcon(iconLupaPrest);
        //Añadir Libro
        ImageIcon iconoLib = new ImageIcon(getClass().getResource("/Imagenes/AñadirLib_1.png"));
        Image imageAñadirLib = (iconoLib).getImage().getScaledInstance(this.LiconoAñadir.getWidth(), LiconoAñadir.getHeight(), Image.SCALE_SMOOTH);
        iconoLib = new ImageIcon(imageAñadirLib);
        LiconoAñadir.setIcon(iconoLib);

        //Eliminar Libro
        ImageIcon iconElimiLib = new ImageIcon(getClass().getResource("/Imagenes/EliminarLib.png"));
        Image imageEliminarLib = (iconElimiLib).getImage().getScaledInstance(this.LiconoEliminar.getWidth(), LiconoEliminar.getHeight(), Image.SCALE_SMOOTH);
        iconElimiLib = new ImageIcon(imageEliminarLib);
        LiconoEliminar.setIcon(iconElimiLib);
        //Lupa
        ImageIcon iconLupa1 = new ImageIcon(getClass().getResource("/Imagenes/Lupa.png"));
        Image imageLupa2 = (iconLupa1).getImage().getScaledInstance(this.LiconoLupa.getWidth(), LiconoLupa.getHeight(), Image.SCALE_SMOOTH);
        iconLupa1 = new ImageIcon(imageLupa2);
        LiconoLupa.setIcon(iconLupa1);
        //Prestamos
        ImageIcon iconoPrestm1 = new ImageIcon(getClass().getResource("/Imagenes/Prestamo_1.png"));
        Image imagePrest1 = (iconoPrestm1).getImage().getScaledInstance(this.PiconoPrestamo.getWidth(), PiconoPrestamo.getHeight(), Image.SCALE_SMOOTH);
        iconoPrestm1 = new ImageIcon(imagePrest1);
        PiconoPrestamo.setIcon(iconoPrestm1);
        //EliminarPrestamo
        ImageIcon iconoEliPres = new ImageIcon(getClass().getResource("/Imagenes/EliminarMulta.png"));
        Image imageEliPrest = (iconoEliPres).getImage().getScaledInstance(this.PiconoElimiPrest.getWidth(), PiconoElimiPrest.getHeight(), Image.SCALE_SMOOTH);
        iconoEliPres = new ImageIcon(imageEliPrest);
        PiconoElimiPrest.setIcon(iconoEliPres);     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        iconoLibro = new javax.swing.JLabel();
        TopBar = new javax.swing.JPanel();
        TolBar = new javax.swing.JPanel();
        iconoAdmin = new javax.swing.JLabel();
        lblUsers = new javax.swing.JLabel();
        pnlLib = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        iconoLibriMundi = new javax.swing.JLabel();
        Opciones = new javax.swing.JPanel();
        Inicio = new javax.swing.JPanel();
        btnIniciotxt = new javax.swing.JLabel();
        iconHome = new javax.swing.JLabel();
        RegistroEstudiante = new javax.swing.JPanel();
        btnCliente = new javax.swing.JLabel();
        iconoEstud = new javax.swing.JLabel();
        RegistroLibro = new javax.swing.JPanel();
        btnLibTxt = new javax.swing.JLabel();
        iconLib = new javax.swing.JLabel();
        PrestamoMulta = new javax.swing.JPanel();
        btnPrestamoTxt = new javax.swing.JLabel();
        iconoPrestamo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Contenido = new javax.swing.JLayeredPane();
        PClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        EtxtBusqueda = new javax.swing.JTextField();
        EiconoLupa = new javax.swing.JLabel();
        EPanelAñadir = new javax.swing.JPanel();
        btnAñadirEstuxt = new javax.swing.JLabel();
        EiconoAñadir = new javax.swing.JLabel();
        EPanelModif = new javax.swing.JPanel();
        btnModificarEstuTxt = new javax.swing.JLabel();
        EiconoModificar = new javax.swing.JLabel();
        PnlLib = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LtxtBusqueda = new javax.swing.JTextField();
        LiconoLupa = new javax.swing.JLabel();
        LPanelElimiLib = new javax.swing.JPanel();
        LiconoEliminar = new javax.swing.JLabel();
        btnModificarLibrTxt = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTLibros = new javax.swing.JTable();
        LPanelAñadirLib = new javax.swing.JPanel();
        btnAñadirLibTxt = new javax.swing.JLabel();
        LiconoAñadir = new javax.swing.JLabel();
        PFacturas = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        PPanelPrestamo = new javax.swing.JPanel();
        btnPrestamoLibTxt = new javax.swing.JLabel();
        PiconoPrestamo = new javax.swing.JLabel();
        PPEliminarPrestamo = new javax.swing.JPanel();
        btnEliminarPrestamoLibTxt = new javax.swing.JLabel();
        PiconoElimiPrest = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        JTFactuas = new javax.swing.JTable();
        PMiconoLupa = new javax.swing.JLabel();
        LtxtBusquedaFacturas = new javax.swing.JTextField();
        PInicio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PiconMinimal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libreria");
        setResizable(false);

        TolBar.setBackground(new java.awt.Color(37, 40, 80));
        TolBar.setToolTipText("");

        iconoAdmin.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblUsers.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblUsers.setForeground(new java.awt.Color(255, 255, 255));
        lblUsers.setText(": ....");

        javax.swing.GroupLayout TolBarLayout = new javax.swing.GroupLayout(TolBar);
        TolBar.setLayout(TolBarLayout);
        TolBarLayout.setHorizontalGroup(
            TolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(838, Short.MAX_VALUE))
        );
        TolBarLayout.setVerticalGroup(
            TolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TolBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(iconoAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlLib.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIBRIMUNDI");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setAlignmentY(0.8F);

        javax.swing.GroupLayout pnlLibLayout = new javax.swing.GroupLayout(pnlLib);
        pnlLib.setLayout(pnlLibLayout);
        pnlLibLayout.setHorizontalGroup(
            pnlLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLibLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlLibLayout.setVerticalGroup(
            pnlLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLibLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout TopBarLayout = new javax.swing.GroupLayout(TopBar);
        TopBar.setLayout(TopBarLayout);
        TopBarLayout.setHorizontalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(iconoLibriMundi, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnlLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TopBarLayout.setVerticalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopBarLayout.createSequentialGroup()
                .addGroup(TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(iconoLibriMundi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlLib, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TolBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Opciones.setBackground(new java.awt.Color(37, 40, 80));
        Opciones.setToolTipText("");

        Inicio.setBackground(new java.awt.Color(37, 40, 80));
        Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InicioMouseExited(evt);
            }
        });

        btnIniciotxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnIniciotxt.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciotxt.setText("Inicio");
        btnIniciotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciotxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciotxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciotxtMouseExited(evt);
            }
        });

        iconHome.setForeground(new java.awt.Color(255, 255, 102));
        iconHome.setAlignmentY(0.0F);
        iconHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconHomeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(iconHome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIniciotxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(InicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconHome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RegistroEstudiante.setBackground(new java.awt.Color(37, 40, 80));
        RegistroEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistroEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistroEstudianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistroEstudianteMouseExited(evt);
            }
        });

        btnCliente.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setText("Clientes");
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClienteMouseExited(evt);
            }
        });

        iconoEstud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoEstudMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoEstudMouseExited(evt);
            }
        });

        javax.swing.GroupLayout RegistroEstudianteLayout = new javax.swing.GroupLayout(RegistroEstudiante);
        RegistroEstudiante.setLayout(RegistroEstudianteLayout);
        RegistroEstudianteLayout.setHorizontalGroup(
            RegistroEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroEstudianteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoEstud, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        RegistroEstudianteLayout.setVerticalGroup(
            RegistroEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RegistroEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoEstud, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RegistroLibro.setBackground(new java.awt.Color(37, 40, 80));
        RegistroLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistroLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistroLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistroLibroMouseExited(evt);
            }
        });

        btnLibTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnLibTxt.setForeground(new java.awt.Color(255, 255, 255));
        btnLibTxt.setText("Libros ");
        btnLibTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLibTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLibTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLibTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLibTxtMouseExited(evt);
            }
        });

        iconLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconLibMouseExited(evt);
            }
        });

        javax.swing.GroupLayout RegistroLibroLayout = new javax.swing.GroupLayout(RegistroLibro);
        RegistroLibro.setLayout(RegistroLibroLayout);
        RegistroLibroLayout.setHorizontalGroup(
            RegistroLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLibroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconLib, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLibTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        RegistroLibroLayout.setVerticalGroup(
            RegistroLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLibTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(RegistroLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLib, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PrestamoMulta.setBackground(new java.awt.Color(37, 40, 80));
        PrestamoMulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrestamoMulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrestamoMultaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrestamoMultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrestamoMultaMouseExited(evt);
            }
        });

        btnPrestamoTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnPrestamoTxt.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamoTxt.setText("Facturas");
        btnPrestamoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrestamoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrestamoTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrestamoTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrestamoTxtMouseExited(evt);
            }
        });

        iconoPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoPrestamoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PrestamoMultaLayout = new javax.swing.GroupLayout(PrestamoMulta);
        PrestamoMulta.setLayout(PrestamoMultaLayout);
        PrestamoMultaLayout.setHorizontalGroup(
            PrestamoMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrestamoMultaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrestamoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PrestamoMultaLayout.setVerticalGroup(
            PrestamoMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPrestamoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PrestamoMultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Copyright ©2023");

        javax.swing.GroupLayout OpcionesLayout = new javax.swing.GroupLayout(Opciones);
        Opciones.setLayout(OpcionesLayout);
        OpcionesLayout.setHorizontalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(RegistroEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RegistroLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PrestamoMulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OpcionesLayout.setVerticalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegistroEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegistroLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrestamoMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel13)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        Contenido.setBorder(new javax.swing.border.MatteBorder(null));

        PClientes.setPreferredSize(new java.awt.Dimension(947, 706));

        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Telefono", "Direccion", "Ubicacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTClientes);

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel6.setText("REGISTRO Y MODIFICACION DE CLIENTES");

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setText("Escritorio");

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("/ Clientes");

        EtxtBusqueda.setForeground(new java.awt.Color(204, 204, 204));
        EtxtBusqueda.setText("Busqueda");
        EtxtBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 40, 80)));
        EtxtBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EtxtBusquedaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EtxtBusquedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EtxtBusquedaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EtxtBusquedaMousePressed(evt);
            }
        });

        EiconoLupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EiconoLupaMouseClicked(evt);
            }
        });

        EPanelAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EPanelAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EPanelAñadirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EPanelAñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EPanelAñadirMouseExited(evt);
            }
        });

        btnAñadirEstuxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAñadirEstuxt.setText("Añadir Cliente");

        javax.swing.GroupLayout EPanelAñadirLayout = new javax.swing.GroupLayout(EPanelAñadir);
        EPanelAñadir.setLayout(EPanelAñadirLayout);
        EPanelAñadirLayout.setHorizontalGroup(
            EPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EPanelAñadirLayout.createSequentialGroup()
                .addGroup(EPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EPanelAñadirLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnAñadirEstuxt))
                    .addGroup(EPanelAñadirLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(EiconoAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        EPanelAñadirLayout.setVerticalGroup(
            EPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EPanelAñadirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EiconoAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAñadirEstuxt)
                .addContainerGap())
        );

        EPanelModif.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EPanelModif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EPanelModifMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EPanelModifMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EPanelModifMouseExited(evt);
            }
        });

        btnModificarEstuTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnModificarEstuTxt.setText("Modificar/Eliminar Cliente");

        javax.swing.GroupLayout EPanelModifLayout = new javax.swing.GroupLayout(EPanelModif);
        EPanelModif.setLayout(EPanelModifLayout);
        EPanelModifLayout.setHorizontalGroup(
            EPanelModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EPanelModifLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificarEstuTxt)
                .addGap(14, 14, 14))
            .addGroup(EPanelModifLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(EiconoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EPanelModifLayout.setVerticalGroup(
            EPanelModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EPanelModifLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(EiconoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarEstuTxt)
                .addContainerGap())
        );

        javax.swing.GroupLayout PClientesLayout = new javax.swing.GroupLayout(PClientes);
        PClientes.setLayout(PClientesLayout);
        PClientesLayout.setHorizontalGroup(
            PClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PClientesLayout.createSequentialGroup()
                .addGroup(PClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PClientesLayout.createSequentialGroup()
                        .addContainerGap(636, Short.MAX_VALUE)
                        .addComponent(EiconoLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(EtxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PClientesLayout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addComponent(EPanelAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(168, 168, 168)
                            .addComponent(EPanelModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PClientesLayout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(PClientesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PClientesLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PClientesLayout.setVerticalGroup(
            PClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PClientesLayout.createSequentialGroup()
                .addGroup(PClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PClientesLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addGroup(PClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PClientesLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(PClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PClientesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                                .addComponent(EPanelModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PClientesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EPanelAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(PClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EiconoLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        PnlLib.setPreferredSize(new java.awt.Dimension(947, 706));

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel14.setText("REGISTRO Y MODIFICACION DE LIBROS");

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel15.setText("Escritorio");

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("/ Libros");

        LtxtBusqueda.setForeground(new java.awt.Color(204, 204, 204));
        LtxtBusqueda.setText("Busqueda");
        LtxtBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 40, 80)));
        LtxtBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LtxtBusquedaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LtxtBusquedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LtxtBusquedaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LtxtBusquedaMousePressed(evt);
            }
        });
        LtxtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LtxtBusquedaActionPerformed(evt);
            }
        });

        LiconoLupa.setDoubleBuffered(true);
        LiconoLupa.setOpaque(true);
        LiconoLupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LiconoLupaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LiconoLupaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LiconoLupaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LiconoLupaMousePressed(evt);
            }
        });

        LPanelElimiLib.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LPanelElimiLib.setPreferredSize(new java.awt.Dimension(213, 61));
        LPanelElimiLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LPanelElimiLibMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LPanelElimiLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LPanelElimiLibMouseExited(evt);
            }
        });

        btnModificarLibrTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnModificarLibrTxt.setText("Modificar Libro");
        btnModificarLibrTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarLibrTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LPanelElimiLibLayout = new javax.swing.GroupLayout(LPanelElimiLib);
        LPanelElimiLib.setLayout(LPanelElimiLibLayout);
        LPanelElimiLibLayout.setHorizontalGroup(
            LPanelElimiLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LPanelElimiLibLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(LiconoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(LPanelElimiLibLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnModificarLibrTxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LPanelElimiLibLayout.setVerticalGroup(
            LPanelElimiLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LPanelElimiLibLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LiconoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarLibrTxt)
                .addGap(15, 15, 15))
        );

        jTLibros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTLibros);

        jScrollPane4.setViewportView(jScrollPane3);

        LPanelAñadirLib.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LPanelAñadirLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LPanelAñadirLibMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LPanelAñadirLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LPanelAñadirLibMouseExited(evt);
            }
        });

        btnAñadirLibTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAñadirLibTxt.setText("Añadir Libro");

        javax.swing.GroupLayout LPanelAñadirLibLayout = new javax.swing.GroupLayout(LPanelAñadirLib);
        LPanelAñadirLib.setLayout(LPanelAñadirLibLayout);
        LPanelAñadirLibLayout.setHorizontalGroup(
            LPanelAñadirLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LPanelAñadirLibLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(LPanelAñadirLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAñadirLibTxt)
                    .addGroup(LPanelAñadirLibLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(LiconoAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        LPanelAñadirLibLayout.setVerticalGroup(
            LPanelAñadirLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LPanelAñadirLibLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LiconoAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAñadirLibTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PnlLibLayout = new javax.swing.GroupLayout(PnlLib);
        PnlLib.setLayout(PnlLibLayout);
        PnlLibLayout.setHorizontalGroup(
            PnlLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlLibLayout.createSequentialGroup()
                .addGroup(PnlLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlLibLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(PnlLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlLibLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16))
                            .addComponent(jLabel14)
                            .addGroup(PnlLibLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(PnlLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LiconoLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PnlLibLayout.createSequentialGroup()
                                        .addComponent(LPanelAñadirLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)
                                        .addComponent(LPanelElimiLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LtxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PnlLibLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        PnlLibLayout.setVerticalGroup(
            PnlLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlLibLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(PnlLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(44, 44, 44)
                .addGroup(PnlLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LPanelElimiLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LPanelAñadirLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PnlLibLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LiconoLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LtxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel19.setText("Facturas");

        jLabel20.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel20.setText("Escritorio");

        jLabel21.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("/ Facturas");

        PPanelPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PPanelPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PPanelPrestamoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PPanelPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PPanelPrestamoMouseExited(evt);
            }
        });

        btnPrestamoLibTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnPrestamoLibTxt.setText("Agregar Factura");

        javax.swing.GroupLayout PPanelPrestamoLayout = new javax.swing.GroupLayout(PPanelPrestamo);
        PPanelPrestamo.setLayout(PPanelPrestamoLayout);
        PPanelPrestamoLayout.setHorizontalGroup(
            PPanelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPanelPrestamoLayout.createSequentialGroup()
                .addGroup(PPanelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PPanelPrestamoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnPrestamoLibTxt))
                    .addGroup(PPanelPrestamoLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(PiconoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        PPanelPrestamoLayout.setVerticalGroup(
            PPanelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPanelPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PiconoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrestamoLibTxt)
                .addContainerGap())
        );

        PPEliminarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PPEliminarPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PPEliminarPrestamoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PPEliminarPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PPEliminarPrestamoMouseExited(evt);
            }
        });

        btnEliminarPrestamoLibTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnEliminarPrestamoLibTxt.setText("Eliminar Factura");

        javax.swing.GroupLayout PPEliminarPrestamoLayout = new javax.swing.GroupLayout(PPEliminarPrestamo);
        PPEliminarPrestamo.setLayout(PPEliminarPrestamoLayout);
        PPEliminarPrestamoLayout.setHorizontalGroup(
            PPEliminarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPEliminarPrestamoLayout.createSequentialGroup()
                .addGroup(PPEliminarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PPEliminarPrestamoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnEliminarPrestamoLibTxt))
                    .addGroup(PPEliminarPrestamoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(PiconoElimiPrest, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PPEliminarPrestamoLayout.setVerticalGroup(
            PPEliminarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPEliminarPrestamoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PiconoElimiPrest, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarPrestamoLibTxt)
                .addContainerGap())
        );

        JTFactuas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "ISBN", "Cantidad", "Precio Total", "Ubicacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(JTFactuas);

        jScrollPane5.setViewportView(jScrollPane6);

        PMiconoLupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PMiconoLupaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PMiconoLupaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PMiconoLupaMouseExited(evt);
            }
        });

        LtxtBusquedaFacturas.setForeground(new java.awt.Color(204, 204, 204));
        LtxtBusquedaFacturas.setText("Busqueda");
        LtxtBusquedaFacturas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 40, 80)));
        LtxtBusquedaFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LtxtBusquedaFacturasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LtxtBusquedaFacturasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LtxtBusquedaFacturasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LtxtBusquedaFacturasMousePressed(evt);
            }
        });
        LtxtBusquedaFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LtxtBusquedaFacturasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PFacturasLayout = new javax.swing.GroupLayout(PFacturas);
        PFacturas.setLayout(PFacturasLayout);
        PFacturasLayout.setHorizontalGroup(
            PFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PFacturasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PMiconoLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LtxtBusquedaFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(PFacturasLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PFacturasLayout.createSequentialGroup()
                        .addGroup(PFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PFacturasLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)
                                .addGap(234, 234, 234))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PFacturasLayout.createSequentialGroup()
                                .addComponent(PPanelPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(179, 179, 179)))
                        .addComponent(PPEliminarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19))
                .addContainerGap(347, Short.MAX_VALUE))
            .addGroup(PFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PFacturasLayout.createSequentialGroup()
                    .addContainerGap(84, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );
        PFacturasLayout.setVerticalGroup(
            PFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFacturasLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(PFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PMiconoLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PFacturasLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addGroup(PFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PFacturasLayout.createSequentialGroup()
                                .addGroup(PFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addGap(41, 41, 41)
                                .addComponent(PPanelPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PPEliminarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LtxtBusquedaFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(357, Short.MAX_VALUE))
            .addGroup(PFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PFacturasLayout.createSequentialGroup()
                    .addContainerGap(266, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(82, Short.MAX_VALUE)))
        );

        PInicio.setRequestFocusEnabled(false);

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Escritorio");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel2.setText("HOME");

        PiconMinimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconMinimal.jpg"))); // NOI18N

        javax.swing.GroupLayout PInicioLayout = new javax.swing.GroupLayout(PInicio);
        PInicio.setLayout(PInicioLayout);
        PInicioLayout.setHorizontalGroup(
            PInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PInicioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PiconMinimal, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
        );
        PInicioLayout.setVerticalGroup(
            PInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PInicioLayout.createSequentialGroup()
                .addGroup(PInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PiconMinimal, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))
        );

        Contenido.setLayer(PClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenido.setLayer(PnlLib, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenido.setLayer(PFacturas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenido.setLayer(PInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addComponent(PInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
            .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenidoLayout.createSequentialGroup()
                    .addComponent(PClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 52, Short.MAX_VALUE)))
            .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenidoLayout.createSequentialGroup()
                    .addComponent(PnlLib, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 61, Short.MAX_VALUE)))
            .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenidoLayout.createSequentialGroup()
                    .addComponent(PFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 50, Short.MAX_VALUE)))
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenidoLayout.createSequentialGroup()
                    .addComponent(PClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenidoLayout.createSequentialGroup()
                    .addComponent(PnlLib, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
            .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenidoLayout.createSequentialGroup()
                    .addComponent(PFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                                .addComponent(iconoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                                .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addComponent(Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addComponent(TopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(iconoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 1191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LtxtBusquedaFacturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LtxtBusquedaFacturasMousePressed
        if (this.LtxtBusquedaFacturas.getText().equals("Busqueda")) {
            this.LtxtBusquedaFacturas.setText("");
            this.LtxtBusquedaFacturas.setForeground(Color.black);
        }
    }//GEN-LAST:event_LtxtBusquedaFacturasMousePressed

    private void LtxtBusquedaFacturasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LtxtBusquedaFacturasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LtxtBusquedaFacturasMouseExited

    private void LtxtBusquedaFacturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LtxtBusquedaFacturasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LtxtBusquedaFacturasMouseEntered

    private void LtxtBusquedaFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LtxtBusquedaFacturasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LtxtBusquedaFacturasMouseClicked

    private void PPEliminarPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPEliminarPrestamoMouseExited
        this.PPEliminarPrestamo.setBorder(null);
        this.btnEliminarPrestamoLibTxt.setForeground(Color.black);
    }//GEN-LAST:event_PPEliminarPrestamoMouseExited

    private void PPEliminarPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPEliminarPrestamoMouseEntered
        this.PPEliminarPrestamo.setBorder(new LineBorder(Color.red));
        this.btnEliminarPrestamoLibTxt.setForeground(Color.red);
    }//GEN-LAST:event_PPEliminarPrestamoMouseEntered

    private void PPEliminarPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPEliminarPrestamoMouseClicked
    int row = JTFactuas.getSelectedRow();
        if (row < 0) {
            // Ninguna fila seleccionada, ignorar evento
            return;
        }

        String ID = JTFactuas.getValueAt(row, 0).toString();

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de borrar la factura con ID: " + ID + "?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirmacion == JOptionPane.YES_OPTION) {
            if (factura.eliminarRegistro(ID)){
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
                factura.ActualizarTablaFacturas(tabla);
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al eliminar los datos.");
            }
        }
    }//GEN-LAST:event_PPEliminarPrestamoMouseClicked

    private void PPanelPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPanelPrestamoMouseExited
        this.PPanelPrestamo.setBorder(null);
        this.btnPrestamoLibTxt.setForeground(Color.black);
    }//GEN-LAST:event_PPanelPrestamoMouseExited

    private void PPanelPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPanelPrestamoMouseEntered
        this.PPanelPrestamo.setBorder(new LineBorder(Color.red));
        this.btnPrestamoLibTxt.setForeground(Color.red);
    }//GEN-LAST:event_PPanelPrestamoMouseEntered

    private void PPanelPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPanelPrestamoMouseClicked
        jfAddFactura.setVisible(true);
    }//GEN-LAST:event_PPanelPrestamoMouseClicked

    private void LPanelAñadirLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LPanelAñadirLibMouseExited
        this.LPanelAñadirLib.setBorder(null);
        this.btnAñadirLibTxt.setForeground(Color.black);
    }//GEN-LAST:event_LPanelAñadirLibMouseExited

    private void LPanelAñadirLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LPanelAñadirLibMouseEntered
        this.LPanelAñadirLib.setBorder(new LineBorder(Color.red));
        this.btnAñadirLibTxt.setForeground(Color.red);
    }//GEN-LAST:event_LPanelAñadirLibMouseEntered

    private void LPanelAñadirLibMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LPanelAñadirLibMouseClicked
        jfaddlibro.setVisible(true);
    }//GEN-LAST:event_LPanelAñadirLibMouseClicked

    private void LPanelElimiLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LPanelElimiLibMouseExited
        this.LPanelElimiLib.setBorder(null);
        this.btnModificarLibrTxt.setForeground(Color.black);
    }//GEN-LAST:event_LPanelElimiLibMouseExited

    private void LPanelElimiLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LPanelElimiLibMouseEntered
        this.LPanelElimiLib.setBorder(new LineBorder(Color.red));
        this.btnModificarLibrTxt.setForeground(Color.red);
    }//GEN-LAST:event_LPanelElimiLibMouseEntered

    private void LPanelElimiLibMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LPanelElimiLibMouseClicked
        jfmodificarlibro.setVisible(true);
    }//GEN-LAST:event_LPanelElimiLibMouseClicked

    private void btnModificarLibrTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarLibrTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarLibrTxtMouseClicked

    private void LtxtBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LtxtBusquedaMousePressed

    }//GEN-LAST:event_LtxtBusquedaMousePressed

    private void LtxtBusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LtxtBusquedaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LtxtBusquedaMouseExited

    private void LtxtBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LtxtBusquedaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LtxtBusquedaMouseEntered

    private void LtxtBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LtxtBusquedaMouseClicked
        if (this.LtxtBusqueda.getText().equals("Busqueda")) {
            this.LtxtBusqueda.setText("");
            this.LtxtBusqueda.setForeground(Color.black);
        }
    }//GEN-LAST:event_LtxtBusquedaMouseClicked

    private void EPanelModifMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EPanelModifMouseExited
        this.EPanelModif.setBorder(null);
        this.btnModificarEstuTxt.setForeground(Color.black);
    }//GEN-LAST:event_EPanelModifMouseExited

    private void EPanelModifMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EPanelModifMouseEntered
        this.EPanelModif.setBorder(new LineBorder(Color.red));
        this.btnModificarEstuTxt.setForeground(Color.red);
    }//GEN-LAST:event_EPanelModifMouseEntered

    private void EPanelModifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EPanelModifMouseClicked
        jfeditcliente.setVisible(true);
    }//GEN-LAST:event_EPanelModifMouseClicked

    private void EPanelAñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EPanelAñadirMouseExited
        //        this.EPanelAñadir.setBorder(new LineBorder(Color.black));
        this.EPanelAñadir.setBorder(null);
        this.btnAñadirEstuxt.setForeground(Color.black);
    }//GEN-LAST:event_EPanelAñadirMouseExited

    private void EPanelAñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EPanelAñadirMouseEntered
        this.EPanelAñadir.setBorder(new LineBorder(Color.red));
        this.btnAñadirEstuxt.setForeground(Color.red);
    }//GEN-LAST:event_EPanelAñadirMouseEntered

    private void EPanelAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EPanelAñadirMouseClicked
        jfaddcliente.setVisible(true);
    }//GEN-LAST:event_EPanelAñadirMouseClicked

    private void EtxtBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtxtBusquedaMousePressed
        if (this.EtxtBusqueda.getText().equals("Busqueda")) {
            this.EtxtBusqueda.setText("");
            this.EtxtBusqueda.setForeground(Color.black);
        }
    }//GEN-LAST:event_EtxtBusquedaMousePressed

    private void EtxtBusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtxtBusquedaMouseExited

    }//GEN-LAST:event_EtxtBusquedaMouseExited

    private void EtxtBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtxtBusquedaMouseEntered

    }//GEN-LAST:event_EtxtBusquedaMouseEntered

    private void EtxtBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtxtBusquedaMouseClicked

    }//GEN-LAST:event_EtxtBusquedaMouseClicked

    private void jTClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClientesMouseClicked

    }//GEN-LAST:event_jTClientesMouseClicked

    private void PrestamoMultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrestamoMultaMouseExited
        this.PrestamoMulta.setBackground(new Color(37, 40, 80));
    }//GEN-LAST:event_PrestamoMultaMouseExited

    private void PrestamoMultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrestamoMultaMouseEntered
        this.PrestamoMulta.setBackground(Color.red);
    }//GEN-LAST:event_PrestamoMultaMouseEntered

    private void PrestamoMultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrestamoMultaMouseClicked

    }//GEN-LAST:event_PrestamoMultaMouseClicked

    private void iconoPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoPrestamoMouseExited
        this.PrestamoMulta.setBackground(new Color(37, 40, 80));
    }//GEN-LAST:event_iconoPrestamoMouseExited

    private void iconoPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoPrestamoMouseEntered
        this.PrestamoMulta.setBackground(Color.red);
    }//GEN-LAST:event_iconoPrestamoMouseEntered

    private void btnPrestamoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamoTxtMouseExited
        this.PrestamoMulta.setBackground(new Color(37, 40, 80));
    }//GEN-LAST:event_btnPrestamoTxtMouseExited

    private void btnPrestamoTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamoTxtMouseEntered
        this.PrestamoMulta.setBackground(Color.red);
    }//GEN-LAST:event_btnPrestamoTxtMouseEntered

    private void btnPrestamoTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamoTxtMouseClicked
        this.PFacturas.setVisible(true);
        this.PClientes.setVisible(false);
        this.PInicio.setVisible(false);
        this.PnlLib.setVisible(false);
    }//GEN-LAST:event_btnPrestamoTxtMouseClicked

    private void RegistroLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroLibroMouseExited
        this.RegistroLibro.setBackground(new Color(37, 40, 80));
    }//GEN-LAST:event_RegistroLibroMouseExited

    private void RegistroLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroLibroMouseEntered
        this.RegistroLibro.setBackground(Color.red);
    }//GEN-LAST:event_RegistroLibroMouseEntered

    private void iconLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLibMouseExited
        this.RegistroLibro.setBackground(new Color(37, 40, 80));
    }//GEN-LAST:event_iconLibMouseExited

    private void iconLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLibMouseEntered
        this.RegistroLibro.setBackground(Color.red);
    }//GEN-LAST:event_iconLibMouseEntered

    private void btnLibTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibTxtMouseExited
        this.RegistroLibro.setBackground(new Color(37, 40, 80));
    }//GEN-LAST:event_btnLibTxtMouseExited

    private void btnLibTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibTxtMouseEntered
        this.RegistroLibro.setBackground(Color.red);
    }//GEN-LAST:event_btnLibTxtMouseEntered

    private void btnLibTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibTxtMouseClicked
        this.PnlLib.setVisible(true);
        this.PClientes.setVisible(false);
        this.PInicio.setVisible(false);
        this.PFacturas.setVisible(false);
    }//GEN-LAST:event_btnLibTxtMouseClicked

    private void RegistroEstudianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroEstudianteMouseExited
        this.RegistroEstudiante.setBackground(new Color(37, 40, 80));
    }//GEN-LAST:event_RegistroEstudianteMouseExited

    private void RegistroEstudianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroEstudianteMouseEntered
        this.RegistroEstudiante.setBackground(Color.red);
    }//GEN-LAST:event_RegistroEstudianteMouseEntered

    private void iconoEstudMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoEstudMouseExited
        this.RegistroEstudiante.setBackground(new Color(37, 40, 80));
    }//GEN-LAST:event_iconoEstudMouseExited

    private void iconoEstudMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoEstudMouseEntered
        this.RegistroEstudiante.setBackground(Color.red);
    }//GEN-LAST:event_iconoEstudMouseEntered

    private void btnClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseExited
        this.RegistroEstudiante.setBackground(new Color(37, 40, 80));
    }//GEN-LAST:event_btnClienteMouseExited

    private void btnClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseEntered
        this.RegistroEstudiante.setBackground(Color.red);
    }//GEN-LAST:event_btnClienteMouseEntered

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        this.PClientes.setVisible(true);
        this.PInicio.setVisible(false);
        this.PnlLib.setVisible(false);
        this.PFacturas.setVisible(false);
    }//GEN-LAST:event_btnClienteMouseClicked

    private void InicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseExited
        this.Inicio.setBackground(new Color(37, 40, 80));
    }//GEN-LAST:event_InicioMouseExited

    private void InicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseEntered
        this.Inicio.setBackground(Color.red);
    }//GEN-LAST:event_InicioMouseEntered

    private void iconHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconHomeMouseExited
        this.Inicio.setBackground(new Color(37, 40, 80));
    }//GEN-LAST:event_iconHomeMouseExited

    private void iconHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconHomeMouseEntered
        this.Inicio.setBackground(Color.red);
    }//GEN-LAST:event_iconHomeMouseEntered

    private void btnIniciotxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciotxtMouseExited
        this.Inicio.setBackground(new Color(37, 40, 80));
    }//GEN-LAST:event_btnIniciotxtMouseExited

    private void btnIniciotxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciotxtMouseEntered
        this.Inicio.setBackground(Color.red);
    }//GEN-LAST:event_btnIniciotxtMouseEntered

    private void btnIniciotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciotxtMouseClicked
        this.PInicio.setVisible(true);
        this.PClientes.setVisible(false);
        this.PnlLib.setVisible(false);
        this.PFacturas.setVisible(false);
    }//GEN-LAST:event_btnIniciotxtMouseClicked

    private void LiconoLupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LiconoLupaMouseClicked
        // TODO add your handling code here:
        String consulta;
        consulta = LtxtBusqueda.getText();
        libro.ActualizarTablaLibrosBusqueda(this.jTLibros, consulta);  
        
        if(this.LtxtBusqueda.getText().equals("")){
            libro.actualizarTabla(jTLibros);
        }
    }//GEN-LAST:event_LiconoLupaMouseClicked

    private void LiconoLupaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LiconoLupaMouseEntered
        // TODO add your handling code here:
        this.LiconoLupa.setBorder(new LineBorder(Color.red));
        this.LiconoLupa.setForeground(Color.red);
        String consulta;
    }//GEN-LAST:event_LiconoLupaMouseEntered

    private void LiconoLupaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LiconoLupaMouseExited
        // TODO add your handling code here:
        this.LiconoLupa.setBorder(null);
        this.LiconoLupa.setForeground(Color.black);
    }//GEN-LAST:event_LiconoLupaMouseExited

    private void LiconoLupaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LiconoLupaMousePressed

        
    }//GEN-LAST:event_LiconoLupaMousePressed

    private void LtxtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LtxtBusquedaActionPerformed
        // TODO add your handling code here:
        if(this.LtxtBusqueda.getText().equals("")){
            libro.actualizarTabla(jTLibros);
        }
    }//GEN-LAST:event_LtxtBusquedaActionPerformed

    private void PMiconoLupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMiconoLupaMouseClicked
        String consulta;
        consulta = LtxtBusquedaFacturas.getText();
        factura.ActualizarTablaFacturasBusqueda(this.JTFactuas,consulta);
        
        if(this.LtxtBusquedaFacturas.getText().equals("")){
            factura.ActualizarTablaFacturas(JTFactuas);
        }

    }//GEN-LAST:event_PMiconoLupaMouseClicked

    private void EiconoLupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EiconoLupaMouseClicked
        // TODO add your handling code here:
        String consulta;
        consulta = EtxtBusqueda.getText();
        cliente.actualizarTablaBusqueda(this.jTClientes, consulta);  
        
        if(EtxtBusqueda.getText().equals("")){
            cliente.actualizarTabla(this.jTClientes);  
        }
    }//GEN-LAST:event_EiconoLupaMouseClicked

    private void LtxtBusquedaFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LtxtBusquedaFacturasActionPerformed

    }//GEN-LAST:event_LtxtBusquedaFacturasActionPerformed

    private void PMiconoLupaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMiconoLupaMouseEntered
         this.PMiconoLupa.setBorder(new LineBorder(Color.red));
        this.PMiconoLupa.setForeground(Color.red);
        String consulta;
    }//GEN-LAST:event_PMiconoLupaMouseEntered

    private void PMiconoLupaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMiconoLupaMouseExited
       
        this.PMiconoLupa.setBorder(null);
        this.PMiconoLupa.setForeground(Color.black);
    }//GEN-LAST:event_PMiconoLupaMouseExited

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
            java.util.logging.Logger.getLogger(JFLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new JFLibreria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JLayeredPane Contenido;
    private javax.swing.JPanel EPanelAñadir;
    private javax.swing.JPanel EPanelModif;
    private javax.swing.JLabel EiconoAñadir;
    private javax.swing.JLabel EiconoLupa;
    private javax.swing.JLabel EiconoModificar;
    private javax.swing.JTextField EtxtBusqueda;
    private javax.swing.JPanel Inicio;
    private javax.swing.JTable JTFactuas;
    private javax.swing.JPanel LPanelAñadirLib;
    private javax.swing.JPanel LPanelElimiLib;
    private javax.swing.JLabel LiconoAñadir;
    private javax.swing.JLabel LiconoEliminar;
    private javax.swing.JLabel LiconoLupa;
    private javax.swing.JTextField LtxtBusqueda;
    private javax.swing.JTextField LtxtBusquedaFacturas;
    private javax.swing.JPanel Opciones;
    private javax.swing.JPanel PClientes;
    private javax.swing.JPanel PFacturas;
    private javax.swing.JPanel PInicio;
    private javax.swing.JLabel PMiconoLupa;
    private javax.swing.JPanel PPEliminarPrestamo;
    private javax.swing.JPanel PPanelPrestamo;
    private javax.swing.JLabel PiconMinimal;
    private javax.swing.JLabel PiconoElimiPrest;
    private javax.swing.JLabel PiconoPrestamo;
    private javax.swing.JPanel PnlLib;
    private javax.swing.JPanel PrestamoMulta;
    private javax.swing.JPanel RegistroEstudiante;
    private javax.swing.JPanel RegistroLibro;
    private javax.swing.JPanel TolBar;
    private javax.swing.JPanel TopBar;
    private javax.swing.JLabel btnAñadirEstuxt;
    private javax.swing.JLabel btnAñadirLibTxt;
    private javax.swing.JLabel btnCliente;
    private javax.swing.JLabel btnEliminarPrestamoLibTxt;
    private javax.swing.JLabel btnIniciotxt;
    private javax.swing.JLabel btnLibTxt;
    private javax.swing.JLabel btnModificarEstuTxt;
    private javax.swing.JLabel btnModificarLibrTxt;
    private javax.swing.JLabel btnPrestamoLibTxt;
    private javax.swing.JLabel btnPrestamoTxt;
    private javax.swing.JLabel iconHome;
    private javax.swing.JLabel iconLib;
    private javax.swing.JLabel iconoAdmin;
    private javax.swing.JLabel iconoEstud;
    private javax.swing.JLabel iconoLibriMundi;
    private javax.swing.JLabel iconoLibro;
    private javax.swing.JLabel iconoPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTClientes;
    private javax.swing.JTable jTLibros;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JPanel pnlLib;
    // End of variables declaration//GEN-END:variables
}
