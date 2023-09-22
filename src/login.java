
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author amelia
 */
public class login extends javax.swing.JFrame {
    public static Connection con;
    public static Statement stat;
    public static ResultSet res;
    


    int xx,xy;
    /**
     * Creates new form login
     */
    String nama;
    private Object jTexField1;
    
    public login() {
        initComponents();
        koneksi();
        String user = id_user.getText();
        
        
    }
    private void koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo_project", "root", "");
            stat = con.createStatement();
        }catch (ClassNotFoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Driver MySQL tidak ditemukan");
        }catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Gagal terhubung ke database");
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cape_gw = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_password = new javax.swing.JTextField();
        id_user = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        sign_in = new javax.swing.JPanel();
        isiuser = new javax.swing.JTextField();
        isipw = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        cape_gw.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Close_1.png"))); // NOI18N
        close.setPreferredSize(new java.awt.Dimension(50, 50));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/car copy.png"))); // NOI18N

        id_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_password.setText("PASSWORD");
        id_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        id_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                id_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_passwordFocusLost(evt);
            }
        });
        id_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_passwordActionPerformed(evt);
            }
        });

        id_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_user.setText("USERNAME");
        id_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        id_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                id_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_userFocusLost(evt);
            }
        });
        id_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_userActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Password.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Customer.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("belum punya akun ?");

        jLabel5.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 1, 18)); // NOI18N
        jLabel5.setText("CAR WITH US");

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setText("DAFTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel5))
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(id_user, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(id_password, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton2)))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2))))
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(id_user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(id_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jButton2)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        login.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 380));

        cape_gw.add(login, "card2");

        sign_in.setBackground(new java.awt.Color(255, 255, 255));
        sign_in.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        isiuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        isiuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiuserActionPerformed(evt);
            }
        });
        sign_in.add(isiuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, -1));

        isipw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        isipw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isipwActionPerformed(evt);
            }
        });
        sign_in.add(isipw, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 110, -1));

        jTextField3.setText("Re-Type Password");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        sign_in.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 110, -1));

        jLabel7.setText("Username:");
        sign_in.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        jLabel9.setText("Password");
        sign_in.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setText("DAFTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Test Account.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(87, 87, 87))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(34, 34, 34))
        );

        sign_in.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 300, 300));

        cape_gw.add(sign_in, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cape_gw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cape_gw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
    xx = evt.getX();
    xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
    int x = evt.getXOnScreen();
    int y = evt.getYOnScreen();
    this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_formMouseDragged

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
    if(JOptionPane.showConfirmDialog(null,
             "Apakah Yakin akan Keluar ?",
             "Konfirmasi",
             JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
         System.exit(0);
     }
    }//GEN-LAST:event_closeMouseClicked

    private void id_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_passwordActionPerformed

    private void id_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_userFocusGained
    String  pass = id_user.getText();
    if(pass.equals("USERNAME")){
        id_user.setText("");
    }
    }//GEN-LAST:event_id_userFocusGained

    private void id_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_passwordFocusGained
    String  pass = id_password.getText();
    if(pass.equals("PASSWORD")){
        id_password.setText("");
    }
    }//GEN-LAST:event_id_passwordFocusGained

    private void id_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_userFocusLost
    String  pass = id_user.getText();
    if(pass.equals("")||pass.equals("USERNAME")){
        id_user.setText("USERNAME");
    }
    }//GEN-LAST:event_id_userFocusLost

    private void id_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_passwordFocusLost
    String  pass = id_password.getText();
    if(pass.equals("")||pass.equals("PASSWORD")){
        id_password.setText("PASSWORD");
    }
    }//GEN-LAST:event_id_passwordFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo_project", "root", "");
            stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            res = stat.executeQuery("select * from user where id_user='" + id_user.getText() + "' " + "and id_password='" + id_password.getText()
                    + "'");

            res.last();
            if (id_user.getText().equals("username") && id_password.getText().equals("password") ) {
            } 
            else if (res.getRow() >= 1) {
                    
                    nama = id_user.getText(); 
                    mainmenu utama = new mainmenu(nama);
                    utama.setVisible(true);
                    this.dispose();
                
            } else if ((res.getRow() == 0)) {
                JOptionPane.showMessageDialog(null, "maaf Login Gagal. periksa kembali username dan password anda!");
                stat.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Belum Terkoneksi :(");
            e.printStackTrace();
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void id_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_userActionPerformed
    
    }//GEN-LAST:event_id_userActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    cape_gw.removeAll();
    cape_gw.repaint();
    cape_gw.revalidate();

    cape_gw.add(sign_in);
    cape_gw.repaint();
    cape_gw.revalidate();
    
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String query = "INSERT INTO user (id_user, id_password) VALUES (?, ?)";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, isiuser.getText());
            ps.setString(2, isipw.getText());

            int result = ps.executeUpdate();
            if (result > 0) {

                JOptionPane.showMessageDialog(this, "Berhasil");

                cape_gw.removeAll();
                cape_gw.repaint();
                cape_gw.revalidate();

                cape_gw.add(login);
                cape_gw.repaint();
                cape_gw.revalidate();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void isipwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isipwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isipwActionPerformed

    private void isiuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiuserActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cape_gw;
    private javax.swing.JLabel close;
    private javax.swing.JTextField id_password;
    private javax.swing.JTextField id_user;
    private javax.swing.JTextField isipw;
    private javax.swing.JTextField isiuser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel login;
    private javax.swing.JPanel sign_in;
    // End of variables declaration//GEN-END:variables

}
