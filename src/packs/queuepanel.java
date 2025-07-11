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
public class queuepanel extends javax.swing.JPanel {
    public queuepanel() {
        initComponents();
        setOpaque(false);
        
        dropdown5.setVisible(false);  // Ensure the panel is initially hidden
        setupMouseListener();  
        
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
            jLabel2.setFont(font2);
            
            pltext9.setFont(font2);
            pltext4.setFont(font2);
            
            
   
        }
        catch (FontFormatException | IOException e) {
        e.printStackTrace();
        }
        
        
    }
    private void setupMouseListener() {
                this.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        if (!dropdown5.getBounds().contains(evt.getPoint()) && dropdown5.isVisible()) {
                            dropdown5.setVisible(false);
                        }
                    }              
                    
                });

            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanelinnerInvisible3 = new packs.MainPanelinnerInvisible();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        dropdown5 = new packs.sidepanel();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
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
        roundButton1 = new packs.RoundButton();
        jButton12 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sidepanel12 = new packs.sidepanel();
        pltext5 = new javax.swing.JLabel();
        pltext10 = new javax.swing.JLabel();
        roundButton13 = new packs.RoundButton();
        jButton13 = new javax.swing.JButton();
        sidepanel16 = new packs.sidepanel();
        pltext14 = new javax.swing.JLabel();
        pltext15 = new javax.swing.JLabel();
        roundButton17 = new packs.RoundButton();
        jButton14 = new javax.swing.JButton();
        sidepanel17 = new packs.sidepanel();
        pltext16 = new javax.swing.JLabel();
        pltext17 = new javax.swing.JLabel();
        roundButton18 = new packs.RoundButton();
        jButton15 = new javax.swing.JButton();
        sidepanel18 = new packs.sidepanel();
        pltext18 = new javax.swing.JLabel();
        pltext19 = new javax.swing.JLabel();
        roundButton19 = new packs.RoundButton();
        jButton16 = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(297, 482));

        mainPanelinnerInvisible3.setForeground(new java.awt.Color(204, 204, 204));

        dropdown5.setBackground(new java.awt.Color(36, 36, 36));
        dropdown5.setMaximumSize(new java.awt.Dimension(195, 250));
        dropdown5.setPreferredSize(new java.awt.Dimension(195, 250));

        jButton33.setForeground(new java.awt.Color(200, 200, 200));
        jButton33.setText("<html>  <p style=\"margin-left:10px\">Add to playlist</p> </html> ");
        jButton33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton33.setBorderPainted(false);
        jButton33.setContentAreaFilled(false);
        jButton33.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton33.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton34.setForeground(new java.awt.Color(200, 200, 200));
        jButton34.setText("<html>  <p style=\"margin-left:10px\">Save to your Liked Songs</p> </html> ");
        jButton34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton34.setBorderPainted(false);
        jButton34.setContentAreaFilled(false);
        jButton34.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton34.setPreferredSize(new java.awt.Dimension(0, 40));

        jButton35.setForeground(new java.awt.Color(200, 200, 200));
        jButton35.setText("<html>  <p style=\"margin-left:10px\">Add to queue</p> </html>");
        jButton35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton35.setBorderPainted(false);
        jButton35.setContentAreaFilled(false);
        jButton35.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton35.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton36.setForeground(new java.awt.Color(200, 200, 200));
        jButton36.setText("<html>  <p style=\"margin-left:10px\">Go to song radio</p> </html>   ");
        jButton36.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton36.setBorderPainted(false);
        jButton36.setContentAreaFilled(false);
        jButton36.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton36.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton36.setPreferredSize(new java.awt.Dimension(0, 40));

        jButton37.setForeground(new java.awt.Color(200, 200, 200));
        jButton37.setText("<html>  <p style=\"margin-left:10px\"> Go to artist</p> </html> ");
        jButton37.setActionCommand("     Settings");
        jButton37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton37.setBorderPainted(false);
        jButton37.setContentAreaFilled(false);
        jButton37.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton37.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton37.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setPreferredSize(new java.awt.Dimension(49, 3));
        jSeparator3.setRequestFocusEnabled(false);

        jButton38.setForeground(new java.awt.Color(200, 200, 200));
        jButton38.setText("<html>      <p style=\"margin-left:10px\">Share</p> </html>");
        jButton38.setActionCommand("<html>\n<br style=\"color:#ffff\">     \n <p>    Log out</p>\n</html>");
        jButton38.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton38.setBorderPainted(false);
        jButton38.setContentAreaFilled(false);
        jButton38.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton38.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton38.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton39.setForeground(new java.awt.Color(200, 200, 200));
        jButton39.setText("<html>  <p style=\"margin-left:10px\"> View credits</p> </html> ");
        jButton39.setActionCommand("     Settings");
        jButton39.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton39.setBorderPainted(false);
        jButton39.setContentAreaFilled(false);
        jButton39.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton39.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton39.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setPreferredSize(new java.awt.Dimension(49, 3));
        jSeparator4.setRequestFocusEnabled(false);

        javax.swing.GroupLayout dropdown5Layout = new javax.swing.GroupLayout(dropdown5);
        dropdown5.setLayout(dropdown5Layout);
        dropdown5Layout.setHorizontalGroup(
            dropdown5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dropdown5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dropdown5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dropdown5Layout.createSequentialGroup()
                        .addGroup(dropdown5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jButton34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dropdown5Layout.createSequentialGroup()
                        .addGroup(dropdown5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        dropdown5Layout.setVerticalGroup(
            dropdown5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dropdown5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
        jLabel7.setText("Queue");

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Recently played");

        javax.swing.GroupLayout mainpaneltop1Layout = new javax.swing.GroupLayout(mainpaneltop1);
        mainpaneltop1.setLayout(mainpaneltop1Layout);
        mainpaneltop1Layout.setHorizontalGroup(
            mainpaneltop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpaneltop1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
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
        jLabel13.setText("Now Playing");

        sidepanel11.setBackground(new java.awt.Color(36, 36, 36));
        sidepanel11.setMaximumSize(new java.awt.Dimension(364, 130));
        sidepanel11.setPreferredSize(new java.awt.Dimension(364, 130));

        pltext4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext4.setForeground(new java.awt.Color(153, 153, 153));
        pltext4.setText("Artist Name");

        pltext9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext9.setForeground(new java.awt.Color(255, 255, 255));
        pltext9.setText("Song Name");

        roundButton1.setBorder(null);
        roundButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/september MOOD.jpeg"))); // NOI18N
        roundButton1.setPreferredSize(new java.awt.Dimension(260, 260));
        roundButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton1ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-three-dots-15.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepanel11Layout = new javax.swing.GroupLayout(sidepanel11);
        sidepanel11.setLayout(sidepanel11Layout);
        sidepanel11Layout.setHorizontalGroup(
            sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanel11Layout.createSequentialGroup()
                        .addComponent(pltext4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidepanel11Layout.createSequentialGroup()
                        .addComponent(pltext9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12)
                        .addGap(20, 20, 20))))
        );
        sidepanel11Layout.setVerticalGroup(
            sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel11Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton12)
                    .addGroup(sidepanel11Layout.createSequentialGroup()
                        .addComponent(pltext9)
                        .addGap(1, 1, 1)
                        .addComponent(pltext4))
                    .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Next from:");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Album name");

        sidepanel12.setBackground(new java.awt.Color(36, 36, 36));
        sidepanel12.setMaximumSize(new java.awt.Dimension(364, 130));
        sidepanel12.setPreferredSize(new java.awt.Dimension(364, 130));

        pltext5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext5.setForeground(new java.awt.Color(153, 153, 153));
        pltext5.setText("Artist Name");

        pltext10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext10.setForeground(new java.awt.Color(255, 255, 255));
        pltext10.setText("Song Name");

        roundButton13.setBorder(null);
        roundButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/september MOOD.jpeg"))); // NOI18N
        roundButton13.setPreferredSize(new java.awt.Dimension(260, 260));
        roundButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton13ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-three-dots-15.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepanel12Layout = new javax.swing.GroupLayout(sidepanel12);
        sidepanel12.setLayout(sidepanel12Layout);
        sidepanel12Layout.setHorizontalGroup(
            sidepanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidepanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanel12Layout.createSequentialGroup()
                        .addComponent(pltext10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidepanel12Layout.createSequentialGroup()
                        .addComponent(pltext5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13)
                        .addGap(20, 20, 20))))
        );
        sidepanel12Layout.setVerticalGroup(
            sidepanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel12Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(sidepanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(roundButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidepanel12Layout.createSequentialGroup()
                        .addComponent(pltext10)
                        .addGap(3, 3, 3)
                        .addComponent(pltext5))
                    .addComponent(jButton13))
                .addContainerGap())
        );

        sidepanel16.setBackground(new java.awt.Color(36, 36, 36));
        sidepanel16.setMaximumSize(new java.awt.Dimension(364, 130));
        sidepanel16.setPreferredSize(new java.awt.Dimension(364, 130));

        pltext14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext14.setForeground(new java.awt.Color(153, 153, 153));
        pltext14.setText("Artist Name");

        pltext15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext15.setForeground(new java.awt.Color(255, 255, 255));
        pltext15.setText("Song Name");

        roundButton17.setBorder(null);
        roundButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/september MOOD.jpeg"))); // NOI18N
        roundButton17.setPreferredSize(new java.awt.Dimension(260, 260));
        roundButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton17ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-three-dots-15.png"))); // NOI18N
        jButton14.setBorder(null);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepanel16Layout = new javax.swing.GroupLayout(sidepanel16);
        sidepanel16.setLayout(sidepanel16Layout);
        sidepanel16Layout.setHorizontalGroup(
            sidepanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidepanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanel16Layout.createSequentialGroup()
                        .addComponent(pltext15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidepanel16Layout.createSequentialGroup()
                        .addComponent(pltext14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14)
                        .addGap(20, 20, 20))))
        );
        sidepanel16Layout.setVerticalGroup(
            sidepanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel16Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(sidepanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(roundButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidepanel16Layout.createSequentialGroup()
                        .addComponent(pltext15)
                        .addGap(3, 3, 3)
                        .addComponent(pltext14))
                    .addComponent(jButton14))
                .addContainerGap())
        );

        sidepanel17.setBackground(new java.awt.Color(36, 36, 36));
        sidepanel17.setMaximumSize(new java.awt.Dimension(364, 130));
        sidepanel17.setPreferredSize(new java.awt.Dimension(364, 130));

        pltext16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext16.setForeground(new java.awt.Color(153, 153, 153));
        pltext16.setText("Artist Name");

        pltext17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext17.setForeground(new java.awt.Color(255, 255, 255));
        pltext17.setText("Song Name");

        roundButton18.setBorder(null);
        roundButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/september MOOD.jpeg"))); // NOI18N
        roundButton18.setPreferredSize(new java.awt.Dimension(260, 260));
        roundButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton18ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-three-dots-15.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setContentAreaFilled(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepanel17Layout = new javax.swing.GroupLayout(sidepanel17);
        sidepanel17.setLayout(sidepanel17Layout);
        sidepanel17Layout.setHorizontalGroup(
            sidepanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidepanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanel17Layout.createSequentialGroup()
                        .addComponent(pltext17)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidepanel17Layout.createSequentialGroup()
                        .addComponent(pltext16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton15)
                        .addGap(20, 20, 20))))
        );
        sidepanel17Layout.setVerticalGroup(
            sidepanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel17Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(sidepanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(roundButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidepanel17Layout.createSequentialGroup()
                        .addComponent(pltext17)
                        .addGap(3, 3, 3)
                        .addComponent(pltext16))
                    .addComponent(jButton15))
                .addContainerGap())
        );

        sidepanel18.setBackground(new java.awt.Color(36, 36, 36));
        sidepanel18.setMaximumSize(new java.awt.Dimension(364, 130));
        sidepanel18.setPreferredSize(new java.awt.Dimension(364, 130));

        pltext18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext18.setForeground(new java.awt.Color(153, 153, 153));
        pltext18.setText("Artist Name");

        pltext19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext19.setForeground(new java.awt.Color(255, 255, 255));
        pltext19.setText("Song Name");

        roundButton19.setBorder(null);
        roundButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/september MOOD.jpeg"))); // NOI18N
        roundButton19.setPreferredSize(new java.awt.Dimension(260, 260));
        roundButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton19ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-three-dots-15.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepanel18Layout = new javax.swing.GroupLayout(sidepanel18);
        sidepanel18.setLayout(sidepanel18Layout);
        sidepanel18Layout.setHorizontalGroup(
            sidepanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidepanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanel18Layout.createSequentialGroup()
                        .addComponent(pltext19)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidepanel18Layout.createSequentialGroup()
                        .addComponent(pltext18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton16)
                        .addGap(20, 20, 20))))
        );
        sidepanel18Layout.setVerticalGroup(
            sidepanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel18Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(sidepanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(roundButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidepanel18Layout.createSequentialGroup()
                        .addComponent(pltext19)
                        .addGap(3, 3, 3)
                        .addComponent(pltext18))
                    .addComponent(jButton16))
                .addContainerGap())
        );

        javax.swing.GroupLayout mainpanelsidescroll1Layout = new javax.swing.GroupLayout(mainpanelsidescroll1);
        mainpanelsidescroll1.setLayout(mainpanelsidescroll1Layout);
        mainpanelsidescroll1Layout.setHorizontalGroup(
            mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelsidescroll1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidepanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(sidepanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(sidepanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(sidepanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(sidepanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addGroup(mainpanelsidescroll1Layout.createSequentialGroup()
                        .addGroup(mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainpanelsidescroll1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(mainpanelsidescroll1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(64, 64, 64)))
                        .addGap(155, 155, 155)))
                .addContainerGap())
        );
        mainpanelsidescroll1Layout.setVerticalGroup(
            mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelsidescroll1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidepanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(sidepanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sidepanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sidepanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sidepanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1475, 1475, 1475))
        );

        jScrollPane1.setViewportView(mainpanelsidescroll1);

        jLayeredPane2.setLayer(dropdown5, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane2.setLayer(mainpaneltop1, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainpaneltop1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                .addGap(0, 0, 0))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap(64, Short.MAX_VALUE)
                    .addComponent(dropdown5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainpaneltop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap(166, Short.MAX_VALUE)
                    .addComponent(dropdown5, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout mainPanelinnerInvisible3Layout = new javax.swing.GroupLayout(mainPanelinnerInvisible3);
        mainPanelinnerInvisible3.setLayout(mainPanelinnerInvisible3Layout);
        mainPanelinnerInvisible3Layout.setHorizontalGroup(
            mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
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

    private void roundButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        boolean isVisible = dropdown5.isVisible();
         dropdown5.setVisible(!isVisible);  
    }//GEN-LAST:event_jButton12ActionPerformed

    private void roundButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton13ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void roundButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton17ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void roundButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton18ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void roundButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton19ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed

    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private packs.sidepanel dropdown5;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible3;
    private packs.Mainpanelsidescroll mainpanelsidescroll1;
    private packs.Mainpaneltop mainpaneltop1;
    private javax.swing.JLabel pltext10;
    private javax.swing.JLabel pltext14;
    private javax.swing.JLabel pltext15;
    private javax.swing.JLabel pltext16;
    private javax.swing.JLabel pltext17;
    private javax.swing.JLabel pltext18;
    private javax.swing.JLabel pltext19;
    private javax.swing.JLabel pltext4;
    private javax.swing.JLabel pltext5;
    private javax.swing.JLabel pltext9;
    private packs.RoundButton roundButton1;
    private packs.RoundButton roundButton13;
    private packs.RoundButton roundButton17;
    private packs.RoundButton roundButton18;
    private packs.RoundButton roundButton19;
    private packs.RoundButton roundButton2;
    private packs.sidepanel sidepanel11;
    private packs.sidepanel sidepanel12;
    private packs.sidepanel sidepanel16;
    private packs.sidepanel sidepanel17;
    private packs.sidepanel sidepanel18;
    // End of variables declaration//GEN-END:variables
}
