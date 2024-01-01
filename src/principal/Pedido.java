package principal;

//Look and Feel
import DAO.DAOPedidosImpl;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerContrastIJTheme;

//Proyecto
import DAO.DAOPedidos;
import vistas.Bebidas;
import vistas.Hamburguesas;
import vistas.ShareIt;
import vistas.Sushis;

//AWT
import java.awt.Image;

//Excepciones
import java.sql.SQLException;

//Fecha
import java.time.LocalDate;

//Swing
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Pedido extends javax.swing.JFrame {

    //Variables Globales
    private static JButton[] lista_boton;
    private static JLabel[] lista_etiqueta;
    private static String[][] lista_nombre_url;
    private static int[] lista_cantidad;
    private static double[] lista_precio;
    private static String pedido;
    private static double precioTotal;
    public static String tlf;
    public static String direc;
    private final modelos.Pedidos p = new modelos.Pedidos();

    //Constructor
    public Pedido() {

        initComponents();
        
        //Inicialización de variables globales
        lista_cantidad = new int[20];
        lista_precio = new double[20];
        lista_nombre_url = new String[2][20];
        lista_boton = new JButton[20];
        lista_etiqueta = new JLabel[20];
        pedido = "";
        precioTotal = 0.0;

        Utilidades.setImageLabel(logo.getWidth(),logo.getHeight(),logo, "src/imagenes/V2LogoW.png");
        initListas();
        initEtiquetas();
        initBotones();
        botonesInv();

    }

    //Verifica si hay algún elemento en el pedido
    private boolean estaVacia() {

        boolean verificar = false;
        if (lista_cantidad[0] == 0) {
            verificar = true;
        }
        return verificar;

    }

    //Registra el pedido
    private void ingresarP(String descrip, String direc, String tlf, double monto) {

        LocalDate now = LocalDate.now();
        int año = now.getYear();
        int mes = now.getMonthValue();
        int dia = now.getDayOfMonth();
        p.setFecha(año + "-" + mes + "-" + dia);
        p.setDescrip(descrip);
        p.setMonto(monto);
        p.setDirec(direc);
        p.setTlf(tlf);

    }

    //Inicializa el vector de cantidad de elementos, precios y nombres
    private void initListas() {

        for (int i = 0; i <= 19; i++) {
            lista_cantidad[i] = 0;
            lista_precio[i] = 0.0;
        }
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 19; j++) {
                lista_nombre_url[i][j] = "";
            }
        }

    }

    //Hace que los botones estén invisibles por defecto
    private void botonesInv() {

        for (int i = 0; i <= 19; i++) {
            lista_boton[i].setVisible(false);
        }

    }

    //Inicializa el vector de botones de los elementos en el pedido
    private void initBotones() {

        lista_boton[0] = boton_0;
        lista_boton[1] = boton_1;
        lista_boton[2] = boton_2;
        lista_boton[3] = boton_3;
        lista_boton[4] = boton_4;
        lista_boton[5] = boton_5;
        lista_boton[6] = boton_6;
        lista_boton[7] = boton_7;
        lista_boton[8] = boton_8;
        lista_boton[9] = boton_9;
        lista_boton[10] = boton_10;
        lista_boton[11] = boton_11;
        lista_boton[12] = boton_12;
        lista_boton[13] = boton_13;
        lista_boton[14] = boton_14;
        lista_boton[15] = boton_15;
        lista_boton[16] = boton_16;
        lista_boton[17] = boton_17;
        lista_boton[18] = boton_18;
        lista_boton[19] = boton_19;

    }

    //Inicializa el vector de etiquetas de cantidad
    private void initEtiquetas() {

        lista_etiqueta[0] = label_0;
        lista_etiqueta[1] = label_1;
        lista_etiqueta[2] = label_2;
        lista_etiqueta[3] = label_3;
        lista_etiqueta[4] = label_4;
        lista_etiqueta[5] = label_5;
        lista_etiqueta[6] = label_6;
        lista_etiqueta[7] = label_7;
        lista_etiqueta[8] = label_8;
        lista_etiqueta[9] = label_9;
        lista_etiqueta[10] = label_10;
        lista_etiqueta[11] = label_11;
        lista_etiqueta[12] = label_12;
        lista_etiqueta[13] = label_13;
        lista_etiqueta[14] = label_14;
        lista_etiqueta[15] = label_15;
        lista_etiqueta[16] = label_16;
        lista_etiqueta[17] = label_17;
        lista_etiqueta[18] = label_18;
        lista_etiqueta[19] = label_19;

    }

    //Actualiza el pedido
    private static void actualizarPedido() {

        pedido = "";
        precioTotal = 0.0;

        //Agrega elementos al String pedido
        for (int j = 0; j <= 19; j++) {
            
            if (!"".equals(lista_nombre_url[0][j])) {
                pedido += lista_nombre_url[0][j] + " x" + lista_cantidad[j] + ", ";
            } else {
                
                int cadena = pedido.length();
                if (cadena > 2) {
                    pedido = pedido.substring(0, cadena - 2);
                    pedido += ".";
                }
                j = 19;
                
            }
            
        }

        //Muestra la actualización del pedido, el precio y todas las listas
        System.out.println("-----------------------------------------------------");
        System.out.println("");
        for (int j = 0; j <= 19; j++) {
            System.out.print(lista_cantidad[j] + " ");
        }
        System.out.println("");
        for (int j = 0; j <= 19; j++) {
            System.out.print(lista_precio[j] + " ");
        }
        System.out.println("");
        for (int j = 0; j <= 19; j++) {
            System.out.print(lista_nombre_url[0][j] + " | ");
        }
        System.out.println("");
        for (int j = 0; j <= 19; j++) {
            System.out.print(lista_nombre_url[1][j] + " | ");
        }
        System.out.println("");
        for (int j = 0; j <= 19; j++) {
            precioTotal += lista_precio[j];
        }
        System.out.println("Precio Total: " + precioTotal + "$");
        System.out.println("Pedido: " + pedido);
        System.out.println("");
        System.out.println("-----------------------------------------------------");

        precio.setText(precioTotal + "$");

    }

    //Agrega una imagen a un botón
    private static void setIconButton(String url, int i) {

        ImageIcon image = new ImageIcon(url);
        lista_boton[i].setIcon(new ImageIcon(
                image.getImage().getScaledInstance(lista_boton[i].getWidth(), lista_boton[i].getHeight(), Image.SCALE_SMOOTH))
        );

    }

    //Agrega un elemento al pedido
    public static void agregarE(String url, String name, double precio) {

        int i = 0;
        boolean espacioE = false;
        boolean botonE = false;

        /*Detecta si el nombre recibido coindice con alguno ya ingresado en la lista de nombres o 
        si en la lista de los nombres hay algún espacio vacío*/
        while (!botonE && !espacioE && i <= 19) {
            
            if (lista_nombre_url[0][i].equals(name)) {
                
                botonE = true;
                lista_cantidad[i]++;
                lista_precio[i] += precio;
                
            } else if (lista_nombre_url[0][i].equals("")) {
                
                espacioE = true;
                lista_nombre_url[0][i] = name;
                lista_nombre_url[1][i] = url;
                lista_cantidad[i]++;
                lista_precio[i] += precio;
                lista_etiqueta[i].setText("x" + (lista_cantidad[i]));
                lista_boton[i].setVisible(true);
                
            } else {
                i++;
            }
            
        }

        /*Se añade una imagen al botón correspondiente al espacio vacío en la lista de nombres o
        se aumenta la cantidad del tipo de elemento que se encontró en la lista de nombres*/
        if (espacioE) {
            setIconButton(url, i);
        } else if (botonE) {
            lista_etiqueta[i].setText("x" + lista_cantidad[i]);
        } else if (i > 19) {
            JOptionPane.showMessageDialog(null, "No hay más espacio...");
        }
        actualizarPedido();

    }

    //Elimina un elemento del pedido
    private void eliminarE(int i) {

        /*Reduce en 1 la cantidad de elementos y el precio total del elemento recibido o,
        si es el último que queda, lo elimina y reorganiza las listas*/
        if (lista_cantidad[i] > 1) {
            
            lista_precio[i] -= lista_precio[i] / lista_cantidad[i];
            lista_cantidad[i] -= 1;
            lista_etiqueta[i].setText("x" + lista_cantidad[i]);
            
        } else {
            
            i++;
            while (lista_cantidad[i] != 0 && i <= 19) {
                
                lista_cantidad[i - 1] = lista_cantidad[i];
                lista_precio[i - 1] = lista_precio[i];
                lista_nombre_url[0][i - 1] = lista_nombre_url[0][i];
                lista_nombre_url[1][i - 1] = lista_nombre_url[1][i];
                i++;
                
            }

            i--;
            lista_cantidad[i] = 0;
            lista_precio[i] = 0.0;
            lista_nombre_url[0][i] = "";
            lista_nombre_url[1][i] = "";

            //Aquí se reorganizan las etiquetas de cantidad y las imágenes
            for (int j = 0; j <= 19; j++) {
                
                if (lista_cantidad[j] != 0) {
                    setIconButton(lista_nombre_url[1][j], j);
                    lista_etiqueta[j].setText("x" + lista_cantidad[j]);
                } else {
                    
                    setIconButton("", j);
                    lista_etiqueta[j].setText("");
                    lista_boton[j].setVisible(false);
                    j = 20;
                    
                }
                
            }
            
        }
        actualizarPedido();

    }

    //Realiza el Pedido
    private void pedir() {

        if (estaVacia()) { //Valida si no hay ningún producto seleccionado
            JOptionPane.showMessageDialog(null, "No ha seleccionado algo aún.");
        } else {
            
            int desicion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea finalizar su pedido?");
            if (desicion == 0) { //Valida si el usuario quiere realizar el pedido

                ingresarP(pedido, direc, tlf, precioTotal);
                try {

                    DAOPedidos impl = new DAOPedidosImpl();
                    impl.ingresarP(p);
                    JOptionPane.showMessageDialog(null, "¡Su pedido se registró exitosamente!");

                    Inicio h = new Inicio();
                    h.setVisible(true);
                    this.setVisible(false);

                } catch (ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, "¡Error al registrar el pedido!");
                }

            }
            
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_BG = new javax.swing.JPanel();
        panel_Menu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        boton_Burgers = new javax.swing.JButton();
        boton_ShareIt = new javax.swing.JButton();
        boton_Sushis = new javax.swing.JButton();
        separador_1 = new javax.swing.JSeparator();
        separador_2 = new javax.swing.JSeparator();
        boton_Pedir = new javax.swing.JButton();
        boton_Bebidas = new javax.swing.JButton();
        panel_Cabecera = new javax.swing.JPanel();
        mensaje_1 = new javax.swing.JLabel();
        panel_Contenedor = new javax.swing.JPanel();
        mensaje_2 = new javax.swing.JLabel();
        separador_3 = new javax.swing.JSeparator();
        panel_Pedido = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        separador_4 = new javax.swing.JSeparator();
        label_0 = new javax.swing.JLabel();
        label_1 = new javax.swing.JLabel();
        label_2 = new javax.swing.JLabel();
        label_3 = new javax.swing.JLabel();
        label_4 = new javax.swing.JLabel();
        label_5 = new javax.swing.JLabel();
        label_6 = new javax.swing.JLabel();
        label_7 = new javax.swing.JLabel();
        label_8 = new javax.swing.JLabel();
        label_9 = new javax.swing.JLabel();
        label_10 = new javax.swing.JLabel();
        label_11 = new javax.swing.JLabel();
        label_12 = new javax.swing.JLabel();
        label_13 = new javax.swing.JLabel();
        label_14 = new javax.swing.JLabel();
        label_15 = new javax.swing.JLabel();
        label_16 = new javax.swing.JLabel();
        label_17 = new javax.swing.JLabel();
        label_18 = new javax.swing.JLabel();
        label_19 = new javax.swing.JLabel();
        boton_0 = new javax.swing.JButton();
        boton_1 = new javax.swing.JButton();
        boton_2 = new javax.swing.JButton();
        boton_3 = new javax.swing.JButton();
        boton_4 = new javax.swing.JButton();
        boton_5 = new javax.swing.JButton();
        boton_6 = new javax.swing.JButton();
        boton_7 = new javax.swing.JButton();
        boton_8 = new javax.swing.JButton();
        boton_9 = new javax.swing.JButton();
        boton_10 = new javax.swing.JButton();
        boton_11 = new javax.swing.JButton();
        boton_12 = new javax.swing.JButton();
        boton_13 = new javax.swing.JButton();
        boton_14 = new javax.swing.JButton();
        boton_15 = new javax.swing.JButton();
        boton_16 = new javax.swing.JButton();
        boton_17 = new javax.swing.JButton();
        boton_18 = new javax.swing.JButton();
        boton_19 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Realización de Pedidos");
        setMinimumSize(new java.awt.Dimension(1020, 670));

        panel_BG.setBackground(new java.awt.Color(8, 5, 4));
        panel_BG.setPreferredSize(new java.awt.Dimension(1020, 650));

        panel_Menu.setBackground(new java.awt.Color(192, 24, 26));

        boton_Burgers.setBackground(new java.awt.Color(213, 24, 26));
        boton_Burgers.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        boton_Burgers.setForeground(new java.awt.Color(233, 224, 211));
        boton_Burgers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cheeseburger.png"))); // NOI18N
        boton_Burgers.setText("HAMBURGUESAS");
        boton_Burgers.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 10, 5, 5, new java.awt.Color(0, 0, 0)));
        boton_Burgers.setBorderPainted(false);
        boton_Burgers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Burgers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_Burgers.setIconTextGap(10);
        boton_Burgers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BurgersActionPerformed(evt);
            }
        });

        boton_ShareIt.setBackground(new java.awt.Color(213, 24, 26));
        boton_ShareIt.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        boton_ShareIt.setForeground(new java.awt.Color(233, 224, 211));
        boton_ShareIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sandwich.png"))); // NOI18N
        boton_ShareIt.setText("ENTRADAS");
        boton_ShareIt.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 10, 5, 5, new java.awt.Color(0, 0, 0)));
        boton_ShareIt.setBorderPainted(false);
        boton_ShareIt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_ShareIt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_ShareIt.setIconTextGap(10);
        boton_ShareIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ShareItActionPerformed(evt);
            }
        });

        boton_Sushis.setBackground(new java.awt.Color(213, 24, 26));
        boton_Sushis.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        boton_Sushis.setForeground(new java.awt.Color(233, 224, 211));
        boton_Sushis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sushi-roll.png"))); // NOI18N
        boton_Sushis.setText("SUSHI");
        boton_Sushis.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 10, 5, 5, new java.awt.Color(0, 0, 0)));
        boton_Sushis.setBorderPainted(false);
        boton_Sushis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Sushis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_Sushis.setIconTextGap(10);
        boton_Sushis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_SushisActionPerformed(evt);
            }
        });

        separador_1.setForeground(new java.awt.Color(233, 224, 211));
        separador_1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 10, new java.awt.Color(192, 24, 26)));

        separador_2.setForeground(new java.awt.Color(233, 224, 211));
        separador_2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 10, new java.awt.Color(192, 24, 26)));

        boton_Pedir.setBackground(new java.awt.Color(78, 155, 53));
        boton_Pedir.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        boton_Pedir.setForeground(new java.awt.Color(233, 224, 211));
        boton_Pedir.setText("PEDIR!");
        boton_Pedir.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        boton_Pedir.setBorderPainted(false);
        boton_Pedir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Pedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_PedirActionPerformed(evt);
            }
        });

        boton_Bebidas.setBackground(new java.awt.Color(213, 24, 26));
        boton_Bebidas.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        boton_Bebidas.setForeground(new java.awt.Color(233, 224, 211));
        boton_Bebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebidas.png"))); // NOI18N
        boton_Bebidas.setText("BEBIDAS");
        boton_Bebidas.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 10, 5, 5, new java.awt.Color(0, 0, 0)));
        boton_Bebidas.setBorderPainted(false);
        boton_Bebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Bebidas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_Bebidas.setIconTextGap(10);
        boton_Bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BebidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_MenuLayout = new javax.swing.GroupLayout(panel_Menu);
        panel_Menu.setLayout(panel_MenuLayout);
        panel_MenuLayout.setHorizontalGroup(
            panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MenuLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(separador_1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_ShareIt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_Burgers, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_Sushis, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_Bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(separador_2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(boton_Pedir, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_MenuLayout.setVerticalGroup(
            panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador_1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_ShareIt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(boton_Burgers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(boton_Sushis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(boton_Bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador_2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(boton_Pedir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        panel_Cabecera.setBackground(new java.awt.Color(197, 24, 26));

        mensaje_1.setFont(new java.awt.Font("MADE Tommy Soft", 0, 35)); // NOI18N
        mensaje_1.setForeground(new java.awt.Color(233, 224, 211));
        mensaje_1.setText("¡REALIZA TU PEDIDO!");

        javax.swing.GroupLayout panel_CabeceraLayout = new javax.swing.GroupLayout(panel_Cabecera);
        panel_Cabecera.setLayout(panel_CabeceraLayout);
        panel_CabeceraLayout.setHorizontalGroup(
            panel_CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CabeceraLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(mensaje_1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_CabeceraLayout.setVerticalGroup(
            panel_CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CabeceraLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(mensaje_1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        panel_Contenedor.setBackground(new java.awt.Color(8, 5, 4));
        panel_Contenedor.setLayout(new java.awt.BorderLayout());

        mensaje_2.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        mensaje_2.setForeground(new java.awt.Color(204, 194, 181));
        mensaje_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje_2.setText("seleccione alguna de las categorías a la izquierda para agregar elementos a su pedido");
        panel_Contenedor.add(mensaje_2, java.awt.BorderLayout.CENTER);

        separador_3.setForeground(new java.awt.Color(233, 224, 211));

        panel_Pedido.setBackground(new java.awt.Color(8, 5, 4));
        panel_Pedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(233, 224, 211));
        titulo.setText("PEDIDO:");
        panel_Pedido.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        precio.setFont(new java.awt.Font("MADE Tommy Soft", 0, 18)); // NOI18N
        precio.setForeground(new java.awt.Color(78, 155, 53));
        precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precio.setText("0.0$");
        panel_Pedido.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 80, -1));

        separador_4.setForeground(new java.awt.Color(233, 224, 211));
        separador_4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panel_Pedido.add(separador_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 10, 60));

        label_0.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_0.setForeground(new java.awt.Color(233, 224, 211));
        label_0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 30, 20));

        label_1.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_1.setForeground(new java.awt.Color(233, 224, 211));
        label_1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 30, 20));

        label_2.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_2.setForeground(new java.awt.Color(233, 224, 211));
        label_2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 30, 20));

        label_3.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_3.setForeground(new java.awt.Color(233, 224, 211));
        label_3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, 20));

        label_4.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_4.setForeground(new java.awt.Color(233, 224, 211));
        label_4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 20));

        label_5.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_5.setForeground(new java.awt.Color(233, 224, 211));
        label_5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 30, 20));

        label_6.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_6.setForeground(new java.awt.Color(233, 224, 211));
        label_6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 30, 20));

        label_7.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_7.setForeground(new java.awt.Color(233, 224, 211));
        label_7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 30, 20));

        label_8.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_8.setForeground(new java.awt.Color(233, 224, 211));
        label_8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 30, 20));

        label_9.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_9.setForeground(new java.awt.Color(233, 224, 211));
        label_9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 30, 20));

        label_10.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_10.setForeground(new java.awt.Color(233, 224, 211));
        label_10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 30, 20));

        label_11.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_11.setForeground(new java.awt.Color(233, 224, 211));
        label_11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 30, 20));

        label_12.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_12.setForeground(new java.awt.Color(233, 224, 211));
        label_12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 30, 20));

        label_13.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_13.setForeground(new java.awt.Color(233, 224, 211));
        label_13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 30, 20));

        label_14.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_14.setForeground(new java.awt.Color(233, 224, 211));
        label_14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 30, 20));

        label_15.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_15.setForeground(new java.awt.Color(233, 224, 211));
        label_15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 30, 20));

        label_16.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_16.setForeground(new java.awt.Color(233, 224, 211));
        label_16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 30, 20));

        label_17.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_17.setForeground(new java.awt.Color(233, 224, 211));
        label_17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 30, 20));

        label_18.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_18.setForeground(new java.awt.Color(233, 224, 211));
        label_18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 30, 20));

        label_19.setFont(new java.awt.Font("MADE Tommy Soft", 0, 14)); // NOI18N
        label_19.setForeground(new java.awt.Color(233, 224, 211));
        label_19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_Pedido.add(label_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 30, 20));

        boton_0.setBackground(new java.awt.Color(8, 5, 4));
        boton_0.setForeground(new java.awt.Color(255, 255, 255));
        boton_0.setBorder(new javax.swing.border.MatteBorder(null));
        boton_0.setBorderPainted(false);
        boton_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_0ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 50, 50));

        boton_1.setBackground(new java.awt.Color(8, 5, 4));
        boton_1.setForeground(new java.awt.Color(255, 255, 255));
        boton_1.setBorder(new javax.swing.border.MatteBorder(null));
        boton_1.setBorderPainted(false);
        boton_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_1ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 50, 50));

        boton_2.setBackground(new java.awt.Color(8, 5, 4));
        boton_2.setForeground(new java.awt.Color(255, 255, 255));
        boton_2.setBorder(new javax.swing.border.MatteBorder(null));
        boton_2.setBorderPainted(false);
        boton_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_2ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 50, 50));

        boton_3.setBackground(new java.awt.Color(8, 5, 4));
        boton_3.setForeground(new java.awt.Color(255, 255, 255));
        boton_3.setBorder(new javax.swing.border.MatteBorder(null));
        boton_3.setBorderPainted(false);
        boton_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_3ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 50, 50));

        boton_4.setBackground(new java.awt.Color(8, 5, 4));
        boton_4.setForeground(new java.awt.Color(255, 255, 255));
        boton_4.setBorder(new javax.swing.border.MatteBorder(null));
        boton_4.setBorderPainted(false);
        boton_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_4ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 50));

        boton_5.setBackground(new java.awt.Color(8, 5, 4));
        boton_5.setForeground(new java.awt.Color(255, 255, 255));
        boton_5.setBorder(new javax.swing.border.MatteBorder(null));
        boton_5.setBorderPainted(false);
        boton_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_5ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 50, 50));

        boton_6.setBackground(new java.awt.Color(8, 5, 4));
        boton_6.setForeground(new java.awt.Color(255, 255, 255));
        boton_6.setBorder(new javax.swing.border.MatteBorder(null));
        boton_6.setBorderPainted(false);
        boton_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_6ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 50, 50));

        boton_7.setBackground(new java.awt.Color(8, 5, 4));
        boton_7.setForeground(new java.awt.Color(255, 255, 255));
        boton_7.setBorder(new javax.swing.border.MatteBorder(null));
        boton_7.setBorderPainted(false);
        boton_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_7ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 50, 50));

        boton_8.setBackground(new java.awt.Color(8, 5, 4));
        boton_8.setForeground(new java.awt.Color(255, 255, 255));
        boton_8.setBorder(new javax.swing.border.MatteBorder(null));
        boton_8.setBorderPainted(false);
        boton_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_8ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 50, 50));

        boton_9.setBackground(new java.awt.Color(8, 5, 4));
        boton_9.setForeground(new java.awt.Color(255, 255, 255));
        boton_9.setBorder(new javax.swing.border.MatteBorder(null));
        boton_9.setBorderPainted(false);
        boton_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_9ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 50));

        boton_10.setBackground(new java.awt.Color(8, 5, 4));
        boton_10.setForeground(new java.awt.Color(255, 255, 255));
        boton_10.setBorder(new javax.swing.border.MatteBorder(null));
        boton_10.setBorderPainted(false);
        boton_10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_10ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 50, 50));

        boton_11.setBackground(new java.awt.Color(8, 5, 4));
        boton_11.setForeground(new java.awt.Color(255, 255, 255));
        boton_11.setBorder(new javax.swing.border.MatteBorder(null));
        boton_11.setBorderPainted(false);
        boton_11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_11ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 50, 50));

        boton_12.setBackground(new java.awt.Color(8, 5, 4));
        boton_12.setForeground(new java.awt.Color(255, 255, 255));
        boton_12.setBorder(new javax.swing.border.MatteBorder(null));
        boton_12.setBorderPainted(false);
        boton_12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_12ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 50, 50));

        boton_13.setBackground(new java.awt.Color(8, 5, 4));
        boton_13.setForeground(new java.awt.Color(255, 255, 255));
        boton_13.setBorder(new javax.swing.border.MatteBorder(null));
        boton_13.setBorderPainted(false);
        boton_13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_13ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 50, 50));

        boton_14.setBackground(new java.awt.Color(8, 5, 4));
        boton_14.setForeground(new java.awt.Color(255, 255, 255));
        boton_14.setBorder(new javax.swing.border.MatteBorder(null));
        boton_14.setBorderPainted(false);
        boton_14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_14ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 50, 50));

        boton_15.setBackground(new java.awt.Color(8, 5, 4));
        boton_15.setForeground(new java.awt.Color(255, 255, 255));
        boton_15.setBorder(new javax.swing.border.MatteBorder(null));
        boton_15.setBorderPainted(false);
        boton_15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_15ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 50, 50));

        boton_16.setBackground(new java.awt.Color(8, 5, 4));
        boton_16.setForeground(new java.awt.Color(255, 255, 255));
        boton_16.setBorder(new javax.swing.border.MatteBorder(null));
        boton_16.setBorderPainted(false);
        boton_16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_16ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 50, 50));

        boton_17.setBackground(new java.awt.Color(8, 5, 4));
        boton_17.setForeground(new java.awt.Color(255, 255, 255));
        boton_17.setBorder(new javax.swing.border.MatteBorder(null));
        boton_17.setBorderPainted(false);
        boton_17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_17ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 50, 50));

        boton_18.setBackground(new java.awt.Color(8, 5, 4));
        boton_18.setForeground(new java.awt.Color(255, 255, 255));
        boton_18.setBorder(new javax.swing.border.MatteBorder(null));
        boton_18.setBorderPainted(false);
        boton_18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_18ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 50, 50));

        boton_19.setBackground(new java.awt.Color(8, 5, 4));
        boton_19.setForeground(new java.awt.Color(255, 255, 255));
        boton_19.setBorder(new javax.swing.border.MatteBorder(null));
        boton_19.setBorderPainted(false);
        boton_19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_19ActionPerformed(evt);
            }
        });
        panel_Pedido.add(boton_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 50, 50));

        javax.swing.GroupLayout panel_BGLayout = new javax.swing.GroupLayout(panel_BG);
        panel_BG.setLayout(panel_BGLayout);
        panel_BGLayout.setHorizontalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addComponent(panel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_BGLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel_Pedido, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                            .addComponent(panel_Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(separador_3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(15, 15, 15))))
        );
        panel_BGLayout.setVerticalGroup(
            panel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_BGLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(panel_Cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(panel_Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador_3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panel_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Guarda los datos en la base de datos y regresa al JFrame Inicio
    private void boton_PedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_PedirActionPerformed

        pedir();
        System.out.println(evt);

    }//GEN-LAST:event_boton_PedirActionPerformed

    private void boton_SushisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_SushisActionPerformed

        Utilidades.setView(new Sushis(), panel_Contenedor, 730, 320);
        System.out.println(evt);

    }//GEN-LAST:event_boton_SushisActionPerformed

    private void boton_ShareItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ShareItActionPerformed

        Utilidades.setView(new ShareIt(), panel_Contenedor, 730, 320);
        System.out.println(evt);

    }//GEN-LAST:event_boton_ShareItActionPerformed

    private void boton_BurgersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BurgersActionPerformed

        Utilidades.setView(new Hamburguesas(), panel_Contenedor, 730, 320);
        System.out.println(evt);

    }//GEN-LAST:event_boton_BurgersActionPerformed

    private void boton_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_0ActionPerformed

        eliminarE(0);
        System.out.println(evt);

    }//GEN-LAST:event_boton_0ActionPerformed

    private void boton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_1ActionPerformed

        eliminarE(1);
        System.out.println(evt);

    }//GEN-LAST:event_boton_1ActionPerformed

    private void boton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_2ActionPerformed

        eliminarE(2);
        System.out.println(evt);

    }//GEN-LAST:event_boton_2ActionPerformed

    private void boton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_3ActionPerformed

        eliminarE(3);
        System.out.println(evt);

    }//GEN-LAST:event_boton_3ActionPerformed

    private void boton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_4ActionPerformed

        eliminarE(4);
        System.out.println(evt);

    }//GEN-LAST:event_boton_4ActionPerformed

    private void boton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_5ActionPerformed

        eliminarE(5);
        System.out.println(evt);

    }//GEN-LAST:event_boton_5ActionPerformed

    private void boton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_6ActionPerformed

        eliminarE(6);
        System.out.println(evt);

    }//GEN-LAST:event_boton_6ActionPerformed

    private void boton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_7ActionPerformed

        eliminarE(7);
        System.out.println(evt);

    }//GEN-LAST:event_boton_7ActionPerformed

    private void boton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_8ActionPerformed

        eliminarE(8);
        System.out.println(evt);

    }//GEN-LAST:event_boton_8ActionPerformed

    private void boton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_9ActionPerformed

        eliminarE(9);
        System.out.println(evt);

    }//GEN-LAST:event_boton_9ActionPerformed

    private void boton_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_10ActionPerformed

        eliminarE(10);
        System.out.println(evt);

    }//GEN-LAST:event_boton_10ActionPerformed

    private void boton_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_11ActionPerformed

        eliminarE(11);
        System.out.println(evt);

    }//GEN-LAST:event_boton_11ActionPerformed

    private void boton_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_12ActionPerformed

        eliminarE(12);
        System.out.println(evt);

    }//GEN-LAST:event_boton_12ActionPerformed

    private void boton_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_13ActionPerformed

        eliminarE(13);
        System.out.println(evt);

    }//GEN-LAST:event_boton_13ActionPerformed

    private void boton_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_14ActionPerformed

        eliminarE(14);
        System.out.println(evt);

    }//GEN-LAST:event_boton_14ActionPerformed

    private void boton_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_15ActionPerformed

        eliminarE(15);
        System.out.println(evt);

    }//GEN-LAST:event_boton_15ActionPerformed

    private void boton_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_16ActionPerformed

        eliminarE(16);
        System.out.println(evt);

    }//GEN-LAST:event_boton_16ActionPerformed

    private void boton_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_17ActionPerformed

        eliminarE(17);
        System.out.println(evt);

    }//GEN-LAST:event_boton_17ActionPerformed

    private void boton_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_18ActionPerformed

        eliminarE(18);
        System.out.println(evt);

    }//GEN-LAST:event_boton_18ActionPerformed

    private void boton_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_19ActionPerformed

        eliminarE(19);
        System.out.println(evt);

    }//GEN-LAST:event_boton_19ActionPerformed

    private void boton_BebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BebidasActionPerformed

        Utilidades.setView(new Bebidas(), panel_Contenedor, 730, 320);
        System.out.println(evt);

    }//GEN-LAST:event_boton_BebidasActionPerformed

    public static void main(String args[]) {
        
        //Inicialización del Look and Feel
        FlatMaterialDarkerContrastIJTheme.setup();
        
        java.awt.EventQueue.invokeLater(() -> {
            new Pedido().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_0;
    private javax.swing.JButton boton_1;
    private javax.swing.JButton boton_10;
    private javax.swing.JButton boton_11;
    private javax.swing.JButton boton_12;
    private javax.swing.JButton boton_13;
    private javax.swing.JButton boton_14;
    private javax.swing.JButton boton_15;
    private javax.swing.JButton boton_16;
    private javax.swing.JButton boton_17;
    private javax.swing.JButton boton_18;
    private javax.swing.JButton boton_19;
    private javax.swing.JButton boton_2;
    private javax.swing.JButton boton_3;
    private javax.swing.JButton boton_4;
    private javax.swing.JButton boton_5;
    private javax.swing.JButton boton_6;
    private javax.swing.JButton boton_7;
    private javax.swing.JButton boton_8;
    private javax.swing.JButton boton_9;
    private javax.swing.JButton boton_Bebidas;
    private javax.swing.JButton boton_Burgers;
    private javax.swing.JButton boton_Pedir;
    private javax.swing.JButton boton_ShareIt;
    private javax.swing.JButton boton_Sushis;
    private javax.swing.JLabel label_0;
    private javax.swing.JLabel label_1;
    private javax.swing.JLabel label_10;
    private javax.swing.JLabel label_11;
    private javax.swing.JLabel label_12;
    private javax.swing.JLabel label_13;
    private javax.swing.JLabel label_14;
    private javax.swing.JLabel label_15;
    private javax.swing.JLabel label_16;
    private javax.swing.JLabel label_17;
    private javax.swing.JLabel label_18;
    private javax.swing.JLabel label_19;
    private javax.swing.JLabel label_2;
    private javax.swing.JLabel label_3;
    private javax.swing.JLabel label_4;
    private javax.swing.JLabel label_5;
    private javax.swing.JLabel label_6;
    private javax.swing.JLabel label_7;
    private javax.swing.JLabel label_8;
    private javax.swing.JLabel label_9;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mensaje_1;
    private javax.swing.JLabel mensaje_2;
    private javax.swing.JPanel panel_BG;
    private javax.swing.JPanel panel_Cabecera;
    public static javax.swing.JPanel panel_Contenedor;
    private javax.swing.JPanel panel_Menu;
    private javax.swing.JPanel panel_Pedido;
    private static javax.swing.JLabel precio;
    private javax.swing.JSeparator separador_1;
    private javax.swing.JSeparator separador_2;
    private javax.swing.JSeparator separador_3;
    private javax.swing.JSeparator separador_4;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
