/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package packs;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import screen1.screen2;
//import javax.
/**
 *
 * @author HP
 */
public class friendsactivitypanel extends javax.swing.JPanel {
    public friendsactivitypanel() {
        initComponents();
        setOpaque(false);
        
        var fontStyle1 = new File("src/resources/CircularSpotifyText-Medium.otf");
        var fontStyle2 = new File("src/resources/CircularSpotifyText-Bold.otf");
        System.out.println("Font file exists: " + fontStyle1.exists());  
        System.out.println("Font file exists: " + fontStyle2.exists());
         
        try { 
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(50f);
            Font font2 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(16f);
            Font font3;
            font3 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(14f);
            jLabel7.setFont(font3);
            jLabel8.setFont(font3);
            
            jLabel13.setFont(font2);
            jLabel14.setFont(font2);
            roundButton1.setFont(font2);
            
            pltext9.setFont(font2);
            pltext4.setFont(font2);
            
            
   
        }
        catch (FontFormatException | IOException e) {
        e.printStackTrace();
        }
}
        
    
//    private void setupMouseListener() {
//                this.addMouseListener(new java.awt.event.MouseAdapter() {
//                    public void mouseClicked(java.awt.event.MouseEvent evt) {
//                        if (!dropdown5.getBounds().contains(evt.getPoint()) && dropdown5.isVisible()) {
//                            dropdown5.setVisible(false);
//                        }
//                    }              
//                    
//                });

//            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanelinnerInvisible3 = new packs.MainPanelinnerInvisible();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        mainpaneltop1 = new packs.Mainpaneltop();
        roundButton2 = new packs.RoundButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainpanelsidescroll1 = new packs.Mainpanelsidescroll();
        jLabel13 = new javax.swing.JLabel();
        sidepanel11 = new packs.sidepanel();
        pltext4 = new javax.swing.JLabel();
        pltext9 = new javax.swing.JLabel();
        fullroundbutton1 = new packs.fullroundbutton();
        jLabel14 = new javax.swing.JLabel();
        sidepanel13 = new packs.sidepanel();
        pltext6 = new javax.swing.JLabel();
        pltext11 = new javax.swing.JLabel();
        fullroundbutton2 = new packs.fullroundbutton();
        sidepanel14 = new packs.sidepanel();
        pltext7 = new javax.swing.JLabel();
        pltext12 = new javax.swing.JLabel();
        fullroundbutton3 = new packs.fullroundbutton();
        roundButton1 = new packs.RoundButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(297, 482));

        mainPanelinnerInvisible3.setForeground(new java.awt.Color(204, 204, 204));

        mainpaneltop1.setFocusCycleRoot(true);
        mainpaneltop1.setPreferredSize(new java.awt.Dimension(47, 53));

        roundButton2.setBackground(new java.awt.Color(18, 18, 18));
        roundButton2.setBorder(null);
        roundButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-15.png"))); // NOI18N
        roundButton2.setAutoscrolls(true);
        roundButton2.setPreferredSize(new java.awt.Dimension(30, 30));
        roundButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton2ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Friends Activity");

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Add friends");

        javax.swing.GroupLayout mainpaneltop1Layout = new javax.swing.GroupLayout(mainpaneltop1);
        mainpaneltop1.setLayout(mainpaneltop1Layout);
        mainpaneltop1Layout.setHorizontalGroup(
            mainpaneltop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpaneltop1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(roundButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        mainpaneltop1Layout.setVerticalGroup(
            mainpaneltop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpaneltop1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(mainpaneltop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(roundButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 0, 0))
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        mainpanelsidescroll1.setBackground(new java.awt.Color(18, 18, 18));

        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("<html>Let's friends and followers on Spotify see what you're listening too.</html>");

        sidepanel11.setBackground(new java.awt.Color(36, 36, 36));
        sidepanel11.setMaximumSize(new java.awt.Dimension(364, 130));
        sidepanel11.setPreferredSize(new java.awt.Dimension(364, 130));

        pltext4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext4.setForeground(new java.awt.Color(153, 153, 153));
        pltext4.setText("Friends Name");

        pltext9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext9.setForeground(new java.awt.Color(255, 255, 255));
        pltext9.setText("Info");

        fullroundbutton1.setText("fullroundbutton1");
        fullroundbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullroundbutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepanel11Layout = new javax.swing.GroupLayout(sidepanel11);
        sidepanel11.setLayout(sidepanel11Layout);
        sidepanel11Layout.setHorizontalGroup(
            sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanel11Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(fullroundbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pltext4)
                    .addComponent(pltext9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidepanel11Layout.setVerticalGroup(
            sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(fullroundbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidepanel11Layout.createSequentialGroup()
                        .addComponent(pltext4)
                        .addGap(0, 0, 0)
                        .addComponent(pltext9)))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("<html>Go to Settings > Social and enable 'Share my listening activity on Spotify'. You can turn this off at any time</html>");

        sidepanel13.setBackground(new java.awt.Color(36, 36, 36));
        sidepanel13.setMaximumSize(new java.awt.Dimension(364, 130));
        sidepanel13.setPreferredSize(new java.awt.Dimension(364, 130));

        pltext6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext6.setForeground(new java.awt.Color(153, 153, 153));
        pltext6.setText("Friends Name");

        pltext11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext11.setForeground(new java.awt.Color(255, 255, 255));
        pltext11.setText("Info");

        fullroundbutton2.setText("fullroundbutton1");
        fullroundbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullroundbutton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepanel13Layout = new javax.swing.GroupLayout(sidepanel13);
        sidepanel13.setLayout(sidepanel13Layout);
        sidepanel13Layout.setHorizontalGroup(
            sidepanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanel13Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(fullroundbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(sidepanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pltext6)
                    .addComponent(pltext11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidepanel13Layout.setVerticalGroup(
            sidepanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidepanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(fullroundbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidepanel13Layout.createSequentialGroup()
                        .addComponent(pltext6)
                        .addGap(0, 0, 0)
                        .addComponent(pltext11)))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        sidepanel14.setBackground(new java.awt.Color(36, 36, 36));
        sidepanel14.setMaximumSize(new java.awt.Dimension(364, 130));
        sidepanel14.setPreferredSize(new java.awt.Dimension(364, 130));

        pltext7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext7.setForeground(new java.awt.Color(153, 153, 153));
        pltext7.setText("Friends Name");

        pltext12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext12.setForeground(new java.awt.Color(255, 255, 255));
        pltext12.setText("Info");

        fullroundbutton3.setText("fullroundbutton1");
        fullroundbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullroundbutton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepanel14Layout = new javax.swing.GroupLayout(sidepanel14);
        sidepanel14.setLayout(sidepanel14Layout);
        sidepanel14Layout.setHorizontalGroup(
            sidepanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanel14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(fullroundbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(sidepanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pltext7)
                    .addComponent(pltext12))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        sidepanel14Layout.setVerticalGroup(
            sidepanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidepanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(fullroundbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidepanel14Layout.createSequentialGroup()
                        .addComponent(pltext7)
                        .addGap(0, 0, 0)
                        .addComponent(pltext12)))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        roundButton1.setBackground(new java.awt.Color(204, 204, 204));
        roundButton1.setBorder(null);
        roundButton1.setForeground(new java.awt.Color(0, 0, 0));
        roundButton1.setText("Settings");
        roundButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainpanelsidescroll1Layout = new javax.swing.GroupLayout(mainpanelsidescroll1);
        mainpanelsidescroll1.setLayout(mainpanelsidescroll1Layout);
        mainpanelsidescroll1Layout.setHorizontalGroup(
            mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelsidescroll1Layout.createSequentialGroup()
                .addGroup(mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelsidescroll1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sidepanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addComponent(sidepanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addComponent(sidepanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(mainpanelsidescroll1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(496, Short.MAX_VALUE))
        );
        mainpanelsidescroll1Layout.setVerticalGroup(
            mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelsidescroll1Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidepanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidepanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidepanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1776, 1776, 1776))
        );

        jScrollPane1.setViewportView(mainpanelsidescroll1);

        jLayeredPane2.setLayer(mainpaneltop1, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainpaneltop1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainpaneltop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelinnerInvisible3Layout = new javax.swing.GroupLayout(mainPanelinnerInvisible3);
        mainPanelinnerInvisible3.setLayout(mainPanelinnerInvisible3Layout);
        mainPanelinnerInvisible3Layout.setHorizontalGroup(
            mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane2))
        );
        mainPanelinnerInvisible3Layout.setVerticalGroup(
            mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelinnerInvisible3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane2)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainPanelinnerInvisible3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainPanelinnerInvisible3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void roundButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton2ActionPerformed
    Window window = SwingUtilities.getWindowAncestor(this);
    if (window instanceof screen2) {  // Check if the ancestor is indeed MainFrame
        screen2 owner = (screen2) window;
        JPanel mainPanel1 = owner.getMainPanel1();  // Access mainPanel1 via getter
        if (mainPanel1 != null) {
            boolean isVisible = mainPanel1.isVisible();  // Check current visibility
            mainPanel1.setVisible(!isVisible);  // Toggle visibility
        } else {
            System.err.println("Failed to access mainPanel1: It is null.");
        }
    } else {
        System.err.println("Ancestor window is not an instance of MainFrame, found: " + window.getClass().getSimpleName());
    }        
        
        
        
//        profiledetaildialog dialog;
//        dialog = new profiledetaildialog(owner , true);
//        dialog.setLocationRelativeTo(owner);
//        dialog.setBackground(new Color(0, 0, 0, 0));
////        dialog.setOpacity(0);
//        dialog.setVisible(true);
    }//GEN-LAST:event_roundButton2ActionPerformed

    private void fullroundbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullroundbutton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullroundbutton1ActionPerformed

    private void fullroundbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullroundbutton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullroundbutton2ActionPerformed

    private void fullroundbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullroundbutton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullroundbutton3ActionPerformed

    private void roundButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton1ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private packs.fullroundbutton fullroundbutton1;
    private packs.fullroundbutton fullroundbutton2;
    private packs.fullroundbutton fullroundbutton3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible3;
    private packs.Mainpanelsidescroll mainpanelsidescroll1;
    private packs.Mainpaneltop mainpaneltop1;
    private javax.swing.JLabel pltext11;
    private javax.swing.JLabel pltext12;
    private javax.swing.JLabel pltext4;
    private javax.swing.JLabel pltext6;
    private javax.swing.JLabel pltext7;
    private javax.swing.JLabel pltext9;
    private packs.RoundButton roundButton1;
    private packs.RoundButton roundButton2;
    private packs.sidepanel sidepanel11;
    private packs.sidepanel sidepanel13;
    private packs.sidepanel sidepanel14;
    // End of variables declaration//GEN-END:variables
}
