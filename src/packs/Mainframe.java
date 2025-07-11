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
import javafx.util.Duration;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import listener.SongChangeListener;
import screen1.screen2;


public class Mainframe extends javax.swing.JPanel implements SongChangeListener {
    
    CardLayout cardLayout;
    CardLayout cardLayout1;
    private songspanel songspanel1; 
    private SongChangeListener songChangeListener;
    public Mainframe() {
        songspanel1 = new songspanel();
        initComponents();
        cardLayout = (CardLayout)(Cardspanel.getLayout());   
        songspanel1.setSongChangeListener(this);
        
        dropdown3.setVisible(false);  // Ensure the panel is initially hidden
        setupMouseListener();  
 
        File fontStyle1 = new File("src/resources/CircularSpotifyText-Medium.otf");
        System.out.println("Font file exists: " + fontStyle1.exists());      
     try { 
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(24f);
            Font font2 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(17f);
            Font font3;
            font3 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(14f);
            
            jButton24.setFont(font3);
            jButton25.setFont(font3);
            jButton26.setFont(font3);
            jButton27.setFont(font3);
            jButton28.setFont(font3);
            jButton29.setFont(font3);
//            
//            jLabel25.setFont(font3);
//            jLabel26.setFont(font3);
//            jLabel33.setFont(font1);           
//            jLabel34.setFont(font3);
////            
//            jLabel3.setFont(font3);
//            jLabel17.setFont(font3);
//            jLabel14.setFont(font3);
////            jLabel11.setFont(font3);
//            
//            jLabel4.setFont(font1);
//            jLabel5.setFont(font3);
            
        }
        catch (FontFormatException | IOException e) {
        e.printStackTrace();
        }
        
    }

    private void setupMouseListener() {
                this.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        if (!dropdown3.getBounds().contains(evt.getPoint()) && dropdown3.isVisible()) {
                            dropdown3.setVisible(false);
                        }
                    }
                });}
    
    public void onSongChange(String songName, String artistName, Duration totalDuration) {
        // Update the JFrame with the new song info
        Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof JFrame) {
            JFrame frame = (JFrame) window;
            // Assuming you have JLabel songNameLabel and artistNameLabel in your JFrame
            ((screen2) frame).updateSongInfo(songName, artistName, totalDuration);
        }
    }
    public void onPlaybackStateChanged(boolean isPlaying) {
        Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof JFrame) {
            JFrame frame = (JFrame) window;
            ((screen2) frame).updatePlayPauseButton(isPlaying);
        }
    }
    public void togglePlayback() {
        songspanel1.togglePlayback();
    }
    public void setVolume(double volume) {
        songspanel1.setVolume(volume);
    }
     public void toggleMute() {
        songspanel1.toggleMute();
    }
    public void playNextSong() {
        songspanel1.playNextSong();
    }
    public void playPreviousSong() {
        songspanel1.playPreviousSong();
    }
    public void seek(Duration duration) {
        songspanel1.seek(duration);
    }

    public Duration getCurrentTime() {
        return songspanel1.getCurrentTime();
    }

    public Duration getTotalDuration() {
        return songspanel1.getTotalDuration();
    }

    public boolean isPlaying() {
        return songspanel1.isPlaying();
    }
     public void stopMediaPlayer() {
        songspanel1.stopMediaPlayer();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollbar2 = new tablefiles.ScrollBar();
        mainPanel2 = new packs.MainPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        dropdown3 = new packs.sidepanel();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton29 = new javax.swing.JButton();
        mainpaneltop3 = new packs.Mainpaneltop();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        Cardspanel = new packs.MainPanel2();
        mainpanelinner1 = new packs.mainpanelinner();
        mainpanelinner21 = new packs.mainpanelinner2();
        searchpanel1 = new packs.searchpanel();
        notispanel1 = new packs.notispanel();

        scrollbar2.setBackground(new java.awt.Color(153, 153, 153));
        scrollbar2.setForeground(new java.awt.Color(102, 102, 102));
        scrollbar2.setPreferredSize(new java.awt.Dimension(16, 478));

        setOpaque(false);

        dropdown3.setBackground(new java.awt.Color(36, 36, 36));
        dropdown3.setMaximumSize(new java.awt.Dimension(195, 250));
        dropdown3.setPreferredSize(new java.awt.Dimension(195, 250));

        jButton24.setForeground(new java.awt.Color(200, 200, 200));
        jButton24.setText("<html>\n <p style=\"margin-left:10px\">Account</p>\n</html> ");
        jButton24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton24.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setForeground(new java.awt.Color(200, 200, 200));
        jButton25.setText("<html>\n <p style=\"margin-left:10px\">Profile</p>\n</html> ");
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
        jButton26.setText("<html>\n <p style=\"margin-left:10px\">Upgrade to Premium</p>\n</html>");
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

        jButton27.setForeground(new java.awt.Color(200, 200, 200));
        jButton27.setText("<html>\n <p style=\"margin-left:10px\">Private session</p>\n</html>   ");
        jButton27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);
        jButton27.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton27.setPreferredSize(new java.awt.Dimension(0, 40));

        jButton28.setForeground(new java.awt.Color(200, 200, 200));
        jButton28.setText("<html>  <p style=\"margin-left:10px\"> Settings</p> </html> ");
        jButton28.setActionCommand("     Settings");
        jButton28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton28.setBorderPainted(false);
        jButton28.setContentAreaFilled(false);
        jButton28.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton28.setPreferredSize(new java.awt.Dimension(0, 40));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setPreferredSize(new java.awt.Dimension(49, 3));
        jSeparator1.setRequestFocusEnabled(false);

        jButton29.setForeground(new java.awt.Color(200, 200, 200));
        jButton29.setText("<html>    \n <p style=\"margin-left:10px\">Log out</p>\n</html>");
        jButton29.setActionCommand("<html>\n<br style=\"color:#ffff\">     \n <p>    Log out</p>\n</html>");
        jButton29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton29.setBorderPainted(false);
        jButton29.setContentAreaFilled(false);
        jButton29.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton29.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dropdown3Layout = new javax.swing.GroupLayout(dropdown3);
        dropdown3.setLayout(dropdown3Layout);
        dropdown3Layout.setHorizontalGroup(
            dropdown3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dropdown3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dropdown3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dropdown3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(dropdown3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        dropdown3Layout.setVerticalGroup(
            dropdown3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dropdown3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainpaneltop3.setPreferredSize(new java.awt.Dimension(406, 53));

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bw (2).png"))); // NOI18N
        jToggleButton7.setContentAreaFilled(false);
        jToggleButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fw (2).png"))); // NOI18N
        jToggleButton8.setAutoscrolls(true);
        jToggleButton8.setContentAreaFilled(false);
        jToggleButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/premium.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notis.png"))); // NOI18N
        jToggleButton9.setAutoscrolls(true);
        jToggleButton9.setContentAreaFilled(false);
        jToggleButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/social.png"))); // NOI18N
        jToggleButton10.setAutoscrolls(true);
        jToggleButton10.setContentAreaFilled(false);
        jToggleButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton11.setForeground(new java.awt.Color(204, 204, 204));
        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jToggleButton11.setBorderPainted(false);
        jToggleButton11.setContentAreaFilled(false);
        jToggleButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainpaneltop3Layout = new javax.swing.GroupLayout(mainpaneltop3);
        mainpaneltop3.setLayout(mainpaneltop3Layout);
        mainpaneltop3Layout.setHorizontalGroup(
            mainpaneltop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpaneltop3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jToggleButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton11)
                .addGap(18, 18, 18))
        );
        mainpaneltop3Layout.setVerticalGroup(
            mainpaneltop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpaneltop3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(mainpaneltop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jToggleButton7)
                    .addComponent(jToggleButton8)
                    .addComponent(jLabel8)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Cardspanel.setMinimumSize(new java.awt.Dimension(0, 0));
        Cardspanel.setPreferredSize(new java.awt.Dimension(943, 600));
        Cardspanel.setLayout(new java.awt.CardLayout());
        Cardspanel.add(mainpanelinner1, "card7");
        Cardspanel.add(mainpanelinner21, "card3");
        Cardspanel.add(searchpanel1, "card5");
        Cardspanel.add(notispanel1, "card4");

        jLayeredPane1.setLayer(dropdown3, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(mainpaneltop3, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(Cardspanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(mainpaneltop3, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(798, Short.MAX_VALUE)
                    .addComponent(dropdown3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Cardspanel, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(mainpaneltop3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 561, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(dropdown3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(288, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(Cardspanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        Cardspanel.add(songspanel1, "card6");

        javax.swing.GroupLayout mainPanel2Layout = new javax.swing.GroupLayout(mainPanel2);
        mainPanel2.setLayout(mainPanel2Layout);
        mainPanel2Layout.setHorizontalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );
        mainPanel2Layout.setVerticalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        boolean isVisible = dropdown3.isVisible();
        dropdown3.setVisible(!isVisible);
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
    Window window = SwingUtilities.getWindowAncestor(this);
    if (window instanceof screen2) {  // Check if the ancestor is indeed MainFrame
        screen2 owner = (screen2) window;
        JPanel mainPanel1 = owner.getMainPanel1();  // Access mainPanel1 via getter
        if (mainPanel1 != null) {
            cardLayout1 = (CardLayout)(mainPanel1.getLayout());
            boolean isVisible = mainPanel1.isVisible();  // Check current visibility
            mainPanel1.setVisible(!isVisible);  // Toggle visibility
            cardLayout1.show(mainPanel1, "card4");
            mainPanel1.revalidate();
            mainPanel1.repaint();
        } else {
            System.err.println("Failed to access mainPanel1: It is null.");
        }
    } else {
        System.err.println("Ancestor window is not an instance of MainFrame, found: " + window.getClass().getSimpleName());
    }        
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        cardLayout.show(Cardspanel, "card4");
        Cardspanel.revalidate();
        Cardspanel.repaint();
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        stopMediaPlayer();
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        var sc = new screen1.Spotify_Screen1();
        sc.setSize(parentFrame.getSize());  // Set size of screen2 to match screen1
        sc.setLocation(parentFrame.getLocation());  // Set location of screen2 to match screen1
        sc.setVisible(true);
        parentFrame.dispose();  // Dispose of screen2
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        cardLayout.show(Cardspanel, "card3");
        Cardspanel.revalidate();
        Cardspanel.repaint();
        System.out.println("Font button working: ");  
    }//GEN-LAST:event_jButton25ActionPerformed

//  cardLayout.show(Cardspanel, "card6");
//        Cardspanel.revalidate();
//        Cardspanel.repaint();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public packs.MainPanel2 Cardspanel;
    private packs.sidepanel dropdown3;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private packs.MainPanel mainPanel2;
    private packs.mainpanelinner mainpanelinner1;
    private packs.mainpanelinner2 mainpanelinner21;
    private packs.Mainpaneltop mainpaneltop3;
    private packs.notispanel notispanel1;
    private tablefiles.ScrollBar scrollbar2;
    private packs.searchpanel searchpanel1;
    // End of variables declaration//GEN-END:variables

    private void setCurrentSongInfo(String songName, String artistName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
