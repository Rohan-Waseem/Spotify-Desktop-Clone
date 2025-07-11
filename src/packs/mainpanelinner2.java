/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package packs;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Frame;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import user_profile.User;
import user_profile.UserSession;
//import javax.
/**
 *
 * @author HP
 */
public class mainpanelinner2 extends javax.swing.JPanel {
    CardLayout cardLayout;
    public mainpanelinner2() {
        initComponents();
        setOpaque(false);
        updateUserLabel();
        cardLayout = (CardLayout)(mainPanelinnerInvisible4.getLayout());
        
        dropdown2.setVisible(false);  // Ensure the panel is initially hidden
        setupMouseListener();  
        
        ImageIcon albumCoverIcon = new ImageIcon(getClass().getResource("/images/user1.png"));
        Image img = albumCoverIcon.getImage();
        fullroundbutton1.setButtonImage(img);
                
        var fontStyle1 = new File("src/resources/CircularSpotifyText-Medium.otf");
        var fontStyle2 = new File("src/resources/CircularSpotifyText-Bold.otf");
        System.out.println("Font file exists: " + fontStyle1.exists());  
        System.out.println("Font file exists: " + fontStyle2.exists());
         
        try { 
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(35f);
            Font font2 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(20f);
            Font font3;
            font3 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(14f);
            jLabel1.setFont(font3);
            jLabel2.setFont(font1);            
            jLabel3.setFont(font3);
            

            jLabel4.setFont(font2);

            
            jButton25.setFont(font3);
            jButton26.setFont(font3);
//            jLabel5.setFont(font3)
        }
        catch (FontFormatException | IOException e) {
        e.printStackTrace();
        }
        
        
    }
     private void updateUserLabel() {
        User loggedInUser = UserSession.getInstance().getUser();
        if (loggedInUser != null) {
            jLabel2.setText(loggedInUser.getUsername());
        } else {
            jLabel2.setText("No user logged in");
        }
    }
    private void setupMouseListener() {
                this.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        if (!dropdown2.getBounds().contains(evt.getPoint()) && dropdown2.isVisible()) {
                            dropdown2.setVisible(false);
                        }
                    }
                });}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanelinnerInvisible4 = new packs.MainPanelinnerInvisible();
        mainPanelinnerInvisible3 = new packs.MainPanelinnerInvisible();
        profilepanelcolor1 = new packs.profilepanelcolor();
        fullroundbutton1 = new packs.fullroundbutton();
        mainPanelinnerInvisible1 = new packs.MainPanelinnerInvisible();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        dropdown2 = new packs.sidepanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        mainPanelinnerInvisible2 = new packs.MainPanelinnerInvisible();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fullroundbutton5 = new packs.fullroundbutton();
        fullroundbutton6 = new packs.fullroundbutton();
        fullroundbutton7 = new packs.fullroundbutton();
        mainPanelinnerInvisible5 = new packs.MainPanelinnerInvisible();
        followerspanel1 = new packs.Followerspanel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(943, 600));

        mainPanelinnerInvisible4.setLayout(new java.awt.CardLayout());

        fullroundbutton1.setBorder(null);
        fullroundbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullroundbutton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Profile");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Username");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Followers");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelinnerInvisible1Layout = new javax.swing.GroupLayout(mainPanelinnerInvisible1);
        mainPanelinnerInvisible1.setLayout(mainPanelinnerInvisible1Layout);
        mainPanelinnerInvisible1Layout.setHorizontalGroup(
            mainPanelinnerInvisible1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelinnerInvisible1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelinnerInvisible1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(636, Short.MAX_VALUE))
        );
        mainPanelinnerInvisible1Layout.setVerticalGroup(
            mainPanelinnerInvisible1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelinnerInvisible1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout profilepanelcolor1Layout = new javax.swing.GroupLayout(profilepanelcolor1);
        profilepanelcolor1.setLayout(profilepanelcolor1Layout);
        profilepanelcolor1Layout.setHorizontalGroup(
            profilepanelcolor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilepanelcolor1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(fullroundbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanelinnerInvisible1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        profilepanelcolor1Layout.setVerticalGroup(
            profilepanelcolor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilepanelcolor1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(profilepanelcolor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanelinnerInvisible1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fullroundbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        dropdown2.setBackground(new java.awt.Color(36, 36, 36));
        dropdown2.setMaximumSize(new java.awt.Dimension(195, 250));
        dropdown2.setPreferredSize(new java.awt.Dimension(195, 250));

        jButton25.setForeground(new java.awt.Color(200, 200, 200));
        jButton25.setText("<html>  <p style=\"margin-left:10px\">Edit profile</p> </html> ");
        jButton25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton25.setPreferredSize(new java.awt.Dimension(177, 40));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setForeground(new java.awt.Color(200, 200, 200));
        jButton26.setText("<html>  <p style=\"margin-left:10px\">Copy link to profile </p> </html>");
        jButton26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        jButton26.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton26.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dropdown2Layout = new javax.swing.GroupLayout(dropdown2);
        dropdown2.setLayout(dropdown2Layout);
        dropdown2Layout.setHorizontalGroup(
            dropdown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dropdown2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dropdown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dropdown2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        dropdown2Layout.setVerticalGroup(
            dropdown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dropdown2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-three-dots-15.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Followers");

        fullroundbutton5.setBorder(null);
        fullroundbutton5.setText("fullroundbutton2");
        fullroundbutton5.setMaximumSize(new java.awt.Dimension(194, 194));
        fullroundbutton5.setMinimumSize(new java.awt.Dimension(100, 100));
        fullroundbutton5.setPreferredSize(new java.awt.Dimension(194, 194));

        fullroundbutton6.setBorder(null);
        fullroundbutton6.setText("fullroundbutton2");
        fullroundbutton6.setMaximumSize(new java.awt.Dimension(194, 194));
        fullroundbutton6.setMinimumSize(new java.awt.Dimension(100, 100));
        fullroundbutton6.setPreferredSize(new java.awt.Dimension(194, 194));

        fullroundbutton7.setBorder(null);
        fullroundbutton7.setText("fullroundbutton2");
        fullroundbutton7.setMaximumSize(new java.awt.Dimension(194, 194));
        fullroundbutton7.setMinimumSize(new java.awt.Dimension(100, 100));
        fullroundbutton7.setPreferredSize(new java.awt.Dimension(194, 194));

        javax.swing.GroupLayout mainPanelinnerInvisible2Layout = new javax.swing.GroupLayout(mainPanelinnerInvisible2);
        mainPanelinnerInvisible2.setLayout(mainPanelinnerInvisible2Layout);
        mainPanelinnerInvisible2Layout.setHorizontalGroup(
            mainPanelinnerInvisible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelinnerInvisible2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mainPanelinnerInvisible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelinnerInvisible2Layout.createSequentialGroup()
                        .addGroup(mainPanelinnerInvisible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(495, 495, 495))
                    .addGroup(mainPanelinnerInvisible2Layout.createSequentialGroup()
                        .addComponent(fullroundbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fullroundbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fullroundbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelinnerInvisible2Layout.setVerticalGroup(
            mainPanelinnerInvisible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelinnerInvisible2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(mainPanelinnerInvisible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullroundbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullroundbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullroundbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(dropdown2, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(mainPanelinnerInvisible2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanelinnerInvisible2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(dropdown2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(732, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanelinnerInvisible2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(dropdown2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(190, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout mainPanelinnerInvisible3Layout = new javax.swing.GroupLayout(mainPanelinnerInvisible3);
        mainPanelinnerInvisible3.setLayout(mainPanelinnerInvisible3Layout);
        mainPanelinnerInvisible3Layout.setHorizontalGroup(
            mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profilepanelcolor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane1)
        );
        mainPanelinnerInvisible3Layout.setVerticalGroup(
            mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelinnerInvisible3Layout.createSequentialGroup()
                .addComponent(profilepanelcolor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1))
        );

        mainPanelinnerInvisible4.add(mainPanelinnerInvisible3, "card2");

        javax.swing.GroupLayout mainPanelinnerInvisible5Layout = new javax.swing.GroupLayout(mainPanelinnerInvisible5);
        mainPanelinnerInvisible5.setLayout(mainPanelinnerInvisible5Layout);
        mainPanelinnerInvisible5Layout.setHorizontalGroup(
            mainPanelinnerInvisible5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(followerspanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelinnerInvisible5Layout.setVerticalGroup(
            mainPanelinnerInvisible5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(followerspanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        mainPanelinnerInvisible4.add(mainPanelinnerInvisible5, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanelinnerInvisible4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanelinnerInvisible4, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fullroundbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullroundbutton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullroundbutton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean isVisible = dropdown2.isVisible();
        dropdown2.setVisible(!isVisible);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        cardLayout.show(mainPanelinnerInvisible4, "card4");
        mainPanelinnerInvisible4.revalidate();
        mainPanelinnerInvisible4.repaint();
        System.out.println("Font button working: "); 
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        Frame owner = (Frame) SwingUtilities.getWindowAncestor(this);
        profiledetaildialog dialog;
        dialog = new profiledetaildialog(owner , true);
        dialog.setLocationRelativeTo(owner);
        dialog.setBackground(new Color(0, 0, 0, 0));
//        dialog.setOpacity(0);
        dialog.setVisible(true);
        User loggedInUser = UserSession.getInstance().getUser();
        jLabel2.setText(loggedInUser.getUsername());
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private packs.sidepanel dropdown2;
    private packs.Followerspanel followerspanel1;
    private packs.fullroundbutton fullroundbutton1;
    private packs.fullroundbutton fullroundbutton5;
    private packs.fullroundbutton fullroundbutton6;
    private packs.fullroundbutton fullroundbutton7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible1;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible2;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible3;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible4;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible5;
    private packs.profilepanelcolor profilepanelcolor1;
    // End of variables declaration//GEN-END:variables
}
