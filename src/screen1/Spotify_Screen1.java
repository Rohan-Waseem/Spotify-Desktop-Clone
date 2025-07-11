package screen1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class Spotify_Screen1 extends javax.swing.JFrame {
    public Spotify_Screen1() {
            
        initComponents();
        init();
        setCustomIcon();
        var fontStyle1 = new File("src/resources/CircularSpotifyText-Medium.otf");
        System.out.println("Font file exists: " + fontStyle1.exists());      
         
        try { 
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(16f);
            Font font2 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(14f);      
            Font font3;
            font3 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(10f);
            Font font4 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(26f);
            
            
            roundButton1.setFont(font1);
            jLabelsignup2.setFont(font2);
            jLabelsignup3.setFont(font3);
//            jLabel7.setFont(font1);
//            jLabel13.setFont(font4);
          
        }
        catch (FontFormatException | IOException e) {
        e.printStackTrace();
        }
       
    
    }
    private void init() {
         setBackground(new Color(0, 0, 0, 0)); 
         
        

    }
    ImageIcon normalIcon = new ImageIcon(getClass().getResource("/images/Slice 1.png"));
    ImageIcon rolloverIcon = new ImageIcon(getClass().getResource("/images/Slice 2.png"));
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background2 = new packs.background();
        topbar1 = new packs.topbar();
        sidepanel1 = new packs.sidepanel();
        logo12 = new packs.logo1();
        textfield2 = new packs.textfield();
        roundButton1 = new packs.RoundButton();
        jLabelsignup2 = new javax.swing.JLabel();
        jLabelsignup3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1059, 624));

        sidepanel1.setBackground(new java.awt.Color(15, 15, 15));
        sidepanel1.setMaximumSize(new java.awt.Dimension(484, 421));

        logo12.setForeground(new java.awt.Color(255, 255, 255));

        roundButton1.setBackground(new java.awt.Color(30, 215, 96));
        roundButton1.setBorder(null);
        roundButton1.setForeground(new java.awt.Color(0, 0, 0));
        roundButton1.setText("Log In");
        roundButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        roundButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundButton1MouseExited(evt);
            }
        });
        roundButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton1ActionPerformed(evt);
            }
        });

        jLabelsignup2.setBackground(new java.awt.Color(15, 15, 15));
        jLabelsignup2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelsignup2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelsignup2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelsignup2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-login-15.png"))); // NOI18N
        jLabelsignup2.setText("<html><span style=\"color:rgb( 153,153,153)\">New to Spotify?</span> Sign up free </html>");
        jLabelsignup2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelsignup2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabelsignup2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelsignup2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelsignup2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelsignup2MouseExited(evt);
            }
        });

        jLabelsignup3.setBackground(new java.awt.Color(15, 15, 15));
        jLabelsignup3.setForeground(new java.awt.Color(102, 102, 102));
        jLabelsignup3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelsignup3.setText("<html>SETTINGS</html>");
        jLabelsignup3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelsignup3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelsignup3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelsignup3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout sidepanel1Layout = new javax.swing.GroupLayout(sidepanel1);
        sidepanel1.setLayout(sidepanel1Layout);
        sidepanel1Layout.setHorizontalGroup(
            sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, sidepanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(logo12, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addComponent(textfield2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelsignup3)
                    .addComponent(jLabelsignup2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        sidepanel1Layout.setVerticalGroup(
            sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(logo12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(textfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabelsignup2)
                .addGap(18, 18, 18)
                .addComponent(jLabelsignup3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addComponent(sidepanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
            .addComponent(topbar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addComponent(topbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(sidepanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roundButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton1ActionPerformed
        
    var sc = new screen1.login_screen();
    sc.setSize(this.getSize());  // Set size of screen2 to match screen1
    sc.setLocation(this.getLocation());  // Set location of screen2 to match screen1
    sc.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_roundButton1ActionPerformed
     private void setCustomIcon() {
        // Load the custom icon
        ImageIcon imgIcon = new ImageIcon("src/images/spotify_logo.png");
        Image img = imgIcon.getImage();
        // Set the custom icon
        this.setIconImage(img);
    }
    private void jLabelsignup2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelsignup2MouseClicked
        var sc = new screen1.signup_screen();
        sc.setSize(this.getSize());  // Set size of screen2 to match screen1
        sc.setLocation(this.getLocation());  // Set location of screen2 to match screen1
        sc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelsignup2MouseClicked

    private void jLabelsignup2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelsignup2MouseEntered
        jLabelsignup2.setText("<html><span style=\"color:rgb( 153,153,153)\">New to Spotify?</span><u> Sign up free </u></html>");
    }//GEN-LAST:event_jLabelsignup2MouseEntered

    private void jLabelsignup2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelsignup2MouseExited
        jLabelsignup2.setText("<html><span style=\"color:rgb( 153,153,153)\">New to Spotify?</span> Sign up free </html>");
    }//GEN-LAST:event_jLabelsignup2MouseExited

    private void jLabelsignup3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelsignup3MouseEntered
                jLabelsignup3.setText("<html><u>SETTINGS</u></html>");
    }//GEN-LAST:event_jLabelsignup3MouseEntered

    private void jLabelsignup3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelsignup3MouseExited
                jLabelsignup3.setText("<html>SETTINGS</html>");
    }//GEN-LAST:event_jLabelsignup3MouseExited

    private void roundButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundButton1MouseEntered
        roundButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_roundButton1MouseEntered

    private void roundButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundButton1MouseExited
        roundButton1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_roundButton1MouseExited
    public void close() {
            WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Spotify_Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Spotify_Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Spotify_Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Spotify_Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new Spotify_Screen1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private packs.background background2;
    private javax.swing.JLabel jLabelsignup2;
    private javax.swing.JLabel jLabelsignup3;
    private packs.logo1 logo12;
    private packs.RoundButton roundButton1;
    private packs.sidepanel sidepanel1;
    private packs.textfield textfield2;
    private packs.topbar topbar1;
    // End of variables declaration//GEN-END:variables

}
