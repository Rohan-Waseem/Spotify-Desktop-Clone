/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen1;

import custom_scrollbar.ScrollBarWin11UI;
import dbhandlers.LoginHandler;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import user_profile.User;
import user_profile.UserSession;

/**
 *
 * @author HP
 */
public class login_screen extends javax.swing.JFrame {

    /**
     * Creates new form login_screen
     */
    public login_screen() {
        initComponents();
        init();
        setCustomIcon();
        var fontStyle1 = new File("src/resources/CircularSpotifyText-Medium.otf");
        var fontStyle2 = new File("src/resources/CircularSpotifyText-Bold.otf");
        System.out.println("Font file exists: " + fontStyle1.exists());  
        System.out.println("Font file exists: " + fontStyle2.exists());
         
        try { 
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, fontStyle2).deriveFont(36f);
            Font font2 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(14f);
            Font font3;
            font3 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(16f);
            jLabel1.setFont(font1);
            jLabel2.setFont(font2);            
            jLabel3.setFont(font2);
            roundButton1.setFont(font3);
            customTextField1.setFont(font3);
            jLabel4.setFont(font3);
            jLabel5.setFont(font3);
            jLabel6.setFont(font2);
        }
        catch (FontFormatException | IOException e) {
        e.printStackTrace();
        }
    }

     private void init() {
         setBackground(new Color(0, 0, 0, 0)); 
         
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollBar1 = new tablefiles.ScrollBar();
        mainPanel2 = new packs.MainPanel();
        topbar1 = new packs.topbar();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel21 = new packs.MainPanel2();
        jPanel1 = new javax.swing.JPanel();
        logo21 = new packs.logo2();
        sidepanel1 = new packs.sidepanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        roundButton1 = new packs.RoundButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        customTextField1 = new customtextfieldandpass.CustomTextField();
        customPasswordField1 = new customtextfieldandpass.CustomPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1059, 624));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBar(scrollBar1);

        jPanel1.setBackground(new java.awt.Color(18, 18, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(logo21, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(logo21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        sidepanel1.setBackground(new java.awt.Color(18, 18, 18));
        sidepanel1.setMaximumSize(new java.awt.Dimension(484, 421));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Log in to Spotify");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email or username");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        roundButton1.setBackground(new java.awt.Color(30, 215, 96));
        roundButton1.setBorder(null);
        roundButton1.setForeground(new java.awt.Color(0, 0, 0));
        roundButton1.setText("Log In");
        roundButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        roundButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html><u>Forgot your password?</u></html>");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html> Don't have an account? <u>Sign up for Spotify </u> <html>");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        customTextField1.setBackground(new java.awt.Color(18, 18, 18));
        customTextField1.setForeground(new java.awt.Color(153, 153, 153));
        customTextField1.setText("Email or username");
        customTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                customTextField1FocusLost(evt);
            }
        });
        customTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customTextField1ActionPerformed(evt);
            }
        });

        customPasswordField1.setBackground(new java.awt.Color(18, 18, 18));
        customPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        customPasswordField1.setText("Password");
        customPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                customPasswordField1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout sidepanel1Layout = new javax.swing.GroupLayout(sidepanel1);
        sidepanel1.setLayout(sidepanel1Layout);
        sidepanel1Layout.setHorizontalGroup(
            sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel1Layout.createSequentialGroup()
                .addGroup(sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sidepanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(customTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(customPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))))
                .addGap(150, 150, 150))
        );
        sidepanel1Layout.setVerticalGroup(
            sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanel21Layout = new javax.swing.GroupLayout(mainPanel21);
        mainPanel21.setLayout(mainPanel21Layout);
        mainPanel21Layout.setHorizontalGroup(
            mainPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanel21Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(sidepanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        mainPanel21Layout.setVerticalGroup(
            mainPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel21Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(sidepanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(mainPanel21);

        javax.swing.GroupLayout mainPanel2Layout = new javax.swing.GroupLayout(mainPanel2);
        mainPanel2.setLayout(mainPanel2Layout);
        mainPanel2Layout.setHorizontalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topbar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        mainPanel2Layout.setVerticalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(topbar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roundButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton1ActionPerformed
        try {                                             
            String usernameOrEmail = customTextField1.getText();
            String password = new String(customPasswordField1.getPassword());
            User loggedInUser = LoginHandler.authenticate(usernameOrEmail, password);
            if (loggedInUser != null) {
                try {
                    UserSession.getInstance().setUser(loggedInUser);
                    var sc = new screen1.screen2();
                    sc.setSize(this.getSize());  // Set size of screen2 to match screen1
                    sc.setLocation(this.getLocation());  // Set location of screen2 to match screen1
                    sc.setVisible(true);
                    this.dispose();
                } catch (FontFormatException ex) {
                    Logger.getLogger(Spotify_Screen1.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                jLabel6.setText("Login Failed! Invalid username/email or password");
                jLabel6.setForeground(Color.RED);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(login_screen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_roundButton1ActionPerformed
    private void setCustomIcon() {
        // Load the custom icon
        ImageIcon imgIcon = new ImageIcon("src/images/spotify_logo.png");
        Image img = imgIcon.getImage();
        // Set the custom icon
        this.setIconImage(img);
    }
    private void customTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customTextField1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        var sc = new screen1.signup_screen();
        sc.setSize(this.getSize());  // Set size of screen2 to match screen1
        sc.setLocation(this.getLocation());  // Set location of screen2 to match screen1
        sc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void customTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customTextField1FocusGained
       if (customTextField1.getText().equals("Email or username")) {
            customTextField1.setText("");
            customTextField1.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_customTextField1FocusGained

    private void customTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customTextField1FocusLost
        if (customTextField1.getText().isEmpty()) {
            customTextField1.setText("Email or username");
            customTextField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_customTextField1FocusLost

    private void customPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customPasswordField1FocusGained
        if (customPasswordField1.getText().equals("Password")) {
            customPasswordField1.setText("");
            customPasswordField1.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_customPasswordField1FocusGained

    private void customPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customPasswordField1FocusLost
         if (customPasswordField1.getText().isEmpty()) {
            customPasswordField1.setText("Password");
            customPasswordField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_customPasswordField1FocusLost

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
            java.util.logging.Logger.getLogger(login_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIDefaults ui = UIManager.getDefaults();
        ui.put("ScrollBarUI", ScrollBarWin11UI.class.getCanonicalName());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customtextfieldandpass.CustomPasswordField customPasswordField1;
    private customtextfieldandpass.CustomTextField customTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private packs.logo2 logo21;
    private packs.MainPanel mainPanel2;
    private packs.MainPanel2 mainPanel21;
    private packs.RoundButton roundButton1;
    private tablefiles.ScrollBar scrollBar1;
    private packs.sidepanel sidepanel1;
    private packs.topbar topbar1;
    // End of variables declaration//GEN-END:variables
}
