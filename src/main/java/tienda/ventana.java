package tienda;

/**
 *
 * @author Tito Jesús Yánac Saldaña
 * @codigo 10200176
 * @correo 1200176@unmsm.edu.pe
 * @curso Patrones de Diseño
 */
public class ventana extends javax.swing.JFrame {
    
    public ventana() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
                             
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_direccion = new javax.swing.JTextField();
        jTextField_dni = new javax.swing.JTextField();
        jButton_agregar_cliente_ = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_item = new javax.swing.JTextField();
        jTextField_precio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_unidad_de_medida = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_marca = new javax.swing.JTextField();
        jButton_agregar_producto_ = new javax.swing.JButton();
        jButton_crear_pedido_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_muestra_pedido_ = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));  
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Demo SRP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));  
        jLabel2.setText("Datos del cliente:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jLabel4.setText("Dirección:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jLabel5.setText("Dni:");

        jTextField_nombre.setFont(new java.awt.Font("Tahoma", 0, 14));  

        jTextField_direccion.setFont(new java.awt.Font("Tahoma", 0, 14));  

        jTextField_dni.setFont(new java.awt.Font("Tahoma", 0, 14));  

        jButton_agregar_cliente_.setFont(new java.awt.Font("Tahoma", 0, 18));  
        jButton_agregar_cliente_.setText("Agregar");
        jButton_agregar_cliente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar_cliente_ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18));  
        jLabel6.setText("Datos del Producto:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jLabel7.setText("Item:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jLabel8.setText("Precio:");

        jTextField_item.setFont(new java.awt.Font("Tahoma", 0, 14));  

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jLabel9.setText("Unid. de medida:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jLabel10.setText("Marca:");

        jButton_agregar_producto_.setFont(new java.awt.Font("Tahoma", 0, 18));  
        jButton_agregar_producto_.setText("Agregar");
        jButton_agregar_producto_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar_producto_ActionPerformed(evt);
            }
        });

        jButton_crear_pedido_.setFont(new java.awt.Font("Tahoma", 0, 18));  
        jButton_crear_pedido_.setText("Crear Pedido");
        jButton_crear_pedido_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_crear_pedido_ActionPerformed(evt);
            }
        });

        jTextArea_muestra_pedido_.setColumns(20);
        jTextArea_muestra_pedido_.setRows(5);
        jScrollPane1.setViewportView(jTextArea_muestra_pedido_);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_direccion))
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton_agregar_cliente_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_item))
                                .addComponent(jLabel6)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel9))
                                        .addComponent(jTextField_marca))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_unidad_de_medida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_agregar_producto_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(jButton_crear_pedido_, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_agregar_cliente_))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_unidad_de_medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_agregar_producto_))
                .addGap(30, 30, 30)
                .addComponent(jButton_crear_pedido_, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

                                                 

    private void jButton_agregar_cliente_ActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // funcion para agregar un cliente
    }                                                        

    private void jButton_agregar_producto_ActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // funcion para agregar un producto
    }                                                         

    private void jButton_crear_pedido_ActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // Funcion para crear pedido
    }                                                     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

                    
    private javax.swing.JButton jButton_agregar_cliente_;
    private javax.swing.JButton jButton_agregar_producto_;
    private javax.swing.JButton jButton_crear_pedido_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_muestra_pedido_;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_dni;
    private javax.swing.JTextField jTextField_item;
    private javax.swing.JTextField jTextField_marca;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_precio;
    private javax.swing.JTextField jTextField_unidad_de_medida;
    // End of variables declaration                   
}
