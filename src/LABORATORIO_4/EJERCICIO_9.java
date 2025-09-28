package LABORATORIO_4;
    import javax.swing.JOptionPane;

public class EJERCICIO_9 extends javax.swing.JFrame {

    public EJERCICIO_9() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        chk_hamb = new javax.swing.JCheckBox();
        chk_hqueso = new javax.swing.JCheckBox();
        chk_hdoble = new javax.swing.JCheckBox();
        chk_papas = new javax.swing.JCheckBox();
        chk_malteadas = new javax.swing.JCheckBox();
        chk_refrescos = new javax.swing.JCheckBox();
        chk_cafe = new javax.swing.JCheckBox();
        txt_hamburguesa = new javax.swing.JTextField();
        txt_refrescos = new javax.swing.JTextField();
        txt_malteadas = new javax.swing.JTextField();
        txt_papas = new javax.swing.JTextField();
        txt_hdoble = new javax.swing.JTextField();
        txt_hqueso = new javax.swing.JTextField();
        txt_cafe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("RESTAURANTE DE HAMBURGUESAS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 5, true), "OFERTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        chk_hamb.setText("HAMBURGUESA");
        chk_hamb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_hambActionPerformed(evt);
            }
        });

        chk_hqueso.setText("HAMBURGUESA CON QUESO");
        chk_hqueso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_hquesoActionPerformed(evt);
            }
        });

        chk_hdoble.setText("HAMBURGUESA DOBLE");
        chk_hdoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_hdobleActionPerformed(evt);
            }
        });

        chk_papas.setText("PAPAS A LA FRANCESA");
        chk_papas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_papasActionPerformed(evt);
            }
        });

        chk_malteadas.setText("MALTEADAS");
        chk_malteadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_malteadasActionPerformed(evt);
            }
        });

        chk_refrescos.setText("REFRESCOS");
        chk_refrescos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_refrescosActionPerformed(evt);
            }
        });

        chk_cafe.setText("CAFÉ");
        chk_cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_cafeActionPerformed(evt);
            }
        });

        txt_hamburguesa.setEnabled(false);

        txt_refrescos.setEnabled(false);

        txt_malteadas.setEnabled(false);

        txt_papas.setEnabled(false);

        txt_hdoble.setEnabled(false);

        txt_hqueso.setEnabled(false);

        txt_cafe.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chk_hamb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_hamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chk_cafe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_cafe, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_hqueso)
                            .addComponent(chk_refrescos)
                            .addComponent(chk_malteadas)
                            .addComponent(chk_papas)
                            .addComponent(chk_hdoble))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_hdoble, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_hqueso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_papas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_malteadas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_refrescos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_hamb)
                    .addComponent(txt_hamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_hqueso)
                    .addComponent(txt_hqueso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_hdoble)
                    .addComponent(txt_hdoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_papas)
                    .addComponent(txt_papas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_malteadas)
                    .addComponent(txt_malteadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_refrescos)
                    .addComponent(txt_refrescos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_cafe)
                    .addComponent(txt_cafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("TOTAL A PAGAR:");

        txt_total.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txt_total.setEnabled(false);

        btn_calcular.setText("CALCULAR");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        btn_nuevo.setText("NUEVO");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_calcular)
                            .addComponent(btn_nuevo)
                            .addComponent(btn_salir))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btn_calcular)
                        .addGap(48, 48, 48)
                        .addComponent(btn_nuevo)
                        .addGap(61, 61, 61)
                        .addComponent(btn_salir)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void chk_hambActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txt_hamburguesa.enable(true);
        txt_hamburguesa.requestFocus();
    }                                        

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int xxx;
        xxx=JOptionPane.showOptionDialog(null,"DESEA SALIR?","AYUDITA",
                JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,null,null,null);
        if(xxx==0) System.exit(0);
    }                                         

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        txt_cafe.setText("");txt_cafe.enable(false);
        txt_hamburguesa.setText("");txt_hamburguesa.enable(false);
        txt_hdoble.setText("");txt_hdoble.enable(false);
        txt_hqueso.setText("");txt_hqueso.enable(false);
        txt_malteadas.setText("");txt_malteadas.enable(false);
        txt_papas.setText("");txt_papas.enable(false);
        txt_refrescos.setText("");txt_refrescos.enable(false);
        txt_total.setText("");
        chk_cafe.setSelected(false);
        chk_hamb.setSelected(false);
        chk_hdoble.setSelected(false);
        chk_hqueso.setSelected(false);
        chk_malteadas.setSelected(false);
        chk_papas.setSelected(false);
        chk_refrescos.setSelected(false);
    }                                         

    private void chk_hquesoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        txt_hqueso.enable(true);
        txt_hqueso.requestFocus();
    }                                          

    private void chk_hdobleActionPerformed(java.awt.event.ActionEvent evt) {                                           
        txt_hdoble.enable(true);
        txt_hdoble.requestFocus();
    }                                          

    private void chk_papasActionPerformed(java.awt.event.ActionEvent evt) {                                          
        txt_papas.enable(true);
        txt_papas.requestFocus();
    }                                         

    private void chk_malteadasActionPerformed(java.awt.event.ActionEvent evt) {                                              
        txt_malteadas.enable(true);
        txt_malteadas.requestFocus();
    }                                             

    private void chk_refrescosActionPerformed(java.awt.event.ActionEvent evt) {                                              
        txt_refrescos.enable(true);
        txt_refrescos.requestFocus();
    }                                             

    private void chk_cafeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txt_cafe.enable(true);
        txt_cafe.requestFocus();
    }                                        

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {                                             
        double hamb = 0,hqueso = 0,hdoble = 0,papas=0;
        double malteadas = 0,refrescos = 0,cafe = 0,total;
        if(chk_hamb.isSelected()){
            hamb=12*Double.parseDouble(txt_hamburguesa.getText());
        }
        if(chk_hqueso.isSelected()){
            hqueso=15*Double.parseDouble(txt_hqueso.getText());
        }
        if(chk_hdoble.isSelected()){
            hdoble=17*Double.parseDouble(txt_hdoble.getText());
        }
        if(chk_malteadas.isSelected()){
            malteadas=6*Double.parseDouble(txt_malteadas.getText());
        }
        if(chk_papas.isSelected()){
            papas=5*Double.parseDouble(txt_papas.getText());
        }
        if(chk_refrescos.isSelected()){
            refrescos=5*Double.parseDouble(txt_refrescos.getText());
        }
        if(chk_cafe.isSelected()){
            cafe=6*Double.parseDouble(txt_cafe.getText());
        }
        total=refrescos+hamb+hqueso+hdoble+malteadas+cafe;
        txt_total.setText(String.format("%.2f",total));
    }                                            

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EJERCICIO_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EJERCICIO_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EJERCICIO_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EJERCICIO_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EJERCICIO_9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JCheckBox chk_cafe;
    private javax.swing.JCheckBox chk_hamb;
    private javax.swing.JCheckBox chk_hdoble;
    private javax.swing.JCheckBox chk_hqueso;
    private javax.swing.JCheckBox chk_malteadas;
    private javax.swing.JCheckBox chk_papas;
    private javax.swing.JCheckBox chk_refrescos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cafe;
    private javax.swing.JTextField txt_hamburguesa;
    private javax.swing.JTextField txt_hdoble;
    private javax.swing.JTextField txt_hqueso;
    private javax.swing.JTextField txt_malteadas;
    private javax.swing.JTextField txt_papas;
    private javax.swing.JTextField txt_refrescos;
    private javax.swing.JTextField txt_total;
    // End of variables declaration                   
}
