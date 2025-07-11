/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package packs;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class topbar extends javax.swing.JPanel {


    public topbar() {
        initComponents();
        init();
     
    }
    private void init() {
         setBackground(new Color(0, 0, 0, 0)); 
        
        

    }
    
   ImageIcon normalIcon = new ImageIcon(getClass().getResource("/images/close.png"));
   ImageIcon rolloverIcon = new ImageIcon(getClass().getResource("/images/close1.png"));
   
   ImageIcon normalIcon1 = new ImageIcon(getClass().getResource("/images/minimize.png"));
   ImageIcon rolloverIcon1 = new ImageIcon(getClass().getResource("/images/minimize1.png"));
   
   ImageIcon normalIcon2 = new ImageIcon(getClass().getResource("/images/maxbutton.png"));
   ImageIcon rolloverIcon2 = new ImageIcon(getClass().getResource("/images/maxbutton1.png"));

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidepanel1 = new packs.sidepanel();
        closebutton = new javax.swing.JButton();
        minimizebutton = new javax.swing.JButton();
        maximize = new javax.swing.JButton();
        optionsbutton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(32767, 40));

        sidepanel1.setBackground(new java.awt.Color(0, 0, 0));
        sidepanel1.setMaximumSize(new java.awt.Dimension(32767, 40));

        closebutton.setBackground(new java.awt.Color(0, 0, 0));
        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        closebutton.setBorder(null);
        closebutton.setContentAreaFilled(false);
        closebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closebuttonMouseExited(evt);
            }
        });
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });

        minimizebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize.png"))); // NOI18N
        minimizebutton.setBorder(null);
        minimizebutton.setContentAreaFilled(false);
        minimizebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizebuttonMouseExited(evt);
            }
        });
        minimizebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizebuttonActionPerformed(evt);
            }
        });

        maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maxbutton.png"))); // NOI18N
        maximize.setBorder(null);
        maximize.setContentAreaFilled(false);
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maximizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maximizeMouseExited(evt);
            }
        });
        maximize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximizeActionPerformed(evt);
            }
        });

        optionsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/options.png"))); // NOI18N
        optionsbutton.setContentAreaFilled(false);
        optionsbutton.setMaximumSize(new java.awt.Dimension(40, 40));
        optionsbutton.setMinimumSize(new java.awt.Dimension(40, 40));
        optionsbutton.setName(""); // NOI18N
        optionsbutton.setPreferredSize(new java.awt.Dimension(40, 40));
        optionsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepanel1Layout = new javax.swing.GroupLayout(sidepanel1);
        sidepanel1.setLayout(sidepanel1Layout);
        sidepanel1Layout.setHorizontalGroup(
            sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(optionsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 881, Short.MAX_VALUE)
                .addComponent(minimizebutton)
                .addGap(0, 0, 0)
                .addComponent(maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(closebutton)
                .addGap(1, 1, 1))
        );
        sidepanel1Layout.setVerticalGroup(
            sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidepanel1Layout.createSequentialGroup()
                .addGroup(sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(minimizebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optionsbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidepanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        
        System.exit(0); 
    }//GEN-LAST:event_closebuttonActionPerformed

    private void closebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMouseEntered
        // TODO add your handling code here:
       closebutton.setRolloverIcon(rolloverIcon);
    }//GEN-LAST:event_closebuttonMouseEntered

    private void closebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMouseExited
       
        closebutton.setIcon(normalIcon);
    }//GEN-LAST:event_closebuttonMouseExited

    private void minimizebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizebuttonActionPerformed
        
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (parentFrame != null) {
            parentFrame.setExtendedState(parentFrame.getExtendedState() | JFrame.ICONIFIED);
        }
    }//GEN-LAST:event_minimizebuttonActionPerformed

    private void minimizebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizebuttonMouseEntered
        // TODO add your handling code here:
        minimizebutton.setRolloverIcon(rolloverIcon1);
    }//GEN-LAST:event_minimizebuttonMouseEntered

    private void minimizebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizebuttonMouseExited
        
        minimizebutton.setIcon(normalIcon1);
    }//GEN-LAST:event_minimizebuttonMouseExited

    private void maximizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximizeActionPerformed
       JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
       if ( parentFrame.getExtendedState()!=  JFrame.MAXIMIZED_BOTH) {
             parentFrame.setExtendedState( JFrame.MAXIMIZED_BOTH);       
        }else{     
         parentFrame.setExtendedState( JFrame.NORMAL);
      
        }
    }//GEN-LAST:event_maximizeActionPerformed

    private void maximizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseEntered
       
       maximize.setRolloverIcon(rolloverIcon2);
    }//GEN-LAST:event_maximizeMouseEntered

    private void maximizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseExited
       
         maximize.setIcon(normalIcon2);
    }//GEN-LAST:event_maximizeMouseExited

    private void optionsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionsbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebutton;
    private javax.swing.JButton maximize;
    private javax.swing.JButton minimizebutton;
    private javax.swing.JButton optionsbutton;
    private packs.sidepanel sidepanel1;
    // End of variables declaration//GEN-END:variables

}
