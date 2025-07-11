/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen1;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import packs.MainPanel;
import tablefiles.ScrollBar;
import javafx.util.Duration;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import media_player.MediaPlayerManager;
import packs.Mainframe;
//import packs.scrollbar;
public class screen2 extends javax.swing.JFrame {
    private ImageIcon playIcon;
    private ImageIcon pauseIcon;
    CardLayout cardLayout;
    CardLayout cardLayout1;
    private Mainframe mainframe1;
    private MediaPlayerManager mediaPlayerManager;
    public screen2() throws FontFormatException {   
        mainframe1 = new Mainframe();
        mainframe1.setPreferredSize(new Dimension(400, 482));
        initComponents();
        init();
        setCustomIcon();
        playIcon = new ImageIcon("src/images/play_icon.png");
        pauseIcon = new ImageIcon("src/images/pause_icon.png");
        
        cardLayout = (CardLayout)(mainframe1.Cardspanel.getLayout());
        cardLayout1 = (CardLayout)(mainPanel1.getLayout());
//        cardLayout1 = (CardLayout)(mainframe1.cardpanel1.getLayout());
//        cardLayout2 = (CardLayout)(mainframe1.Cardspanel.JPanel.getLayout());
        
        mainPanel1.setVisible(false);  // Ensure the panel is initially hidden
        setupMouseListener();  
        
        dropdown4.setVisible(false);  // Ensure the panel is initially hidden
        setupMouseListener();  
        
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
        var fontStyle1 = new File("src/resources/CircularSpotifyText-Medium.otf");
        System.out.println("Font file exists: " + fontStyle1.exists());      
         
        try { 
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(16f);
            Font font4 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(20f);
            Font font2 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(14f);
            Font font3;
            font3 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(12f);
            Home.setFont(font1);
            Search.setFont(font1);
            libtext.setFont(font1);
            pltext1.setFont(font1);
            pltext2.setFont(font2);
            pdtext1.setFont(font1);
            pdtext2.setFont(font2);
            timer1.setFont(font3);
            timer2.setFont(font3);
            
            jButton26.setFont(font2);
            jButton27.setFont(font2);
            jButton28.setFont(font2);
            jButton29.setFont(font2);
            jButton30.setFont(font2);
            jButton31.setFont(font2);
            jButton32.setFont(font2);
            
            songName.setFont(font2);
            artistName.setFont(font3);
            jLabel7.setFont(font1);
            jLabel13.setFont(font4);
            jLabel14.setFont(font1);
            
            pltext3.setFont(font1);
            pltext4.setFont(font2);
            pltext5.setFont(font1);
            pltext6.setFont(font1);
            pltext9.setFont(font1);
            roundButtonwithborder1.setFont(font2);
        }
        catch (FontFormatException | IOException e) {
        e.printStackTrace();
        }
       
    }
    private void setCustomIcon() {
        // Load the custom icon
        ImageIcon imgIcon = new ImageIcon("src/images/spotify_logo.png");
        Image img = imgIcon.getImage();
        // Set the custom icon
        this.setIconImage(img);
    }
     public MainPanel getMainPanel1() {
        return mainPanel1;
    }
    private void setupMouseListener() {
                this.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        if (!mainPanel1.getBounds().contains(evt.getPoint()) && mainPanel1.isVisible()) {
                            mainPanel1.setVisible(false);
                        }
                        if (!dropdown4.getBounds().contains(evt.getPoint()) && dropdown4.isVisible()) {
                            dropdown4.setVisible(false);
                        }
                    }              
                    
                });

            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidepanel1 = new packs.sidepanel();
        topbar2 = new packs.topbar();
        sidepanel7 = new packs.sidepanel();
        sidepanel9 = new packs.sidepanel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        sliders1 = new packs.sliders();
        jButton11 = new javax.swing.JButton();
        sidepanel10 = new packs.sidepanel();
        jLabel8 = new javax.swing.JLabel();
        songName = new javax.swing.JLabel();
        artistName = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sidepanel8 = new packs.sidepanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        sliders2 = new packs.sliders();
        timer1 = new javax.swing.JLabel();
        timer2 = new javax.swing.JLabel();
        fullroundbutton1 = new packs.fullroundbutton();
        centerpanel = new javax.swing.JPanel();
        mainPanel1 = new packs.MainPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        mainpaneltop1 = new packs.Mainpaneltop();
        roundButton2 = new packs.RoundButton();
        jButton12 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainpanelsidescroll1 = new packs.Mainpanelsidescroll();
        roundButton1 = new packs.RoundButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        sidepanel11 = new packs.sidepanel();
        pltext3 = new javax.swing.JLabel();
        pltext4 = new javax.swing.JLabel();
        pltext5 = new javax.swing.JLabel();
        pltext6 = new javax.swing.JLabel();
        roundButtonwithborder1 = new packs.RoundButtonwithborder();
        pltext9 = new javax.swing.JLabel();
        sidepanel12 = new packs.sidepanel();
        pltext7 = new javax.swing.JLabel();
        pltext8 = new javax.swing.JLabel();
        roundButton3 = new packs.RoundButton();
        dropdown4 = new packs.sidepanel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        queuepanel1 = new packs.queuepanel();
        friendsactivitypanel1 = new packs.friendsactivitypanel();
        jPanel1 = new javax.swing.JPanel();
        sidepanel2 = new packs.sidepanel();
        jLabel1 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        sidepanel3 = new packs.sidepanel();
        jLabel3 = new javax.swing.JLabel();
        libtext = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sidepanel5 = new packs.sidepanel();
        pltext1 = new javax.swing.JLabel();
        pltext2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sidepanel6 = new packs.sidepanel();
        pdtext1 = new javax.swing.JLabel();
        pdtext2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        sidepanel1.setBackground(new java.awt.Color(0, 0, 0));
        sidepanel1.setPreferredSize(new java.awt.Dimension(1053, 583));

        sidepanel7.setBackground(new java.awt.Color(0, 0, 0));

        sidepanel9.setBackground(new java.awt.Color(0, 0, 0));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-next-20.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-micro-20.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-workstation-20.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-voice-20.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-database-20 .png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        sliders1.setPreferredSize(new java.awt.Dimension(76, 20));
        sliders1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliders1StateChanged(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-decompress-20.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepanel9Layout = new javax.swing.GroupLayout(sidepanel9);
        sidepanel9.setLayout(sidepanel9Layout);
        sidepanel9Layout.setHorizontalGroup(
            sidepanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliders1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        sidepanel9Layout.setVerticalGroup(
            sidepanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(sidepanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sliders1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepanel10.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-album-64.png"))); // NOI18N
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        songName.setForeground(new java.awt.Color(200, 200, 200));
        songName.setText("<html>Song </html>");

        artistName.setForeground(new java.awt.Color(200, 200, 200));
        artistName.setText("<html>Artist Name</html>");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-20.png"))); // NOI18N

        javax.swing.GroupLayout sidepanel10Layout = new javax.swing.GroupLayout(sidepanel10);
        sidepanel10.setLayout(sidepanel10Layout);
        sidepanel10Layout.setHorizontalGroup(
            sidepanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addGroup(sidepanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songName)
                    .addComponent(artistName, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(0, 0, 0))
        );
        sidepanel10Layout.setVerticalGroup(
            sidepanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel10Layout.createSequentialGroup()
                .addGroup(sidepanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(sidepanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(sidepanel10Layout.createSequentialGroup()
                                .addComponent(songName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(artistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)))
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepanel8.setBackground(new java.awt.Color(0, 0, 0));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-prev-30.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-shuffle-24.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-next-30.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-loop-arrow-24.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        sliders2.setToolTipText("");
        sliders2.setValue(0);
        sliders2.setMaximumSize(new java.awt.Dimension(350, 20));
        sliders2.setPreferredSize(new java.awt.Dimension(320, 20));

        timer1.setForeground(new java.awt.Color(255, 255, 255));
        timer1.setText("0:00");

        timer2.setForeground(new java.awt.Color(255, 255, 255));
        timer2.setText("0:00");

        fullroundbutton1.setBackground(new java.awt.Color(255, 255, 255));
        fullroundbutton1.setBorder(null);
        fullroundbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play_icon.png"))); // NOI18N
        fullroundbutton1.setPreferredSize(new java.awt.Dimension(40, 40));
        fullroundbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullroundbutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepanel8Layout = new javax.swing.GroupLayout(sidepanel8);
        sidepanel8.setLayout(sidepanel8Layout);
        sidepanel8Layout.setHorizontalGroup(
            sidepanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fullroundbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanel8Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(timer1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliders2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timer2)
                .addGap(63, 63, 63))
        );
        sidepanel8Layout.setVerticalGroup(
            sidepanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanel8Layout.createSequentialGroup()
                .addGroup(sidepanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sidepanel8Layout.createSequentialGroup()
                        .addGroup(sidepanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton6)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton2)
                            .addComponent(fullroundbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(sliders2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(timer2)
                    .addComponent(timer1))
                .addContainerGap())
        );

        sidepanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, jButton4});

        javax.swing.GroupLayout sidepanel7Layout = new javax.swing.GroupLayout(sidepanel7);
        sidepanel7.setLayout(sidepanel7Layout);
        sidepanel7Layout.setHorizontalGroup(
            sidepanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sidepanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidepanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidepanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        sidepanel7Layout.setVerticalGroup(
            sidepanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidepanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidepanel7Layout.createSequentialGroup()
                .addComponent(sidepanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        centerpanel.setOpaque(false);
        centerpanel.setLayout(new java.awt.BorderLayout(6, 0));

        mainPanel1.setMaximumSize(new java.awt.Dimension(400, 581));
        mainPanel1.setLayout(new java.awt.CardLayout());

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

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-three-dots-15.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Leo");

        javax.swing.GroupLayout mainpaneltop1Layout = new javax.swing.GroupLayout(mainpaneltop1);
        mainpaneltop1.setLayout(mainpaneltop1Layout);
        mainpaneltop1Layout.setHorizontalGroup(
            mainpaneltop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpaneltop1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12)
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
                    .addComponent(jButton12)
                    .addComponent(roundButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        mainpanelsidescroll1.setBackground(new java.awt.Color(18, 18, 18));

        roundButton1.setBorder(null);
        roundButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/september MOOD.jpeg"))); // NOI18N
        roundButton1.setPreferredSize(new java.awt.Dimension(260, 260));
        roundButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton1ActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Song Name");

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Artist Name");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-20.png"))); // NOI18N

        sidepanel11.setBackground(new java.awt.Color(36, 36, 36));
        sidepanel11.setMaximumSize(new java.awt.Dimension(364, 130));
        sidepanel11.setPreferredSize(new java.awt.Dimension(364, 130));

        pltext3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pltext3.setForeground(new java.awt.Color(255, 255, 255));
        pltext3.setText("Credits");

        pltext4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext4.setForeground(new java.awt.Color(153, 153, 153));
        pltext4.setText("Show all");

        pltext5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext5.setForeground(new java.awt.Color(255, 255, 255));
        pltext5.setText("Artist Name 2");

        pltext6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext6.setForeground(new java.awt.Color(255, 255, 255));
        pltext6.setText("Artist Name 3");

        roundButtonwithborder1.setBackground(new java.awt.Color(36, 36, 36));
        roundButtonwithborder1.setForeground(new java.awt.Color(204, 204, 204));
        roundButtonwithborder1.setText("Follow");
        roundButtonwithborder1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roundButtonwithborder1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        roundButtonwithborder1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        pltext9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext9.setForeground(new java.awt.Color(255, 255, 255));
        pltext9.setText("Artist Name 1");

        javax.swing.GroupLayout sidepanel11Layout = new javax.swing.GroupLayout(sidepanel11);
        sidepanel11.setLayout(sidepanel11Layout);
        sidepanel11Layout.setHorizontalGroup(
            sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanel11Layout.createSequentialGroup()
                        .addComponent(pltext6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidepanel11Layout.createSequentialGroup()
                        .addGroup(sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sidepanel11Layout.createSequentialGroup()
                                .addGroup(sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pltext5)
                                    .addComponent(pltext9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roundButtonwithborder1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sidepanel11Layout.createSequentialGroup()
                                .addComponent(pltext3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                                .addComponent(pltext4)))
                        .addGap(18, 18, 18))))
        );
        sidepanel11Layout.setVerticalGroup(
            sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pltext3)
                    .addComponent(pltext4))
                .addGap(18, 18, 18)
                .addGroup(sidepanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pltext9)
                    .addComponent(roundButtonwithborder1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pltext5)
                .addGap(18, 18, 18)
                .addComponent(pltext6)
                .addGap(18, 18, 18))
        );

        sidepanel12.setBackground(new java.awt.Color(36, 36, 36));
        sidepanel12.setMaximumSize(new java.awt.Dimension(364, 130));
        sidepanel12.setPreferredSize(new java.awt.Dimension(364, 130));

        pltext7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pltext7.setForeground(new java.awt.Color(255, 255, 255));
        pltext7.setText("Next in Queue");

        pltext8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext8.setForeground(new java.awt.Color(153, 153, 153));
        pltext8.setText("Open Queue");

        javax.swing.GroupLayout sidepanel12Layout = new javax.swing.GroupLayout(sidepanel12);
        sidepanel12.setLayout(sidepanel12Layout);
        sidepanel12Layout.setHorizontalGroup(
            sidepanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(sidepanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sidepanel12Layout.createSequentialGroup()
                        .addComponent(pltext7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(pltext8)))
                .addGap(18, 18, 18))
        );
        sidepanel12Layout.setVerticalGroup(
            sidepanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(sidepanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pltext7)
                    .addComponent(pltext8))
                .addGap(18, 18, 18)
                .addComponent(roundButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainpanelsidescroll1Layout = new javax.swing.GroupLayout(mainpanelsidescroll1);
        mainpanelsidescroll1.setLayout(mainpanelsidescroll1Layout);
        mainpanelsidescroll1Layout.setHorizontalGroup(
            mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelsidescroll1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sidepanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainpanelsidescroll1Layout.createSequentialGroup()
                        .addGroup(mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(107, 107, 107)
                        .addComponent(jLabel15))
                    .addComponent(sidepanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        mainpanelsidescroll1Layout.setVerticalGroup(
            mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelsidescroll1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainpanelsidescroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelsidescroll1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelsidescroll1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addGap(18, 18, 18)
                .addComponent(sidepanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sidepanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(mainpanelsidescroll1);

        dropdown4.setBackground(new java.awt.Color(36, 36, 36));
        dropdown4.setMaximumSize(new java.awt.Dimension(195, 250));
        dropdown4.setPreferredSize(new java.awt.Dimension(195, 250));

        jButton26.setForeground(new java.awt.Color(200, 200, 200));
        jButton26.setText("<html>  <p style=\"margin-left:10px\">Add to playlist</p> </html> ");
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
        jButton27.setText("<html>  <p style=\"margin-left:10px\">Save to your Liked Songs</p> </html> ");
        jButton27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);
        jButton27.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton27.setPreferredSize(new java.awt.Dimension(0, 40));

        jButton28.setForeground(new java.awt.Color(200, 200, 200));
        jButton28.setText("<html>  <p style=\"margin-left:10px\">Add to queue</p> </html>");
        jButton28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton28.setBorderPainted(false);
        jButton28.setContentAreaFilled(false);
        jButton28.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton28.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setForeground(new java.awt.Color(200, 200, 200));
        jButton29.setText("<html>  <p style=\"margin-left:10px\">Go to song radio</p> </html>   ");
        jButton29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton29.setBorderPainted(false);
        jButton29.setContentAreaFilled(false);
        jButton29.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton29.setPreferredSize(new java.awt.Dimension(0, 40));

        jButton30.setForeground(new java.awt.Color(200, 200, 200));
        jButton30.setText("<html>  <p style=\"margin-left:10px\"> Go to artist</p> </html> ");
        jButton30.setActionCommand("     Settings");
        jButton30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton30.setBorderPainted(false);
        jButton30.setContentAreaFilled(false);
        jButton30.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton30.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setPreferredSize(new java.awt.Dimension(49, 3));
        jSeparator1.setRequestFocusEnabled(false);

        jButton31.setForeground(new java.awt.Color(200, 200, 200));
        jButton31.setText("<html>      <p style=\"margin-left:10px\">Share</p> </html>");
        jButton31.setActionCommand("<html>\n<br style=\"color:#ffff\">     \n <p>    Log out</p>\n</html>");
        jButton31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton31.setBorderPainted(false);
        jButton31.setContentAreaFilled(false);
        jButton31.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton31.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setForeground(new java.awt.Color(200, 200, 200));
        jButton32.setText("<html>  <p style=\"margin-left:10px\"> View credits</p> </html> ");
        jButton32.setActionCommand("     Settings");
        jButton32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton32.setBorderPainted(false);
        jButton32.setContentAreaFilled(false);
        jButton32.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton32.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setPreferredSize(new java.awt.Dimension(49, 3));
        jSeparator2.setRequestFocusEnabled(false);

        javax.swing.GroupLayout dropdown4Layout = new javax.swing.GroupLayout(dropdown4);
        dropdown4.setLayout(dropdown4Layout);
        dropdown4Layout.setHorizontalGroup(
            dropdown4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dropdown4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dropdown4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dropdown4Layout.createSequentialGroup()
                        .addGroup(dropdown4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jButton27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dropdown4Layout.createSequentialGroup()
                        .addGroup(dropdown4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        dropdown4Layout.setVerticalGroup(
            dropdown4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dropdown4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane2.setLayer(mainpaneltop1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(dropdown4, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainpaneltop1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 0, 0))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap(43, Short.MAX_VALUE)
                    .addComponent(dropdown4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainpaneltop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(dropdown4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(131, Short.MAX_VALUE)))
        );

        mainPanel1.add(jLayeredPane2, "card2");
        mainPanel1.add(queuepanel1, "card3");
        mainPanel1.add(friendsactivitypanel1, "card4");

        centerpanel.add(mainPanel1, java.awt.BorderLayout.LINE_END);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 482));

        sidepanel2.setBackground(new java.awt.Color(18, 18, 18));
        sidepanel2.setMaximumSize(new java.awt.Dimension(412, 100));
        sidepanel2.setPreferredSize(new java.awt.Dimension(412, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-30.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        Home.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("Home");
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-30.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        Search.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Search.setForeground(new java.awt.Color(153, 153, 153));
        Search.setText("Search");
        Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sidepanel2Layout = new javax.swing.GroupLayout(sidepanel2);
        sidepanel2.setLayout(sidepanel2Layout);
        sidepanel2Layout.setHorizontalGroup(
            sidepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(sidepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(sidepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidepanel2Layout.setVerticalGroup(
            sidepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        sidepanel3.setBackground(new java.awt.Color(18, 18, 18));
        sidepanel3.setMaximumSize(new java.awt.Dimension(412, 32767));
        sidepanel3.setPreferredSize(new java.awt.Dimension(412, 411));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-albums-30-1.png"))); // NOI18N

        libtext.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        libtext.setForeground(new java.awt.Color(153, 153, 153));
        libtext.setText("Your Library");
        libtext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-plus-24.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        sidepanel5.setBackground(new java.awt.Color(36, 36, 36));
        sidepanel5.setMaximumSize(new java.awt.Dimension(364, 130));
        sidepanel5.setPreferredSize(new java.awt.Dimension(364, 130));

        pltext1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pltext1.setForeground(new java.awt.Color(255, 255, 255));
        pltext1.setText("Create your first playlist");

        pltext2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pltext2.setForeground(new java.awt.Color(255, 255, 255));
        pltext2.setText("It's easy , we'll help you");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/playlist.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout sidepanel5Layout = new javax.swing.GroupLayout(sidepanel5);
        sidepanel5.setLayout(sidepanel5Layout);
        sidepanel5Layout.setHorizontalGroup(
            sidepanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(sidepanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(pltext1)
                    .addComponent(pltext2))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        sidepanel5Layout.setVerticalGroup(
            sidepanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pltext1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pltext2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        sidepanel6.setBackground(new java.awt.Color(36, 36, 36));
        sidepanel6.setMaximumSize(new java.awt.Dimension(364, 130));
        sidepanel6.setPreferredSize(new java.awt.Dimension(364, 130));

        pdtext1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pdtext1.setForeground(new java.awt.Color(255, 255, 255));
        pdtext1.setText("Let's find some podcasts to follow ");

        pdtext2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pdtext2.setForeground(new java.awt.Color(255, 255, 255));
        pdtext2.setText("We'll keep you updated on new episodes");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pd.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout sidepanel6Layout = new javax.swing.GroupLayout(sidepanel6);
        sidepanel6.setLayout(sidepanel6Layout);
        sidepanel6Layout.setHorizontalGroup(
            sidepanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(sidepanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(pdtext1)
                    .addComponent(pdtext2))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        sidepanel6Layout.setVerticalGroup(
            sidepanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pdtext1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pdtext2)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidepanel3Layout = new javax.swing.GroupLayout(sidepanel3);
        sidepanel3.setLayout(sidepanel3Layout);
        sidepanel3Layout.setHorizontalGroup(
            sidepanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(libtext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(28, 28, 28))
            .addGroup(sidepanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(sidepanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sidepanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidepanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidepanel3Layout.setVerticalGroup(
            sidepanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(sidepanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(sidepanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel5)
                        .addComponent(libtext, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidepanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(sidepanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidepanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                    .addComponent(sidepanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sidepanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidepanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))
        );

        centerpanel.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout sidepanel1Layout = new javax.swing.GroupLayout(sidepanel1);
        sidepanel1.setLayout(sidepanel1Layout);
        sidepanel1Layout.setHorizontalGroup(
            sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topbar2, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
            .addComponent(sidepanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidepanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(centerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sidepanel1Layout.setVerticalGroup(
            sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanel1Layout.createSequentialGroup()
                .addComponent(topbar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(centerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidepanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        centerpanel.add(mainframe1, BorderLayout.CENTER);
        centerpanel.add(mainPanel1, BorderLayout.EAST);
        centerpanel.add(jPanel1, BorderLayout.WEST);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mainframe1.playNextSong();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mainframe1.playPreviousSong();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        boolean isVisible = mainPanel1.isVisible();
        mainPanel1.setVisible(!isVisible);
        cardLayout1.show(mainPanel1, "card3");
        mainPanel1.revalidate();
        mainPanel1.repaint();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
         mainframe1.toggleMute();
    
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        boolean isVisible = mainPanel1.isVisible();
        mainPanel1.setVisible(!isVisible);
        cardLayout1.show(mainPanel1, "card2");
        mainPanel1.revalidate();
        mainPanel1.repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void roundButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton2ActionPerformed
        boolean isVisible = mainPanel1.isVisible();
        mainPanel1.setVisible(!isVisible);
        cardLayout1.show(mainPanel1, "card2");
        mainPanel1.revalidate();
        mainPanel1.repaint();
    }//GEN-LAST:event_roundButton2ActionPerformed

    private void roundButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton1ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        boolean isVisible = dropdown4.isVisible();
         dropdown4.setVisible(!isVisible);    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        cardLayout.show(mainframe1.Cardspanel, "card5");
        mainframe1.Cardspanel.revalidate();
        mainframe1.Cardspanel.repaint();
    }//GEN-LAST:event_SearchMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        cardLayout.show(mainframe1.Cardspanel, "card5");
        mainframe1.Cardspanel.revalidate();
        mainframe1.Cardspanel.repaint();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        cardLayout.show(mainframe1.Cardspanel, "card7");
//        cardLayout1.show(mainframe1.cardpanel1, "card2");
        
        mainframe1.Cardspanel.revalidate();
        mainframe1.Cardspanel.repaint();
    }//GEN-LAST:event_HomeMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
          cardLayout.show(mainframe1.Cardspanel, "card7");
//        cardLayout1.show(mainframe1.cardpanel1, "card2");
        
        mainframe1.Cardspanel.revalidate();
        mainframe1.Cardspanel.repaint();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        boolean isVisible = mainPanel1.isVisible();
        mainPanel1.setVisible(!isVisible);
        cardLayout1.show(mainPanel1, "card2");
        mainPanel1.revalidate();
        mainPanel1.repaint();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void sliders1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliders1StateChanged
         if (!sliders1.getValueIsAdjusting()) {
            int value = sliders1.getValue();
            System.out.println("Slider value: " + value); // Debugging statement
            mainframe1.setVolume(value / 100.0); // Convert to range 0.0 - 1.0
        }
    }//GEN-LAST:event_sliders1StateChanged

    private void fullroundbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullroundbutton1ActionPerformed
        mainframe1.togglePlayback();
    }//GEN-LAST:event_fullroundbutton1ActionPerformed

   
    
    private void init() {
        setBackground(new Color(0, 0, 0, 0)); 

        sliders2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (sliders2.getValueIsAdjusting()) {
                    int sliderValue = sliders2.getValue();
                    mainframe1.seek(Duration.seconds(sliderValue));
                }
            }
        });

        // Initialize and configure the timer to update the slider's position
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateSliderPosition();
            }
        }, 0, 1000); // Update every second
        
    }

    private void updateSliderPosition() {
        if (mainframe1.isPlaying()) {
            Duration currentTime = mainframe1.getCurrentTime();
            Duration totalDuration = mainframe1.getTotalDuration();
            if (!sliders2.getValueIsAdjusting() && totalDuration.toSeconds() > 0) {
                sliders2.setMaximum((int) totalDuration.toSeconds());
                sliders2.setValue((int) currentTime.toSeconds());
                timer1.setText(formatTime(currentTime));
            }
        }
    }
    
    private String formatTime(Duration duration) {
    int minutes = (int) duration.toMinutes();
    int seconds = (int) (duration.toSeconds() % 60);
    return String.format("%02d:%02d", minutes, seconds);
    }
    
     public void updateSongInfo(String songTitle, String artistname, Duration totalDuration) {
        songName.setText(songTitle);
        artistName.setText(artistname);
        timer2.setText(formatTime(totalDuration));
    }
    public void updatePlayPauseButton(boolean isPlaying) {
        if (isPlaying) {
            fullroundbutton1.setIcon(pauseIcon);
        } else {
            fullroundbutton1.setIcon(playIcon);
        }
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
            java.util.logging.Logger.getLogger(screen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(screen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(screen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(screen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new screen2().setVisible(true);
            } catch (FontFormatException ex) {
                Logger.getLogger(screen2.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Search;
    private javax.swing.JLabel artistName;
    private javax.swing.JPanel centerpanel;
    private packs.sidepanel dropdown4;
    private packs.friendsactivitypanel friendsactivitypanel1;
    private packs.fullroundbutton fullroundbutton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel libtext;
    private packs.MainPanel mainPanel1;
    private packs.Mainpanelsidescroll mainpanelsidescroll1;
    private packs.Mainpaneltop mainpaneltop1;
    private javax.swing.JLabel pdtext1;
    private javax.swing.JLabel pdtext2;
    private javax.swing.JLabel pltext1;
    private javax.swing.JLabel pltext2;
    private javax.swing.JLabel pltext3;
    private javax.swing.JLabel pltext4;
    private javax.swing.JLabel pltext5;
    private javax.swing.JLabel pltext6;
    private javax.swing.JLabel pltext7;
    private javax.swing.JLabel pltext8;
    private javax.swing.JLabel pltext9;
    private packs.queuepanel queuepanel1;
    private packs.RoundButton roundButton1;
    private packs.RoundButton roundButton2;
    private packs.RoundButton roundButton3;
    private packs.RoundButtonwithborder roundButtonwithborder1;
    private packs.sidepanel sidepanel1;
    private packs.sidepanel sidepanel10;
    private packs.sidepanel sidepanel11;
    private packs.sidepanel sidepanel12;
    private packs.sidepanel sidepanel2;
    private packs.sidepanel sidepanel3;
    private packs.sidepanel sidepanel5;
    private packs.sidepanel sidepanel6;
    private packs.sidepanel sidepanel7;
    private packs.sidepanel sidepanel8;
    private packs.sidepanel sidepanel9;
    private packs.sliders sliders1;
    private packs.sliders sliders2;
    private javax.swing.JLabel songName;
    private javax.swing.JLabel timer1;
    private javax.swing.JLabel timer2;
    private packs.topbar topbar2;
    // End of variables declaration//GEN-END:variables
}
