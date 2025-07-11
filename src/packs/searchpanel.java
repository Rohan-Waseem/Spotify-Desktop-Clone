/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package packs;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
//import javax.
/**
 *
 * @author HP
 */
public class searchpanel extends javax.swing.JPanel {
    CardLayout cardLayout;
    public searchpanel() {
        initComponents();
        setOpaque(false);
        
        
        var fontStyle1 = new File("src/resources/CircularSpotifyText-Medium.otf");
        var fontStyle2 = new File("src/resources/CircularSpotifyText-Bold.otf");
        System.out.println("Font file exists: " + fontStyle1.exists());  
        System.out.println("Font file exists: " + fontStyle2.exists());
         
        try { 
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(50f);
            Font font2 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(20f);
            Font font3;
            font3 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(14f);
            jLabel1.setFont(font2);
   
        }
        catch (FontFormatException | IOException e) {
        e.printStackTrace();
        }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanelinnerInvisible4 = new packs.MainPanelinnerInvisible();
        mainPanelinnerInvisible3 = new packs.MainPanelinnerInvisible();
        roundButton1 = new packs.RoundButton();
        roundButton2 = new packs.RoundButton();
        roundButton3 = new packs.RoundButton();
        roundButton4 = new packs.RoundButton();
        roundButton5 = new packs.RoundButton();
        roundButton6 = new packs.RoundButton();
        roundButton7 = new packs.RoundButton();
        roundButton8 = new packs.RoundButton();
        roundButton9 = new packs.RoundButton();
        roundButton10 = new packs.RoundButton();
        roundButton11 = new packs.RoundButton();
        roundButton12 = new packs.RoundButton();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(943, 600));

        mainPanelinnerInvisible3.setForeground(new java.awt.Color(204, 204, 204));

        roundButton1.setText("roundButton1");
        roundButton1.setPreferredSize(new java.awt.Dimension(150, 150));
        roundButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton1ActionPerformed(evt);
            }
        });

        roundButton2.setText("roundButton1");
        roundButton2.setPreferredSize(new java.awt.Dimension(150, 150));
        roundButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton2ActionPerformed(evt);
            }
        });

        roundButton3.setText("roundButton1");
        roundButton3.setPreferredSize(new java.awt.Dimension(150, 150));
        roundButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton3ActionPerformed(evt);
            }
        });

        roundButton4.setText("roundButton1");
        roundButton4.setPreferredSize(new java.awt.Dimension(150, 150));
        roundButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton4ActionPerformed(evt);
            }
        });

        roundButton5.setText("roundButton1");
        roundButton5.setPreferredSize(new java.awt.Dimension(150, 150));
        roundButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton5ActionPerformed(evt);
            }
        });

        roundButton6.setText("roundButton1");
        roundButton6.setPreferredSize(new java.awt.Dimension(150, 150));
        roundButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton6ActionPerformed(evt);
            }
        });

        roundButton7.setText("roundButton1");
        roundButton7.setPreferredSize(new java.awt.Dimension(150, 150));
        roundButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton7ActionPerformed(evt);
            }
        });

        roundButton8.setText("roundButton1");
        roundButton8.setPreferredSize(new java.awt.Dimension(150, 150));
        roundButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton8ActionPerformed(evt);
            }
        });

        roundButton9.setText("roundButton1");
        roundButton9.setPreferredSize(new java.awt.Dimension(150, 150));
        roundButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton9ActionPerformed(evt);
            }
        });

        roundButton10.setText("roundButton1");
        roundButton10.setPreferredSize(new java.awt.Dimension(150, 150));
        roundButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton10ActionPerformed(evt);
            }
        });

        roundButton11.setText("roundButton1");
        roundButton11.setPreferredSize(new java.awt.Dimension(150, 150));
        roundButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton11ActionPerformed(evt);
            }
        });

        roundButton12.setText("roundButton1");
        roundButton12.setPreferredSize(new java.awt.Dimension(150, 150));
        roundButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton12ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Browse all");

        javax.swing.GroupLayout mainPanelinnerInvisible3Layout = new javax.swing.GroupLayout(mainPanelinnerInvisible3);
        mainPanelinnerInvisible3.setLayout(mainPanelinnerInvisible3Layout);
        mainPanelinnerInvisible3Layout.setHorizontalGroup(
            mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelinnerInvisible3Layout.createSequentialGroup()
                .addGroup(mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelinnerInvisible3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelinnerInvisible3Layout.createSequentialGroup()
                                .addComponent(roundButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roundButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roundButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roundButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelinnerInvisible3Layout.createSequentialGroup()
                                .addComponent(roundButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roundButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roundButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roundButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelinnerInvisible3Layout.createSequentialGroup()
                                .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roundButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roundButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roundButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanelinnerInvisible3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(589, 589, 589)))
                .addGap(169, 169, 169))
        );
        mainPanelinnerInvisible3Layout.setVerticalGroup(
            mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelinnerInvisible3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roundButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roundButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout mainPanelinnerInvisible4Layout = new javax.swing.GroupLayout(mainPanelinnerInvisible4);
        mainPanelinnerInvisible4.setLayout(mainPanelinnerInvisible4Layout);
        mainPanelinnerInvisible4Layout.setHorizontalGroup(
            mainPanelinnerInvisible4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanelinnerInvisible3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        mainPanelinnerInvisible4Layout.setVerticalGroup(
            mainPanelinnerInvisible4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelinnerInvisible4Layout.createSequentialGroup()
                .addComponent(mainPanelinnerInvisible3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanelinnerInvisible4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanelinnerInvisible4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void roundButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton1ActionPerformed

    private void roundButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton2ActionPerformed

    private void roundButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton3ActionPerformed

    private void roundButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton4ActionPerformed

    private void roundButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton5ActionPerformed

    private void roundButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton6ActionPerformed

    private void roundButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton7ActionPerformed

    private void roundButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton8ActionPerformed

    private void roundButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton9ActionPerformed

    private void roundButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton10ActionPerformed

    private void roundButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton11ActionPerformed

    private void roundButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton12ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible3;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible4;
    private packs.RoundButton roundButton1;
    private packs.RoundButton roundButton10;
    private packs.RoundButton roundButton11;
    private packs.RoundButton roundButton12;
    private packs.RoundButton roundButton2;
    private packs.RoundButton roundButton3;
    private packs.RoundButton roundButton4;
    private packs.RoundButton roundButton5;
    private packs.RoundButton roundButton6;
    private packs.RoundButton roundButton7;
    private packs.RoundButton roundButton8;
    private packs.RoundButton roundButton9;
    // End of variables declaration//GEN-END:variables
}
