/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package packs;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class Followerspanel extends javax.swing.JPanel {

   
    public Followerspanel() {
        initComponents();
        var fontStyle1 = new File("src/resources/CircularSpotifyText-Medium.otf");
        var fontStyle2 = new File("src/resources/CircularSpotifyText-Bold.otf");
        System.out.println("Font file exists: " + fontStyle1.exists());  
        System.out.println("Font file exists: " + fontStyle2.exists());
         
        try { 
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(35f);
//            Font font2 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(20f);
//            Font font3;
//            font3 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(14f);

            jLabel4.setFont(font1);


        }
        catch (FontFormatException | IOException e) {
        e.printStackTrace();
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanelinnerInvisible2 = new packs.MainPanelinnerInvisible();
        jLabel4 = new javax.swing.JLabel();
        fullroundbutton5 = new packs.fullroundbutton();
        fullroundbutton6 = new packs.fullroundbutton();
        fullroundbutton7 = new packs.fullroundbutton();

        setOpaque(false);

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Followers");

        fullroundbutton5.setBorder(null);
        fullroundbutton5.setText("fullroundbutton2");
        fullroundbutton5.setMaximumSize(new java.awt.Dimension(194, 194));
        fullroundbutton5.setMinimumSize(new java.awt.Dimension(100, 100));
        fullroundbutton5.setPreferredSize(new java.awt.Dimension(194, 194));
        fullroundbutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullroundbutton5ActionPerformed(evt);
            }
        });

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
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelinnerInvisible2Layout.createSequentialGroup()
                        .addComponent(fullroundbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fullroundbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fullroundbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        mainPanelinnerInvisible2Layout.setVerticalGroup(
            mainPanelinnerInvisible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelinnerInvisible2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(mainPanelinnerInvisible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullroundbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullroundbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullroundbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanelinnerInvisible2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanelinnerInvisible2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fullroundbutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullroundbutton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullroundbutton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private packs.fullroundbutton fullroundbutton5;
    private packs.fullroundbutton fullroundbutton6;
    private packs.fullroundbutton fullroundbutton7;
    private javax.swing.JLabel jLabel4;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible2;
    // End of variables declaration//GEN-END:variables
}
