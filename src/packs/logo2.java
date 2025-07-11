/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package packs;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;


public class logo2 extends javax.swing.JPanel {

    public logo2() {
        initComponents();
        File fontStyle = new File("src/resources/CircularSpotifyText-Bold.otf");
        System.out.println("Font file exists: " + fontStyle.exists());
        
           try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(24f);
            jLabellogo.setFont(font);
        }
        catch (FontFormatException | IOException e) {
        e.printStackTrace();
        }
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabellogo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(18, 18, 18));

        jLabellogo.setBackground(new java.awt.Color(18, 18, 18));
        jLabellogo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabellogo.setForeground(new java.awt.Color(255, 255, 255));
        jLabellogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabellogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-spotify-50.png"))); // NOI18N
        jLabellogo.setLabelFor(jLabellogo);
        jLabellogo.setText("Spotify");
        jLabellogo.setToolTipText("");
        jLabellogo.setAutoscrolls(true);
        jLabellogo.setDoubleBuffered(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabellogo, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabellogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabellogo;
    // End of variables declaration//GEN-END:variables
}
